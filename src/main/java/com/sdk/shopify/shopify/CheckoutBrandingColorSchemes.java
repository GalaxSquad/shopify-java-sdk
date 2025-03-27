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
* The color schemes.
*/
public class CheckoutBrandingColorSchemes extends AbstractResponse<CheckoutBrandingColorSchemes> {
    public CheckoutBrandingColorSchemes() {
    }

    public CheckoutBrandingColorSchemes(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "scheme1": {
                    CheckoutBrandingColorScheme optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingColorScheme(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "scheme2": {
                    CheckoutBrandingColorScheme optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingColorScheme(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "scheme3": {
                    CheckoutBrandingColorScheme optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingColorScheme(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "scheme4": {
                    CheckoutBrandingColorScheme optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingColorScheme(jsonAsObject(field.getValue(), key));
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
        return "CheckoutBrandingColorSchemes";
    }

    /**
    * The primary scheme. By default, it’s used for the main area of the interface.
    */

    public CheckoutBrandingColorScheme getScheme1() {
        return (CheckoutBrandingColorScheme) get("scheme1");
    }

    public CheckoutBrandingColorSchemes setScheme1(CheckoutBrandingColorScheme arg) {
        optimisticData.put(getKey("scheme1"), arg);
        return this;
    }

    /**
    * The secondary scheme. By default, it’s used for secondary areas, like Checkout’s Order Summary.
    */

    public CheckoutBrandingColorScheme getScheme2() {
        return (CheckoutBrandingColorScheme) get("scheme2");
    }

    public CheckoutBrandingColorSchemes setScheme2(CheckoutBrandingColorScheme arg) {
        optimisticData.put(getKey("scheme2"), arg);
        return this;
    }

    /**
    * An extra scheme available to customize more surfaces, components or specific states of the user
    * interface.
    */

    public CheckoutBrandingColorScheme getScheme3() {
        return (CheckoutBrandingColorScheme) get("scheme3");
    }

    public CheckoutBrandingColorSchemes setScheme3(CheckoutBrandingColorScheme arg) {
        optimisticData.put(getKey("scheme3"), arg);
        return this;
    }

    /**
    * An extra scheme available to customize more surfaces, components or specific states of the user
    * interface.
    */

    public CheckoutBrandingColorScheme getScheme4() {
        return (CheckoutBrandingColorScheme) get("scheme4");
    }

    public CheckoutBrandingColorSchemes setScheme4(CheckoutBrandingColorScheme arg) {
        optimisticData.put(getKey("scheme4"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "scheme1": return true;

            case "scheme2": return true;

            case "scheme3": return true;

            case "scheme4": return true;

            default: return false;
        }
    }
}

