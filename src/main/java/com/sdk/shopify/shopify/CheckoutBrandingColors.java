// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The color settings for global colors and color schemes.
*/
public class CheckoutBrandingColors extends AbstractResponse<CheckoutBrandingColors> {
    public CheckoutBrandingColors() {
    }

    public CheckoutBrandingColors(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "global": {
                    CheckoutBrandingColorGlobal optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingColorGlobal(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "schemes": {
                    CheckoutBrandingColorSchemes optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingColorSchemes(jsonAsObject(field.getValue(), key));
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
        return "CheckoutBrandingColors";
    }

    /**
    * A group of global colors for customizing the overall look and feel of the user interface.
    */

    public CheckoutBrandingColorGlobal getGlobal() {
        return (CheckoutBrandingColorGlobal) get("global");
    }

    public CheckoutBrandingColors setGlobal(CheckoutBrandingColorGlobal arg) {
        optimisticData.put(getKey("global"), arg);
        return this;
    }

    /**
    * A set of color schemes which apply to different areas of the user interface.
    */

    public CheckoutBrandingColorSchemes getSchemes() {
        return (CheckoutBrandingColorSchemes) get("schemes");
    }

    public CheckoutBrandingColors setSchemes(CheckoutBrandingColorSchemes arg) {
        optimisticData.put(getKey("schemes"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "global": return true;

            case "schemes": return true;

            default: return false;
        }
    }
}

