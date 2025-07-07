// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A subscription delivery method for local delivery.
* The other subscription delivery methods can be found in the `SubscriptionDeliveryMethod` union type.
*/
public class SubscriptionDeliveryMethodLocalDelivery extends AbstractResponse<SubscriptionDeliveryMethodLocalDelivery> implements SubscriptionDeliveryMethod {
    public SubscriptionDeliveryMethodLocalDelivery() {
    }

    public SubscriptionDeliveryMethodLocalDelivery(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "address": {
                    responseData.put(key, new MailingAddress(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "localDeliveryOption": {
                    responseData.put(key, new SubscriptionDeliveryMethodLocalDeliveryOption(jsonAsObject(field.getValue(), key)));

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
        return "SubscriptionDeliveryMethodLocalDelivery";
    }

    /**
    * The address to deliver to.
    */

    public MailingAddress getAddress() {
        return (MailingAddress) get("address");
    }

    public SubscriptionDeliveryMethodLocalDelivery setAddress(MailingAddress arg) {
        optimisticData.put(getKey("address"), arg);
        return this;
    }

    /**
    * The details of the local delivery method to use.
    */

    public SubscriptionDeliveryMethodLocalDeliveryOption getLocalDeliveryOption() {
        return (SubscriptionDeliveryMethodLocalDeliveryOption) get("localDeliveryOption");
    }

    public SubscriptionDeliveryMethodLocalDelivery setLocalDeliveryOption(SubscriptionDeliveryMethodLocalDeliveryOption arg) {
        optimisticData.put(getKey("localDeliveryOption"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address": return true;

            case "localDeliveryOption": return true;

            default: return false;
        }
    }
}

