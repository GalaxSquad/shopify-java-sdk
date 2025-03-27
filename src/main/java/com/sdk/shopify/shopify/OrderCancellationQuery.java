// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Details about the order cancellation.
*/
public class OrderCancellationQuery extends Query<OrderCancellationQuery> {
    OrderCancellationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Staff provided note for the order cancellation.
    */
    public OrderCancellationQuery staffNote() {
        startField("staffNote");

        return this;
    }
}
