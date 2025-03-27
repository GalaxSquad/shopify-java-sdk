// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A summary of the important details for a dispute on an order.
*/
public class OrderDisputeSummaryQuery extends Query<OrderDisputeSummaryQuery> {
    OrderDisputeSummaryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The type that the dispute was initiated as.
    */
    public OrderDisputeSummaryQuery initiatedAs() {
        startField("initiatedAs");

        return this;
    }

    /**
    * The current status of the dispute.
    */
    public OrderDisputeSummaryQuery status() {
        startField("status");

        return this;
    }
}
