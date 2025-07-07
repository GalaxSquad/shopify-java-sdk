// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A warning indicating that the market region country code is not supported with Markets.
*/
public class DraftOrderMarketRegionCountryCodeNotSupportedWarning extends AbstractResponse<DraftOrderMarketRegionCountryCodeNotSupportedWarning> implements DraftOrderWarning {
    public DraftOrderMarketRegionCountryCodeNotSupportedWarning() {
    }

    public DraftOrderMarketRegionCountryCodeNotSupportedWarning(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "errorCode": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "field": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "message": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "DraftOrderMarketRegionCountryCodeNotSupportedWarning";
    }

    /**
    * The error code.
    */

    public String getErrorCode() {
        return (String) get("errorCode");
    }

    public DraftOrderMarketRegionCountryCodeNotSupportedWarning setErrorCode(String arg) {
        optimisticData.put(getKey("errorCode"), arg);
        return this;
    }

    /**
    * The input field that the warning applies to.
    */

    public String getField() {
        return (String) get("field");
    }

    public DraftOrderMarketRegionCountryCodeNotSupportedWarning setField(String arg) {
        optimisticData.put(getKey("field"), arg);
        return this;
    }

    /**
    * The warning message.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public DraftOrderMarketRegionCountryCodeNotSupportedWarning setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "errorCode": return false;

            case "field": return false;

            case "message": return false;

            default: return false;
        }
    }
}

