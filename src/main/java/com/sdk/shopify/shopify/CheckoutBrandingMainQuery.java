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
* The main container customizations.
*/
public class CheckoutBrandingMainQuery extends Query<CheckoutBrandingMainQuery> {
    CheckoutBrandingMainQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The background image of the main container.
    */
    public CheckoutBrandingMainQuery backgroundImage(CheckoutBrandingImageQueryDefinition queryDef) {
        startField("backgroundImage");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The selected color scheme of the main container.
    */
    public CheckoutBrandingMainQuery colorScheme() {
        startField("colorScheme");

        return this;
    }

    /**
    * The main container's divider style and visibility.
    */
    public CheckoutBrandingMainQuery divider(CheckoutBrandingContainerDividerQueryDefinition queryDef) {
        startField("divider");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingContainerDividerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The settings for the main sections.
    */
    public CheckoutBrandingMainQuery section(CheckoutBrandingMainSectionQueryDefinition queryDef) {
        startField("section");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingMainSectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
