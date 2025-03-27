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
* The design system allows you to set values that represent specific attributes
* of your brand like color and font. These attributes are used throughout the user
* interface. This brings consistency and allows you to easily make broad design changes.
*/
public class CheckoutBrandingDesignSystemQuery extends Query<CheckoutBrandingDesignSystemQuery> {
    CheckoutBrandingDesignSystemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The color settings for global colors and color schemes.
    */
    public CheckoutBrandingDesignSystemQuery colors(CheckoutBrandingColorsQueryDefinition queryDef) {
        startField("colors");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingColorsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The corner radius variables.
    */
    public CheckoutBrandingDesignSystemQuery cornerRadius(CheckoutBrandingCornerRadiusVariablesQueryDefinition queryDef) {
        startField("cornerRadius");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingCornerRadiusVariablesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The typography.
    */
    public CheckoutBrandingDesignSystemQuery typography(CheckoutBrandingTypographyQueryDefinition queryDef) {
        startField("typography");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingTypographyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
