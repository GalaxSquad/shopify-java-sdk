// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The font size.
*/
public class CheckoutBrandingFontSize extends AbstractResponse<CheckoutBrandingFontSize> {
    public CheckoutBrandingFontSize() {
    }

    public CheckoutBrandingFontSize(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "base": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "ratio": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
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
        return "CheckoutBrandingFontSize";
    }

    /**
    * The base font size.
    */

    public Double getBase() {
        return (Double) get("base");
    }

    public CheckoutBrandingFontSize setBase(Double arg) {
        optimisticData.put(getKey("base"), arg);
        return this;
    }

    /**
    * The scale ratio used to derive all font sizes such as small and large.
    */

    public Double getRatio() {
        return (Double) get("ratio");
    }

    public CheckoutBrandingFontSize setRatio(Double arg) {
        optimisticData.put(getKey("ratio"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "base": return false;

            case "ratio": return false;

            default: return false;
        }
    }
}

