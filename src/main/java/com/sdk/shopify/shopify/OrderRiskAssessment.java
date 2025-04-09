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
* The risk assessments for an order.
* See the [example query "Retrieves a list of all order risks for an
* order"](https://shopify.dev/docs/api/admin-graphql/unstable/queries/order?example=Retrieves+a+list+o
* f+all+order+risks+for+an+order).
*/
public class OrderRiskAssessment extends AbstractResponse<OrderRiskAssessment> {
    public OrderRiskAssessment() {
    }

    public OrderRiskAssessment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "facts": {
                    List<RiskFact> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new RiskFact(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "provider": {
                    App optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new App(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "riskLevel": {
                    responseData.put(key, RiskAssessmentResult.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "OrderRiskAssessment";
    }

    /**
    * Optional facts used to describe the risk assessment. The values in here are specific to the
    * provider.
    * See the [examples for the mutation
    * orderRiskAssessmentCreate](https://shopify.dev/api/admin-graphql/unstable/mutations/orderRiskAssessm
    * entCreate#section-examples).
    */

    public List<RiskFact> getFacts() {
        return (List<RiskFact>) get("facts");
    }

    public OrderRiskAssessment setFacts(List<RiskFact> arg) {
        optimisticData.put(getKey("facts"), arg);
        return this;
    }

    /**
    * The app that provided the assessment, `null` if the assessment was provided by Shopify.
    */

    public App getProvider() {
        return (App) get("provider");
    }

    public OrderRiskAssessment setProvider(App arg) {
        optimisticData.put(getKey("provider"), arg);
        return this;
    }

    /**
    * The likelihood that the order is fraudulent, based on this risk assessment.
    */

    public RiskAssessmentResult getRiskLevel() {
        return (RiskAssessmentResult) get("riskLevel");
    }

    public OrderRiskAssessment setRiskLevel(RiskAssessmentResult arg) {
        optimisticData.put(getKey("riskLevel"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "facts": return true;

            case "provider": return true;

            case "riskLevel": return false;

            default: return false;
        }
    }
}

