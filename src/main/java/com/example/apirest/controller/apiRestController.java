package com.example.apirest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest.service.apiRestService;

@RestController
public class apiRestController {

    private final apiRestService miServicio;
    public apiRestController(apiRestService elServicio)
    {
        this.miServicio = elServicio;
    }

    @CrossOrigin(origins = "http://192.168.1.154:8081")
    @GetMapping("/movie/{filmName}")
    public String getFilmByName(@PathVariable String filmName) {
        return miServicio.obtenerPeliculaPorNombre(filmName);
    }
}
