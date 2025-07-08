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
* Return type for `consentPolicyUpdate` mutation.
*/
public class ConsentPolicyUpdatePayload extends AbstractResponse<ConsentPolicyUpdatePayload> {
    public ConsentPolicyUpdatePayload() {
    }

    public ConsentPolicyUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "updatedPolicies": {
                    List<ConsentPolicy> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ConsentPolicy> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new ConsentPolicy(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<ConsentPolicyError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ConsentPolicyError(jsonAsObject(element1, key)));
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
        return "ConsentPolicyUpdatePayload";
    }

    /**
    * All updated and created consent policies. The consent policies that haven't been modified as part of
    * the mutation aren't returned.
    */

    public List<ConsentPolicy> getUpdatedPolicies() {
        return (List<ConsentPolicy>) get("updatedPolicies");
    }

    public ConsentPolicyUpdatePayload setUpdatedPolicies(List<ConsentPolicy> arg) {
        optimisticData.put(getKey("updatedPolicies"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ConsentPolicyError> getUserErrors() {
        return (List<ConsentPolicyError>) get("userErrors");
    }

    public ConsentPolicyUpdatePayload setUserErrors(List<ConsentPolicyError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "updatedPolicies": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

