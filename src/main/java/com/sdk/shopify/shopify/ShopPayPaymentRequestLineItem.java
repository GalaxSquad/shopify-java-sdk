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
* Represents a line item for a Shop Pay payment request.
*/
public class ShopPayPaymentRequestLineItem extends AbstractResponse<ShopPayPaymentRequestLineItem> {
    public ShopPayPaymentRequestLineItem() {
    }

    public ShopPayPaymentRequestLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "finalItemPrice": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "finalLinePrice": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "image": {
                    ShopPayPaymentRequestImage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopPayPaymentRequestImage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "itemDiscounts": {
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

                case "label": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "lineDiscounts": {
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

                case "originalItemPrice": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "originalLinePrice": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "requiresShipping": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sku": {
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
        return "ShopPayPaymentRequestLineItem";
    }

    /**
    * The final item price for the line item.
    */

    public MoneyV2 getFinalItemPrice() {
        return (MoneyV2) get("finalItemPrice");
    }

    public ShopPayPaymentRequestLineItem setFinalItemPrice(MoneyV2 arg) {
        optimisticData.put(getKey("finalItemPrice"), arg);
        return this;
    }

    /**
    * The final line price for the line item.
    */

    public MoneyV2 getFinalLinePrice() {
        return (MoneyV2) get("finalLinePrice");
    }

    public ShopPayPaymentRequestLineItem setFinalLinePrice(MoneyV2 arg) {
        optimisticData.put(getKey("finalLinePrice"), arg);
        return this;
    }

    /**
    * The image of the line item.
    */

    public ShopPayPaymentRequestImage getImage() {
        return (ShopPayPaymentRequestImage) get("image");
    }

    public ShopPayPaymentRequestLineItem setImage(ShopPayPaymentRequestImage arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * The item discounts for the line item.
    */

    public List<ShopPayPaymentRequestDiscount> getItemDiscounts() {
        return (List<ShopPayPaymentRequestDiscount>) get("itemDiscounts");
    }

    public ShopPayPaymentRequestLineItem setItemDiscounts(List<ShopPayPaymentRequestDiscount> arg) {
        optimisticData.put(getKey("itemDiscounts"), arg);
        return this;
    }

    /**
    * The label of the line item.
    */

    public String getLabel() {
        return (String) get("label");
    }

    public ShopPayPaymentRequestLineItem setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
    * The line discounts for the line item.
    */

    public List<ShopPayPaymentRequestDiscount> getLineDiscounts() {
        return (List<ShopPayPaymentRequestDiscount>) get("lineDiscounts");
    }

    public ShopPayPaymentRequestLineItem setLineDiscounts(List<ShopPayPaymentRequestDiscount> arg) {
        optimisticData.put(getKey("lineDiscounts"), arg);
        return this;
    }

    /**
    * The original item price for the line item.
    */

    public MoneyV2 getOriginalItemPrice() {
        return (MoneyV2) get("originalItemPrice");
    }

    public ShopPayPaymentRequestLineItem setOriginalItemPrice(MoneyV2 arg) {
        optimisticData.put(getKey("originalItemPrice"), arg);
        return this;
    }

    /**
    * The original line price for the line item.
    */

    public MoneyV2 getOriginalLinePrice() {
        return (MoneyV2) get("originalLinePrice");
    }

    public ShopPayPaymentRequestLineItem setOriginalLinePrice(MoneyV2 arg) {
        optimisticData.put(getKey("originalLinePrice"), arg);
        return this;
    }

    /**
    * The quantity of the line item.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public ShopPayPaymentRequestLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * Whether the line item requires shipping.
    */

    public Boolean getRequiresShipping() {
        return (Boolean) get("requiresShipping");
    }

    public ShopPayPaymentRequestLineItem setRequiresShipping(Boolean arg) {
        optimisticData.put(getKey("requiresShipping"), arg);
        return this;
    }

    /**
    * The SKU of the line item.
    */

    public String getSku() {
        return (String) get("sku");
    }

    public ShopPayPaymentRequestLineItem setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "finalItemPrice": return true;

            case "finalLinePrice": return true;

            case "image": return true;

            case "itemDiscounts": return true;

            case "label": return false;

            case "lineDiscounts": return true;

            case "originalItemPrice": return true;

            case "originalLinePrice": return true;

            case "quantity": return false;

            case "requiresShipping": return false;

            case "sku": return false;

            default: return false;
        }
    }
}

