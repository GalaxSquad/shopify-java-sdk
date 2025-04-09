// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one DeliveryCustomization and a cursor during pagination.
*/
public class DeliveryCustomizationEdgeQuery extends Query<DeliveryCustomizationEdgeQuery> {
    DeliveryCustomizationEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public DeliveryCustomizationEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of DeliveryCustomizationEdge.
    */
    public DeliveryCustomizationEdgeQuery node(DeliveryCustomizationQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
