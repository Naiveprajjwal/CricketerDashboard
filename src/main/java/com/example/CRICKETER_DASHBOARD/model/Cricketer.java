package com.example.CRICKETER_DASHBOARD.model;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;//(esase getter setter,default constructor toString and equal and ahshcode automatically generate ho jata hai)
@Entity
@Data
public class Cricketer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    private Playerstats stats;
}
