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
* A shipping option for delivery of a subscription contract.
*/
public class SubscriptionShippingOptionResultSuccessQuery extends Query<SubscriptionShippingOptionResultSuccessQuery> {
    SubscriptionShippingOptionResultSuccessQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Available shipping options.
    */
    public SubscriptionShippingOptionResultSuccessQuery shippingOptions(SubscriptionShippingOptionQueryDefinition queryDef) {
        startField("shippingOptions");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionShippingOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
