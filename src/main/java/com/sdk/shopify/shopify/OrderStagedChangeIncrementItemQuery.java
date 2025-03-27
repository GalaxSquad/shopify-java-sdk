// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An addition of items to an existing line item on the order.
*/
public class OrderStagedChangeIncrementItemQuery extends Query<OrderStagedChangeIncrementItemQuery> {
    OrderStagedChangeIncrementItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The number of items added.
    */
    public OrderStagedChangeIncrementItemQuery delta() {
        startField("delta");

        return this;
    }

    /**
    * The original line item.
    */
    public OrderStagedChangeIncrementItemQuery lineItem(LineItemQueryDefinition queryDef) {
        startField("lineItem");

        _queryBuilder.append('{');
        queryDef.define(new LineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
