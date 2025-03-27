// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The status of a customer's payment for an order.
*/
public class OrderPaymentStatus extends AbstractResponse<OrderPaymentStatus> {
    public OrderPaymentStatus() {
    }

    public OrderPaymentStatus(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "errorMessage": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentReferenceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "status": {
                    responseData.put(key, OrderPaymentStatusResult.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "transactions": {
                    List<OrderTransaction> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new OrderTransaction(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "translatedErrorMessage": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "OrderPaymentStatus";
    }

    /**
    * A message describing an error during the asynchronous processing of a payment.
    */

    public String getErrorMessage() {
        return (String) get("errorMessage");
    }

    public OrderPaymentStatus setErrorMessage(String arg) {
        optimisticData.put(getKey("errorMessage"), arg);
        return this;
    }

    /**
    * The ID of the payment, initially returned by an `orderCreateMandatePayment` or `orderCreatePayment`
    * mutation.
    */

    public String getPaymentReferenceId() {
        return (String) get("paymentReferenceId");
    }

    public OrderPaymentStatus setPaymentReferenceId(String arg) {
        optimisticData.put(getKey("paymentReferenceId"), arg);
        return this;
    }

    /**
    * The status of the payment.
    */

    public OrderPaymentStatusResult getStatus() {
        return (OrderPaymentStatusResult) get("status");
    }

    public OrderPaymentStatus setStatus(OrderPaymentStatusResult arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The transaction associated with the payment.
    */

    public List<OrderTransaction> getTransactions() {
        return (List<OrderTransaction>) get("transactions");
    }

    public OrderPaymentStatus setTransactions(List<OrderTransaction> arg) {
        optimisticData.put(getKey("transactions"), arg);
        return this;
    }

    /**
    * A translated message describing an error during the asynchronous processing of a payment.
    */

    public String getTranslatedErrorMessage() {
        return (String) get("translatedErrorMessage");
    }

    public OrderPaymentStatus setTranslatedErrorMessage(String arg) {
        optimisticData.put(getKey("translatedErrorMessage"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "errorMessage": return false;

            case "paymentReferenceId": return false;

            case "status": return false;

            case "transactions": return true;

            case "translatedErrorMessage": return false;

            default: return false;
        }
    }
}

