// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An amount discounting the line that has been allocated by an associated discount application.
*/
public class CalculatedDiscountAllocation extends AbstractResponse<CalculatedDiscountAllocation> {
    public CalculatedDiscountAllocation() {
    }

    public CalculatedDiscountAllocation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "allocatedAmountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountApplication": {
                    responseData.put(key, UnknownCalculatedDiscountApplication.create(jsonAsObject(field.getValue(), key)));

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
        return "CalculatedDiscountAllocation";
    }

    /**
    * The money amount that's allocated by the discount application in shop and presentment currencies.
    */

    public MoneyBag getAllocatedAmountSet() {
        return (MoneyBag) get("allocatedAmountSet");
    }

    public CalculatedDiscountAllocation setAllocatedAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("allocatedAmountSet"), arg);
        return this;
    }

    /**
    * The discount that the allocated amount originated from.
    */

    public CalculatedDiscountApplication getDiscountApplication() {
        return (CalculatedDiscountApplication) get("discountApplication");
    }

    public CalculatedDiscountAllocation setDiscountApplication(CalculatedDiscountApplication arg) {
        optimisticData.put(getKey("discountApplication"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "allocatedAmountSet": return true;

            case "discountApplication": return false;

            default: return false;
        }
    }
}

