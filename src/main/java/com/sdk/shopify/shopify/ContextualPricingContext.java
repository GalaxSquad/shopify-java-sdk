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

public class ContextualPricingContext implements Serializable {
    private Input<CountryCode> country = Input.undefined();

    private Input<ID> companyLocationId = Input.undefined();

    public CountryCode getCountry() {
        return country.getValue();
    }

    public Input<CountryCode> getCountryInput() {
        return country;
    }

    public ContextualPricingContext setCountry(CountryCode country) {
        this.country = Input.optional(country);
        return this;
    }

    public ContextualPricingContext setCountryInput(Input<CountryCode> country) {
        if (country == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.country = country;
        return this;
    }

    public ID getCompanyLocationId() {
        return companyLocationId.getValue();
    }

    public Input<ID> getCompanyLocationIdInput() {
        return companyLocationId;
    }

    public ContextualPricingContext setCompanyLocationId(ID companyLocationId) {
        this.companyLocationId = Input.optional(companyLocationId);
        return this;
    }

    public ContextualPricingContext setCompanyLocationIdInput(Input<ID> companyLocationId) {
        if (companyLocationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.companyLocationId = companyLocationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.country.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("country:");
            if (country.getValue() != null) {
                _queryBuilder.append(country.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.companyLocationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("companyLocationId:");
            if (companyLocationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, companyLocationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
