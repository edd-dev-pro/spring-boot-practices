package com.edd.dev.spring_boot_practices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hola")
    public String hola(@RequestParam(defaultValue = "Eduardo") String nombre) {
        return "Hola " + nombre + ", bienvenido al backend con Spring Boot";
    }

    @GetMapping("/saludo")
    public String saludo() {
        return "Bienvenido al curso de Backend con Spring Boot";
    }
}
