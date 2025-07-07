// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Identifies a metafield definition by its owner type, namespace, and key.
*/
public class MetafieldDefinitionIdentifierQuery extends Query<MetafieldDefinitionIdentifierQuery> {
    MetafieldDefinitionIdentifierQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The unique identifier for the metafield definition within its namespace.
    */
    public MetafieldDefinitionIdentifierQuery key() {
        startField("key");

        return this;
    }

    /**
    * The container for a group of metafields that the metafield definition is associated with.
    */
    public MetafieldDefinitionIdentifierQuery namespace() {
        startField("namespace");

        return this;
    }

    /**
    * The resource type that the metafield definition is attached to.
    */
    public MetafieldDefinitionIdentifierQuery ownerType() {
        startField("ownerType");

        return this;
    }
}
