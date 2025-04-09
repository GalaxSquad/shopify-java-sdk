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
* Return type for `subscriptionContractSetNextBillingDate` mutation.
*/
public class SubscriptionContractSetNextBillingDatePayload extends AbstractResponse<SubscriptionContractSetNextBillingDatePayload> {
    public SubscriptionContractSetNextBillingDatePayload() {
    }

    public SubscriptionContractSetNextBillingDatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "contract": {
                    SubscriptionContract optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContract(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<SubscriptionContractUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SubscriptionContractUserError(jsonAsObject(element1, key)));
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
        return "SubscriptionContractSetNextBillingDatePayload";
    }

    /**
    * The updated Subscription Contract object.
    */

    public SubscriptionContract getContract() {
        return (SubscriptionContract) get("contract");
    }

    public SubscriptionContractSetNextBillingDatePayload setContract(SubscriptionContract arg) {
        optimisticData.put(getKey("contract"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<SubscriptionContractUserError> getUserErrors() {
        return (List<SubscriptionContractUserError>) get("userErrors");
    }

    public SubscriptionContractSetNextBillingDatePayload setUserErrors(List<SubscriptionContractUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "contract": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

