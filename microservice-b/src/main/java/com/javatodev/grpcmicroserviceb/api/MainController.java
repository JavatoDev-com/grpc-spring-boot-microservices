package com.javatodev.grpcmicroserviceb.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/b")
public class MainController {

    @GetMapping
    public ResponseEntity mainMessage(){
        return ResponseEntity.ok("Response from Service B");
    }

}
