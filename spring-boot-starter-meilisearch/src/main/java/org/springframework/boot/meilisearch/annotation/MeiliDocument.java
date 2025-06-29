package org.springframework.boot.meilisearch.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MeiliDocument {
    String uid();
    String primaryKey() default "id";
}
