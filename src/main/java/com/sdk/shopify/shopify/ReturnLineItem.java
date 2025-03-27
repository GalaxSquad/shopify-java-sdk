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
* A return line item.
*/
public class ReturnLineItem extends AbstractResponse<ReturnLineItem> implements Node, ReturnLineItemType {
    public ReturnLineItem() {
    }

    public ReturnLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customerNote": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentLineItem": {
                    responseData.put(key, new FulfillmentLineItem(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "refundableQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "refundedQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "restockingFee": {
                    RestockingFee optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RestockingFee(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnReason": {
                    responseData.put(key, ReturnReason.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "returnReasonNote": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "totalWeight": {
                    Weight optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Weight(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "withCodeDiscountedTotalPriceSet": {
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

    public ReturnLineItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ReturnLineItem";
    }

    /**
    * A note from the customer that describes the item to be returned. Maximum length: 300 characters.
    */

    public String getCustomerNote() {
        return (String) get("customerNote");
    }

    public ReturnLineItem setCustomerNote(String arg) {
        optimisticData.put(getKey("customerNote"), arg);
        return this;
    }

    /**
    * The fulfillment line item from which items are returned.
    */

    public FulfillmentLineItem getFulfillmentLineItem() {
        return (FulfillmentLineItem) get("fulfillmentLineItem");
    }

    public ReturnLineItem setFulfillmentLineItem(FulfillmentLineItem arg) {
        optimisticData.put(getKey("fulfillmentLineItem"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The quantity being returned.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public ReturnLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The quantity that can be refunded.
    */

    public Integer getRefundableQuantity() {
        return (Integer) get("refundableQuantity");
    }

    public ReturnLineItem setRefundableQuantity(Integer arg) {
        optimisticData.put(getKey("refundableQuantity"), arg);
        return this;
    }

    /**
    * The quantity that was refunded.
    */

    public Integer getRefundedQuantity() {
        return (Integer) get("refundedQuantity");
    }

    public ReturnLineItem setRefundedQuantity(Integer arg) {
        optimisticData.put(getKey("refundedQuantity"), arg);
        return this;
    }

    /**
    * The restocking fee for the return line item.
    */

    public RestockingFee getRestockingFee() {
        return (RestockingFee) get("restockingFee");
    }

    public ReturnLineItem setRestockingFee(RestockingFee arg) {
        optimisticData.put(getKey("restockingFee"), arg);
        return this;
    }

    /**
    * The reason for returning the item.
    */

    public ReturnReason getReturnReason() {
        return (ReturnReason) get("returnReason");
    }

    public ReturnLineItem setReturnReason(ReturnReason arg) {
        optimisticData.put(getKey("returnReason"), arg);
        return this;
    }

    /**
    * Additional information about the reason for the return. Maximum length: 255 characters.
    */

    public String getReturnReasonNote() {
        return (String) get("returnReasonNote");
    }

    public ReturnLineItem setReturnReasonNote(String arg) {
        optimisticData.put(getKey("returnReasonNote"), arg);
        return this;
    }

    /**
    * The total weight of the item.
    */

    public Weight getTotalWeight() {
        return (Weight) get("totalWeight");
    }

    public ReturnLineItem setTotalWeight(Weight arg) {
        optimisticData.put(getKey("totalWeight"), arg);
        return this;
    }

    /**
    * The total line price after all discounts on the line item, including both line item level discounts
    * and code-based line item discounts, are applied.
    */

    public MoneyBag getWithCodeDiscountedTotalPriceSet() {
        return (MoneyBag) get("withCodeDiscountedTotalPriceSet");
    }

    public ReturnLineItem setWithCodeDiscountedTotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("withCodeDiscountedTotalPriceSet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customerNote": return false;

            case "fulfillmentLineItem": return true;

            case "id": return false;

            case "quantity": return false;

            case "refundableQuantity": return false;

            case "refundedQuantity": return false;

            case "restockingFee": return true;

            case "returnReason": return false;

            case "returnReasonNote": return false;

            case "totalWeight": return true;

            case "withCodeDiscountedTotalPriceSet": return true;

            default: return false;
        }
    }
}

