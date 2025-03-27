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
* Represents a shipping delivery method: a mailing address and a shipping option.
*/
public class SubscriptionDeliveryMethodShipping extends AbstractResponse<SubscriptionDeliveryMethodShipping> implements SubscriptionDeliveryMethod {
    public SubscriptionDeliveryMethodShipping() {
    }

    public SubscriptionDeliveryMethodShipping(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "address": {
                    responseData.put(key, new SubscriptionMailingAddress(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "shippingOption": {
                    responseData.put(key, new SubscriptionDeliveryMethodShippingOption(jsonAsObject(field.getValue(), key)));

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
        return "SubscriptionDeliveryMethodShipping";
    }

    /**
    * The address to ship to.
    */

    public SubscriptionMailingAddress getAddress() {
        return (SubscriptionMailingAddress) get("address");
    }

    public SubscriptionDeliveryMethodShipping setAddress(SubscriptionMailingAddress arg) {
        optimisticData.put(getKey("address"), arg);
        return this;
    }

    /**
    * The details of the shipping method to use.
    */

    public SubscriptionDeliveryMethodShippingOption getShippingOption() {
        return (SubscriptionDeliveryMethodShippingOption) get("shippingOption");
    }

    public SubscriptionDeliveryMethodShipping setShippingOption(SubscriptionDeliveryMethodShippingOption arg) {
        optimisticData.put(getKey("shippingOption"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address": return true;

            case "shippingOption": return true;

            default: return false;
        }
    }
}

