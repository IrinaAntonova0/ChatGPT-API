OpenAI doku
- https://developers.openai.com/api/reference/resources/chat/subresources/completions
- https://developers.openai.com/api/reference/resources/chat/subresources/completions/methods/create

Task: Implementiere einen Service

1. Der eine per Post-Request gestellte Frage für den OpenAI-Comlpetions-Endpoint entgegennimmt,
2. ein eigenes Request an die OpenAI-Schnittstelle weiterleitet
   https://developers.openai.com/api/reference/resources/chat/subresources/completions ,
3. das Reply entgegenimmt, und die Textantwort zurückgibt.

Post To Endpoint:

http://localhost:8080/api/post/askOpenAI

Example Body:
```
{
   "model": "gpt-5.4",
   "messages": [
      {
         "role": "user",
         "content": "Welches Datum haben wir heute?"
      }
   ]
}
```

Example Reply:

```
Heute ist der 22. Juni 2026.
```