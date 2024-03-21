package com.example.apirest.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Service
public class apiRestService {
    private static final String TMDB_API_URL = "https://api.themoviedb.org/3";
    // private static final String API_KEY = "f45811905af623d2d6e25bf129688eef";
    private static final String SEARCH_MOVIE_ENDPOINT = "/search/movie";

    @Value("${tmdb.api.key}")
    private String apiKey;

    private final WebClient webClient;
    public apiRestService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(TMDB_API_URL).build();
    }

    // https://developer.themoviedb.org/reference/search-movie

    public String obtenerPeliculaPorNombre(String nombrePelicula) {
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path(SEARCH_MOVIE_ENDPOINT)
                        .queryParam("api_key", apiKey)
                        .queryParam("query", nombrePelicula)
                        .build())
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
