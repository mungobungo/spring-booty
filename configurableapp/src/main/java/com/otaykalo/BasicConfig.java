package com.otaykalo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by otaykalo on 6/20/2016.
 */

@RestController
public class BasicConfig {

    @Value("${greeting.val}")
    private String greeting;

    @RequestMapping("/")
    public String home(){
        return  greeting + " World!";
    }
}
