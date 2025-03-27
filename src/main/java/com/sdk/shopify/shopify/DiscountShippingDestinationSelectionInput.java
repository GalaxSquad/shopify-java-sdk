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

public class DiscountShippingDestinationSelectionInput implements Serializable {
    private Input<Boolean> all = Input.undefined();

    private Input<DiscountCountriesInput> countries = Input.undefined();

    public Boolean getAll() {
        return all.getValue();
    }

    public Input<Boolean> getAllInput() {
        return all;
    }

    public DiscountShippingDestinationSelectionInput setAll(Boolean all) {
        this.all = Input.optional(all);
        return this;
    }

    public DiscountShippingDestinationSelectionInput setAllInput(Input<Boolean> all) {
        if (all == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.all = all;
        return this;
    }

    public DiscountCountriesInput getCountries() {
        return countries.getValue();
    }

    public Input<DiscountCountriesInput> getCountriesInput() {
        return countries;
    }

    public DiscountShippingDestinationSelectionInput setCountries(DiscountCountriesInput countries) {
        this.countries = Input.optional(countries);
        return this;
    }

    public DiscountShippingDestinationSelectionInput setCountriesInput(Input<DiscountCountriesInput> countries) {
        if (countries == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countries = countries;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.all.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("all:");
            if (all.getValue() != null) {
                _queryBuilder.append(all.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.countries.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("countries:");
            if (countries.getValue() != null) {
                countries.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
