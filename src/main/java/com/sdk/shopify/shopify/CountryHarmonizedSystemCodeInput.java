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

public class CountryHarmonizedSystemCodeInput implements Serializable {
    private String harmonizedSystemCode;

    private CountryCode countryCode;

    public CountryHarmonizedSystemCodeInput(String harmonizedSystemCode, CountryCode countryCode) {
        this.harmonizedSystemCode = harmonizedSystemCode;

        this.countryCode = countryCode;
    }

    public String getHarmonizedSystemCode() {
        return harmonizedSystemCode;
    }

    public CountryHarmonizedSystemCodeInput setHarmonizedSystemCode(String harmonizedSystemCode) {
        this.harmonizedSystemCode = harmonizedSystemCode;
        return this;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public CountryHarmonizedSystemCodeInput setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("harmonizedSystemCode:");
        Query.appendQuotedString(_queryBuilder, harmonizedSystemCode.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("countryCode:");
        _queryBuilder.append(countryCode.toString());

        _queryBuilder.append('}');
    }
}
