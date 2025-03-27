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
* Return type for `orderRiskAssessmentCreate` mutation.
*/
public class OrderRiskAssessmentCreatePayload extends AbstractResponse<OrderRiskAssessmentCreatePayload> {
    public OrderRiskAssessmentCreatePayload() {
    }

    public OrderRiskAssessmentCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "orderRiskAssessment": {
                    OrderRiskAssessment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderRiskAssessment(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<OrderRiskAssessmentCreateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new OrderRiskAssessmentCreateUserError(jsonAsObject(element1, key)));
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
        return "OrderRiskAssessmentCreatePayload";
    }

    /**
    * The order risk assessment created.
    */

    public OrderRiskAssessment getOrderRiskAssessment() {
        return (OrderRiskAssessment) get("orderRiskAssessment");
    }

    public OrderRiskAssessmentCreatePayload setOrderRiskAssessment(OrderRiskAssessment arg) {
        optimisticData.put(getKey("orderRiskAssessment"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<OrderRiskAssessmentCreateUserError> getUserErrors() {
        return (List<OrderRiskAssessmentCreateUserError>) get("userErrors");
    }

    public OrderRiskAssessmentCreatePayload setUserErrors(List<OrderRiskAssessmentCreateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "orderRiskAssessment": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

