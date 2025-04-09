// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The main container customizations.
*/
public class CheckoutBrandingMain extends AbstractResponse<CheckoutBrandingMain> {
    public CheckoutBrandingMain() {
    }

    public CheckoutBrandingMain(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "backgroundImage": {
                    CheckoutBrandingImage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingImage(jsonAsObject(field.getValue(), key));
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

                case "divider": {
                    CheckoutBrandingContainerDivider optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingContainerDivider(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "section": {
                    CheckoutBrandingMainSection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingMainSection(jsonAsObject(field.getValue(), key));
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
        return "CheckoutBrandingMain";
    }

    /**
    * The background image of the main container.
    */

    public CheckoutBrandingImage getBackgroundImage() {
        return (CheckoutBrandingImage) get("backgroundImage");
    }

    public CheckoutBrandingMain setBackgroundImage(CheckoutBrandingImage arg) {
        optimisticData.put(getKey("backgroundImage"), arg);
        return this;
    }

    /**
    * The selected color scheme of the main container.
    */

    public CheckoutBrandingColorSchemeSelection getColorScheme() {
        return (CheckoutBrandingColorSchemeSelection) get("colorScheme");
    }

    public CheckoutBrandingMain setColorScheme(CheckoutBrandingColorSchemeSelection arg) {
        optimisticData.put(getKey("colorScheme"), arg);
        return this;
    }

    /**
    * The main container's divider style and visibility.
    */

    public CheckoutBrandingContainerDivider getDivider() {
        return (CheckoutBrandingContainerDivider) get("divider");
    }

    public CheckoutBrandingMain setDivider(CheckoutBrandingContainerDivider arg) {
        optimisticData.put(getKey("divider"), arg);
        return this;
    }

    /**
    * The settings for the main sections.
    */

    public CheckoutBrandingMainSection getSection() {
        return (CheckoutBrandingMainSection) get("section");
    }

    public CheckoutBrandingMain setSection(CheckoutBrandingMainSection arg) {
        optimisticData.put(getKey("section"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "backgroundImage": return true;

            case "colorScheme": return false;

            case "divider": return true;

            case "section": return true;

            default: return false;
        }
    }
}

