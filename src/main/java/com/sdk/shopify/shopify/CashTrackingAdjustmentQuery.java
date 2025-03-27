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
* Tracks an adjustment to the cash in a cash tracking session for a point of sale device over the
* course of a shift.
*/
public class CashTrackingAdjustmentQuery extends Query<CashTrackingAdjustmentQuery> {
    CashTrackingAdjustmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The amount of cash being added or removed.
    */
    public CashTrackingAdjustmentQuery cash(MoneyV2QueryDefinition queryDef) {
        startField("cash");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The note entered when the adjustment was made.
    */
    public CashTrackingAdjustmentQuery note() {
        startField("note");

        return this;
    }

    /**
    * The staff member who made the adjustment.
    */
    public CashTrackingAdjustmentQuery staffMember(StaffMemberQueryDefinition queryDef) {
        startField("staffMember");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The time when the adjustment was made.
    */
    public CashTrackingAdjustmentQuery time() {
        startField("time");

        return this;
    }
}
