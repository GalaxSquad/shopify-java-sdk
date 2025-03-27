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
* Represents the cart transform feature configuration for the shop.
*/
public class CartTransformEligibleOperations extends AbstractResponse<CartTransformEligibleOperations> {
    public CartTransformEligibleOperations() {
    }

    public CartTransformEligibleOperations(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "expandOperation": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "mergeOperation": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "updateOperation": {
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
        return "CartTransformEligibleOperations";
    }

    /**
    * The shop is eligible for expand operations.
    */

    public Boolean getExpandOperation() {
        return (Boolean) get("expandOperation");
    }

    public CartTransformEligibleOperations setExpandOperation(Boolean arg) {
        optimisticData.put(getKey("expandOperation"), arg);
        return this;
    }

    /**
    * The shop is eligible for merge operations.
    */

    public Boolean getMergeOperation() {
        return (Boolean) get("mergeOperation");
    }

    public CartTransformEligibleOperations setMergeOperation(Boolean arg) {
        optimisticData.put(getKey("mergeOperation"), arg);
        return this;
    }

    /**
    * The shop is eligible for update operations.
    */

    public Boolean getUpdateOperation() {
        return (Boolean) get("updateOperation");
    }

    public CartTransformEligibleOperations setUpdateOperation(Boolean arg) {
        optimisticData.put(getKey("updateOperation"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "expandOperation": return false;

            case "mergeOperation": return false;

            case "updateOperation": return false;

            default: return false;
        }
    }
}

