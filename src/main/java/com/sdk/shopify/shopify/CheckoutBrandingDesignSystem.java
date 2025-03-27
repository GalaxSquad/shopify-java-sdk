// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The design system allows you to set values that represent specific attributes
* of your brand like color and font. These attributes are used throughout the user
* interface. This brings consistency and allows you to easily make broad design changes.
*/
public class CheckoutBrandingDesignSystem extends AbstractResponse<CheckoutBrandingDesignSystem> {
    public CheckoutBrandingDesignSystem() {
    }

    public CheckoutBrandingDesignSystem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "colors": {
                    CheckoutBrandingColors optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingColors(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cornerRadius": {
                    CheckoutBrandingCornerRadiusVariables optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingCornerRadiusVariables(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "typography": {
                    CheckoutBrandingTypography optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingTypography(jsonAsObject(field.getValue(), key));
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
        return "CheckoutBrandingDesignSystem";
    }

    /**
    * The color settings for global colors and color schemes.
    */

    public CheckoutBrandingColors getColors() {
        return (CheckoutBrandingColors) get("colors");
    }

    public CheckoutBrandingDesignSystem setColors(CheckoutBrandingColors arg) {
        optimisticData.put(getKey("colors"), arg);
        return this;
    }

    /**
    * The corner radius variables.
    */

    public CheckoutBrandingCornerRadiusVariables getCornerRadius() {
        return (CheckoutBrandingCornerRadiusVariables) get("cornerRadius");
    }

    public CheckoutBrandingDesignSystem setCornerRadius(CheckoutBrandingCornerRadiusVariables arg) {
        optimisticData.put(getKey("cornerRadius"), arg);
        return this;
    }

    /**
    * The typography.
    */

    public CheckoutBrandingTypography getTypography() {
        return (CheckoutBrandingTypography) get("typography");
    }

    public CheckoutBrandingDesignSystem setTypography(CheckoutBrandingTypography arg) {
        optimisticData.put(getKey("typography"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "colors": return true;

            case "cornerRadius": return true;

            case "typography": return true;

            default: return false;
        }
    }
}

