package com.example.springcloud.consumer.controller;

import com.example.springcloud.consumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    private HelloRemote helloRemote;

    @Autowired
    public ConsumerController(HelloRemote helloRemote) {
        this.helloRemote = helloRemote;
    }

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

}
