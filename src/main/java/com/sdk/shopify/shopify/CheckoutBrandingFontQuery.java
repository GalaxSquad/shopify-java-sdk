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
* A font.
*/
public class CheckoutBrandingFontQuery extends Query<CheckoutBrandingFontQuery> {
    CheckoutBrandingFontQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The font sources.
    */
    public CheckoutBrandingFontQuery sources() {
        startField("sources");

        return this;
    }

    /**
    * The font weight.
    */
    public CheckoutBrandingFontQuery weight() {
        startField("weight");

        return this;
    }

    public CheckoutBrandingFontQuery onCheckoutBrandingCustomFont(CheckoutBrandingCustomFontQueryDefinition queryDef) {
        startInlineFragment("CheckoutBrandingCustomFont");
        queryDef.define(new CheckoutBrandingCustomFontQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CheckoutBrandingFontQuery onCheckoutBrandingShopifyFont(CheckoutBrandingShopifyFontQueryDefinition queryDef) {
        startInlineFragment("CheckoutBrandingShopifyFont");
        queryDef.define(new CheckoutBrandingShopifyFontQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
