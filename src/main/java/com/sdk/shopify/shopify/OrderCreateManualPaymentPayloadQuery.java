// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderCreateManualPayment` mutation.
*/
public class OrderCreateManualPaymentPayloadQuery extends Query<OrderCreateManualPaymentPayloadQuery> {
    OrderCreateManualPaymentPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The order recorded a manual payment.
    */
    public OrderCreateManualPaymentPayloadQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderCreateManualPaymentPayloadQuery userErrors(OrderCreateManualPaymentOrderCreateManualPaymentErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OrderCreateManualPaymentOrderCreateManualPaymentErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
