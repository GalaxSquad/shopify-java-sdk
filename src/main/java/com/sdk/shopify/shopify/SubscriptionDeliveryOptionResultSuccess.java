// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The delivery option for a subscription contract.
*/
public class SubscriptionDeliveryOptionResultSuccess extends AbstractResponse<SubscriptionDeliveryOptionResultSuccess> implements SubscriptionDeliveryOptionResult {
    public SubscriptionDeliveryOptionResultSuccess() {
    }

    public SubscriptionDeliveryOptionResultSuccess(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deliveryOptions": {
                    List<SubscriptionDeliveryOption> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(UnknownSubscriptionDeliveryOption.create(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "SubscriptionDeliveryOptionResultSuccess";
    }

    /**
    * The available delivery options.
    */

    public List<SubscriptionDeliveryOption> getDeliveryOptions() {
        return (List<SubscriptionDeliveryOption>) get("deliveryOptions");
    }

    public SubscriptionDeliveryOptionResultSuccess setDeliveryOptions(List<SubscriptionDeliveryOption> arg) {
        optimisticData.put(getKey("deliveryOptions"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deliveryOptions": return false;

            default: return false;
        }
    }
}

