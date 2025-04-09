// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Shop Pay Installments payment details related to a transaction.
*/
public class ShopPayInstallmentsPaymentDetails extends AbstractResponse<ShopPayInstallmentsPaymentDetails> implements BasePaymentDetails, PaymentDetails {
    public ShopPayInstallmentsPaymentDetails() {
    }

    public ShopPayInstallmentsPaymentDetails(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "paymentMethodName": {
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
        return "ShopPayInstallmentsPaymentDetails";
    }

    /**
    * The name of payment method used by the buyer.
    */

    public String getPaymentMethodName() {
        return (String) get("paymentMethodName");
    }

    public ShopPayInstallmentsPaymentDetails setPaymentMethodName(String arg) {
        optimisticData.put(getKey("paymentMethodName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "paymentMethodName": return false;

            default: return false;
        }
    }
}

