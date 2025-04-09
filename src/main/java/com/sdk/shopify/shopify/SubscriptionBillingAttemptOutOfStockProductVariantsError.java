// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An inventory error caused by an issue with one or more of the contract merchandise lines.
*/
public class SubscriptionBillingAttemptOutOfStockProductVariantsError extends AbstractResponse<SubscriptionBillingAttemptOutOfStockProductVariantsError> implements SubscriptionBillingAttemptProcessingError {
    public SubscriptionBillingAttemptOutOfStockProductVariantsError() {
    }

    public SubscriptionBillingAttemptOutOfStockProductVariantsError(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, SubscriptionBillingAttemptErrorCode.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "SubscriptionBillingAttemptOutOfStockProductVariantsError";
    }

    /**
    * The code for the error.
    */

    public SubscriptionBillingAttemptErrorCode getCode() {
        return (SubscriptionBillingAttemptErrorCode) get("code");
    }

    public SubscriptionBillingAttemptOutOfStockProductVariantsError setCode(SubscriptionBillingAttemptErrorCode arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * An explanation of the error.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public SubscriptionBillingAttemptOutOfStockProductVariantsError setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "message": return false;

            default: return false;
        }
    }
}

