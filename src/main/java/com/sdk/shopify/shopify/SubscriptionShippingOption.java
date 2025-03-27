// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A shipping option to deliver a subscription contract.
*/
public class SubscriptionShippingOption extends AbstractResponse<SubscriptionShippingOption> implements SubscriptionDeliveryOption {
    public SubscriptionShippingOption() {
    }

    public SubscriptionShippingOption(JsonObject fields) throws SchemaViolationError {
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
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "SubscriptionShippingOption";
    }

    /**
    * The code of the shipping option.
    */

    public String getCode() {
        return (String) get("code");
    }

    public SubscriptionShippingOption setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The description of the shipping option.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public SubscriptionShippingOption setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * If a phone number is required for the shipping option.
    */

    public Boolean getPhoneRequired() {
        return (Boolean) get("phoneRequired");
    }

    public SubscriptionShippingOption setPhoneRequired(Boolean arg) {
        optimisticData.put(getKey("phoneRequired"), arg);
        return this;
    }

    /**
    * The presentment title of the shipping option.
    */

    public String getPresentmentTitle() {
        return (String) get("presentmentTitle");
    }

    public SubscriptionShippingOption setPresentmentTitle(String arg) {
        optimisticData.put(getKey("presentmentTitle"), arg);
        return this;
    }

    /**
    * The price of the shipping option.
    */

    public MoneyV2 getPrice() {
        return (MoneyV2) get("price");
    }

    public SubscriptionShippingOption setPrice(MoneyV2 arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * The title of the shipping option.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public SubscriptionShippingOption setTitle(String arg) {
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

