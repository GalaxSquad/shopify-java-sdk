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
* Colors for buttons.
*/
public class CheckoutBrandingButtonColorRoles extends AbstractResponse<CheckoutBrandingButtonColorRoles> {
    public CheckoutBrandingButtonColorRoles() {
    }

    public CheckoutBrandingButtonColorRoles(JsonObject fields) throws SchemaViolationError {
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

                case "hover": {
                    CheckoutBrandingColorRoles optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingColorRoles(jsonAsObject(field.getValue(), key));
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
        return "CheckoutBrandingButtonColorRoles";
    }

    /**
    * The color of accented objects (links and focused state).
    */

    public String getAccent() {
        return (String) get("accent");
    }

    public CheckoutBrandingButtonColorRoles setAccent(String arg) {
        optimisticData.put(getKey("accent"), arg);
        return this;
    }

    /**
    * The color of the background.
    */

    public String getBackground() {
        return (String) get("background");
    }

    public CheckoutBrandingButtonColorRoles setBackground(String arg) {
        optimisticData.put(getKey("background"), arg);
        return this;
    }

    /**
    * The color of borders.
    */

    public String getBorder() {
        return (String) get("border");
    }

    public CheckoutBrandingButtonColorRoles setBorder(String arg) {
        optimisticData.put(getKey("border"), arg);
        return this;
    }

    /**
    * The decorative color for highlighting specific parts of the user interface.
    */

    public String getDecorative() {
        return (String) get("decorative");
    }

    public CheckoutBrandingButtonColorRoles setDecorative(String arg) {
        optimisticData.put(getKey("decorative"), arg);
        return this;
    }

    /**
    * The colors of the button on hover.
    */

    public CheckoutBrandingColorRoles getHover() {
        return (CheckoutBrandingColorRoles) get("hover");
    }

    public CheckoutBrandingButtonColorRoles setHover(CheckoutBrandingColorRoles arg) {
        optimisticData.put(getKey("hover"), arg);
        return this;
    }

    /**
    * The color of icons.
    */

    public String getIcon() {
        return (String) get("icon");
    }

    public CheckoutBrandingButtonColorRoles setIcon(String arg) {
        optimisticData.put(getKey("icon"), arg);
        return this;
    }

    /**
    * The color of text.
    */

    public String getText() {
        return (String) get("text");
    }

    public CheckoutBrandingButtonColorRoles setText(String arg) {
        optimisticData.put(getKey("text"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accent": return false;

            case "background": return false;

            case "border": return false;

            case "decorative": return false;

            case "hover": return true;

            case "icon": return false;

            case "text": return false;

            default: return false;
        }
    }
}

