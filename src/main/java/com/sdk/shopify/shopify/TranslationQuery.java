// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Translation of a field of a resource.
*/
public class TranslationQuery extends Query<TranslationQuery> {
    TranslationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * On the resource that this translation belongs to, the reference to the value being translated.
    */
    public TranslationQuery key() {
        startField("key");

        return this;
    }

    /**
    * ISO code of the translation locale.
    */
    public TranslationQuery locale() {
        startField("locale");

        return this;
    }

    /**
    * The market that the translation is specific to. Null value means the translation is available in all
    * markets.
    */
    public TranslationQuery market(MarketQueryDefinition queryDef) {
        startField("market");

        _queryBuilder.append('{');
        queryDef.define(new MarketQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the original content has changed since this translation was updated.
    */
    public TranslationQuery outdated() {
        startField("outdated");

        return this;
    }

    /**
    * The date and time when the translation was updated.
    */
    public TranslationQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * Translation value.
    */
    public TranslationQuery value() {
        startField("value");

        return this;
    }
}
