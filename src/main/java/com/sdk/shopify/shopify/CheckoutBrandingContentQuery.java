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
* The content container customizations.
*/
public class CheckoutBrandingContentQuery extends Query<CheckoutBrandingContentQuery> {
    CheckoutBrandingContentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The content container's divider style and visibility.
    */
    public CheckoutBrandingContentQuery divider(CheckoutBrandingContainerDividerQueryDefinition queryDef) {
        startField("divider");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingContainerDividerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
