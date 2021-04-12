package com.example.prizegen.rest;

import com.example.prizegen.service.PrizeGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/prize")
@CrossOrigin
public class PrizeGenController {
    private final PrizeGenService service;
    RestTemplate rest;

    @Autowired
    public PrizeGenController(PrizeGenService service, RestTemplateBuilder builder){
        super();
        this.service = service;
        this.rest = builder.build();

    }

    @GetMapping("/get/{accNum}")
    public ResponseEntity<Double> genPrize(@PathVariable String accNum) {
        return ResponseEntity.ok(this.service.genPrize(accNum));
    }
}