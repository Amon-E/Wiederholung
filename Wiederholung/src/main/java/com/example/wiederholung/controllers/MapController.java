package com.example.wiederholung.controllers;


import com.example.wiederholung.services.MapService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/map")
@RestController
public class MapController {

    private final MapService service;

    public MapController(MapService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<String>> keys() {
        return ResponseEntity.ok(new ArrayList(service.keys()));
    }

    @GetMapping("/{key}")
    public ResponseEntity<String> get(@PathVariable("key") String key) {
        if (service.contains(key)) {
            String value = service.get(key);
            return ResponseEntity.ok(value);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{key}")
    public ResponseEntity put(@PathVariable("key") String key, @RequestBody String value) {
        service.put(key, value);
        return ResponseEntity.ok().build();
    }

}
