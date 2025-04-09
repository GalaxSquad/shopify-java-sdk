// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An removal of items from an existing line item on the order.
*/
public class OrderStagedChangeDecrementItemQuery extends Query<OrderStagedChangeDecrementItemQuery> {
    OrderStagedChangeDecrementItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The number of items removed.
    */
    public OrderStagedChangeDecrementItemQuery delta() {
        startField("delta");

        return this;
    }

    /**
    * The original line item.
    */
    public OrderStagedChangeDecrementItemQuery lineItem(LineItemQueryDefinition queryDef) {
        startField("lineItem");

        _queryBuilder.append('{');
        queryDef.define(new LineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The intention to restock the removed items.
    */
    public OrderStagedChangeDecrementItemQuery restock() {
        startField("restock");

        return this;
    }
}
