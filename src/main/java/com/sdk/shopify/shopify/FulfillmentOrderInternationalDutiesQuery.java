// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The international duties relevant to a fulfillment order.
*/
public class FulfillmentOrderInternationalDutiesQuery extends Query<FulfillmentOrderInternationalDutiesQuery> {
    FulfillmentOrderInternationalDutiesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The method of duties payment. Example values: `DDP`, `DAP`.
    */
    public FulfillmentOrderInternationalDutiesQuery incoterm() {
        startField("incoterm");

        return this;
    }
}
