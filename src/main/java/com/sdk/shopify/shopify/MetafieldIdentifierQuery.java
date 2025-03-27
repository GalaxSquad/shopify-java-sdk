// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Identifies a metafield by its owner resource, namespace, and key.
*/
public class MetafieldIdentifierQuery extends Query<MetafieldIdentifierQuery> {
    MetafieldIdentifierQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The key of the metafield.
    */
    public MetafieldIdentifierQuery key() {
        startField("key");

        return this;
    }

    /**
    * The namespace of the metafield.
    */
    public MetafieldIdentifierQuery namespace() {
        startField("namespace");

        return this;
    }

    /**
    * GID of the owner resource that the metafield belongs to.
    */
    public MetafieldIdentifierQuery ownerId() {
        startField("ownerId");

        return this;
    }
}
