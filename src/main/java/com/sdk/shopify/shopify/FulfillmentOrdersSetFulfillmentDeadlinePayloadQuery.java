// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentOrdersSetFulfillmentDeadline` mutation.
*/
public class FulfillmentOrdersSetFulfillmentDeadlinePayloadQuery extends Query<FulfillmentOrdersSetFulfillmentDeadlinePayloadQuery> {
    FulfillmentOrdersSetFulfillmentDeadlinePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the fulfillment deadline was successfully set.
    */
    public FulfillmentOrdersSetFulfillmentDeadlinePayloadQuery success() {
        startField("success");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentOrdersSetFulfillmentDeadlinePayloadQuery userErrors(FulfillmentOrdersSetFulfillmentDeadlineUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrdersSetFulfillmentDeadlineUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
