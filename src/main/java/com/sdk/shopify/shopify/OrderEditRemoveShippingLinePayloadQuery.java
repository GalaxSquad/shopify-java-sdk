// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderEditRemoveShippingLine` mutation.
*/
public class OrderEditRemoveShippingLinePayloadQuery extends Query<OrderEditRemoveShippingLinePayloadQuery> {
    OrderEditRemoveShippingLinePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
    * with the edits applied but not saved.
    */
    public OrderEditRemoveShippingLinePayloadQuery calculatedOrder(CalculatedOrderQueryDefinition queryDef) {
        startField("calculatedOrder");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderEditRemoveShippingLinePayloadQuery userErrors(OrderEditRemoveShippingLineUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OrderEditRemoveShippingLineUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
