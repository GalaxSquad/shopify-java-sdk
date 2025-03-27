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
* Represents the selected shipping option on a subscription contract.
*/
public class SubscriptionDeliveryMethodShippingOptionQuery extends Query<SubscriptionDeliveryMethodShippingOptionQuery> {
    SubscriptionDeliveryMethodShippingOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code of the shipping option.
    */
    public SubscriptionDeliveryMethodShippingOptionQuery code() {
        startField("code");

        return this;
    }

    /**
    * The description of the shipping option.
    */
    public SubscriptionDeliveryMethodShippingOptionQuery description() {
        startField("description");

        return this;
    }

    /**
    * The presentment title of the shipping option.
    */
    public SubscriptionDeliveryMethodShippingOptionQuery presentmentTitle() {
        startField("presentmentTitle");

        return this;
    }

    /**
    * The title of the shipping option.
    */
    public SubscriptionDeliveryMethodShippingOptionQuery title() {
        startField("title");

        return this;
    }
}
