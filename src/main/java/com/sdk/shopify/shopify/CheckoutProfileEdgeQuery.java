// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one CheckoutProfile and a cursor during pagination.
*/
public class CheckoutProfileEdgeQuery extends Query<CheckoutProfileEdgeQuery> {
    CheckoutProfileEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CheckoutProfileEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CheckoutProfileEdge.
    */
    public CheckoutProfileEdgeQuery node(CheckoutProfileQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutProfileQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
