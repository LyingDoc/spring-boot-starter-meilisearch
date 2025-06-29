package org.springframework.boot.meilisearch;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "spring.meilisearch")
public class MeilisearchProperties {
    /**
     * Meilisearch host URL
     */
    private String host = "http://localhost:7700";

    /**
     * API key for authentication
     */
    private String apiKey;

}