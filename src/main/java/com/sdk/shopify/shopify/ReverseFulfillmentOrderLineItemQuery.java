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
* The details about a reverse fulfillment order line item.
*/
public class ReverseFulfillmentOrderLineItemQuery extends Query<ReverseFulfillmentOrderLineItemQuery> {
    ReverseFulfillmentOrderLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The dispositions of the item.
    */
    public ReverseFulfillmentOrderLineItemQuery dispositions(ReverseFulfillmentOrderDispositionQueryDefinition queryDef) {
        startField("dispositions");

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderDispositionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The corresponding fulfillment line item for a reverse fulfillment order line item.
    */
    public ReverseFulfillmentOrderLineItemQuery fulfillmentLineItem(FulfillmentLineItemQueryDefinition queryDef) {
        startField("fulfillmentLineItem");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total number of units to be processed.
    */
    public ReverseFulfillmentOrderLineItemQuery totalQuantity() {
        startField("totalQuantity");

        return this;
    }
}
