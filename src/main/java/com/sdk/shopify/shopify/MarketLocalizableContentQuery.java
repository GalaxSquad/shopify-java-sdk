// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The market localizable content of a resource's field.
*/
public class MarketLocalizableContentQuery extends Query<MarketLocalizableContentQuery> {
    MarketLocalizableContentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The hash digest representation of the content value.
    */
    public MarketLocalizableContentQuery digest() {
        startField("digest");

        return this;
    }

    /**
    * The resource field that's being localized.
    */
    public MarketLocalizableContentQuery key() {
        startField("key");

        return this;
    }

    /**
    * The content value.
    */
    public MarketLocalizableContentQuery value() {
        startField("value");

        return this;
    }
}
