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
* Represents a recurring selling plan billing policy.
*/
public class SellingPlanRecurringBillingPolicyQuery extends Query<SellingPlanRecurringBillingPolicyQuery> {
    SellingPlanRecurringBillingPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Specific anchor dates upon which the billing interval calculations should be made.
    */
    public SellingPlanRecurringBillingPolicyQuery anchors(SellingPlanAnchorQueryDefinition queryDef) {
        startField("anchors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanAnchorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the selling plan billing policy was created.
    */
    public SellingPlanRecurringBillingPolicyQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The billing frequency, it can be either: day, week, month or year.
    */
    public SellingPlanRecurringBillingPolicyQuery interval() {
        startField("interval");

        return this;
    }

    /**
    * The number of intervals between billings.
    */
    public SellingPlanRecurringBillingPolicyQuery intervalCount() {
        startField("intervalCount");

        return this;
    }

    /**
    * Maximum number of billing iterations.
    */
    public SellingPlanRecurringBillingPolicyQuery maxCycles() {
        startField("maxCycles");

        return this;
    }

    /**
    * Minimum number of billing iterations.
    */
    public SellingPlanRecurringBillingPolicyQuery minCycles() {
        startField("minCycles");

        return this;
    }
}
