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
* A local delivery option for a subscription contract.
*/
public class SubscriptionLocalDeliveryOptionQuery extends Query<SubscriptionLocalDeliveryOptionQuery> {
    SubscriptionLocalDeliveryOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code of the local delivery option.
    */
    public SubscriptionLocalDeliveryOptionQuery code() {
        startField("code");

        return this;
    }

    /**
    * The description of the local delivery option.
    */
    public SubscriptionLocalDeliveryOptionQuery description() {
        startField("description");

        return this;
    }

    /**
    * Whether a phone number is required for the local delivery option.
    */
    public SubscriptionLocalDeliveryOptionQuery phoneRequired() {
        startField("phoneRequired");

        return this;
    }

    /**
    * The presentment title of the local delivery option.
    */
    public SubscriptionLocalDeliveryOptionQuery presentmentTitle() {
        startField("presentmentTitle");

        return this;
    }

    /**
    * The price of the local delivery option.
    */
    public SubscriptionLocalDeliveryOptionQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The title of the local delivery option.
    */
    public SubscriptionLocalDeliveryOptionQuery title() {
        startField("title");

        return this;
    }
}
