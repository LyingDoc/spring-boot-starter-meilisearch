package org.springframework.boot.meilisearch;

import com.meilisearch.sdk.SearchRequest;
import com.meilisearch.sdk.model.SearchResult;

import java.util.Optional;

public interface MeilisearchOperations {
    /**
     * Save entity to index
     */
    <T> T save(T entity);

}
