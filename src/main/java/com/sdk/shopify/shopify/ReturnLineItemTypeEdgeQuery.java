// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ReturnLineItemType and a cursor during pagination.
*/
public class ReturnLineItemTypeEdgeQuery extends Query<ReturnLineItemTypeEdgeQuery> {
    ReturnLineItemTypeEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ReturnLineItemTypeEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ReturnLineItemTypeEdge.
    */
    public ReturnLineItemTypeEdgeQuery node(ReturnLineItemTypeQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ReturnLineItemTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
