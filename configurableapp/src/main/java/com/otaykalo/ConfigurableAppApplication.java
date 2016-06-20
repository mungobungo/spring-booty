package com.otaykalo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration
@EnableConfigurationProperties
@SpringBootApplication
@EnableSwagger2
public class ConfigurableAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurableAppApplication.class, args);
	}
}
