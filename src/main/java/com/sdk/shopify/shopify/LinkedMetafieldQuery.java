// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The identifier for the metafield linked to this option.
* This API is currently in early access. See [Metafield-linked product
* options](https://shopify.dev/docs/api/admin/migrate/new-product-model/metafield-linked) for more
* details.
*/
public class LinkedMetafieldQuery extends Query<LinkedMetafieldQuery> {
    LinkedMetafieldQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Key of the metafield the option is linked to.
    */
    public LinkedMetafieldQuery key() {
        startField("key");

        return this;
    }

    /**
    * Namespace of the metafield the option is linked to.
    */
    public LinkedMetafieldQuery namespace() {
        startField("namespace");

        return this;
    }
}
