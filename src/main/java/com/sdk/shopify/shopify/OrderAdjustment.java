// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An order adjustment accounts for the difference between a calculated and actual refund amount.
*/
public class OrderAdjustment extends AbstractResponse<OrderAdjustment> implements Node {
    public OrderAdjustment() {
    }

    public OrderAdjustment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "reason": {
                    OrderAdjustmentDiscrepancyReason optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = OrderAdjustmentDiscrepancyReason.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "taxAmountSet": {
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

    public OrderAdjustment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "OrderAdjustment";
    }

    /**
    * The amount of the order adjustment in shop and presentment currencies.
    */

    public MoneyBag getAmountSet() {
        return (MoneyBag) get("amountSet");
    }

    public OrderAdjustment setAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("amountSet"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * An optional reason that explains a discrepancy between calculated and actual refund amounts.
    */

    public OrderAdjustmentDiscrepancyReason getReason() {
        return (OrderAdjustmentDiscrepancyReason) get("reason");
    }

    public OrderAdjustment setReason(OrderAdjustmentDiscrepancyReason arg) {
        optimisticData.put(getKey("reason"), arg);
        return this;
    }

    /**
    * The tax amount of the order adjustment in shop and presentment currencies.
    */

    public MoneyBag getTaxAmountSet() {
        return (MoneyBag) get("taxAmountSet");
    }

    public OrderAdjustment setTaxAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("taxAmountSet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amountSet": return true;

            case "id": return false;

            case "reason": return false;

            case "taxAmountSet": return true;

            default: return false;
        }
    }
}

