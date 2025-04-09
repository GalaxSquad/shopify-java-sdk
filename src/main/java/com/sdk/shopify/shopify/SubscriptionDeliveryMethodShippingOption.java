// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the selected shipping option on a subscription contract.
*/
public class SubscriptionDeliveryMethodShippingOption extends AbstractResponse<SubscriptionDeliveryMethodShippingOption> {
    public SubscriptionDeliveryMethodShippingOption() {
    }

    public SubscriptionDeliveryMethodShippingOption(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "presentmentTitle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "SubscriptionDeliveryMethodShippingOption";
    }

    /**
    * The code of the shipping option.
    */

    public String getCode() {
        return (String) get("code");
    }

    public SubscriptionDeliveryMethodShippingOption setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The description of the shipping option.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public SubscriptionDeliveryMethodShippingOption setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The presentment title of the shipping option.
    */

    public String getPresentmentTitle() {
        return (String) get("presentmentTitle");
    }

    public SubscriptionDeliveryMethodShippingOption setPresentmentTitle(String arg) {
        optimisticData.put(getKey("presentmentTitle"), arg);
        return this;
    }

    /**
    * The title of the shipping option.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public SubscriptionDeliveryMethodShippingOption setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "description": return false;

            case "presentmentTitle": return false;

            case "title": return false;

            default: return false;
        }
    }
}

