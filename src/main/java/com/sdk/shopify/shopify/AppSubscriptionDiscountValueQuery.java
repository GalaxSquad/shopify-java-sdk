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
* The value of the discount.
*/
public class AppSubscriptionDiscountValueQuery extends Query<AppSubscriptionDiscountValueQuery> {
    AppSubscriptionDiscountValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public AppSubscriptionDiscountValueQuery onAppSubscriptionDiscountAmount(AppSubscriptionDiscountAmountQueryDefinition queryDef) {
        startInlineFragment("AppSubscriptionDiscountAmount");
        queryDef.define(new AppSubscriptionDiscountAmountQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public AppSubscriptionDiscountValueQuery onAppSubscriptionDiscountPercentage(AppSubscriptionDiscountPercentageQueryDefinition queryDef) {
        startInlineFragment("AppSubscriptionDiscountPercentage");
        queryDef.define(new AppSubscriptionDiscountPercentageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
