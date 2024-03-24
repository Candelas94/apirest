package com.example.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest.service.ApiRestService;

@RestController
public class ApiRestController {

    @Autowired
    private ApiRestService miServicio;

    @CrossOrigin(origins = "http://192.168.1.154:8081")
    @GetMapping("/movie/{movieName}")
    public String getFilmByName(@PathVariable String filmName) {
        return miServicio.obtenerPeliculaPorNombre(filmName);
    }
}
