// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a summary of the current version of data in a resource.
* The `compare_digest` field can be used as input for mutations that implement a compare-and-swap
* mechanism.
*/
public class HasCompareDigestQuery extends Query<HasCompareDigestQuery> {
    HasCompareDigestQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The data stored in the resource, represented as a digest.
    */
    public HasCompareDigestQuery compareDigest() {
        startField("compareDigest");

        return this;
    }

    public HasCompareDigestQuery onMetafield(MetafieldQueryDefinition queryDef) {
        startInlineFragment("Metafield");
        queryDef.define(new MetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
