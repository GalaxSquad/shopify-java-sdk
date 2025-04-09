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
* A shipping option for delivery of a subscription contract.
*/
public class SubscriptionShippingOptionResultSuccess extends AbstractResponse<SubscriptionShippingOptionResultSuccess> implements SubscriptionShippingOptionResult {
    public SubscriptionShippingOptionResultSuccess() {
    }

    public SubscriptionShippingOptionResultSuccess(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "shippingOptions": {
                    List<SubscriptionShippingOption> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SubscriptionShippingOption(jsonAsObject(element1, key)));
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
        return "SubscriptionShippingOptionResultSuccess";
    }

    /**
    * Available shipping options.
    */

    public List<SubscriptionShippingOption> getShippingOptions() {
        return (List<SubscriptionShippingOption>) get("shippingOptions");
    }

    public SubscriptionShippingOptionResultSuccess setShippingOptions(List<SubscriptionShippingOption> arg) {
        optimisticData.put(getKey("shippingOptions"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "shippingOptions": return true;

            default: return false;
        }
    }
}

