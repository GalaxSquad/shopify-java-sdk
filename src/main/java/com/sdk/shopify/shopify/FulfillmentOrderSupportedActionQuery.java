// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* One of the actions that the fulfillment order supports in its current state.
*/
public class FulfillmentOrderSupportedActionQuery extends Query<FulfillmentOrderSupportedActionQuery> {
    FulfillmentOrderSupportedActionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The action value.
    */
    public FulfillmentOrderSupportedActionQuery action() {
        startField("action");

        return this;
    }

    /**
    * The external URL to be used to initiate the fulfillment process outside Shopify.
    * Applicable only when the `action` value is `EXTERNAL`.
    */
    public FulfillmentOrderSupportedActionQuery externalUrl() {
        startField("externalUrl");

        return this;
    }
}
