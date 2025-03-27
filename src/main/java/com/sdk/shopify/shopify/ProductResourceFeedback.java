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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Reports the status of product for a Sales Channel or Storefront API.
* This might include why a product is not available in a Sales Channel
* and how a merchant might fix this.
*/
public class ProductResourceFeedback extends AbstractResponse<ProductResourceFeedback> {
    public ProductResourceFeedback() {
    }

    public ProductResourceFeedback(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "feedbackGeneratedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "messages": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "productId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "productUpdatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "state": {
                    responseData.put(key, ResourceFeedbackState.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "ProductResourceFeedback";
    }

    /**
    * The time when the feedback was generated. Used to help determine whether
    * incoming feedback is outdated compared to existing feedback.
    */

    public String getFeedbackGeneratedAt() {
        return (String) get("feedbackGeneratedAt");
    }

    public ProductResourceFeedback setFeedbackGeneratedAt(String arg) {
        optimisticData.put(getKey("feedbackGeneratedAt"), arg);
        return this;
    }

    /**
    * The feedback messages presented to the merchant.
    */

    public List<String> getMessages() {
        return (List<String>) get("messages");
    }

    public ProductResourceFeedback setMessages(List<String> arg) {
        optimisticData.put(getKey("messages"), arg);
        return this;
    }

    /**
    * The ID of the product associated with the feedback.
    */

    public ID getProductId() {
        return (ID) get("productId");
    }

    public ProductResourceFeedback setProductId(ID arg) {
        optimisticData.put(getKey("productId"), arg);
        return this;
    }

    /**
    * The timestamp of the product associated with the feedback.
    */

    public String getProductUpdatedAt() {
        return (String) get("productUpdatedAt");
    }

    public ProductResourceFeedback setProductUpdatedAt(String arg) {
        optimisticData.put(getKey("productUpdatedAt"), arg);
        return this;
    }

    /**
    * Conveys the state of the feedback and whether it requires merchant action or not.
    */

    public ResourceFeedbackState getState() {
        return (ResourceFeedbackState) get("state");
    }

    public ProductResourceFeedback setState(ResourceFeedbackState arg) {
        optimisticData.put(getKey("state"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "feedbackGeneratedAt": return false;

            case "messages": return false;

            case "productId": return false;

            case "productUpdatedAt": return false;

            case "state": return false;

            default: return false;
        }
    }
}

