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
* A base set of color customizations that's applied to an area of Checkout, from which every component
* pulls its colors.
*/
public class CheckoutBrandingColorSchemeQuery extends Query<CheckoutBrandingColorSchemeQuery> {
    CheckoutBrandingColorSchemeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The main colors of a scheme. Used for the surface background, text, links, and more.
    */
    public CheckoutBrandingColorSchemeQuery base(CheckoutBrandingColorRolesQueryDefinition queryDef) {
        startField("base");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingColorRolesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The colors of form controls, such as the
    * [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield)
    * and
    * [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelis
    * t) components.
    */
    public CheckoutBrandingColorSchemeQuery control(CheckoutBrandingControlColorRolesQueryDefinition queryDef) {
        startField("control");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingControlColorRolesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The colors of the primary button. For example, the main payment, or **Pay now** button.
    */
    public CheckoutBrandingColorSchemeQuery primaryButton(CheckoutBrandingButtonColorRolesQueryDefinition queryDef) {
        startField("primaryButton");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingButtonColorRolesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
    */
    public CheckoutBrandingColorSchemeQuery secondaryButton(CheckoutBrandingButtonColorRolesQueryDefinition queryDef) {
        startField("secondaryButton");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingButtonColorRolesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
