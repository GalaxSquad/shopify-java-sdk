// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The error history from running a Shopify Function.
*/
public class FunctionsErrorHistory extends AbstractResponse<FunctionsErrorHistory> {
    public FunctionsErrorHistory() {
    }

    public FunctionsErrorHistory(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "errorsFirstOccurredAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "firstOccurredAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "hasBeenSharedSinceLastError": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "hasSharedRecentErrors": {
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
        return "FunctionsErrorHistory";
    }

    /**
    * The date and time that the first error occurred.
    */

    public String getErrorsFirstOccurredAt() {
        return (String) get("errorsFirstOccurredAt");
    }

    public FunctionsErrorHistory setErrorsFirstOccurredAt(String arg) {
        optimisticData.put(getKey("errorsFirstOccurredAt"), arg);
        return this;
    }

    /**
    * The date and time that the first error occurred.
    */

    public String getFirstOccurredAt() {
        return (String) get("firstOccurredAt");
    }

    public FunctionsErrorHistory setFirstOccurredAt(String arg) {
        optimisticData.put(getKey("firstOccurredAt"), arg);
        return this;
    }

    /**
    * Whether the merchant has shared all the recent errors with the developer.
    */

    public Boolean getHasBeenSharedSinceLastError() {
        return (Boolean) get("hasBeenSharedSinceLastError");
    }

    public FunctionsErrorHistory setHasBeenSharedSinceLastError(Boolean arg) {
        optimisticData.put(getKey("hasBeenSharedSinceLastError"), arg);
        return this;
    }

    /**
    * Whether the merchant has shared all the recent errors with the developer.
    */

    public Boolean getHasSharedRecentErrors() {
        return (Boolean) get("hasSharedRecentErrors");
    }

    public FunctionsErrorHistory setHasSharedRecentErrors(Boolean arg) {
        optimisticData.put(getKey("hasSharedRecentErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "errorsFirstOccurredAt": return false;

            case "firstOccurredAt": return false;

            case "hasBeenSharedSinceLastError": return false;

            case "hasSharedRecentErrors": return false;

            default: return false;
        }
    }
}

