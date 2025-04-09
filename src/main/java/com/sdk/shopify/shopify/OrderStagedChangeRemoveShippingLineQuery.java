// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A shipping line removed during an order edit.
*/
public class OrderStagedChangeRemoveShippingLineQuery extends Query<OrderStagedChangeRemoveShippingLineQuery> {
    OrderStagedChangeRemoveShippingLineQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The removed shipping line.
    */
    public OrderStagedChangeRemoveShippingLineQuery shippingLine(ShippingLineQueryDefinition queryDef) {
        startField("shippingLine");

        _queryBuilder.append('{');
        queryDef.define(new ShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
