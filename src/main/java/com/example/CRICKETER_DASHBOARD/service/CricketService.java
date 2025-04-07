package com.example.CRICKETER_DASHBOARD.service;
import com.example.CRICKETER_DASHBOARD.model.Cricketer;
import com.example.CRICKETER_DASHBOARD.repository.CricketerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CricketService {
    @Autowired
    private CricketerRepository cricketerrespository;
    public List<Cricketer> getAllCricketer(){
        return cricketerrespository.findAll();}
        public Cricketer addCricketer(Cricketer cricketer){

        return cricketerrespository.save(cricketer);
        }
    public Optional<Cricketer> getCricketerById(int id) {
        return cricketerrespository.findById(id);
    }
    public Cricketer updateCricketer(int id, Cricketer updatedCricketer) {
        return cricketerrespository.findById(id).map(cricketer -> {
            cricketer.setName(updatedCricketer.getName());
            cricketer.setAge(updatedCricketer.getAge());
            cricketer.setStats(updatedCricketer.getStats());
            return cricketerrespository.save(cricketer);
        }).orElse(null);
    }
    public boolean deleteCricketer(int id) {
        if (cricketerrespository.existsById(id)) {
            cricketerrespository.deleteById(id);
            return true;
        }
        return false;
    }

}
