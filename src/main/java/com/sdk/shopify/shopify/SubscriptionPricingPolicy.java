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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Represents a Subscription Line Pricing Policy.
*/
public class SubscriptionPricingPolicy extends AbstractResponse<SubscriptionPricingPolicy> {
    public SubscriptionPricingPolicy() {
    }

    public SubscriptionPricingPolicy(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "basePrice": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "cycleDiscounts": {
                    List<SubscriptionCyclePriceAdjustment> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SubscriptionCyclePriceAdjustment(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "SubscriptionPricingPolicy";
    }

    /**
    * The base price per unit for the subscription line in the contract's currency.
    */

    public MoneyV2 getBasePrice() {
        return (MoneyV2) get("basePrice");
    }

    public SubscriptionPricingPolicy setBasePrice(MoneyV2 arg) {
        optimisticData.put(getKey("basePrice"), arg);
        return this;
    }

    /**
    * The adjustments per cycle for the subscription line.
    */

    public List<SubscriptionCyclePriceAdjustment> getCycleDiscounts() {
        return (List<SubscriptionCyclePriceAdjustment>) get("cycleDiscounts");
    }

    public SubscriptionPricingPolicy setCycleDiscounts(List<SubscriptionCyclePriceAdjustment> arg) {
        optimisticData.put(getKey("cycleDiscounts"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "basePrice": return true;

            case "cycleDiscounts": return true;

            default: return false;
        }
    }
}

