package com.example.CRICKETER_DASHBOARD.repository;
import com.example.CRICKETER_DASHBOARD.model.Cricketer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface CricketerRepository extends JpaRepository<Cricketer, Integer>{

}
