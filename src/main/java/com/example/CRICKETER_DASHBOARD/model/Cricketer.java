package com.example.CRICKETER_DASHBOARD.model;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;

@Entity
public class Cricketer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    private Playerstats stats;
}
