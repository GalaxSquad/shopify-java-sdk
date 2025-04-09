// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The selected delivery option on a subscription contract.
*/
public class SubscriptionDeliveryMethodLocalDeliveryOption extends AbstractResponse<SubscriptionDeliveryMethodLocalDeliveryOption> {
    public SubscriptionDeliveryMethodLocalDeliveryOption() {
    }

    public SubscriptionDeliveryMethodLocalDeliveryOption(JsonObject fields) throws SchemaViolationError {
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

                case "instructions": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "phone": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "SubscriptionDeliveryMethodLocalDeliveryOption";
    }

    /**
    * A custom reference to the delivery method for use with automations.
    */

    public String getCode() {
        return (String) get("code");
    }

    public SubscriptionDeliveryMethodLocalDeliveryOption setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The details displayed to the customer to describe the local delivery option.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public SubscriptionDeliveryMethodLocalDeliveryOption setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The delivery instructions that the customer can provide to the merchant.
    */

    public String getInstructions() {
        return (String) get("instructions");
    }

    public SubscriptionDeliveryMethodLocalDeliveryOption setInstructions(String arg) {
        optimisticData.put(getKey("instructions"), arg);
        return this;
    }

    /**
    * The phone number that the customer provided to the merchant.
    * Formatted using E.164 standard. For example, `+16135551111`.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public SubscriptionDeliveryMethodLocalDeliveryOption setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The presentment title of the local delivery option.
    */

    public String getPresentmentTitle() {
        return (String) get("presentmentTitle");
    }

    public SubscriptionDeliveryMethodLocalDeliveryOption setPresentmentTitle(String arg) {
        optimisticData.put(getKey("presentmentTitle"), arg);
        return this;
    }

    /**
    * The title of the local delivery option.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public SubscriptionDeliveryMethodLocalDeliveryOption setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "description": return false;

            case "instructions": return false;

            case "phone": return false;

            case "presentmentTitle": return false;

            case "title": return false;

            default: return false;
        }
    }
}

