package com.feignclient.consumer.controller;

import com.feignclient.consumer.rest.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Proxy proxy;

    @Autowired
    public Controller(Proxy proxy) {
        this.proxy = proxy;
    }

    @GetMapping("/message")
    public ResponseEntity<String> getMessage() {
        return proxy.getMessage();
    }
}
