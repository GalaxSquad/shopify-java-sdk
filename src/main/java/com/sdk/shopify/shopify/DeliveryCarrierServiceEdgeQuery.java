// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one DeliveryCarrierService and a cursor during pagination.
*/
public class DeliveryCarrierServiceEdgeQuery extends Query<DeliveryCarrierServiceEdgeQuery> {
    DeliveryCarrierServiceEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public DeliveryCarrierServiceEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of DeliveryCarrierServiceEdge.
    */
    public DeliveryCarrierServiceEdgeQuery node(DeliveryCarrierServiceQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCarrierServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
