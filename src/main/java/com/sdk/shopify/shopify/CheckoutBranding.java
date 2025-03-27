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
* The settings of checkout visual customizations.
* To learn more about updating checkout branding settings, refer to the
* [checkoutBrandingUpsert](https://shopify.dev/api/admin-graphql/unstable/mutations/checkoutBrandingUp
* sert) mutation.
*/
public class CheckoutBranding extends AbstractResponse<CheckoutBranding> {
    public CheckoutBranding() {
    }

    public CheckoutBranding(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customizations": {
                    CheckoutBrandingCustomizations optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingCustomizations(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "designSystem": {
                    CheckoutBrandingDesignSystem optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingDesignSystem(jsonAsObject(field.getValue(), key));
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
        return "CheckoutBranding";
    }

    /**
    * The customizations that apply to specific components or areas of the user interface.
    */

    public CheckoutBrandingCustomizations getCustomizations() {
        return (CheckoutBrandingCustomizations) get("customizations");
    }

    public CheckoutBranding setCustomizations(CheckoutBrandingCustomizations arg) {
        optimisticData.put(getKey("customizations"), arg);
        return this;
    }

    /**
    * The design system allows you to set values that represent specific attributes
    * of your brand like color and font. These attributes are used throughout the user
    * interface. This brings consistency and allows you to easily make broad design changes.
    */

    public CheckoutBrandingDesignSystem getDesignSystem() {
        return (CheckoutBrandingDesignSystem) get("designSystem");
    }

    public CheckoutBranding setDesignSystem(CheckoutBrandingDesignSystem arg) {
        optimisticData.put(getKey("designSystem"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customizations": return true;

            case "designSystem": return true;

            default: return false;
        }
    }
}

