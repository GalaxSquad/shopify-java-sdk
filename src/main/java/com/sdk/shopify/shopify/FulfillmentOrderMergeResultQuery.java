// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The result of merging a set of fulfillment orders.
*/
public class FulfillmentOrderMergeResultQuery extends Query<FulfillmentOrderMergeResultQuery> {
    FulfillmentOrderMergeResultQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The new fulfillment order as a result of the merge.
    */
    public FulfillmentOrderMergeResultQuery fulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("fulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
