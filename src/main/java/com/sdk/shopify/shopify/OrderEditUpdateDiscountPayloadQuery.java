// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderEditUpdateDiscount` mutation.
*/
public class OrderEditUpdateDiscountPayloadQuery extends Query<OrderEditUpdateDiscountPayloadQuery> {
    OrderEditUpdateDiscountPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * An order with the edits applied but not saved.
    */
    public OrderEditUpdateDiscountPayloadQuery calculatedOrder(CalculatedOrderQueryDefinition queryDef) {
        startField("calculatedOrder");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderEditUpdateDiscountPayloadQuery userErrors(OrderEditUpdateDiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OrderEditUpdateDiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
