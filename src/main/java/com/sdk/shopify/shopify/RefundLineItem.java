// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* A line item that's included in a refund.
*/
public class RefundLineItem extends AbstractResponse<RefundLineItem> {
    public RefundLineItem() {
    }

    public RefundLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lineItem": {
                    responseData.put(key, new LineItem(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "location": {
                    Location optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Location(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "restockType": {
                    responseData.put(key, RefundLineItemRestockType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "restocked": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "RefundLineItem";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public RefundLineItem setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The `LineItem` resource associated to the refunded line item.
    */

    public LineItem getLineItem() {
        return (LineItem) get("lineItem");
    }

    public RefundLineItem setLineItem(LineItem arg) {
        optimisticData.put(getKey("lineItem"), arg);
        return this;
    }

    /**
    * The inventory restock location.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public RefundLineItem setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * The price of a refunded line item in shop and presentment currencies.
    */

    public MoneyBag getPriceSet() {
        return (MoneyBag) get("priceSet");
    }

    public RefundLineItem setPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("priceSet"), arg);
        return this;
    }

    /**
    * The quantity of a refunded line item.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public RefundLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The type of restock for the refunded line item.
    */

    public RefundLineItemRestockType getRestockType() {
        return (RefundLineItemRestockType) get("restockType");
    }

    public RefundLineItem setRestockType(RefundLineItemRestockType arg) {
        optimisticData.put(getKey("restockType"), arg);
        return this;
    }

    /**
    * Whether the refunded line item was restocked. Not applicable in the context of a SuggestedRefund.
    */

    public Boolean getRestocked() {
        return (Boolean) get("restocked");
    }

    public RefundLineItem setRestocked(Boolean arg) {
        optimisticData.put(getKey("restocked"), arg);
        return this;
    }

    /**
    * The subtotal price of a refunded line item in shop and presentment currencies.
    */

    public MoneyBag getSubtotalSet() {
        return (MoneyBag) get("subtotalSet");
    }

    public RefundLineItem setSubtotalSet(MoneyBag arg) {
        optimisticData.put(getKey("subtotalSet"), arg);
        return this;
    }

    /**
    * The total tax charged on a refunded line item in shop and presentment currencies.
    */

    public MoneyBag getTotalTaxSet() {
        return (MoneyBag) get("totalTaxSet");
    }

    public RefundLineItem setTotalTaxSet(MoneyBag arg) {
        optimisticData.put(getKey("totalTaxSet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "lineItem": return true;

            case "location": return true;

            case "priceSet": return true;

            case "quantity": return false;

            case "restockType": return false;

            case "restocked": return false;

            case "subtotalSet": return true;

            case "totalTaxSet": return true;

            default: return false;
        }
    }
}

