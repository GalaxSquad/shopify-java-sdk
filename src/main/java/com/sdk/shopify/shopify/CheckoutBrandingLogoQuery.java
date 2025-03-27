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
* The store logo customizations.
*/
public class CheckoutBrandingLogoQuery extends Query<CheckoutBrandingLogoQuery> {
    CheckoutBrandingLogoQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The logo image.
    */
    public CheckoutBrandingLogoQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The maximum width of the logo.
    */
    public CheckoutBrandingLogoQuery maxWidth() {
        startField("maxWidth");

        return this;
    }

    /**
    * The visibility of the logo.
    */
    public CheckoutBrandingLogoQuery visibility() {
        startField("visibility");

        return this;
    }
}
