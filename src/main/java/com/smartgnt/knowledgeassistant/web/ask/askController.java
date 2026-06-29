package com.smartgnt.knowledgeassistant.web.ask;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class askController {
@PostMapping("/api/ask")
    public AskResponse ask(@RequestBody AskRequest request){
   return new AskResponse(
           "the assistant is not connected yet. Received question: " + request.question(),
           "LOW",
           List.of(
                   new SourceReference(
                           "demo-doc-1",
                           "Demo source",
                           "https://example.com/demo",
                           "this is a placeholder source reference."
                   )
           )
   );
}
}
