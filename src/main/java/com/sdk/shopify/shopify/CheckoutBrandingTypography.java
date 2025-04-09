// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The typography settings used for checkout-related text. Use these settings to customize the
* font family and size for primary and secondary text elements.
* Refer to the [typography
* tutorial](https://shopify.dev/docs/apps/checkout/styling/customize-typography)
* for further information on typography customization.
*/
public class CheckoutBrandingTypography extends AbstractResponse<CheckoutBrandingTypography> {
    public CheckoutBrandingTypography() {
    }

    public CheckoutBrandingTypography(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "primary": {
                    CheckoutBrandingFontGroup optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingFontGroup(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "secondary": {
                    CheckoutBrandingFontGroup optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingFontGroup(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "size": {
                    CheckoutBrandingFontSize optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingFontSize(jsonAsObject(field.getValue(), key));
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
        return "CheckoutBrandingTypography";
    }

    /**
    * A font group used for most components such as text, buttons and form controls.
    */

    public CheckoutBrandingFontGroup getPrimary() {
        return (CheckoutBrandingFontGroup) get("primary");
    }

    public CheckoutBrandingTypography setPrimary(CheckoutBrandingFontGroup arg) {
        optimisticData.put(getKey("primary"), arg);
        return this;
    }

    /**
    * A font group used for heading components by default.
    */

    public CheckoutBrandingFontGroup getSecondary() {
        return (CheckoutBrandingFontGroup) get("secondary");
    }

    public CheckoutBrandingTypography setSecondary(CheckoutBrandingFontGroup arg) {
        optimisticData.put(getKey("secondary"), arg);
        return this;
    }

    /**
    * The font size design system (base size in pixels and scaling between different sizes).
    */

    public CheckoutBrandingFontSize getSize() {
        return (CheckoutBrandingFontSize) get("size");
    }

    public CheckoutBrandingTypography setSize(CheckoutBrandingFontSize arg) {
        optimisticData.put(getKey("size"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "primary": return true;

            case "secondary": return true;

            case "size": return true;

            default: return false;
        }
    }
}

