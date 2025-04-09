// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Information about product is restricted for a given resource.
*/
public class RestrictedForResourceQuery extends Query<RestrictedForResourceQuery> {
    RestrictedForResourceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Returns true when the product is restricted for the given resource.
    */
    public RestrictedForResourceQuery restricted() {
        startField("restricted");

        return this;
    }

    /**
    * Restriction reason for the given resource.
    */
    public RestrictedForResourceQuery restrictedReason() {
        startField("restrictedReason");

        return this;
    }
}
