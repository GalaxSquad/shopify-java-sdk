// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Translatable content of a resource's field.
*/
public class TranslatableContentQuery extends Query<TranslatableContentQuery> {
    TranslatableContentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Hash digest representation of the content value.
    */
    public TranslatableContentQuery digest() {
        startField("digest");

        return this;
    }

    /**
    * The resource field that's being translated.
    */
    public TranslatableContentQuery key() {
        startField("key");

        return this;
    }

    /**
    * Locale of the content.
    */
    public TranslatableContentQuery locale() {
        startField("locale");

        return this;
    }

    /**
    * Type of the translatable content.
    */
    public TranslatableContentQuery type() {
        startField("type");

        return this;
    }

    /**
    * Content value.
    */
    public TranslatableContentQuery value() {
        startField("value");

        return this;
    }
}
