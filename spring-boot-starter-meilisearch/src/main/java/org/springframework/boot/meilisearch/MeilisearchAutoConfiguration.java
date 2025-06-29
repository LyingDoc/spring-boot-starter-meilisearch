package org.springframework.boot.meilisearch;

import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import com.meilisearch.sdk.Index;
import com.meilisearch.sdk.model.TaskInfo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(MeilisearchProperties.class)
public class MeilisearchAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Client meilisearchClient(MeilisearchProperties properties) {
        Config config = new Config(
                properties.getApiKey(),
                properties.getHost()
        );
        return new Client(config);
    }

    @Bean
    @ConditionalOnMissingBean
    public MeilisearchTemplate meilisearchTemplate(Client meilisearchClient) {
        Index index=meilisearchClient.getIndex("meilisearch");
        if (index==null) {
            TaskInfo info=meilisearchClient.createIndex("meilisearch","id");
            index=meilisearchClient.getIndex("meilisearch");
        }
        return new MeilisearchTemplate(index);
    }
}