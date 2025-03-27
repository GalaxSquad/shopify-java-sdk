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
* Discount applications capture the intentions of a discount source at
* the time of application on an order's line items or shipping lines.
*/
public class FinancialSummaryDiscountApplicationQuery extends Query<FinancialSummaryDiscountApplicationQuery> {
    FinancialSummaryDiscountApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The method by which the discount's value is applied to its entitled items.
    */
    public FinancialSummaryDiscountApplicationQuery allocationMethod() {
        startField("allocationMethod");

        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */
    public FinancialSummaryDiscountApplicationQuery targetSelection() {
        startField("targetSelection");

        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */
    public FinancialSummaryDiscountApplicationQuery targetType() {
        startField("targetType");

        return this;
    }
}
