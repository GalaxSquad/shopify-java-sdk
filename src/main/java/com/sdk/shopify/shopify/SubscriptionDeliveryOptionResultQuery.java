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
* The result of the query to fetch delivery options for the subscription contract.
*/
public class SubscriptionDeliveryOptionResultQuery extends Query<SubscriptionDeliveryOptionResultQuery> {
    SubscriptionDeliveryOptionResultQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public SubscriptionDeliveryOptionResultQuery onSubscriptionDeliveryOptionResultFailure(SubscriptionDeliveryOptionResultFailureQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDeliveryOptionResultFailure");
        queryDef.define(new SubscriptionDeliveryOptionResultFailureQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SubscriptionDeliveryOptionResultQuery onSubscriptionDeliveryOptionResultSuccess(SubscriptionDeliveryOptionResultSuccessQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDeliveryOptionResultSuccess");
        queryDef.define(new SubscriptionDeliveryOptionResultSuccessQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
