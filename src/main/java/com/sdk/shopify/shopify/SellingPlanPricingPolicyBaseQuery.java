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
* Represents selling plan pricing policy common fields.
*/
public class SellingPlanPricingPolicyBaseQuery extends Query<SellingPlanPricingPolicyBaseQuery> {
    SellingPlanPricingPolicyBaseQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The price adjustment type.
    */
    public SellingPlanPricingPolicyBaseQuery adjustmentType() {
        startField("adjustmentType");

        return this;
    }

    /**
    * The price adjustment value.
    */
    public SellingPlanPricingPolicyBaseQuery adjustmentValue(SellingPlanPricingPolicyAdjustmentValueQueryDefinition queryDef) {
        startField("adjustmentValue");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanPricingPolicyAdjustmentValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public SellingPlanPricingPolicyBaseQuery onSellingPlanFixedPricingPolicy(SellingPlanFixedPricingPolicyQueryDefinition queryDef) {
        startInlineFragment("SellingPlanFixedPricingPolicy");
        queryDef.define(new SellingPlanFixedPricingPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SellingPlanPricingPolicyBaseQuery onSellingPlanRecurringPricingPolicy(SellingPlanRecurringPricingPolicyQueryDefinition queryDef) {
        startInlineFragment("SellingPlanRecurringPricingPolicy");
        queryDef.define(new SellingPlanRecurringPricingPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
