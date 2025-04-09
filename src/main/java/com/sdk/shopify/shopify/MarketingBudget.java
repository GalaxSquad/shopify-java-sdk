// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* This type combines budget amount and its marketing budget type.
*/
public class MarketingBudget extends AbstractResponse<MarketingBudget> {
    public MarketingBudget() {
    }

    public MarketingBudget(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "budgetType": {
                    responseData.put(key, MarketingBudgetBudgetType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "total": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

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
        return "MarketingBudget";
    }

    /**
    * The budget type for a marketing activity.
    */

    public MarketingBudgetBudgetType getBudgetType() {
        return (MarketingBudgetBudgetType) get("budgetType");
    }

    public MarketingBudget setBudgetType(MarketingBudgetBudgetType arg) {
        optimisticData.put(getKey("budgetType"), arg);
        return this;
    }

    /**
    * The amount of budget for marketing activity.
    */

    public MoneyV2 getTotal() {
        return (MoneyV2) get("total");
    }

    public MarketingBudget setTotal(MoneyV2 arg) {
        optimisticData.put(getKey("total"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "budgetType": return false;

            case "total": return true;

            default: return false;
        }
    }
}

