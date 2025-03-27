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
* The choice list customizations.
*/
public class CheckoutBrandingChoiceListQuery extends Query<CheckoutBrandingChoiceListQuery> {
    CheckoutBrandingChoiceListQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The settings that apply to the 'group' variant of ChoiceList.
    */
    public CheckoutBrandingChoiceListQuery group(CheckoutBrandingChoiceListGroupQueryDefinition queryDef) {
        startField("group");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingChoiceListGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
