// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentOrderSubmitFulfillmentRequest` mutation.
*/
public class FulfillmentOrderSubmitFulfillmentRequestPayloadQuery extends Query<FulfillmentOrderSubmitFulfillmentRequestPayloadQuery> {
    FulfillmentOrderSubmitFulfillmentRequestPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The original fulfillment order intended to request fulfillment for.
    */
    public FulfillmentOrderSubmitFulfillmentRequestPayloadQuery originalFulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("originalFulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The fulfillment order that was submitted to the fulfillment service. This will be the same as
    * the original fulfillment order field. The exception to this is partial fulfillment requests or
    * fulfillment request for cancelled or incomplete fulfillment orders.
    */
    public FulfillmentOrderSubmitFulfillmentRequestPayloadQuery submittedFulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("submittedFulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * This field will only be present for partial fulfillment requests. This will represent the new
    * fulfillment order with the remaining line items not submitted to the fulfillment service.
    */
    public FulfillmentOrderSubmitFulfillmentRequestPayloadQuery unsubmittedFulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("unsubmittedFulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentOrderSubmitFulfillmentRequestPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
