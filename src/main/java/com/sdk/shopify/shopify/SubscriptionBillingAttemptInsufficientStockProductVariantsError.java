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
* An inventory error caused by an issue with one or more of the contract merchandise lines.
*/
public class SubscriptionBillingAttemptInsufficientStockProductVariantsError extends AbstractResponse<SubscriptionBillingAttemptInsufficientStockProductVariantsError> implements SubscriptionBillingAttemptProcessingError {
    public SubscriptionBillingAttemptInsufficientStockProductVariantsError() {
    }

    public SubscriptionBillingAttemptInsufficientStockProductVariantsError(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, SubscriptionBillingAttemptErrorCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "insufficientStockProductVariants": {
                    responseData.put(key, new ProductVariantConnection(jsonAsObject(field.getValue(), key)));

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
        return "SubscriptionBillingAttemptInsufficientStockProductVariantsError";
    }

    /**
    * The code for the error.
    */

    public SubscriptionBillingAttemptErrorCode getCode() {
        return (SubscriptionBillingAttemptErrorCode) get("code");
    }

    public SubscriptionBillingAttemptInsufficientStockProductVariantsError setCode(SubscriptionBillingAttemptErrorCode arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * A list of product variants that caused the insufficient inventory error.
    */

    public ProductVariantConnection getInsufficientStockProductVariants() {
        return (ProductVariantConnection) get("insufficientStockProductVariants");
    }

    public SubscriptionBillingAttemptInsufficientStockProductVariantsError setInsufficientStockProductVariants(ProductVariantConnection arg) {
        optimisticData.put(getKey("insufficientStockProductVariants"), arg);
        return this;
    }

    /**
    * An explanation of the error.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public SubscriptionBillingAttemptInsufficientStockProductVariantsError setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "insufficientStockProductVariants": return true;

            case "message": return false;

            default: return false;
        }
    }
}

