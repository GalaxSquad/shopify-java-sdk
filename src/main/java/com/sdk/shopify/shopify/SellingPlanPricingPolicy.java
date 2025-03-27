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
* Represents the type of pricing associated to the selling plan (for example, a $10 or 20% discount
* that is set
* for a limited period or that is fixed for the duration of the subscription). Selling plan pricing
* policies and
* associated records (selling plan groups, selling plans, billing policy, and delivery policy) are
* deleted 48
* hours after a merchant uninstalls their subscriptions app. We recommend backing up these records if
* you need
* to restore them later.
*/

public interface SellingPlanPricingPolicy {
    String getGraphQlTypeName();
}

