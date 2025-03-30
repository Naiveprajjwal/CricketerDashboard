package com.example.CRICKETER_DASHBOARD.controller;
import com.example.CRICKETER_DASHBOARD.model.Cricketer;
import com.example.CRICKETER_DASHBOARD.service.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;


import java.util.List;

@RestController
@RequestMapping("/cricketers")
public class CricketController {
    @Autowired
    private CricketService cricketerService;

    @GetMapping
    public List<Cricketer> getAllCricketer() {
        return cricketerService.getAllCricketer();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Cricketer addCricketer(@RequestBody Cricketer cricketer) {

        return cricketerService.addCricketer(cricketer);
    }
}
