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

public class SubscriptionBillingCyclesIndexRangeSelector implements Serializable {
    private int startIndex;

    private int endIndex;

    public SubscriptionBillingCyclesIndexRangeSelector(int startIndex, int endIndex) {
        this.startIndex = startIndex;

        this.endIndex = endIndex;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public SubscriptionBillingCyclesIndexRangeSelector setStartIndex(int startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public SubscriptionBillingCyclesIndexRangeSelector setEndIndex(int endIndex) {
        this.endIndex = endIndex;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("startIndex:");
        _queryBuilder.append(startIndex);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("endIndex:");
        _queryBuilder.append(endIndex);

        _queryBuilder.append('}');
    }
}
