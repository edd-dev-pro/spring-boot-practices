package com.edd.dev.spring_boot_practices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParametersController {

    @GetMapping("/saludo/{nombre}")
    public String saludoConNombre(@PathVariable String nombre) {
        return "Hola "+ nombre +", estas aprendiendo Backend con SpringBoot";
    }

    @GetMapping("/presentacion")
    public String presentacion(@RequestParam String nombre, @RequestParam int edad) {
        return "Hola, mi nombre es "+ nombre +" y tengo "+ edad +" años";
    }

    @GetMapping("/curso/{nombreCurso}")
    public String curso(@PathVariable String nombreCurso) {
        return  "Estas inscrito al curso de " + nombreCurso;
    }

    @GetMapping("/usuario")
    public String usuario(@RequestParam String nombre, @RequestParam String apellido) {
        return nombre + " " + apellido;
    }

    @GetMapping("/calculadora/suma")
    public String suma(@RequestParam int num1, @RequestParam int num2) {
        int resultado = num1 + num2;

        return "El resultado es " + resultado;
    }
}
