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
* Represents a Shop Pay payment request.
*/
public class ShopPayPaymentRequest extends AbstractResponse<ShopPayPaymentRequest> {
    public ShopPayPaymentRequest() {
    }

    public ShopPayPaymentRequest(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "discounts": {
                    List<ShopPayPaymentRequestDiscount> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ShopPayPaymentRequestDiscount> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new ShopPayPaymentRequestDiscount(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lineItems": {
                    List<ShopPayPaymentRequestLineItem> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ShopPayPaymentRequestLineItem(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "presentmentCurrency": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "selectedDeliveryMethodType": {
                    responseData.put(key, ShopPayPaymentRequestDeliveryMethodType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "shippingAddress": {
                    ShopPayPaymentRequestContactField optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopPayPaymentRequestContactField(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shippingLines": {
                    List<ShopPayPaymentRequestShippingLine> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ShopPayPaymentRequestShippingLine(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "subtotal": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "total": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalShippingPrice": {
                    ShopPayPaymentRequestTotalShippingPrice optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopPayPaymentRequestTotalShippingPrice(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "totalTax": {
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
        return "ShopPayPaymentRequest";
    }

    /**
    * The discounts for the payment request order.
    */

    public List<ShopPayPaymentRequestDiscount> getDiscounts() {
        return (List<ShopPayPaymentRequestDiscount>) get("discounts");
    }

    public ShopPayPaymentRequest setDiscounts(List<ShopPayPaymentRequestDiscount> arg) {
        optimisticData.put(getKey("discounts"), arg);
        return this;
    }

    /**
    * The line items for the payment request.
    */

    public List<ShopPayPaymentRequestLineItem> getLineItems() {
        return (List<ShopPayPaymentRequestLineItem>) get("lineItems");
    }

    public ShopPayPaymentRequest setLineItems(List<ShopPayPaymentRequestLineItem> arg) {
        optimisticData.put(getKey("lineItems"), arg);
        return this;
    }

    /**
    * The presentment currency for the payment request.
    */

    public CurrencyCode getPresentmentCurrency() {
        return (CurrencyCode) get("presentmentCurrency");
    }

    public ShopPayPaymentRequest setPresentmentCurrency(CurrencyCode arg) {
        optimisticData.put(getKey("presentmentCurrency"), arg);
        return this;
    }

    /**
    * The delivery method type for the payment request.
    */

    public ShopPayPaymentRequestDeliveryMethodType getSelectedDeliveryMethodType() {
        return (ShopPayPaymentRequestDeliveryMethodType) get("selectedDeliveryMethodType");
    }

    public ShopPayPaymentRequest setSelectedDeliveryMethodType(ShopPayPaymentRequestDeliveryMethodType arg) {
        optimisticData.put(getKey("selectedDeliveryMethodType"), arg);
        return this;
    }

    /**
    * The shipping address for the payment request.
    */

    public ShopPayPaymentRequestContactField getShippingAddress() {
        return (ShopPayPaymentRequestContactField) get("shippingAddress");
    }

    public ShopPayPaymentRequest setShippingAddress(ShopPayPaymentRequestContactField arg) {
        optimisticData.put(getKey("shippingAddress"), arg);
        return this;
    }

    /**
    * The shipping lines for the payment request.
    */

    public List<ShopPayPaymentRequestShippingLine> getShippingLines() {
        return (List<ShopPayPaymentRequestShippingLine>) get("shippingLines");
    }

    public ShopPayPaymentRequest setShippingLines(List<ShopPayPaymentRequestShippingLine> arg) {
        optimisticData.put(getKey("shippingLines"), arg);
        return this;
    }

    /**
    * The subtotal amount for the payment request.
    */

    public MoneyV2 getSubtotal() {
        return (MoneyV2) get("subtotal");
    }

    public ShopPayPaymentRequest setSubtotal(MoneyV2 arg) {
        optimisticData.put(getKey("subtotal"), arg);
        return this;
    }

    /**
    * The total amount for the payment request.
    */

    public MoneyV2 getTotal() {
        return (MoneyV2) get("total");
    }

    public ShopPayPaymentRequest setTotal(MoneyV2 arg) {
        optimisticData.put(getKey("total"), arg);
        return this;
    }

    /**
    * The total shipping price for the payment request.
    */

    public ShopPayPaymentRequestTotalShippingPrice getTotalShippingPrice() {
        return (ShopPayPaymentRequestTotalShippingPrice) get("totalShippingPrice");
    }

    public ShopPayPaymentRequest setTotalShippingPrice(ShopPayPaymentRequestTotalShippingPrice arg) {
        optimisticData.put(getKey("totalShippingPrice"), arg);
        return this;
    }

    /**
    * The total tax for the payment request.
    */

    public MoneyV2 getTotalTax() {
        return (MoneyV2) get("totalTax");
    }

    public ShopPayPaymentRequest setTotalTax(MoneyV2 arg) {
        optimisticData.put(getKey("totalTax"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discounts": return true;

            case "lineItems": return true;

            case "presentmentCurrency": return false;

            case "selectedDeliveryMethodType": return false;

            case "shippingAddress": return true;

            case "shippingLines": return true;

            case "subtotal": return true;

            case "total": return true;

            case "totalShippingPrice": return true;

            case "totalTax": return true;

            default: return false;
        }
    }
}

