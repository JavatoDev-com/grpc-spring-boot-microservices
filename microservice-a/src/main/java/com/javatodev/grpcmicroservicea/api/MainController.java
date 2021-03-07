package com.javatodev.grpcmicroservicea.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/a")
public class MainController {
    @GetMapping
    public ResponseEntity mainMessage(){
        return ResponseEntity.ok("Response from Service A");
    }
}
