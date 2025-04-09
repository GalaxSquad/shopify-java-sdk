// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Generic payment details that are related to a transaction.
*/
public class UnknownBasePaymentDetails extends AbstractResponse<UnknownBasePaymentDetails> implements BasePaymentDetails {
    public UnknownBasePaymentDetails() {
    }

    public UnknownBasePaymentDetails(JsonObject fields) throws SchemaViolationError {
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

    public static BasePaymentDetails create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "CardPaymentDetails": {
                return new CardPaymentDetails(fields);
            }

            case "LocalPaymentMethodsPaymentDetails": {
                return new LocalPaymentMethodsPaymentDetails(fields);
            }

            case "ShopPayInstallmentsPaymentDetails": {
                return new ShopPayInstallmentsPaymentDetails(fields);
            }

            default: {
                return new UnknownBasePaymentDetails(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The name of payment method used by the buyer.
    */

    public String getPaymentMethodName() {
        return (String) get("paymentMethodName");
    }

    public UnknownBasePaymentDetails setPaymentMethodName(String arg) {
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

