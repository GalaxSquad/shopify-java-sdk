// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A [discount
* application](https://shopify.dev/api/admin-graphql/latest/interfaces/discountapplication) involved
* in order editing that might be newly added or have new changes applied.
*/
public class UnknownCalculatedDiscountApplication extends AbstractResponse<UnknownCalculatedDiscountApplication> implements CalculatedDiscountApplication {
    public UnknownCalculatedDiscountApplication() {
    }

    public UnknownCalculatedDiscountApplication(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "allocationMethod": {
                    responseData.put(key, DiscountApplicationAllocationMethod.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "appliedTo": {
                    responseData.put(key, DiscountApplicationLevel.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

    public static CalculatedDiscountApplication create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "CalculatedAutomaticDiscountApplication": {
                return new CalculatedAutomaticDiscountApplication(fields);
            }

            case "CalculatedDiscountCodeApplication": {
                return new CalculatedDiscountCodeApplication(fields);
            }

            case "CalculatedManualDiscountApplication": {
                return new CalculatedManualDiscountApplication(fields);
            }

            case "CalculatedScriptDiscountApplication": {
                return new CalculatedScriptDiscountApplication(fields);
            }

            default: {
                return new UnknownCalculatedDiscountApplication(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The method by which the discount's value is allocated to its entitled items.
    */

    public DiscountApplicationAllocationMethod getAllocationMethod() {
        return (DiscountApplicationAllocationMethod) get("allocationMethod");
    }

    public UnknownCalculatedDiscountApplication setAllocationMethod(DiscountApplicationAllocationMethod arg) {
        optimisticData.put(getKey("allocationMethod"), arg);
        return this;
    }

    /**
    * The level at which the discount was applied.
    */

    public DiscountApplicationLevel getAppliedTo() {
        return (DiscountApplicationLevel) get("appliedTo");
    }

    public UnknownCalculatedDiscountApplication setAppliedTo(DiscountApplicationLevel arg) {
        optimisticData.put(getKey("appliedTo"), arg);
        return this;
    }

    /**
    * The description of discount application. Indicates the reason why the discount was applied.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public UnknownCalculatedDiscountApplication setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownCalculatedDiscountApplication setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */

    public DiscountApplicationTargetSelection getTargetSelection() {
        return (DiscountApplicationTargetSelection) get("targetSelection");
    }

    public UnknownCalculatedDiscountApplication setTargetSelection(DiscountApplicationTargetSelection arg) {
        optimisticData.put(getKey("targetSelection"), arg);
        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */

    public DiscountApplicationTargetType getTargetType() {
        return (DiscountApplicationTargetType) get("targetType");
    }

    public UnknownCalculatedDiscountApplication setTargetType(DiscountApplicationTargetType arg) {
        optimisticData.put(getKey("targetType"), arg);
        return this;
    }

    /**
    * The value of the discount application.
    */

    public PricingValue getValue() {
        return (PricingValue) get("value");
    }

    public UnknownCalculatedDiscountApplication setValue(PricingValue arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "allocationMethod": return false;

            case "appliedTo": return false;

            case "description": return false;

            case "id": return false;

            case "targetSelection": return false;

            case "targetType": return false;

            case "value": return false;

            default: return false;
        }
    }
}

