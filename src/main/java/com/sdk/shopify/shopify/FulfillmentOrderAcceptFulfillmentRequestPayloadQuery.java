// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentOrderAcceptFulfillmentRequest` mutation.
*/
public class FulfillmentOrderAcceptFulfillmentRequestPayloadQuery extends Query<FulfillmentOrderAcceptFulfillmentRequestPayloadQuery> {
    FulfillmentOrderAcceptFulfillmentRequestPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The fulfillment order whose fulfillment request was accepted.
    */
    public FulfillmentOrderAcceptFulfillmentRequestPayloadQuery fulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("fulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentOrderAcceptFulfillmentRequestPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
