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
* The customizations for the page, content, main, and order summary dividers.
*/
public class CheckoutBrandingDividerStyle extends AbstractResponse<CheckoutBrandingDividerStyle> {
    public CheckoutBrandingDividerStyle() {
    }

    public CheckoutBrandingDividerStyle(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "borderStyle": {
                    CheckoutBrandingBorderStyle optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingBorderStyle.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "borderWidth": {
                    CheckoutBrandingBorderWidth optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingBorderWidth.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingDividerStyle";
    }

    /**
    * The border style for the divider.
    */

    public CheckoutBrandingBorderStyle getBorderStyle() {
        return (CheckoutBrandingBorderStyle) get("borderStyle");
    }

    public CheckoutBrandingDividerStyle setBorderStyle(CheckoutBrandingBorderStyle arg) {
        optimisticData.put(getKey("borderStyle"), arg);
        return this;
    }

    /**
    * The border width for the divider.
    */

    public CheckoutBrandingBorderWidth getBorderWidth() {
        return (CheckoutBrandingBorderWidth) get("borderWidth");
    }

    public CheckoutBrandingDividerStyle setBorderWidth(CheckoutBrandingBorderWidth arg) {
        optimisticData.put(getKey("borderWidth"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "borderStyle": return false;

            case "borderWidth": return false;

            default: return false;
        }
    }
}

