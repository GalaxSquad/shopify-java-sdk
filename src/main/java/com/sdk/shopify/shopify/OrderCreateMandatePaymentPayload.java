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
* Return type for `orderCreateMandatePayment` mutation.
*/
public class OrderCreateMandatePaymentPayload extends AbstractResponse<OrderCreateMandatePaymentPayload> {
    public OrderCreateMandatePaymentPayload() {
    }

    public OrderCreateMandatePaymentPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "job": {
                    Job optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Job(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentReferenceId": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<OrderCreateMandatePaymentUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new OrderCreateMandatePaymentUserError(jsonAsObject(element1, key)));
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
        return "OrderCreateMandatePaymentPayload";
    }

    /**
    * The async job used for charging the payment.
    */

    public Job getJob() {
        return (Job) get("job");
    }

    public OrderCreateMandatePaymentPayload setJob(Job arg) {
        optimisticData.put(getKey("job"), arg);
        return this;
    }

    /**
    * The Unique ID for the created payment.
    */

    public String getPaymentReferenceId() {
        return (String) get("paymentReferenceId");
    }

    public OrderCreateMandatePaymentPayload setPaymentReferenceId(String arg) {
        optimisticData.put(getKey("paymentReferenceId"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<OrderCreateMandatePaymentUserError> getUserErrors() {
        return (List<OrderCreateMandatePaymentUserError>) get("userErrors");
    }

    public OrderCreateMandatePaymentPayload setUserErrors(List<OrderCreateMandatePaymentUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "job": return true;

            case "paymentReferenceId": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

