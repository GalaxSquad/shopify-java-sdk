// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The container's divider customizations.
*/
public class CheckoutBrandingContainerDivider extends AbstractResponse<CheckoutBrandingContainerDivider> {
    public CheckoutBrandingContainerDivider() {
    }

    public CheckoutBrandingContainerDivider(JsonObject fields) throws SchemaViolationError {
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

                case "visibility": {
                    CheckoutBrandingVisibility optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingVisibility.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingContainerDivider";
    }

    /**
    * The divider style.
    */

    public CheckoutBrandingBorderStyle getBorderStyle() {
        return (CheckoutBrandingBorderStyle) get("borderStyle");
    }

    public CheckoutBrandingContainerDivider setBorderStyle(CheckoutBrandingBorderStyle arg) {
        optimisticData.put(getKey("borderStyle"), arg);
        return this;
    }

    /**
    * The divider width.
    */

    public CheckoutBrandingBorderWidth getBorderWidth() {
        return (CheckoutBrandingBorderWidth) get("borderWidth");
    }

    public CheckoutBrandingContainerDivider setBorderWidth(CheckoutBrandingBorderWidth arg) {
        optimisticData.put(getKey("borderWidth"), arg);
        return this;
    }

    /**
    * The divider visibility.
    */

    public CheckoutBrandingVisibility getVisibility() {
        return (CheckoutBrandingVisibility) get("visibility");
    }

    public CheckoutBrandingContainerDivider setVisibility(CheckoutBrandingVisibility arg) {
        optimisticData.put(getKey("visibility"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "borderStyle": return false;

            case "borderWidth": return false;

            case "visibility": return false;

            default: return false;
        }
    }
}

