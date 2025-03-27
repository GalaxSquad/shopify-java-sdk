// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Discount applications capture the intentions of a discount source at
* the time of application on an order's line items or shipping lines.
* Discount applications don't represent the actual final amount discounted on a line (line item or
* shipping line). The actual amount discounted on a line is represented by the
* [DiscountAllocation](https://shopify.dev/api/admin-graphql/latest/objects/discountallocation)
* object.
*/
public class UnknownDiscountApplication extends AbstractResponse<UnknownDiscountApplication> implements DiscountApplication {
    public UnknownDiscountApplication() {
    }

    public UnknownDiscountApplication(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "allocationMethod": {
                    responseData.put(key, DiscountApplicationAllocationMethod.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "index": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "targetSelection": {
                    responseData.put(key, DiscountApplicationTargetSelection.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "targetType": {
                    responseData.put(key, DiscountApplicationTargetType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "value": {
                    responseData.put(key, UnknownPricingValue.create(jsonAsObject(field.getValue(), key)));

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

    public static DiscountApplication create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "AutomaticDiscountApplication": {
                return new AutomaticDiscountApplication(fields);
            }

            case "DiscountCodeApplication": {
                return new DiscountCodeApplication(fields);
            }

            case "ManualDiscountApplication": {
                return new ManualDiscountApplication(fields);
            }

            case "ScriptDiscountApplication": {
                return new ScriptDiscountApplication(fields);
            }

            default: {
                return new UnknownDiscountApplication(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The method by which the discount's value is applied to its entitled items.
    */

    public DiscountApplicationAllocationMethod getAllocationMethod() {
        return (DiscountApplicationAllocationMethod) get("allocationMethod");
    }

    public UnknownDiscountApplication setAllocationMethod(DiscountApplicationAllocationMethod arg) {
        optimisticData.put(getKey("allocationMethod"), arg);
        return this;
    }

    /**
    * An ordered index that can be used to identify the discount application and indicate the precedence
    * of the discount application for calculations.
    */

    public Integer getIndex() {
        return (Integer) get("index");
    }

    public UnknownDiscountApplication setIndex(Integer arg) {
        optimisticData.put(getKey("index"), arg);
        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */

    public DiscountApplicationTargetSelection getTargetSelection() {
        return (DiscountApplicationTargetSelection) get("targetSelection");
    }

    public UnknownDiscountApplication setTargetSelection(DiscountApplicationTargetSelection arg) {
        optimisticData.put(getKey("targetSelection"), arg);
        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */

    public DiscountApplicationTargetType getTargetType() {
        return (DiscountApplicationTargetType) get("targetType");
    }

    public UnknownDiscountApplication setTargetType(DiscountApplicationTargetType arg) {
        optimisticData.put(getKey("targetType"), arg);
        return this;
    }

    /**
    * The value of the discount application.
    */

    public PricingValue getValue() {
        return (PricingValue) get("value");
    }

    public UnknownDiscountApplication setValue(PricingValue arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "allocationMethod": return false;

            case "index": return false;

            case "targetSelection": return false;

            case "targetType": return false;

            case "value": return false;

            default: return false;
        }
    }
}

