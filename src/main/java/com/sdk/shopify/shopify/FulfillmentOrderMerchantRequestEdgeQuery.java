// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one FulfillmentOrderMerchantRequest and a cursor during
* pagination.
*/
public class FulfillmentOrderMerchantRequestEdgeQuery extends Query<FulfillmentOrderMerchantRequestEdgeQuery> {
    FulfillmentOrderMerchantRequestEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public FulfillmentOrderMerchantRequestEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of FulfillmentOrderMerchantRequestEdge.
    */
    public FulfillmentOrderMerchantRequestEdgeQuery node(FulfillmentOrderMerchantRequestQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderMerchantRequestQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
