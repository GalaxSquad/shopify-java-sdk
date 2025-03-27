// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderCapture` mutation.
*/
public class OrderCapturePayloadQuery extends Query<OrderCapturePayloadQuery> {
    OrderCapturePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created capture transaction.
    */
    public OrderCapturePayloadQuery transaction(OrderTransactionQueryDefinition queryDef) {
        startField("transaction");

        _queryBuilder.append('{');
        queryDef.define(new OrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderCapturePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
