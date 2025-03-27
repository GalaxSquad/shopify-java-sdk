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
* The main sections customizations.
*/
public class CheckoutBrandingMainSection extends AbstractResponse<CheckoutBrandingMainSection> {
    public CheckoutBrandingMainSection() {
    }

    public CheckoutBrandingMainSection(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "background": {
                    CheckoutBrandingBackground optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingBackground.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "border": {
                    CheckoutBrandingSimpleBorder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingSimpleBorder.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

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

                case "colorScheme": {
                    CheckoutBrandingColorSchemeSelection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingColorSchemeSelection.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cornerRadius": {
                    CheckoutBrandingCornerRadius optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingCornerRadius.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "padding": {
                    CheckoutBrandingSpacingKeyword optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingSpacingKeyword.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shadow": {
                    CheckoutBrandingShadow optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingShadow.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingMainSection";
    }

    /**
    * The background style of the main sections.
    */

    public CheckoutBrandingBackground getBackground() {
        return (CheckoutBrandingBackground) get("background");
    }

    public CheckoutBrandingMainSection setBackground(CheckoutBrandingBackground arg) {
        optimisticData.put(getKey("background"), arg);
        return this;
    }

    /**
    * The border for the main sections.
    */

    public CheckoutBrandingSimpleBorder getBorder() {
        return (CheckoutBrandingSimpleBorder) get("border");
    }

    public CheckoutBrandingMainSection setBorder(CheckoutBrandingSimpleBorder arg) {
        optimisticData.put(getKey("border"), arg);
        return this;
    }

    /**
    * The border style of the main sections.
    */

    public CheckoutBrandingBorderStyle getBorderStyle() {
        return (CheckoutBrandingBorderStyle) get("borderStyle");
    }

    public CheckoutBrandingMainSection setBorderStyle(CheckoutBrandingBorderStyle arg) {
        optimisticData.put(getKey("borderStyle"), arg);
        return this;
    }

    /**
    * The border width of the main sections.
    */

    public CheckoutBrandingBorderWidth getBorderWidth() {
        return (CheckoutBrandingBorderWidth) get("borderWidth");
    }

    public CheckoutBrandingMainSection setBorderWidth(CheckoutBrandingBorderWidth arg) {
        optimisticData.put(getKey("borderWidth"), arg);
        return this;
    }

    /**
    * The selected color scheme of the main sections.
    */

    public CheckoutBrandingColorSchemeSelection getColorScheme() {
        return (CheckoutBrandingColorSchemeSelection) get("colorScheme");
    }

    public CheckoutBrandingMainSection setColorScheme(CheckoutBrandingColorSchemeSelection arg) {
        optimisticData.put(getKey("colorScheme"), arg);
        return this;
    }

    /**
    * The corner radius of the main sections.
    */

    public CheckoutBrandingCornerRadius getCornerRadius() {
        return (CheckoutBrandingCornerRadius) get("cornerRadius");
    }

    public CheckoutBrandingMainSection setCornerRadius(CheckoutBrandingCornerRadius arg) {
        optimisticData.put(getKey("cornerRadius"), arg);
        return this;
    }

    /**
    * The padding of the main sections.
    */

    public CheckoutBrandingSpacingKeyword getPadding() {
        return (CheckoutBrandingSpacingKeyword) get("padding");
    }

    public CheckoutBrandingMainSection setPadding(CheckoutBrandingSpacingKeyword arg) {
        optimisticData.put(getKey("padding"), arg);
        return this;
    }

    /**
    * The shadow of the main sections.
    */

    public CheckoutBrandingShadow getShadow() {
        return (CheckoutBrandingShadow) get("shadow");
    }

    public CheckoutBrandingMainSection setShadow(CheckoutBrandingShadow arg) {
        optimisticData.put(getKey("shadow"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "background": return false;

            case "border": return false;

            case "borderStyle": return false;

            case "borderWidth": return false;

            case "colorScheme": return false;

            case "cornerRadius": return false;

            case "padding": return false;

            case "shadow": return false;

            default: return false;
        }
    }
}

