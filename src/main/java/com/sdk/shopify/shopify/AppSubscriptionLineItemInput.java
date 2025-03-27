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

import java.io.Serializable;

public class AppSubscriptionLineItemInput implements Serializable {
    private AppPlanInput plan;

    public AppSubscriptionLineItemInput(AppPlanInput plan) {
        this.plan = plan;
    }

    public AppPlanInput getPlan() {
        return plan;
    }

    public AppSubscriptionLineItemInput setPlan(AppPlanInput plan) {
        this.plan = plan;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("plan:");
        plan.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
