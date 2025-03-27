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
* The footer content customizations.
*/
public class CheckoutBrandingFooterContentQuery extends Query<CheckoutBrandingFooterContentQuery> {
    CheckoutBrandingFooterContentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The visibility settings for footer content.
    */
    public CheckoutBrandingFooterContentQuery visibility() {
        startField("visibility");

        return this;
    }
}
