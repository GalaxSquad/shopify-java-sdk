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
* A font group. To learn more about updating fonts, refer to the
* [checkoutBrandingUpsert](https://shopify.dev/api/admin-graphql/unstable/mutations/checkoutBrandingUp
* sert)
* mutation and the checkout branding [tutorial](https://shopify.dev/docs/apps/checkout/styling).
*/
public class CheckoutBrandingFontGroupQuery extends Query<CheckoutBrandingFontGroupQuery> {
    CheckoutBrandingFontGroupQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The base font.
    */
    public CheckoutBrandingFontGroupQuery base(CheckoutBrandingFontQueryDefinition queryDef) {
        startField("base");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingFontQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The bold font.
    */
    public CheckoutBrandingFontGroupQuery bold(CheckoutBrandingFontQueryDefinition queryDef) {
        startField("bold");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingFontQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The font loading strategy.
    */
    public CheckoutBrandingFontGroupQuery loadingStrategy() {
        startField("loadingStrategy");

        return this;
    }

    /**
    * The font group name.
    */
    public CheckoutBrandingFontGroupQuery name() {
        startField("name");

        return this;
    }
}
