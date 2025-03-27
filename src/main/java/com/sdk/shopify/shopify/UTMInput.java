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

public class UTMInput implements Serializable {
    private String campaign;

    private String source;

    private String medium;

    public UTMInput(String campaign, String source, String medium) {
        this.campaign = campaign;

        this.source = source;

        this.medium = medium;
    }

    public String getCampaign() {
        return campaign;
    }

    public UTMInput setCampaign(String campaign) {
        this.campaign = campaign;
        return this;
    }

    public String getSource() {
        return source;
    }

    public UTMInput setSource(String source) {
        this.source = source;
        return this;
    }

    public String getMedium() {
        return medium;
    }

    public UTMInput setMedium(String medium) {
        this.medium = medium;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("campaign:");
        Query.appendQuotedString(_queryBuilder, campaign.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("source:");
        Query.appendQuotedString(_queryBuilder, source.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("medium:");
        Query.appendQuotedString(_queryBuilder, medium.toString());

        _queryBuilder.append('}');
    }
}
