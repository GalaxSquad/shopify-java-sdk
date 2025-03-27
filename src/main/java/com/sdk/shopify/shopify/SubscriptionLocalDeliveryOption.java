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
* A local delivery option for a subscription contract.
*/
public class SubscriptionLocalDeliveryOption extends AbstractResponse<SubscriptionLocalDeliveryOption> implements SubscriptionDeliveryOption {
    public SubscriptionLocalDeliveryOption() {
    }

    public SubscriptionLocalDeliveryOption(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "phoneRequired": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "presentmentTitle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
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
        return "SubscriptionLocalDeliveryOption";
    }

    /**
    * The code of the local delivery option.
    */

    public String getCode() {
        return (String) get("code");
    }

    public SubscriptionLocalDeliveryOption setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The description of the local delivery option.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public SubscriptionLocalDeliveryOption setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * Whether a phone number is required for the local delivery option.
    */

    public Boolean getPhoneRequired() {
        return (Boolean) get("phoneRequired");
    }

    public SubscriptionLocalDeliveryOption setPhoneRequired(Boolean arg) {
        optimisticData.put(getKey("phoneRequired"), arg);
        return this;
    }

    /**
    * The presentment title of the local delivery option.
    */

    public String getPresentmentTitle() {
        return (String) get("presentmentTitle");
    }

    public SubscriptionLocalDeliveryOption setPresentmentTitle(String arg) {
        optimisticData.put(getKey("presentmentTitle"), arg);
        return this;
    }

    /**
    * The price of the local delivery option.
    */

    public MoneyV2 getPrice() {
        return (MoneyV2) get("price");
    }

    public SubscriptionLocalDeliveryOption setPrice(MoneyV2 arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * The title of the local delivery option.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public SubscriptionLocalDeliveryOption setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "description": return false;

            case "phoneRequired": return false;

            case "presentmentTitle": return false;

            case "price": return true;

            case "title": return false;

            default: return false;
        }
    }
}

