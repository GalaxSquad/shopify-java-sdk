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
* Represents a Subscription Billing Policy.
*/
public class SubscriptionBillingPolicyQuery extends Query<SubscriptionBillingPolicyQuery> {
    SubscriptionBillingPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Specific anchor dates upon which the billing interval calculations should be made.
    */
    public SubscriptionBillingPolicyQuery anchors(SellingPlanAnchorQueryDefinition queryDef) {
        startField("anchors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanAnchorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The kind of interval that's associated with this schedule (e.g. Monthly, Weekly, etc).
    */
    public SubscriptionBillingPolicyQuery interval() {
        startField("interval");

        return this;
    }

    /**
    * The number of billing intervals between invoices.
    */
    public SubscriptionBillingPolicyQuery intervalCount() {
        startField("intervalCount");

        return this;
    }

    /**
    * Maximum amount of cycles after which the subscription ends.
    */
    public SubscriptionBillingPolicyQuery maxCycles() {
        startField("maxCycles");

        return this;
    }

    /**
    * Minimum amount of cycles required in the subscription.
    */
    public SubscriptionBillingPolicyQuery minCycles() {
        startField("minCycles");

        return this;
    }
}
