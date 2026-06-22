package org.example.chatgptapi.model;

import lombok.Builder;

import java.util.List;

/**
 *     "model": "VAR_chat_model_id",
 *     "messages": [
 *       {
 *         "role": "developer",
 *         "content": "You are a helpful assistant."
 *       },
 *       {
 *         "role": "user",
 *         "content": "Hello!"
 *       }
 *     ]
 */
@Builder
public record OpenAiRequest(
        String model,
        List<OpenAiMessages> messages) {
}
