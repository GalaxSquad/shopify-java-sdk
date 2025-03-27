// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderEditAddLineItemDiscount` mutation.
*/
public class OrderEditAddLineItemDiscountPayloadQuery extends Query<OrderEditAddLineItemDiscountPayloadQuery> {
    OrderEditAddLineItemDiscountPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The discount applied to a line item during this order edit.
    */
    public OrderEditAddLineItemDiscountPayloadQuery addedDiscountStagedChange(OrderStagedChangeAddLineItemDiscountQueryDefinition queryDef) {
        startField("addedDiscountStagedChange");

        _queryBuilder.append('{');
        queryDef.define(new OrderStagedChangeAddLineItemDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The line item with the edits applied but not saved.
    */
    public OrderEditAddLineItemDiscountPayloadQuery calculatedLineItem(CalculatedLineItemQueryDefinition queryDef) {
        startField("calculatedLineItem");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An order with the edits applied but not saved.
    */
    public OrderEditAddLineItemDiscountPayloadQuery calculatedOrder(CalculatedOrderQueryDefinition queryDef) {
        startField("calculatedOrder");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderEditAddLineItemDiscountPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
