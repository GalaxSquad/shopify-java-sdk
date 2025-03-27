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
* A set of colors for customizing the overall look and feel of the checkout.
*/
public class CheckoutBrandingColorGlobalQuery extends Query<CheckoutBrandingColorGlobalQuery> {
    CheckoutBrandingColorGlobalQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A color used for interaction, like links and focus states.
    */
    public CheckoutBrandingColorGlobalQuery accent() {
        startField("accent");

        return this;
    }

    /**
    * A color that's strongly associated with the merchant. Currently used for
    * primary buttons, for example **Pay now**, and secondary buttons, for example **Buy again**.
    */
    public CheckoutBrandingColorGlobalQuery brand() {
        startField("brand");

        return this;
    }

    /**
    * A semantic color used for components that communicate critical content. For example, a blocking
    * error such as the requirement to enter a valid credit card number.
    */
    public CheckoutBrandingColorGlobalQuery critical() {
        startField("critical");

        return this;
    }

    /**
    * A color used to highlight certain areas of the user interface. For example, the
    * [`Text`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/titles-and-text/text#
    * textprops-propertydetail-appearance) component.
    */
    public CheckoutBrandingColorGlobalQuery decorative() {
        startField("decorative");

        return this;
    }

    /**
    * A semantic color used for components that communicate general, informative content.
    */
    public CheckoutBrandingColorGlobalQuery info() {
        startField("info");

        return this;
    }

    /**
    * A semantic color used for components that communicate successful actions or a positive state.
    */
    public CheckoutBrandingColorGlobalQuery success() {
        startField("success");

        return this;
    }

    /**
    * A semantic color used for components that display content that requires attention. For example,
    * something that might be wrong, but not blocking.
    */
    public CheckoutBrandingColorGlobalQuery warning() {
        startField("warning");

        return this;
    }
}
