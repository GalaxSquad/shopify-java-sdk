// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A container for the footer section customizations.
*/
public class CheckoutBrandingFooter extends AbstractResponse<CheckoutBrandingFooter> {
    public CheckoutBrandingFooter() {
    }

    public CheckoutBrandingFooter(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "alignment": {
                    CheckoutBrandingFooterAlignment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingFooterAlignment.fromGraphQl(jsonAsString(field.getValue(), key));
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

                case "content": {
                    CheckoutBrandingFooterContent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingFooterContent(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "divided": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
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

                case "position": {
                    CheckoutBrandingFooterPosition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingFooterPosition.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingFooter";
    }

    /**
    * The footer alignment.
    */

    public CheckoutBrandingFooterAlignment getAlignment() {
        return (CheckoutBrandingFooterAlignment) get("alignment");
    }

    public CheckoutBrandingFooter setAlignment(CheckoutBrandingFooterAlignment arg) {
        optimisticData.put(getKey("alignment"), arg);
        return this;
    }

    /**
    * The selected color scheme of the footer container.
    */

    public CheckoutBrandingColorSchemeSelection getColorScheme() {
        return (CheckoutBrandingColorSchemeSelection) get("colorScheme");
    }

    public CheckoutBrandingFooter setColorScheme(CheckoutBrandingColorSchemeSelection arg) {
        optimisticData.put(getKey("colorScheme"), arg);
        return this;
    }

    /**
    * The footer content settings.
    */

    public CheckoutBrandingFooterContent getContent() {
        return (CheckoutBrandingFooterContent) get("content");
    }

    public CheckoutBrandingFooter setContent(CheckoutBrandingFooterContent arg) {
        optimisticData.put(getKey("content"), arg);
        return this;
    }

    /**
    * The divided setting.
    */

    public Boolean getDivided() {
        return (Boolean) get("divided");
    }

    public CheckoutBrandingFooter setDivided(Boolean arg) {
        optimisticData.put(getKey("divided"), arg);
        return this;
    }

    /**
    * The padding of the footer container.
    */

    public CheckoutBrandingSpacingKeyword getPadding() {
        return (CheckoutBrandingSpacingKeyword) get("padding");
    }

    public CheckoutBrandingFooter setPadding(CheckoutBrandingSpacingKeyword arg) {
        optimisticData.put(getKey("padding"), arg);
        return this;
    }

    /**
    * The footer position.
    */

    public CheckoutBrandingFooterPosition getPosition() {
        return (CheckoutBrandingFooterPosition) get("position");
    }

    public CheckoutBrandingFooter setPosition(CheckoutBrandingFooterPosition arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "alignment": return false;

            case "colorScheme": return false;

            case "content": return true;

            case "divided": return false;

            case "padding": return false;

            case "position": return false;

            default: return false;
        }
    }
}

