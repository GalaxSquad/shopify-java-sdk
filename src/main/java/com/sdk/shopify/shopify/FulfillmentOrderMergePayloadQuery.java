// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentOrderMerge` mutation.
*/
public class FulfillmentOrderMergePayloadQuery extends Query<FulfillmentOrderMergePayloadQuery> {
    FulfillmentOrderMergePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The result of the fulfillment order merges.
    */
    public FulfillmentOrderMergePayloadQuery fulfillmentOrderMerges(FulfillmentOrderMergeResultQueryDefinition queryDef) {
        startField("fulfillmentOrderMerges");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderMergeResultQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentOrderMergePayloadQuery userErrors(FulfillmentOrderMergeUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderMergeUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
