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
* A custom font.
*/
public class CheckoutBrandingCustomFontQuery extends Query<CheckoutBrandingCustomFontQuery> {
    CheckoutBrandingCustomFontQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Globally unique ID reference to the custom font file.
    */
    public CheckoutBrandingCustomFontQuery genericFileId() {
        startField("genericFileId");

        return this;
    }

    /**
    * The font sources.
    */
    public CheckoutBrandingCustomFontQuery sources() {
        startField("sources");

        return this;
    }

    /**
    * The font weight.
    */
    public CheckoutBrandingCustomFontQuery weight() {
        startField("weight");

        return this;
    }
}
