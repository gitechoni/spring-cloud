package com.example.springcloud.consumer.remote;

import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello " + name + ", this message send failed ";
    }
}
