package com.smartgnt.knowledgeassistant.knowledge.domain;

import java.time.Instant;

public record KnowledgeChunk(
        String chunkId,
        String documentId,
        int chunkIndex,
        String text,
        SourceType sourceType,
        String title,
        String sourceUrl,
        String projectKey,
        Instant lastUpdatedAt
) {
}
