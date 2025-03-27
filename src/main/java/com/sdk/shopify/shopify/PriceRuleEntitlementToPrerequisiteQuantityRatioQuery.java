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
* Quantity of prerequisite items required for the price rule to be applicable, compared to quantity of
* entitled items.
*/
public class PriceRuleEntitlementToPrerequisiteQuantityRatioQuery extends Query<PriceRuleEntitlementToPrerequisiteQuantityRatioQuery> {
    PriceRuleEntitlementToPrerequisiteQuantityRatioQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The quantity of entitled items in the ratio.
    */
    public PriceRuleEntitlementToPrerequisiteQuantityRatioQuery entitlementQuantity() {
        startField("entitlementQuantity");

        return this;
    }

    /**
    * The quantity of prerequisite items in the ratio.
    */
    public PriceRuleEntitlementToPrerequisiteQuantityRatioQuery prerequisiteQuantity() {
        startField("prerequisiteQuantity");

        return this;
    }
}
