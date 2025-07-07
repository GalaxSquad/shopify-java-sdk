// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a shipping line for a Shop Pay payment request.
*/
public class ShopPayPaymentRequestShippingLine extends AbstractResponse<ShopPayPaymentRequestShippingLine> {
    public ShopPayPaymentRequestShippingLine() {
    }

    public ShopPayPaymentRequestShippingLine(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "label": {
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

    public String getGraphQlTypeName() {
        return "ShopPayPaymentRequestShippingLine";
    }

    /**
    * The amount for the shipping line.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public ShopPayPaymentRequestShippingLine setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The code of the shipping line.
    */

    public String getCode() {
        return (String) get("code");
    }

    public ShopPayPaymentRequestShippingLine setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The label of the shipping line.
    */

    public String getLabel() {
        return (String) get("label");
    }

    public ShopPayPaymentRequestShippingLine setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "code": return false;

            case "label": return false;

            default: return false;
        }
    }
}

