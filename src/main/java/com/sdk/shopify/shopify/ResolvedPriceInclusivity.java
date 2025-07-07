// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The resolved price inclusivity attributes.
*/
public class ResolvedPriceInclusivity extends AbstractResponse<ResolvedPriceInclusivity> {
    public ResolvedPriceInclusivity() {
    }

    public ResolvedPriceInclusivity(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "dutiesIncluded": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "taxesIncluded": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "ResolvedPriceInclusivity";
    }

    /**
    * Whether duties are included in the price.
    */

    public Boolean getDutiesIncluded() {
        return (Boolean) get("dutiesIncluded");
    }

    public ResolvedPriceInclusivity setDutiesIncluded(Boolean arg) {
        optimisticData.put(getKey("dutiesIncluded"), arg);
        return this;
    }

    /**
    * Whether taxes are included in the price.
    */

    public Boolean getTaxesIncluded() {
        return (Boolean) get("taxesIncluded");
    }

    public ResolvedPriceInclusivity setTaxesIncluded(Boolean arg) {
        optimisticData.put(getKey("taxesIncluded"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "dutiesIncluded": return false;

            case "taxesIncluded": return false;

            default: return false;
        }
    }
}

