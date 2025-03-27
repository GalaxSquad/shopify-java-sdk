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
* Describes the delivery method to use to get the physical goods to the customer.
*/
public class SubscriptionDeliveryMethodQuery extends Query<SubscriptionDeliveryMethodQuery> {
    SubscriptionDeliveryMethodQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public SubscriptionDeliveryMethodQuery onSubscriptionDeliveryMethodLocalDelivery(SubscriptionDeliveryMethodLocalDeliveryQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDeliveryMethodLocalDelivery");
        queryDef.define(new SubscriptionDeliveryMethodLocalDeliveryQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SubscriptionDeliveryMethodQuery onSubscriptionDeliveryMethodPickup(SubscriptionDeliveryMethodPickupQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDeliveryMethodPickup");
        queryDef.define(new SubscriptionDeliveryMethodPickupQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SubscriptionDeliveryMethodQuery onSubscriptionDeliveryMethodShipping(SubscriptionDeliveryMethodShippingQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDeliveryMethodShipping");
        queryDef.define(new SubscriptionDeliveryMethodShippingQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
