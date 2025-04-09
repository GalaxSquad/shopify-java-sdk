// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A fulfillment order line item warning. For example, a warning about why a fulfillment request was
* rejected.
*/
public class FulfillmentOrderLineItemWarningQuery extends Query<FulfillmentOrderLineItemWarningQuery> {
    FulfillmentOrderLineItemWarningQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The description of warning.
    */
    public FulfillmentOrderLineItemWarningQuery description() {
        startField("description");

        return this;
    }

    /**
    * The title of warning.
    */
    public FulfillmentOrderLineItemWarningQuery title() {
        startField("title");

        return this;
    }
}
