package com.smartgnt.knowledgeassistant.web.ask;

public record SourceReference(
        String documentId,
        String title,
        String sourceUrl,
        String excerpt
) {
}
