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
* The buttons customizations.
*/
public class CheckoutBrandingButton extends AbstractResponse<CheckoutBrandingButton> {
    public CheckoutBrandingButton() {
    }

    public CheckoutBrandingButton(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "background": {
                    CheckoutBrandingBackgroundStyle optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingBackgroundStyle.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "blockPadding": {
                    CheckoutBrandingSpacing optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingSpacing.fromGraphQl(jsonAsString(field.getValue(), key));
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

                case "cornerRadius": {
                    CheckoutBrandingCornerRadius optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingCornerRadius.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inlinePadding": {
                    CheckoutBrandingSpacing optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingSpacing.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingButton";
    }

    /**
    * The background style used for buttons.
    */

    public CheckoutBrandingBackgroundStyle getBackground() {
        return (CheckoutBrandingBackgroundStyle) get("background");
    }

    public CheckoutBrandingButton setBackground(CheckoutBrandingBackgroundStyle arg) {
        optimisticData.put(getKey("background"), arg);
        return this;
    }

    /**
    * The block padding used for buttons.
    */

    public CheckoutBrandingSpacing getBlockPadding() {
        return (CheckoutBrandingSpacing) get("blockPadding");
    }

    public CheckoutBrandingButton setBlockPadding(CheckoutBrandingSpacing arg) {
        optimisticData.put(getKey("blockPadding"), arg);
        return this;
    }

    /**
    * The border used for buttons.
    */

    public CheckoutBrandingSimpleBorder getBorder() {
        return (CheckoutBrandingSimpleBorder) get("border");
    }

    public CheckoutBrandingButton setBorder(CheckoutBrandingSimpleBorder arg) {
        optimisticData.put(getKey("border"), arg);
        return this;
    }

    /**
    * The corner radius used for buttons.
    */

    public CheckoutBrandingCornerRadius getCornerRadius() {
        return (CheckoutBrandingCornerRadius) get("cornerRadius");
    }

    public CheckoutBrandingButton setCornerRadius(CheckoutBrandingCornerRadius arg) {
        optimisticData.put(getKey("cornerRadius"), arg);
        return this;
    }

    /**
    * The inline padding used for buttons.
    */

    public CheckoutBrandingSpacing getInlinePadding() {
        return (CheckoutBrandingSpacing) get("inlinePadding");
    }

    public CheckoutBrandingButton setInlinePadding(CheckoutBrandingSpacing arg) {
        optimisticData.put(getKey("inlinePadding"), arg);
        return this;
    }

    /**
    * The typography used for buttons.
    */

    public CheckoutBrandingTypographyStyle getTypography() {
        return (CheckoutBrandingTypographyStyle) get("typography");
    }

    public CheckoutBrandingButton setTypography(CheckoutBrandingTypographyStyle arg) {
        optimisticData.put(getKey("typography"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "background": return false;

            case "blockPadding": return false;

            case "border": return false;

            case "cornerRadius": return false;

            case "inlinePadding": return false;

            case "typography": return true;

            default: return false;
        }
    }
}

