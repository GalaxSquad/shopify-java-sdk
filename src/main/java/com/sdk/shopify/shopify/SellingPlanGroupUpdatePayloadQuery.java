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
* Return type for `sellingPlanGroupUpdate` mutation.
*/
public class SellingPlanGroupUpdatePayloadQuery extends Query<SellingPlanGroupUpdatePayloadQuery> {
    SellingPlanGroupUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The IDs of the deleted Subscription Plans.
    */
    public SellingPlanGroupUpdatePayloadQuery deletedSellingPlanIds() {
        startField("deletedSellingPlanIds");

        return this;
    }

    /**
    * The updated Selling Plan Group.
    */
    public SellingPlanGroupUpdatePayloadQuery sellingPlanGroup(SellingPlanGroupQueryDefinition queryDef) {
        startField("sellingPlanGroup");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SellingPlanGroupUpdatePayloadQuery userErrors(SellingPlanGroupUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
