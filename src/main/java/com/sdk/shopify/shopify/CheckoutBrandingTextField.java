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
* The text fields customizations.
*/
public class CheckoutBrandingTextField extends AbstractResponse<CheckoutBrandingTextField> {
    public CheckoutBrandingTextField() {
    }

    public CheckoutBrandingTextField(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "border": {
                    CheckoutBrandingBorder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingBorder.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "typography": {
                    CheckoutBrandingTypographyStyle optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingTypographyStyle(jsonAsObject(field.getValue(), key));
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
        return "CheckoutBrandingTextField";
    }

    /**
    * The border used for text fields.
    */

    public CheckoutBrandingBorder getBorder() {
        return (CheckoutBrandingBorder) get("border");
    }

    public CheckoutBrandingTextField setBorder(CheckoutBrandingBorder arg) {
        optimisticData.put(getKey("border"), arg);
        return this;
    }

    /**
    * The typography customizations used for text fields.
    */

    public CheckoutBrandingTypographyStyle getTypography() {
        return (CheckoutBrandingTypographyStyle) get("typography");
    }

    public CheckoutBrandingTextField setTypography(CheckoutBrandingTypographyStyle arg) {
        optimisticData.put(getKey("typography"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "border": return false;

            case "typography": return true;

            default: return false;
        }
    }
}

