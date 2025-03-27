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
* Represents the delivery frequency associated to the selling plan (for example, deliver every month,
* or deliver
* every other week). The selling plan delivery policy and associated records (selling plan groups,
* selling plans,
* pricing policies, and billing policy) are deleted 48 hours after a merchant uninstalls their
* subscriptions app.
* We recommend backing up these records if you need to restore them later.
*/

public interface SellingPlanDeliveryPolicy {
    String getGraphQlTypeName();
}

