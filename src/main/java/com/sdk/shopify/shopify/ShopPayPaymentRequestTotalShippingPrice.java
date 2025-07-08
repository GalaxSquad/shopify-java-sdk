// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Represents a shipping total for a Shop Pay payment request.
*/
public class ShopPayPaymentRequestTotalShippingPrice extends AbstractResponse<ShopPayPaymentRequestTotalShippingPrice> {
    public ShopPayPaymentRequestTotalShippingPrice() {
    }

    public ShopPayPaymentRequestTotalShippingPrice(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "discounts": {
                    List<ShopPayPaymentRequestDiscount> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ShopPayPaymentRequestDiscount(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "finalTotal": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "originalTotal": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
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
        return "ShopPayPaymentRequestTotalShippingPrice";
    }

    /**
    * The discounts for the shipping total.
    */

    public List<ShopPayPaymentRequestDiscount> getDiscounts() {
        return (List<ShopPayPaymentRequestDiscount>) get("discounts");
    }

    public ShopPayPaymentRequestTotalShippingPrice setDiscounts(List<ShopPayPaymentRequestDiscount> arg) {
        optimisticData.put(getKey("discounts"), arg);
        return this;
    }

    /**
    * The final total for the shipping line.
    */

    public MoneyV2 getFinalTotal() {
        return (MoneyV2) get("finalTotal");
    }

    public ShopPayPaymentRequestTotalShippingPrice setFinalTotal(MoneyV2 arg) {
        optimisticData.put(getKey("finalTotal"), arg);
        return this;
    }

    /**
    * The original total for the shipping line.
    */

    public MoneyV2 getOriginalTotal() {
        return (MoneyV2) get("originalTotal");
    }

    public ShopPayPaymentRequestTotalShippingPrice setOriginalTotal(MoneyV2 arg) {
        optimisticData.put(getKey("originalTotal"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discounts": return true;

            case "finalTotal": return true;

            case "originalTotal": return true;

            default: return false;
        }
    }
}

