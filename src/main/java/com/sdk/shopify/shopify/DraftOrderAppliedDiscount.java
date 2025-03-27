// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The order-level discount applied to a draft order.
*/
public class DraftOrderAppliedDiscount extends AbstractResponse<DraftOrderAppliedDiscount> {
    public DraftOrderAppliedDiscount() {
    }

    public DraftOrderAppliedDiscount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "description": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "value": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "valueType": {
                    responseData.put(key, DraftOrderAppliedDiscountType.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "DraftOrderAppliedDiscount";
    }

    /**
    * The amount of money discounted, with values shown in both shop currency and presentment currency.
    */

    public MoneyBag getAmountSet() {
        return (MoneyBag) get("amountSet");
    }

    public DraftOrderAppliedDiscount setAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("amountSet"), arg);
        return this;
    }

    /**
    * Description of the order-level discount.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public DraftOrderAppliedDiscount setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * Name of the order-level discount.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public DraftOrderAppliedDiscount setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The order level discount amount. If `valueType` is `"percentage"`,
    * then `value` is the percentage discount.
    */

    public Double getValue() {
        return (Double) get("value");
    }

    public DraftOrderAppliedDiscount setValue(Double arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    /**
    * Type of the order-level discount.
    */

    public DraftOrderAppliedDiscountType getValueType() {
        return (DraftOrderAppliedDiscountType) get("valueType");
    }

    public DraftOrderAppliedDiscount setValueType(DraftOrderAppliedDiscountType arg) {
        optimisticData.put(getKey("valueType"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amountSet": return true;

            case "description": return false;

            case "title": return false;

            case "value": return false;

            case "valueType": return false;

            default: return false;
        }
    }
}

