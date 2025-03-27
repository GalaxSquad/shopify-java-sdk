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
* A warning that is displayed to the merchant when a change is made to a draft order.
*/
public class DraftOrderWarningQuery extends Query<DraftOrderWarningQuery> {
    DraftOrderWarningQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The error code.
    */
    public DraftOrderWarningQuery errorCode() {
        startField("errorCode");

        return this;
    }

    /**
    * The input field that the warning applies to.
    */
    public DraftOrderWarningQuery field() {
        startField("field");

        return this;
    }

    /**
    * The warning message.
    */
    public DraftOrderWarningQuery message() {
        startField("message");

        return this;
    }

    public DraftOrderWarningQuery onDraftOrderBundleAddedWarning(DraftOrderBundleAddedWarningQueryDefinition queryDef) {
        startInlineFragment("DraftOrderBundleAddedWarning");
        queryDef.define(new DraftOrderBundleAddedWarningQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DraftOrderWarningQuery onDraftOrderDiscountNotAppliedWarning(DraftOrderDiscountNotAppliedWarningQueryDefinition queryDef) {
        startInlineFragment("DraftOrderDiscountNotAppliedWarning");
        queryDef.define(new DraftOrderDiscountNotAppliedWarningQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
