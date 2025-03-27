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
* A request made by the merchant or an order management app to a fulfillment service
* for a fulfillment order.
*/
public class FulfillmentOrderMerchantRequestQuery extends Query<FulfillmentOrderMerchantRequestQuery> {
    FulfillmentOrderMerchantRequestQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The fulfillment order associated with the merchant request.
    */
    public FulfillmentOrderMerchantRequestQuery fulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("fulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The kind of request made.
    */
    public FulfillmentOrderMerchantRequestQuery kind() {
        startField("kind");

        return this;
    }

    /**
    * The optional message that the merchant included in the request.
    */
    public FulfillmentOrderMerchantRequestQuery message() {
        startField("message");

        return this;
    }

    /**
    * Additional options requested by the merchant. These depend on the `kind` of the request.
    * For example, for a `FULFILLMENT_REQUEST`, one option is `notify_customer`, which indicates whether
    * the
    * merchant intends to notify the customer upon fulfillment. The fulfillment service can then set
    * `notifyCustomer` when making calls to `FulfillmentCreate`.
    */
    public FulfillmentOrderMerchantRequestQuery requestOptions() {
        startField("requestOptions");

        return this;
    }

    /**
    * The response from the fulfillment service.
    */
    public FulfillmentOrderMerchantRequestQuery responseData() {
        startField("responseData");

        return this;
    }

    /**
    * The timestamp when the request was made.
    */
    public FulfillmentOrderMerchantRequestQuery sentAt() {
        startField("sentAt");

        return this;
    }
}
