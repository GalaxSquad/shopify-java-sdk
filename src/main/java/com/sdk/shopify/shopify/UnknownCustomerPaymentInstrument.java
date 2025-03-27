// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* All possible instruments for CustomerPaymentMethods.
*/
public class UnknownCustomerPaymentInstrument extends AbstractResponse<UnknownCustomerPaymentInstrument> implements CustomerPaymentInstrument {
    public UnknownCustomerPaymentInstrument() {
    }

    public UnknownCustomerPaymentInstrument(JsonObject fields) throws SchemaViolationError {
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

    public static CustomerPaymentInstrument create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "CustomerCreditCard": {
                return new CustomerCreditCard(fields);
            }

            case "CustomerPaypalBillingAgreement": {
                return new CustomerPaypalBillingAgreement(fields);
            }

            case "CustomerShopPayAgreement": {
                return new CustomerShopPayAgreement(fields);
            }

            default: {
                return new UnknownCustomerPaymentInstrument(fields);
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

