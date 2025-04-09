// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ExchangeLineItem and a cursor during pagination.
*/
public class ExchangeLineItemEdgeQuery extends Query<ExchangeLineItemEdgeQuery> {
    ExchangeLineItemEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ExchangeLineItemEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ExchangeLineItemEdge.
    */
    public ExchangeLineItemEdgeQuery node(ExchangeLineItemQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ExchangeLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
