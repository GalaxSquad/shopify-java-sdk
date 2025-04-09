// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one PaymentSchedule and a cursor during pagination.
*/
public class PaymentScheduleEdgeQuery extends Query<PaymentScheduleEdgeQuery> {
    PaymentScheduleEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public PaymentScheduleEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of PaymentScheduleEdge.
    */
    public PaymentScheduleEdgeQuery node(PaymentScheduleQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new PaymentScheduleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
