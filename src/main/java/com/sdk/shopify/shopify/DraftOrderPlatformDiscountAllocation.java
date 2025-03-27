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
* Price reduction allocations across the draft order's lines.
*/
public class DraftOrderPlatformDiscountAllocation extends AbstractResponse<DraftOrderPlatformDiscountAllocation> {
    public DraftOrderPlatformDiscountAllocation() {
    }

    public DraftOrderPlatformDiscountAllocation(JsonObject fields) throws SchemaViolationError {
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

                case "quantity": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reductionAmount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "reductionAmountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "target": {
                    DraftOrderPlatformDiscountAllocationTarget optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownDraftOrderPlatformDiscountAllocationTarget.create(jsonAsObject(field.getValue(), key));
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
        return "DraftOrderPlatformDiscountAllocation";
    }

    /**
    * The ID of the allocation.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public DraftOrderPlatformDiscountAllocation setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The quantity of the target being discounted.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public DraftOrderPlatformDiscountAllocation setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * Amount of the discount allocated to the target.
    */

    public MoneyV2 getReductionAmount() {
        return (MoneyV2) get("reductionAmount");
    }

    public DraftOrderPlatformDiscountAllocation setReductionAmount(MoneyV2 arg) {
        optimisticData.put(getKey("reductionAmount"), arg);
        return this;
    }

    /**
    * Amount of the discount allocated to the target in both shop currency and presentment currency.
    */

    public MoneyBag getReductionAmountSet() {
        return (MoneyBag) get("reductionAmountSet");
    }

    public DraftOrderPlatformDiscountAllocation setReductionAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("reductionAmountSet"), arg);
        return this;
    }

    /**
    * The element of the draft being discounted.
    */

    public DraftOrderPlatformDiscountAllocationTarget getTarget() {
        return (DraftOrderPlatformDiscountAllocationTarget) get("target");
    }

    public DraftOrderPlatformDiscountAllocation setTarget(DraftOrderPlatformDiscountAllocationTarget arg) {
        optimisticData.put(getKey("target"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "quantity": return false;

            case "reductionAmount": return true;

            case "reductionAmountSet": return true;

            case "target": return false;

            default: return false;
        }
    }
}

