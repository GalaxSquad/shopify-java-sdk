// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderEditAddCustomItem` mutation.
*/
public class OrderEditAddCustomItemPayloadQuery extends Query<OrderEditAddCustomItemPayloadQuery> {
    OrderEditAddCustomItemPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The custom line item that will be added to the order based on the current edits.
    */
    public OrderEditAddCustomItemPayloadQuery calculatedLineItem(CalculatedLineItemQueryDefinition queryDef) {
        startField("calculatedLineItem");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An order with the edits applied but not saved.
    */
    public OrderEditAddCustomItemPayloadQuery calculatedOrder(CalculatedOrderQueryDefinition queryDef) {
        startField("calculatedOrder");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderEditAddCustomItemPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
