// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* Return type for `orderEditRemoveLineItemDiscount` mutation.
*/
public class OrderEditRemoveLineItemDiscountPayloadQuery extends Query<OrderEditRemoveLineItemDiscountPayloadQuery> {
    OrderEditRemoveLineItemDiscountPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The calculated line item after removal of the discount.
    */
    public OrderEditRemoveLineItemDiscountPayloadQuery calculatedLineItem(CalculatedLineItemQueryDefinition queryDef) {
        startField("calculatedLineItem");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An order with the edits applied but not saved.
    */
    public OrderEditRemoveLineItemDiscountPayloadQuery calculatedOrder(CalculatedOrderQueryDefinition queryDef) {
        startField("calculatedOrder");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderEditRemoveLineItemDiscountPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
