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
* The details about a reverse delivery line item.
*/
public class ReverseDeliveryLineItemQuery extends Query<ReverseDeliveryLineItemQuery> {
    ReverseDeliveryLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The dispositions of the item.
    */
    public ReverseDeliveryLineItemQuery dispositions(ReverseFulfillmentOrderDispositionQueryDefinition queryDef) {
        startField("dispositions");

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderDispositionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The expected number of units.
    */
    public ReverseDeliveryLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The corresponding reverse fulfillment order line item.
    */
    public ReverseDeliveryLineItemQuery reverseFulfillmentOrderLineItem(ReverseFulfillmentOrderLineItemQueryDefinition queryDef) {
        startField("reverseFulfillmentOrderLineItem");

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
