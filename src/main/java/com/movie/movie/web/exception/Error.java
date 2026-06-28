package com.movie.movie.web.exception;

import com.movie.movie.domain.service.MovieAiService;

public record Error(String type, String message) {
}
