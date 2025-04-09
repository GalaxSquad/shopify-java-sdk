// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The discount applied to an item that was added during the current order edit.
*/
public class OrderStagedChangeAddLineItemDiscountQuery extends Query<OrderStagedChangeAddLineItemDiscountQuery> {
    OrderStagedChangeAddLineItemDiscountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The description of the discount.
    */
    public OrderStagedChangeAddLineItemDiscountQuery description() {
        startField("description");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public OrderStagedChangeAddLineItemDiscountQuery id() {
        startField("id");

        return this;
    }

    /**
    * The pricing value of the discount.
    */
    public OrderStagedChangeAddLineItemDiscountQuery value(PricingValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new PricingValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
