// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a recipient who will receive the issued gift card.
*/
public class GiftCardRecipient extends AbstractResponse<GiftCardRecipient> {
    public GiftCardRecipient() {
    }

    public GiftCardRecipient(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "message": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "preferredName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "recipient": {
                    responseData.put(key, new Customer(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "sendNotificationAt": {
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
        return "GiftCardRecipient";
    }

    /**
    * The message sent with the gift card.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public GiftCardRecipient setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
    * The preferred name of the recipient who will receive the gift card.
    */

    public String getPreferredName() {
        return (String) get("preferredName");
    }

    public GiftCardRecipient setPreferredName(String arg) {
        optimisticData.put(getKey("preferredName"), arg);
        return this;
    }

    /**
    * The recipient who will receive the gift card.
    */

    public Customer getRecipient() {
        return (Customer) get("recipient");
    }

    public GiftCardRecipient setRecipient(Customer arg) {
        optimisticData.put(getKey("recipient"), arg);
        return this;
    }

    /**
    * The scheduled datetime on which the gift card will be sent to the recipient. The gift card will be
    * sent within an hour of the specified datetime.
    */

    public String getSendNotificationAt() {
        return (String) get("sendNotificationAt");
    }

    public GiftCardRecipient setSendNotificationAt(String arg) {
        optimisticData.put(getKey("sendNotificationAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "message": return false;

            case "preferredName": return false;

            case "recipient": return true;

            case "sendNotificationAt": return false;

            default: return false;
        }
    }
}

