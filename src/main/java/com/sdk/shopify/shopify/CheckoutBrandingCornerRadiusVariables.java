// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Define the pixel size of corner radius options.
*/
public class CheckoutBrandingCornerRadiusVariables extends AbstractResponse<CheckoutBrandingCornerRadiusVariables> {
    public CheckoutBrandingCornerRadiusVariables() {
    }

    public CheckoutBrandingCornerRadiusVariables(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "base": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "large": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "small": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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
        return "CheckoutBrandingCornerRadiusVariables";
    }

    /**
    * The value in pixels for base corner radii. Example: 5.
    */

    public Integer getBase() {
        return (Integer) get("base");
    }

    public CheckoutBrandingCornerRadiusVariables setBase(Integer arg) {
        optimisticData.put(getKey("base"), arg);
        return this;
    }

    /**
    * The value in pixels for large corner radii. Example: 10.
    */

    public Integer getLarge() {
        return (Integer) get("large");
    }

    public CheckoutBrandingCornerRadiusVariables setLarge(Integer arg) {
        optimisticData.put(getKey("large"), arg);
        return this;
    }

    /**
    * The value in pixels for small corner radii. Example: 3.
    */

    public Integer getSmall() {
        return (Integer) get("small");
    }

    public CheckoutBrandingCornerRadiusVariables setSmall(Integer arg) {
        optimisticData.put(getKey("small"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "base": return false;

            case "large": return false;

            case "small": return false;

            default: return false;
        }
    }
}

