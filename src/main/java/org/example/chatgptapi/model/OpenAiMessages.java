package org.example.chatgptapi.model;

import lombok.Builder;

/**
 * {
 *     "role": "developer",
 *     "content": "You are a helpful assistant."
 * }
 * oder
 * {
 *     "role": "user",
 *     "content": "Hello!"
 * }
 */
@Builder
public record OpenAiMessages(
        String role,
        String content
) {
}
