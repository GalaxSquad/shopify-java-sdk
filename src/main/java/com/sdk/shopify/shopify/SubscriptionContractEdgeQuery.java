// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one SubscriptionContract and a cursor during pagination.
*/
public class SubscriptionContractEdgeQuery extends Query<SubscriptionContractEdgeQuery> {
    SubscriptionContractEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public SubscriptionContractEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of SubscriptionContractEdge.
    */
    public SubscriptionContractEdgeQuery node(SubscriptionContractQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
