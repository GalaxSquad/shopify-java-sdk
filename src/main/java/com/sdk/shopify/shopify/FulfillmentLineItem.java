// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a line item from an order that's included in a fulfillment.
*/
public class FulfillmentLineItem extends AbstractResponse<FulfillmentLineItem> implements Node {
    public FulfillmentLineItem() {
    }

    public FulfillmentLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "discountedTotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lineItem": {
                    responseData.put(key, new LineItem(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "originalTotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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

    public FulfillmentLineItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "FulfillmentLineItem";
    }

    /**
    * The total price after discounts are applied in shop and presentment currencies. This value doesn't
    * include order-level discounts.
    */

    public MoneyBag getDiscountedTotalSet() {
        return (MoneyBag) get("discountedTotalSet");
    }

    public FulfillmentLineItem setDiscountedTotalSet(MoneyBag arg) {
        optimisticData.put(getKey("discountedTotalSet"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The associated order's line item.
    */

    public LineItem getLineItem() {
        return (LineItem) get("lineItem");
    }

    public FulfillmentLineItem setLineItem(LineItem arg) {
        optimisticData.put(getKey("lineItem"), arg);
        return this;
    }

    /**
    * The total price before discounts are applied in shop and presentment currencies.
    */

    public MoneyBag getOriginalTotalSet() {
        return (MoneyBag) get("originalTotalSet");
    }

    public FulfillmentLineItem setOriginalTotalSet(MoneyBag arg) {
        optimisticData.put(getKey("originalTotalSet"), arg);
        return this;
    }

    /**
    * Number of line items in the fulfillment.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public FulfillmentLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discountedTotalSet": return true;

            case "id": return false;

            case "lineItem": return true;

            case "originalTotalSet": return true;

            case "quantity": return false;

            default: return false;
        }
    }
}

