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

public class SubscriptionBillingCyclesDateRangeSelector implements Serializable {
    private String startDate;

    private String endDate;

    public SubscriptionBillingCyclesDateRangeSelector(String startDate, String endDate) {
        this.startDate = startDate;

        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public SubscriptionBillingCyclesDateRangeSelector setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public SubscriptionBillingCyclesDateRangeSelector setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("startDate:");
        Query.appendQuotedString(_queryBuilder, startDate.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("endDate:");
        Query.appendQuotedString(_queryBuilder, endDate.toString());

        _queryBuilder.append('}');
    }
}
