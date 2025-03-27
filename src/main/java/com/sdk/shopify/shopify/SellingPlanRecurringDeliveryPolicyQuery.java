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
* Represents a recurring selling plan delivery policy.
*/
public class SellingPlanRecurringDeliveryPolicyQuery extends Query<SellingPlanRecurringDeliveryPolicyQuery> {
    SellingPlanRecurringDeliveryPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The specific anchor dates upon which the delivery interval calculations should be made.
    */
    public SellingPlanRecurringDeliveryPolicyQuery anchors(SellingPlanAnchorQueryDefinition queryDef) {
        startField("anchors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanAnchorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the selling plan delivery policy was created.
    */
    public SellingPlanRecurringDeliveryPolicyQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Number of days which represent a buffer period for orders to be included in a cycle.
    */
    public SellingPlanRecurringDeliveryPolicyQuery cutoff() {
        startField("cutoff");

        return this;
    }

    /**
    * Whether the delivery policy is merchant or buyer-centric.
    * Buyer-centric delivery policies state the time when the buyer will receive the goods.
    * Merchant-centric delivery policies state the time when the fulfillment should be started.
    * Currently, only merchant-centric delivery policies are supported.
    */
    public SellingPlanRecurringDeliveryPolicyQuery intent() {
        startField("intent");

        return this;
    }

    /**
    * The delivery frequency, it can be either: day, week, month or year.
    */
    public SellingPlanRecurringDeliveryPolicyQuery interval() {
        startField("interval");

        return this;
    }

    /**
    * The number of intervals between deliveries.
    */
    public SellingPlanRecurringDeliveryPolicyQuery intervalCount() {
        startField("intervalCount");

        return this;
    }

    /**
    * The fulfillment or delivery behavior of the first fulfillment when the order is placed before the
    * anchor. The default value for this field is `ASAP`.
    */
    public SellingPlanRecurringDeliveryPolicyQuery preAnchorBehavior() {
        startField("preAnchorBehavior");

        return this;
    }
}
