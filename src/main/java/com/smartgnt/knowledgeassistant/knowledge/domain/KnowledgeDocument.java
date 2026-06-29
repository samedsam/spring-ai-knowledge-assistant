package com.smartgnt.knowledgeassistant.knowledge.domain;

import java.time.Instant;
import java.util.List;

public record KnowledgeDocument(
        String id,
        SourceType sourceType,
        String title,
        String content,
        String sourceUrl,
        String projectKey,
        String author,
        Instant lastUpdatedAt,
        List<String> tags
) {
}
