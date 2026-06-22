package org.example.chatgptapi.model;

import lombok.Builder;

import java.util.List;

/**
 * {
 *   "choices": [
 *     {
 *       "index": 0,
 *       "message": {
 *         "role": "assistant",
 *         "content": "Hello! How can I assist you today?",
 *       },
 *     }
 *   ]
 * }
 */
@Builder
public record OpenAiResponse(
        List<OpenAiChoice> choices
) {
}

