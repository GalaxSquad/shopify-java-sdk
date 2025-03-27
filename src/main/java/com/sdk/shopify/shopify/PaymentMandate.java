// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A payment instrument and the permission
* the owner of the instrument gives to the merchant to debit it.
*/
public class PaymentMandate extends AbstractResponse<PaymentMandate> implements Node {
    public PaymentMandate() {
    }

    public PaymentMandate(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "paymentInstrument": {
                    responseData.put(key, UnknownPaymentInstrument.create(jsonAsObject(field.getValue(), key)));

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

    public PaymentMandate(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "PaymentMandate";
    }

    /**
    * The unique ID of a payment mandate.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The outputs details of the payment instrument.
    */

    public PaymentInstrument getPaymentInstrument() {
        return (PaymentInstrument) get("paymentInstrument");
    }

    public PaymentMandate setPaymentInstrument(PaymentInstrument arg) {
        optimisticData.put(getKey("paymentInstrument"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "paymentInstrument": return false;

            default: return false;
        }
    }
}

