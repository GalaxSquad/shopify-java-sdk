// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a discount for a Shop Pay payment request.
*/
public class ShopPayPaymentRequestDiscount extends AbstractResponse<ShopPayPaymentRequestDiscount> {
    public ShopPayPaymentRequestDiscount() {
    }

    public ShopPayPaymentRequestDiscount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

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
        return "ShopPayPaymentRequestDiscount";
    }

    /**
    * The amount of the discount.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public ShopPayPaymentRequestDiscount setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The label of the discount.
    */

    public String getLabel() {
        return (String) get("label");
    }

    public ShopPayPaymentRequestDiscount setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "label": return false;

            default: return false;
        }
    }
}

