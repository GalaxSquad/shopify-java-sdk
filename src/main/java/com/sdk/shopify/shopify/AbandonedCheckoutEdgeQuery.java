// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one AbandonedCheckout and a cursor during pagination.
*/
public class AbandonedCheckoutEdgeQuery extends Query<AbandonedCheckoutEdgeQuery> {
    AbandonedCheckoutEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public AbandonedCheckoutEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of AbandonedCheckoutEdge.
    */
    public AbandonedCheckoutEdgeQuery node(AbandonedCheckoutQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new AbandonedCheckoutQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
