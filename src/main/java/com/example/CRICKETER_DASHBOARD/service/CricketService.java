package com.example.CRICKETER_DASHBOARD.service;
import com.example.CRICKETER_DASHBOARD.model.Cricketer;
import com.example.CRICKETER_DASHBOARD.repository.CricketerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CricketService {
    @Autowired
    private CricketerRepository cricketerrespository;
    public List<Cricketer> getAllCricketer(){
        return cricketerrespository.findAll();}
        public Cricketer addCricketer(Cricketer cricketer){

        return cricketerrespository.save(cricketer);
        }


}
