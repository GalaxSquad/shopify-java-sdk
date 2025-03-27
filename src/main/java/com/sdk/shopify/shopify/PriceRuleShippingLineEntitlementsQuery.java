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
* The shipping lines to which the price rule applies to.
*/
public class PriceRuleShippingLineEntitlementsQuery extends Query<PriceRuleShippingLineEntitlementsQuery> {
    PriceRuleShippingLineEntitlementsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The codes for the countries to which the price rule applies to.
    */
    public PriceRuleShippingLineEntitlementsQuery countryCodes() {
        startField("countryCodes");

        return this;
    }

    /**
    * Whether the price rule is applicable to countries that haven't been defined in the shop's shipping
    * zones.
    */
    public PriceRuleShippingLineEntitlementsQuery includeRestOfWorld() {
        startField("includeRestOfWorld");

        return this;
    }

    /**
    * Whether the price rule applies to all shipping lines.
    */
    public PriceRuleShippingLineEntitlementsQuery targetAllShippingLines() {
        startField("targetAllShippingLines");

        return this;
    }
}
