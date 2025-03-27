// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderEditAddShippingLine` mutation.
*/
public class OrderEditAddShippingLinePayloadQuery extends Query<OrderEditAddShippingLinePayloadQuery> {
    OrderEditAddShippingLinePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
    * with the edits applied but not saved.
    */
    public OrderEditAddShippingLinePayloadQuery calculatedOrder(CalculatedOrderQueryDefinition queryDef) {
        startField("calculatedOrder");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The [calculated shipping
    * line](https://shopify.dev/api/admin-graphql/latest/objects/calculatedshippingline)
    * that's added during this order edit.
    */
    public OrderEditAddShippingLinePayloadQuery calculatedShippingLine(CalculatedShippingLineQueryDefinition queryDef) {
        startField("calculatedShippingLine");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderEditAddShippingLinePayloadQuery userErrors(OrderEditAddShippingLineUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OrderEditAddShippingLineUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
