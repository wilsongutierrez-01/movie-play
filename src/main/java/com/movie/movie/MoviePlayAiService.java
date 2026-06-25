package com.movie.movie;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface MoviePlayAiService {
    @UserMessage("""
            Generate a greeting for the movie platform and use less than
            125 chatacters make sure to create fun message for users
            """)
    String generateGreeting();
}
