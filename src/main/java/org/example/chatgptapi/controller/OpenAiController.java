package org.example.chatgptapi.controller;
import org.example.chatgptapi.model.OpenAiRequest;
import org.example.chatgptapi.model.OpenAiResponse;
import org.example.chatgptapi.service.OpenAiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
class OpenAiController {

    private final OpenAiService openAiService;


    OpenAiController(OpenAiService openAiService) {
        this.openAiService = openAiService;
    }

    @PostMapping("/post/askOpenAI")
    public ResponseEntity<String> post(@RequestBody OpenAiRequest openAiRequest){
        OpenAiResponse oAR = openAiService.postToOpenAi(openAiRequest);
        return ResponseEntity.status(HttpStatus.OK).body(oAR.choices().getFirst().message().content());
    }
}
