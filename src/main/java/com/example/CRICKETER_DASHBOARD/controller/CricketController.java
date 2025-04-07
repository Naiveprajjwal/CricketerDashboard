package com.example.CRICKETER_DASHBOARD.controller;
import com.example.CRICKETER_DASHBOARD.model.Cricketer;
import com.example.CRICKETER_DASHBOARD.service.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;


import java.util.List;
import java.util.Optional;

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
    @GetMapping("/{id}")
    public ResponseEntity<Cricketer> getCricketerById(@PathVariable int id) {
        Optional<Cricketer> cricketer = cricketerService.getCricketerById(id);
        return cricketer.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Cricketer> updateCricketer(@PathVariable int id, @RequestBody Cricketer updatedCricketer) {
        Cricketer cricketer = cricketerService.updateCricketer(id, updatedCricketer);
        if (cricketer != null) {
            return ResponseEntity.ok(cricketer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCricketer(@PathVariable int id) {
        boolean deleted = cricketerService.deleteCricketer(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
