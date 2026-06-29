package com.smartgnt.knowledgeassistant.web.ask;

import java.util.List;

public record AskResponse(
        String answer,
        String confidence,
        List<SourceReference> sources


) {
}
