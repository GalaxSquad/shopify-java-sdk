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
* A warning indicating that a discount cannot be applied to a draft order.
*/
public class DraftOrderDiscountNotAppliedWarningQuery extends Query<DraftOrderDiscountNotAppliedWarningQuery> {
    DraftOrderDiscountNotAppliedWarningQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code of the discount that can't be applied.
    */
    public DraftOrderDiscountNotAppliedWarningQuery discountCode() {
        startField("discountCode");

        return this;
    }

    /**
    * The title of the discount that can't be applied.
    */
    public DraftOrderDiscountNotAppliedWarningQuery discountTitle() {
        startField("discountTitle");

        return this;
    }

    /**
    * The error code.
    */
    public DraftOrderDiscountNotAppliedWarningQuery errorCode() {
        startField("errorCode");

        return this;
    }

    /**
    * The input field that the warning applies to.
    */
    public DraftOrderDiscountNotAppliedWarningQuery field() {
        startField("field");

        return this;
    }

    /**
    * The warning message.
    */
    public DraftOrderDiscountNotAppliedWarningQuery message() {
        startField("message");

        return this;
    }

    /**
    * The price rule that can't be applied.
    */
    public DraftOrderDiscountNotAppliedWarningQuery priceRule(PriceRuleQueryDefinition queryDef) {
        startField("priceRule");

        _queryBuilder.append('{');
        queryDef.define(new PriceRuleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
