// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderInvoiceSend` mutation.
*/
public class OrderInvoiceSendPayloadQuery extends Query<OrderInvoiceSendPayloadQuery> {
    OrderInvoiceSendPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The order associated with the invoice email.
    */
    public OrderInvoiceSendPayloadQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderInvoiceSendPayloadQuery userErrors(OrderInvoiceSendUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OrderInvoiceSendUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
