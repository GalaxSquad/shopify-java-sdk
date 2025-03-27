// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A group of colors used together on a surface.
*/
public class CheckoutBrandingColorRoles extends AbstractResponse<CheckoutBrandingColorRoles> {
    public CheckoutBrandingColorRoles() {
    }

    public CheckoutBrandingColorRoles(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accent": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "background": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "border": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "decorative": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "icon": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "text": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "CheckoutBrandingColorRoles";
    }

    /**
    * The color of accented objects (links and focused state).
    */

    public String getAccent() {
        return (String) get("accent");
    }

    public CheckoutBrandingColorRoles setAccent(String arg) {
        optimisticData.put(getKey("accent"), arg);
        return this;
    }

    /**
    * The color of the background.
    */

    public String getBackground() {
        return (String) get("background");
    }

    public CheckoutBrandingColorRoles setBackground(String arg) {
        optimisticData.put(getKey("background"), arg);
        return this;
    }

    /**
    * The color of borders.
    */

    public String getBorder() {
        return (String) get("border");
    }

    public CheckoutBrandingColorRoles setBorder(String arg) {
        optimisticData.put(getKey("border"), arg);
        return this;
    }

    /**
    * The decorative color for highlighting specific parts of the user interface.
    */

    public String getDecorative() {
        return (String) get("decorative");
    }

    public CheckoutBrandingColorRoles setDecorative(String arg) {
        optimisticData.put(getKey("decorative"), arg);
        return this;
    }

    /**
    * The color of icons.
    */

    public String getIcon() {
        return (String) get("icon");
    }

    public CheckoutBrandingColorRoles setIcon(String arg) {
        optimisticData.put(getKey("icon"), arg);
        return this;
    }

    /**
    * The color of text.
    */

    public String getText() {
        return (String) get("text");
    }

    public CheckoutBrandingColorRoles setText(String arg) {
        optimisticData.put(getKey("text"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accent": return false;

            case "background": return false;

            case "border": return false;

            case "decorative": return false;

            case "icon": return false;

            case "text": return false;

            default: return false;
        }
    }
}

