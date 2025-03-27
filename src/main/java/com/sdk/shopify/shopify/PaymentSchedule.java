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

import java.util.Map;

/**
* Represents the payment schedule for a single payment defined in the payment terms.
*/
public class PaymentSchedule extends AbstractResponse<PaymentSchedule> implements Node {
    public PaymentSchedule() {
    }

    public PaymentSchedule(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "completedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dueAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "issuedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentTerms": {
                    responseData.put(key, new PaymentTerms(jsonAsObject(field.getValue(), key)));

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

    public PaymentSchedule(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "PaymentSchedule";
    }

    /**
    * Date and time when the payment schedule is paid or fulfilled.
    */

    public String getCompletedAt() {
        return (String) get("completedAt");
    }

    public PaymentSchedule setCompletedAt(String arg) {
        optimisticData.put(getKey("completedAt"), arg);
        return this;
    }

    /**
    * Date and time when the payment schedule is due.
    */

    public String getDueAt() {
        return (String) get("dueAt");
    }

    public PaymentSchedule setDueAt(String arg) {
        optimisticData.put(getKey("dueAt"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Date and time when the invoice is sent.
    */

    public String getIssuedAt() {
        return (String) get("issuedAt");
    }

    public PaymentSchedule setIssuedAt(String arg) {
        optimisticData.put(getKey("issuedAt"), arg);
        return this;
    }

    /**
    * The payment terms the payment schedule belongs to.
    */

    public PaymentTerms getPaymentTerms() {
        return (PaymentTerms) get("paymentTerms");
    }

    public PaymentSchedule setPaymentTerms(PaymentTerms arg) {
        optimisticData.put(getKey("paymentTerms"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "completedAt": return false;

            case "dueAt": return false;

            case "id": return false;

            case "issuedAt": return false;

            case "paymentTerms": return true;

            default: return false;
        }
    }
}

