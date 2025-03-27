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
* The quantity rule for the product variant in a given context.
*/
public class QuantityRuleQuery extends Query<QuantityRuleQuery> {
    QuantityRuleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The value that specifies the quantity increment between minimum and maximum of the rule.
    * Only quantities divisible by this value will be considered valid.
    * The increment must be lower than or equal to the minimum and the maximum, and both minimum and
    * maximum
    * must be divisible by this value.
    */
    public QuantityRuleQuery increment() {
        startField("increment");

        return this;
    }

    /**
    * Whether the quantity rule fields match one increment, one minimum and no maximum.
    */
    public QuantityRuleQuery isDefault() {
        startField("isDefault");

        return this;
    }

    /**
    * An optional value that defines the highest allowed quantity purchased by the customer.
    * If defined, maximum must be lower than or equal to the minimum and must be a multiple of the
    * increment.
    */
    public QuantityRuleQuery maximum() {
        startField("maximum");

        return this;
    }

    /**
    * The value that defines the lowest allowed quantity purchased by the customer.
    * The minimum must be a multiple of the quantity rule's increment.
    */
    public QuantityRuleQuery minimum() {
        startField("minimum");

        return this;
    }

    /**
    * Whether the values of the quantity rule were explicitly set.
    */
    public QuantityRuleQuery originType() {
        startField("originType");

        return this;
    }

    /**
    * The product variant for which the quantity rule is applied.
    */
    public QuantityRuleQuery productVariant(ProductVariantQueryDefinition queryDef) {
        startField("productVariant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
