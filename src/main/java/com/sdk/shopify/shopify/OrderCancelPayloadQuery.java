// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderCancel` mutation.
*/
public class OrderCancelPayloadQuery extends Query<OrderCancelPayloadQuery> {
    OrderCancelPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The job that asynchronously cancels the order.
    */
    public OrderCancelPayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderCancelPayloadQuery orderCancelUserErrors(OrderCancelUserErrorQueryDefinition queryDef) {
        startField("orderCancelUserErrors");

        _queryBuilder.append('{');
        queryDef.define(new OrderCancelUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
