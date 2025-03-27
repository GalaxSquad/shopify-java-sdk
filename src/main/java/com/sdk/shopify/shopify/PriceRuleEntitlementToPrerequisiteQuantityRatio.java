// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Quantity of prerequisite items required for the price rule to be applicable, compared to quantity of
* entitled items.
*/
public class PriceRuleEntitlementToPrerequisiteQuantityRatio extends AbstractResponse<PriceRuleEntitlementToPrerequisiteQuantityRatio> {
    public PriceRuleEntitlementToPrerequisiteQuantityRatio() {
    }

    public PriceRuleEntitlementToPrerequisiteQuantityRatio(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "entitlementQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "prerequisiteQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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
        return "PriceRuleEntitlementToPrerequisiteQuantityRatio";
    }

    /**
    * The quantity of entitled items in the ratio.
    */

    public Integer getEntitlementQuantity() {
        return (Integer) get("entitlementQuantity");
    }

    public PriceRuleEntitlementToPrerequisiteQuantityRatio setEntitlementQuantity(Integer arg) {
        optimisticData.put(getKey("entitlementQuantity"), arg);
        return this;
    }

    /**
    * The quantity of prerequisite items in the ratio.
    */

    public Integer getPrerequisiteQuantity() {
        return (Integer) get("prerequisiteQuantity");
    }

    public PriceRuleEntitlementToPrerequisiteQuantityRatio setPrerequisiteQuantity(Integer arg) {
        optimisticData.put(getKey("prerequisiteQuantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "entitlementQuantity": return false;

            case "prerequisiteQuantity": return false;

            default: return false;
        }
    }
}

