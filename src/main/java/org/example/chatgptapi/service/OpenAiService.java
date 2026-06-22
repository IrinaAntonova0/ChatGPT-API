package org.example.chatgptapi.service;

import org.example.chatgptapi.model.OpenAiRequest;
import org.example.chatgptapi.model.OpenAiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class OpenAiService {

    private final RestClient restClient;

    OpenAiService(RestClient.Builder builder, @Value("${openai.auth.bearer.key}") String key ) {
        this.restClient = builder
                .baseUrl("https://api.openai.com/v1")
                .defaultHeader("Authorization","Bearer "+key)
                .defaultHeader("Content-Type", "application/json")
                .build();
    }

    public OpenAiResponse postToOpenAi(OpenAiRequest req){
        return restClient.post()
                .uri("/chat/completions")
                .body(req)
                .retrieve()
                .body(OpenAiResponse.class);
    }

}
