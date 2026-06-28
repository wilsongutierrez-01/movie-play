package com.movie.movie.web.controller;

import com.movie.movie.MoviePlayAiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final MoviePlayAiService moviePlayAiService;

    public HelloController(MoviePlayAiService moviePlayAiService) {
        this.moviePlayAiService = moviePlayAiService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return this.moviePlayAiService.generateGreeting();
    }
}
