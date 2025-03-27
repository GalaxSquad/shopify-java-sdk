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
* Represents the payment terms for an order or draft order.
*/
public class PaymentTerms extends AbstractResponse<PaymentTerms> implements Node {
    public PaymentTerms() {
    }

    public PaymentTerms(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "draftOrder": {
                    DraftOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dueInDays": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "order": {
                    Order optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Order(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "overdue": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "paymentSchedules": {
                    responseData.put(key, new PaymentScheduleConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "paymentTermsName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "paymentTermsType": {
                    responseData.put(key, PaymentTermsType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "translatedName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public PaymentTerms(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "PaymentTerms";
    }

    /**
    * The draft order associated with the payment terms.
    */

    public DraftOrder getDraftOrder() {
        return (DraftOrder) get("draftOrder");
    }

    public PaymentTerms setDraftOrder(DraftOrder arg) {
        optimisticData.put(getKey("draftOrder"), arg);
        return this;
    }

    /**
    * Duration of payment terms in days based on the payment terms template used to create the payment
    * terms.
    */

    public Integer getDueInDays() {
        return (Integer) get("dueInDays");
    }

    public PaymentTerms setDueInDays(Integer arg) {
        optimisticData.put(getKey("dueInDays"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The order associated with the payment terms.
    */

    public Order getOrder() {
        return (Order) get("order");
    }

    public PaymentTerms setOrder(Order arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
    * Whether the payment terms have overdue payment schedules.
    */

    public Boolean getOverdue() {
        return (Boolean) get("overdue");
    }

    public PaymentTerms setOverdue(Boolean arg) {
        optimisticData.put(getKey("overdue"), arg);
        return this;
    }

    /**
    * List of schedules for the payment terms.
    */

    public PaymentScheduleConnection getPaymentSchedules() {
        return (PaymentScheduleConnection) get("paymentSchedules");
    }

    public PaymentTerms setPaymentSchedules(PaymentScheduleConnection arg) {
        optimisticData.put(getKey("paymentSchedules"), arg);
        return this;
    }

    /**
    * The name of the payment terms template used to create the payment terms.
    */

    public String getPaymentTermsName() {
        return (String) get("paymentTermsName");
    }

    public PaymentTerms setPaymentTermsName(String arg) {
        optimisticData.put(getKey("paymentTermsName"), arg);
        return this;
    }

    /**
    * The payment terms template type used to create the payment terms.
    */

    public PaymentTermsType getPaymentTermsType() {
        return (PaymentTermsType) get("paymentTermsType");
    }

    public PaymentTerms setPaymentTermsType(PaymentTermsType arg) {
        optimisticData.put(getKey("paymentTermsType"), arg);
        return this;
    }

    /**
    * The payment terms name, translated into the shop admin's preferred language.
    */

    public String getTranslatedName() {
        return (String) get("translatedName");
    }

    public PaymentTerms setTranslatedName(String arg) {
        optimisticData.put(getKey("translatedName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "draftOrder": return true;

            case "dueInDays": return false;

            case "id": return false;

            case "order": return true;

            case "overdue": return false;

            case "paymentSchedules": return true;

            case "paymentTermsName": return false;

            case "paymentTermsType": return false;

            case "translatedName": return false;

            default: return false;
        }
    }
}

