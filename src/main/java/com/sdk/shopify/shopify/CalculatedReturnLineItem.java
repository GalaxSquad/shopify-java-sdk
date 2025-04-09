// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A calculated return line item.
*/
public class CalculatedReturnLineItem extends AbstractResponse<CalculatedReturnLineItem> {
    public CalculatedReturnLineItem() {
    }

    public CalculatedReturnLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fulfillmentLineItem": {
                    responseData.put(key, new FulfillmentLineItem(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "restockingFee": {
                    CalculatedRestockingFee optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CalculatedRestockingFee(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subtotalBeforeOrderDiscountsSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "subtotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalTaxSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

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
        return "CalculatedReturnLineItem";
    }

    /**
    * The fulfillment line item from which items are returned.
    */

    public FulfillmentLineItem getFulfillmentLineItem() {
        return (FulfillmentLineItem) get("fulfillmentLineItem");
    }

    public CalculatedReturnLineItem setFulfillmentLineItem(FulfillmentLineItem arg) {
        optimisticData.put(getKey("fulfillmentLineItem"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public CalculatedReturnLineItem setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The quantity being returned.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public CalculatedReturnLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The restocking fee of the return line item.
    */

    public CalculatedRestockingFee getRestockingFee() {
        return (CalculatedRestockingFee) get("restockingFee");
    }

    public CalculatedReturnLineItem setRestockingFee(CalculatedRestockingFee arg) {
        optimisticData.put(getKey("restockingFee"), arg);
        return this;
    }

    /**
    * The subtotal of the return line item before order discounts.
    */

    public MoneyBag getSubtotalBeforeOrderDiscountsSet() {
        return (MoneyBag) get("subtotalBeforeOrderDiscountsSet");
    }

    public CalculatedReturnLineItem setSubtotalBeforeOrderDiscountsSet(MoneyBag arg) {
        optimisticData.put(getKey("subtotalBeforeOrderDiscountsSet"), arg);
        return this;
    }

    /**
    * The subtotal of the return line item.
    */

    public MoneyBag getSubtotalSet() {
        return (MoneyBag) get("subtotalSet");
    }

    public CalculatedReturnLineItem setSubtotalSet(MoneyBag arg) {
        optimisticData.put(getKey("subtotalSet"), arg);
        return this;
    }

    /**
    * The total tax of the return line item.
    */

    public MoneyBag getTotalTaxSet() {
        return (MoneyBag) get("totalTaxSet");
    }

    public CalculatedReturnLineItem setTotalTaxSet(MoneyBag arg) {
        optimisticData.put(getKey("totalTaxSet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fulfillmentLineItem": return true;

            case "id": return false;

            case "quantity": return false;

            case "restockingFee": return true;

            case "subtotalBeforeOrderDiscountsSet": return true;

            case "subtotalSet": return true;

            case "totalTaxSet": return true;

            default: return false;
        }
    }
}

