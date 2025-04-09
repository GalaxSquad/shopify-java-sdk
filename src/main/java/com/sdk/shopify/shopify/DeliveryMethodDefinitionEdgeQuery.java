// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one DeliveryMethodDefinition and a cursor during pagination.
*/
public class DeliveryMethodDefinitionEdgeQuery extends Query<DeliveryMethodDefinitionEdgeQuery> {
    DeliveryMethodDefinitionEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public DeliveryMethodDefinitionEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of DeliveryMethodDefinitionEdge.
    */
    public DeliveryMethodDefinitionEdgeQuery node(DeliveryMethodDefinitionQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryMethodDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
