// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Colors for form controls.
*/
public class CheckoutBrandingControlColorRoles extends AbstractResponse<CheckoutBrandingControlColorRoles> {
    public CheckoutBrandingControlColorRoles() {
    }

    public CheckoutBrandingControlColorRoles(JsonObject fields) throws SchemaViolationError {
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

                case "selected": {
                    CheckoutBrandingColorRoles optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingColorRoles(jsonAsObject(field.getValue(), key));
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
        return "CheckoutBrandingControlColorRoles";
    }

    /**
    * The color of accented objects (links and focused state).
    */

    public String getAccent() {
        return (String) get("accent");
    }

    public CheckoutBrandingControlColorRoles setAccent(String arg) {
        optimisticData.put(getKey("accent"), arg);
        return this;
    }

    /**
    * The color of the background.
    */

    public String getBackground() {
        return (String) get("background");
    }

    public CheckoutBrandingControlColorRoles setBackground(String arg) {
        optimisticData.put(getKey("background"), arg);
        return this;
    }

    /**
    * The color of borders.
    */

    public String getBorder() {
        return (String) get("border");
    }

    public CheckoutBrandingControlColorRoles setBorder(String arg) {
        optimisticData.put(getKey("border"), arg);
        return this;
    }

    /**
    * The decorative color for highlighting specific parts of the user interface.
    */

    public String getDecorative() {
        return (String) get("decorative");
    }

    public CheckoutBrandingControlColorRoles setDecorative(String arg) {
        optimisticData.put(getKey("decorative"), arg);
        return this;
    }

    /**
    * The color of icons.
    */

    public String getIcon() {
        return (String) get("icon");
    }

    public CheckoutBrandingControlColorRoles setIcon(String arg) {
        optimisticData.put(getKey("icon"), arg);
        return this;
    }

    /**
    * The colors of selected controls.
    */

    public CheckoutBrandingColorRoles getSelected() {
        return (CheckoutBrandingColorRoles) get("selected");
    }

    public CheckoutBrandingControlColorRoles setSelected(CheckoutBrandingColorRoles arg) {
        optimisticData.put(getKey("selected"), arg);
        return this;
    }

    /**
    * The color of text.
    */

    public String getText() {
        return (String) get("text");
    }

    public CheckoutBrandingControlColorRoles setText(String arg) {
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

            case "selected": return true;

            case "text": return false;

            default: return false;
        }
    }
}

