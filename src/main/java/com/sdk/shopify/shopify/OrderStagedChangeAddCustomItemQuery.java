// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A change to the order representing the addition of a
* custom line item. For example, you might want to add gift wrapping service
* as a custom line item.
*/
public class OrderStagedChangeAddCustomItemQuery extends Query<OrderStagedChangeAddCustomItemQuery> {
    OrderStagedChangeAddCustomItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The price of an individual item without any discounts applied. This value can't be negative.
    */
    public OrderStagedChangeAddCustomItemQuery originalUnitPrice(MoneyV2QueryDefinition queryDef) {
        startField("originalUnitPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity of the custom item to add to the order. This value must be greater than zero.
    */
    public OrderStagedChangeAddCustomItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The title of the custom item.
    */
    public OrderStagedChangeAddCustomItemQuery title() {
        startField("title");

        return this;
    }
}
