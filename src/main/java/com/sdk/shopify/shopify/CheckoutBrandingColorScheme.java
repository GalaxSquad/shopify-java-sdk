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

import java.util.Map;

/**
* A base set of color customizations that's applied to an area of Checkout, from which every component
* pulls its colors.
*/
public class CheckoutBrandingColorScheme extends AbstractResponse<CheckoutBrandingColorScheme> {
    public CheckoutBrandingColorScheme() {
    }

    public CheckoutBrandingColorScheme(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "base": {
                    CheckoutBrandingColorRoles optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingColorRoles(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "control": {
                    CheckoutBrandingControlColorRoles optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingControlColorRoles(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "primaryButton": {
                    CheckoutBrandingButtonColorRoles optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingButtonColorRoles(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "secondaryButton": {
                    CheckoutBrandingButtonColorRoles optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingButtonColorRoles(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "CheckoutBrandingColorScheme";
    }

    /**
    * The main colors of a scheme. Used for the surface background, text, links, and more.
    */

    public CheckoutBrandingColorRoles getBase() {
        return (CheckoutBrandingColorRoles) get("base");
    }

    public CheckoutBrandingColorScheme setBase(CheckoutBrandingColorRoles arg) {
        optimisticData.put(getKey("base"), arg);
        return this;
    }

    /**
    * The colors of form controls, such as the
    * [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield)
    * and
    * [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelis
    * t) components.
    */

    public CheckoutBrandingControlColorRoles getControl() {
        return (CheckoutBrandingControlColorRoles) get("control");
    }

    public CheckoutBrandingColorScheme setControl(CheckoutBrandingControlColorRoles arg) {
        optimisticData.put(getKey("control"), arg);
        return this;
    }

    /**
    * The colors of the primary button. For example, the main payment, or **Pay now** button.
    */

    public CheckoutBrandingButtonColorRoles getPrimaryButton() {
        return (CheckoutBrandingButtonColorRoles) get("primaryButton");
    }

    public CheckoutBrandingColorScheme setPrimaryButton(CheckoutBrandingButtonColorRoles arg) {
        optimisticData.put(getKey("primaryButton"), arg);
        return this;
    }

    /**
    * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
    */

    public CheckoutBrandingButtonColorRoles getSecondaryButton() {
        return (CheckoutBrandingButtonColorRoles) get("secondaryButton");
    }

    public CheckoutBrandingColorScheme setSecondaryButton(CheckoutBrandingButtonColorRoles arg) {
        optimisticData.put(getKey("secondaryButton"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "base": return true;

            case "control": return true;

            case "primaryButton": return true;

            case "secondaryButton": return true;

            default: return false;
        }
    }
}

