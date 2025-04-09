// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentOrderSplit` mutation.
*/
public class FulfillmentOrderSplitPayloadQuery extends Query<FulfillmentOrderSplitPayloadQuery> {
    FulfillmentOrderSplitPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The result of the fulfillment order splits.
    */
    public FulfillmentOrderSplitPayloadQuery fulfillmentOrderSplits(FulfillmentOrderSplitResultQueryDefinition queryDef) {
        startField("fulfillmentOrderSplits");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderSplitResultQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentOrderSplitPayloadQuery userErrors(FulfillmentOrderSplitUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderSplitUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
