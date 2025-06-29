package org.springframework.boot.meilisearch.core;

import java.util.List;
import java.util.Optional;

public interface MeilisearchOperations {
    <T> void createIndex(String indexName, Class<T> documentClass);

    <T> void addDocument(String indexName, T document);

    <T> void addDocuments(String indexName, List<T> documents);

    <T> Optional<T> getDocument(String indexName, String documentId, Class<T> documentClass);

    <T> List<T> search(String indexName, String query, Class<T> documentClass);

    void deleteDocument(String indexName, String documentId);

    void deleteIndex(String indexName);
}
