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
* Quantity of prerequisite items required for the price rule to be applicable, compared to quantity of
* entitled items.
*/
public class PriceRulePrerequisiteToEntitlementQuantityRatio extends AbstractResponse<PriceRulePrerequisiteToEntitlementQuantityRatio> {
    public PriceRulePrerequisiteToEntitlementQuantityRatio() {
    }

    public PriceRulePrerequisiteToEntitlementQuantityRatio(JsonObject fields) throws SchemaViolationError {
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
        return "PriceRulePrerequisiteToEntitlementQuantityRatio";
    }

    /**
    * The quantity of entitled items in the ratio.
    */

    public Integer getEntitlementQuantity() {
        return (Integer) get("entitlementQuantity");
    }

    public PriceRulePrerequisiteToEntitlementQuantityRatio setEntitlementQuantity(Integer arg) {
        optimisticData.put(getKey("entitlementQuantity"), arg);
        return this;
    }

    /**
    * The quantity of prerequisite items in the ratio.
    */

    public Integer getPrerequisiteQuantity() {
        return (Integer) get("prerequisiteQuantity");
    }

    public PriceRulePrerequisiteToEntitlementQuantityRatio setPrerequisiteQuantity(Integer arg) {
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

