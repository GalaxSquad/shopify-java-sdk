// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The third-party confirmation of a reverse fulfillment order.
*/
public class ReverseFulfillmentOrderThirdPartyConfirmationQuery extends Query<ReverseFulfillmentOrderThirdPartyConfirmationQuery> {
    ReverseFulfillmentOrderThirdPartyConfirmationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The status of the reverse fulfillment order third-party confirmation.
    */
    public ReverseFulfillmentOrderThirdPartyConfirmationQuery status() {
        startField("status");

        return this;
    }
}
