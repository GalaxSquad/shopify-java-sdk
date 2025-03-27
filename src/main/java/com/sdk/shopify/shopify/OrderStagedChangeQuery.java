// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A change that has been applied to an order.
*/
public class OrderStagedChangeQuery extends Query<OrderStagedChangeQuery> {
    OrderStagedChangeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public OrderStagedChangeQuery onOrderStagedChangeAddCustomItem(OrderStagedChangeAddCustomItemQueryDefinition queryDef) {
        startInlineFragment("OrderStagedChangeAddCustomItem");
        queryDef.define(new OrderStagedChangeAddCustomItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public OrderStagedChangeQuery onOrderStagedChangeAddLineItemDiscount(OrderStagedChangeAddLineItemDiscountQueryDefinition queryDef) {
        startInlineFragment("OrderStagedChangeAddLineItemDiscount");
        queryDef.define(new OrderStagedChangeAddLineItemDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public OrderStagedChangeQuery onOrderStagedChangeAddShippingLine(OrderStagedChangeAddShippingLineQueryDefinition queryDef) {
        startInlineFragment("OrderStagedChangeAddShippingLine");
        queryDef.define(new OrderStagedChangeAddShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public OrderStagedChangeQuery onOrderStagedChangeAddVariant(OrderStagedChangeAddVariantQueryDefinition queryDef) {
        startInlineFragment("OrderStagedChangeAddVariant");
        queryDef.define(new OrderStagedChangeAddVariantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public OrderStagedChangeQuery onOrderStagedChangeDecrementItem(OrderStagedChangeDecrementItemQueryDefinition queryDef) {
        startInlineFragment("OrderStagedChangeDecrementItem");
        queryDef.define(new OrderStagedChangeDecrementItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public OrderStagedChangeQuery onOrderStagedChangeIncrementItem(OrderStagedChangeIncrementItemQueryDefinition queryDef) {
        startInlineFragment("OrderStagedChangeIncrementItem");
        queryDef.define(new OrderStagedChangeIncrementItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public OrderStagedChangeQuery onOrderStagedChangeRemoveShippingLine(OrderStagedChangeRemoveShippingLineQueryDefinition queryDef) {
        startInlineFragment("OrderStagedChangeRemoveShippingLine");
        queryDef.define(new OrderStagedChangeRemoveShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
