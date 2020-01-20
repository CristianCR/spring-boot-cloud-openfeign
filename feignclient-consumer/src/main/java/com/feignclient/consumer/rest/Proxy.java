package com.feignclient.consumer.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo", url = "http://localhost:8080")
public interface Proxy {

    @GetMapping
    ResponseEntity<String> getMessage();

}
