// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentOrderAcceptCancellationRequest` mutation.
*/
public class FulfillmentOrderAcceptCancellationRequestPayloadQuery extends Query<FulfillmentOrderAcceptCancellationRequestPayloadQuery> {
    FulfillmentOrderAcceptCancellationRequestPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The fulfillment order whose cancellation request was accepted.
    */
    public FulfillmentOrderAcceptCancellationRequestPayloadQuery fulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("fulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentOrderAcceptCancellationRequestPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
