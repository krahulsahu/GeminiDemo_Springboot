package com.rahul.GeminiAPI.config;


import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeminiConfig {

    @Bean
    public Client geminiClient(){
        return new Client();
    }

}
