// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Custom subscription discount.
*/
public class SubscriptionManualDiscount extends AbstractResponse<SubscriptionManualDiscount> implements SubscriptionDiscount {
    public SubscriptionManualDiscount() {
    }

    public SubscriptionManualDiscount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "entitledLines": {
                    responseData.put(key, new SubscriptionDiscountEntitledLines(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "recurringCycleLimit": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "rejectionReason": {
                    SubscriptionDiscountRejectionReason optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = SubscriptionDiscountRejectionReason.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "targetType": {
                    responseData.put(key, DiscountTargetType.fromGraphQl(jsonAsString(field.getValue(), key)));

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

                case "type": {
                    responseData.put(key, DiscountType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "usageCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "value": {
                    responseData.put(key, UnknownSubscriptionDiscountValue.create(jsonAsObject(field.getValue(), key)));

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
        return "SubscriptionManualDiscount";
    }

    /**
    * Entitled line items used to apply the subscription discount on.
    */

    public SubscriptionDiscountEntitledLines getEntitledLines() {
        return (SubscriptionDiscountEntitledLines) get("entitledLines");
    }

    public SubscriptionManualDiscount setEntitledLines(SubscriptionDiscountEntitledLines arg) {
        optimisticData.put(getKey("entitledLines"), arg);
        return this;
    }

    /**
    * The unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public SubscriptionManualDiscount setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The maximum number of times the subscription discount will be applied on orders.
    */

    public Integer getRecurringCycleLimit() {
        return (Integer) get("recurringCycleLimit");
    }

    public SubscriptionManualDiscount setRecurringCycleLimit(Integer arg) {
        optimisticData.put(getKey("recurringCycleLimit"), arg);
        return this;
    }

    /**
    * The reason that the discount on the subscription draft is rejected.
    */

    public SubscriptionDiscountRejectionReason getRejectionReason() {
        return (SubscriptionDiscountRejectionReason) get("rejectionReason");
    }

    public SubscriptionManualDiscount setRejectionReason(SubscriptionDiscountRejectionReason arg) {
        optimisticData.put(getKey("rejectionReason"), arg);
        return this;
    }

    /**
    * Type of line the discount applies on.
    */

    public DiscountTargetType getTargetType() {
        return (DiscountTargetType) get("targetType");
    }

    public SubscriptionManualDiscount setTargetType(DiscountTargetType arg) {
        optimisticData.put(getKey("targetType"), arg);
        return this;
    }

    /**
    * The title associated with the subscription discount.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public SubscriptionManualDiscount setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The type of the subscription discount.
    */

    public DiscountType getType() {
        return (DiscountType) get("type");
    }

    public SubscriptionManualDiscount setType(DiscountType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * The number of times the discount was applied.
    */

    public Integer getUsageCount() {
        return (Integer) get("usageCount");
    }

    public SubscriptionManualDiscount setUsageCount(Integer arg) {
        optimisticData.put(getKey("usageCount"), arg);
        return this;
    }

    /**
    * The value of the subscription discount.
    */

    public SubscriptionDiscountValue getValue() {
        return (SubscriptionDiscountValue) get("value");
    }

    public SubscriptionManualDiscount setValue(SubscriptionDiscountValue arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "entitledLines": return true;

            case "id": return false;

            case "recurringCycleLimit": return false;

            case "rejectionReason": return false;

            case "targetType": return false;

            case "title": return false;

            case "type": return false;

            case "usageCount": return false;

            case "value": return false;

            default: return false;
        }
    }
}

