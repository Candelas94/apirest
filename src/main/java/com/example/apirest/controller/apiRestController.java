package com.example.apirest.controller;

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

    @GetMapping("/movies/{filmName}")
    public String getFilmByName(@PathVariable String filmName) {
        return miServicio.obtenerPeliculaPorNombre(filmName);
    }

}
