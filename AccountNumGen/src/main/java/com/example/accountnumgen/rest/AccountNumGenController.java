package com.example.accountnumgen.rest;

import com.example.accountnumgen.service.AccountNumGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/accNum")
@CrossOrigin
public class AccountNumGenController {
    private final AccountNumGenService service;
    RestTemplate rest;

    @Autowired
    public AccountNumGenController(AccountNumGenService service, RestTemplateBuilder builder){
        super();
        this.service = service;
        this.rest = builder.build();
    }

    @GetMapping("/get")
    public ResponseEntity<String> genNumber() {
        return ResponseEntity.ok(this.service.genNumber());
    }
}
