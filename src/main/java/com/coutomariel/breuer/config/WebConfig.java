package com.coutomariel.breuer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coutomariel.breuer.controller.CervejasController;

@Configuration
@ComponentScan(basePackageClasses=CervejasController.class)
public class WebConfig {

}
