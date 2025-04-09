// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The header customizations.
*/
public class CheckoutBrandingHeader extends AbstractResponse<CheckoutBrandingHeader> {
    public CheckoutBrandingHeader() {
    }

    public CheckoutBrandingHeader(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "alignment": {
                    CheckoutBrandingHeaderAlignment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingHeaderAlignment.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "banner": {
                    CheckoutBrandingImage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingImage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cartLink": {
                    CheckoutBrandingHeaderCartLink optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingHeaderCartLink(jsonAsObject(field.getValue(), key));
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

                case "divided": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "logo": {
                    CheckoutBrandingLogo optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingLogo(jsonAsObject(field.getValue(), key));
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
                    CheckoutBrandingHeaderPosition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingHeaderPosition.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingHeader";
    }

    /**
    * The header alignment.
    */

    public CheckoutBrandingHeaderAlignment getAlignment() {
        return (CheckoutBrandingHeaderAlignment) get("alignment");
    }

    public CheckoutBrandingHeader setAlignment(CheckoutBrandingHeaderAlignment arg) {
        optimisticData.put(getKey("alignment"), arg);
        return this;
    }

    /**
    * The background image of the header.
    */

    public CheckoutBrandingImage getBanner() {
        return (CheckoutBrandingImage) get("banner");
    }

    public CheckoutBrandingHeader setBanner(CheckoutBrandingImage arg) {
        optimisticData.put(getKey("banner"), arg);
        return this;
    }

    /**
    * The cart link customizations for 1-page checkout. This field allows to customize the cart icon that
    * renders by default on 1-page checkout.
    */

    public CheckoutBrandingHeaderCartLink getCartLink() {
        return (CheckoutBrandingHeaderCartLink) get("cartLink");
    }

    public CheckoutBrandingHeader setCartLink(CheckoutBrandingHeaderCartLink arg) {
        optimisticData.put(getKey("cartLink"), arg);
        return this;
    }

    /**
    * The selected color scheme of the header container.
    */

    public CheckoutBrandingColorSchemeSelection getColorScheme() {
        return (CheckoutBrandingColorSchemeSelection) get("colorScheme");
    }

    public CheckoutBrandingHeader setColorScheme(CheckoutBrandingColorSchemeSelection arg) {
        optimisticData.put(getKey("colorScheme"), arg);
        return this;
    }

    /**
    * The divided setting.
    */

    public Boolean getDivided() {
        return (Boolean) get("divided");
    }

    public CheckoutBrandingHeader setDivided(Boolean arg) {
        optimisticData.put(getKey("divided"), arg);
        return this;
    }

    /**
    * The store logo.
    */

    public CheckoutBrandingLogo getLogo() {
        return (CheckoutBrandingLogo) get("logo");
    }

    public CheckoutBrandingHeader setLogo(CheckoutBrandingLogo arg) {
        optimisticData.put(getKey("logo"), arg);
        return this;
    }

    /**
    * The padding of the header container.
    */

    public CheckoutBrandingSpacingKeyword getPadding() {
        return (CheckoutBrandingSpacingKeyword) get("padding");
    }

    public CheckoutBrandingHeader setPadding(CheckoutBrandingSpacingKeyword arg) {
        optimisticData.put(getKey("padding"), arg);
        return this;
    }

    /**
    * The header position.
    */

    public CheckoutBrandingHeaderPosition getPosition() {
        return (CheckoutBrandingHeaderPosition) get("position");
    }

    public CheckoutBrandingHeader setPosition(CheckoutBrandingHeaderPosition arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "alignment": return false;

            case "banner": return true;

            case "cartLink": return true;

            case "colorScheme": return false;

            case "divided": return false;

            case "logo": return true;

            case "padding": return false;

            case "position": return false;

            default: return false;
        }
    }
}

