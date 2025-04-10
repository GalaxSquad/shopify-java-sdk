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
* Return type for `fulfillmentConstraintRuleCreate` mutation.
*/
public class FulfillmentConstraintRuleCreatePayload extends AbstractResponse<FulfillmentConstraintRuleCreatePayload> {
    public FulfillmentConstraintRuleCreatePayload() {
    }

    public FulfillmentConstraintRuleCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fulfillmentConstraintRule": {
                    FulfillmentConstraintRule optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentConstraintRule(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<FulfillmentConstraintRuleCreateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentConstraintRuleCreateUserError(jsonAsObject(element1, key)));
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
        return "FulfillmentConstraintRuleCreatePayload";
    }

    /**
    * The newly created fulfillment constraint rule.
    */

    public FulfillmentConstraintRule getFulfillmentConstraintRule() {
        return (FulfillmentConstraintRule) get("fulfillmentConstraintRule");
    }

    public FulfillmentConstraintRuleCreatePayload setFulfillmentConstraintRule(FulfillmentConstraintRule arg) {
        optimisticData.put(getKey("fulfillmentConstraintRule"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<FulfillmentConstraintRuleCreateUserError> getUserErrors() {
        return (List<FulfillmentConstraintRuleCreateUserError>) get("userErrors");
    }

    public FulfillmentConstraintRuleCreatePayload setUserErrors(List<FulfillmentConstraintRuleCreateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fulfillmentConstraintRule": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

