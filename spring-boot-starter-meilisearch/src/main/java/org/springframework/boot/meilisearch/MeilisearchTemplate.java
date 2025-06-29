package org.springframework.boot.meilisearch;

import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Index;
import lombok.Getter;
import org.springframework.util.Assert;

public class MeilisearchTemplate {

    @Getter
    private final Index index;

    public MeilisearchTemplate(Index meilisearchIndex) {
        Assert.notNull(meilisearchIndex, "client must not be null");
        this.index = meilisearchIndex;
    }



}
