// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* An error that prevented a billing attempt.
*/
public class UnknownSubscriptionBillingAttemptProcessingError extends AbstractResponse<UnknownSubscriptionBillingAttemptProcessingError> implements SubscriptionBillingAttemptProcessingError {
    public UnknownSubscriptionBillingAttemptProcessingError() {
    }

    public UnknownSubscriptionBillingAttemptProcessingError(JsonObject fields) throws SchemaViolationError {
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

    public static SubscriptionBillingAttemptProcessingError create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "SubscriptionBillingAttemptGenericError": {
                return new SubscriptionBillingAttemptGenericError(fields);
            }

            case "SubscriptionBillingAttemptInsufficientStockProductVariantsError": {
                return new SubscriptionBillingAttemptInsufficientStockProductVariantsError(fields);
            }

            case "SubscriptionBillingAttemptOutOfStockProductVariantsError": {
                return new SubscriptionBillingAttemptOutOfStockProductVariantsError(fields);
            }

            default: {
                return new UnknownSubscriptionBillingAttemptProcessingError(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The code for the error.
    */

    public SubscriptionBillingAttemptErrorCode getCode() {
        return (SubscriptionBillingAttemptErrorCode) get("code");
    }

    public UnknownSubscriptionBillingAttemptProcessingError setCode(SubscriptionBillingAttemptErrorCode arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * An explanation of the error.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public UnknownSubscriptionBillingAttemptProcessingError setMessage(String arg) {
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

