package com.otaykalo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by otaykalo on 6/20/2016.
 */

@RestController
@RefreshScope
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();
    @Value("${greeting.val}")
    private String greeting;

    @RequestMapping("/")
    public String home(){
        return  greeting + " World #" + counter.incrementAndGet();
    }
}
