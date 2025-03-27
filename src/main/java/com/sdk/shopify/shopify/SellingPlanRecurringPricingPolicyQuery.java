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
* Represents a recurring selling plan pricing policy. It applies after the fixed pricing policy. By
* using the afterCycle parameter, you can specify the cycle when the recurring pricing policy comes
* into effect. Recurring pricing policies are not available for deferred purchase options.
*/
public class SellingPlanRecurringPricingPolicyQuery extends Query<SellingPlanRecurringPricingPolicyQuery> {
    SellingPlanRecurringPricingPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The price adjustment type.
    */
    public SellingPlanRecurringPricingPolicyQuery adjustmentType() {
        startField("adjustmentType");

        return this;
    }

    /**
    * The price adjustment value.
    */
    public SellingPlanRecurringPricingPolicyQuery adjustmentValue(SellingPlanPricingPolicyAdjustmentValueQueryDefinition queryDef) {
        startField("adjustmentValue");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanPricingPolicyAdjustmentValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Cycle after which this pricing policy applies.
    */
    public SellingPlanRecurringPricingPolicyQuery afterCycle() {
        startField("afterCycle");

        return this;
    }

    /**
    * The date and time when the recurring selling plan pricing policy was created.
    */
    public SellingPlanRecurringPricingPolicyQuery createdAt() {
        startField("createdAt");

        return this;
    }
}
