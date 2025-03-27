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
* The `DiscountCountryAll` object lets you target all countries as shipping destination for discount
* eligibility.
*/
public class DiscountCountryAllQuery extends Query<DiscountCountryAllQuery> {
    DiscountCountryAllQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the discount can be applied to all countries as shipping destination. This value is always
    * `true`.
    */
    public DiscountCountryAllQuery allCountries() {
        startField("allCountries");

        return this;
    }
}
