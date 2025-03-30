package com.example.CRICKETER_DASHBOARD.model;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Playerstats {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  int runs;
    private int matches;
    private int wickets;
    private int balls;
    private double runRate;
    private double economy;

}
