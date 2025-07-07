// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Payment details related to a transaction.
*/
public class UnknownPaymentDetails extends AbstractResponse<UnknownPaymentDetails> implements PaymentDetails {
    public UnknownPaymentDetails() {
    }

    public UnknownPaymentDetails(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static PaymentDetails create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "CardPaymentDetails": {
                return new CardPaymentDetails(fields);
            }

            case "LocalPaymentMethodsPaymentDetails": {
                return new LocalPaymentMethodsPaymentDetails(fields);
            }

            case "PaypalWalletPaymentDetails": {
                return new PaypalWalletPaymentDetails(fields);
            }

            case "ShopPayInstallmentsPaymentDetails": {
                return new ShopPayInstallmentsPaymentDetails(fields);
            }

            default: {
                return new UnknownPaymentDetails(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            default: return false;
        }
    }
}

