package org.example.chatgptapi.model;
/*
 *     {
 *       "message": {
 *         "role": "assistant",
 *         "content": "Hello! How can I assist you today?",
 *       }
 *     }
 */

public record OpenAiChoice(
        OpenAiMessages message
) {
}
