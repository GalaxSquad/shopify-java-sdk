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
* Summary of risk characteristics for an order.
* See the [example query "Retrieves a list of all order risks for an
* order"](https://shopify.dev/docs/api/admin-graphql/unstable/queries/order?example=Retrieves+a+list+o
* f+all+order+risks+for+an+order).
*/
public class OrderRiskSummary extends AbstractResponse<OrderRiskSummary> {
    public OrderRiskSummary() {
    }

    public OrderRiskSummary(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "assessments": {
                    List<OrderRiskAssessment> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new OrderRiskAssessment(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "recommendation": {
                    responseData.put(key, OrderRiskRecommendationResult.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "OrderRiskSummary";
    }

    /**
    * The list of risk assessments for the order.
    */

    public List<OrderRiskAssessment> getAssessments() {
        return (List<OrderRiskAssessment>) get("assessments");
    }

    public OrderRiskSummary setAssessments(List<OrderRiskAssessment> arg) {
        optimisticData.put(getKey("assessments"), arg);
        return this;
    }

    /**
    * The recommendation for the order based on the results of the risk assessments. This suggests the
    * action the merchant should take with regards to its risk of fraud.
    */

    public OrderRiskRecommendationResult getRecommendation() {
        return (OrderRiskRecommendationResult) get("recommendation");
    }

    public OrderRiskSummary setRecommendation(OrderRiskRecommendationResult arg) {
        optimisticData.put(getKey("recommendation"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "assessments": return true;

            case "recommendation": return false;

            default: return false;
        }
    }
}

