// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A customer's computed statistics.
*/
public class CustomerStatistics extends AbstractResponse<CustomerStatistics> {
    public CustomerStatistics() {
    }

    public CustomerStatistics(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "predictedSpendTier": {
                    CustomerPredictedSpendTier optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CustomerPredictedSpendTier.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CustomerStatistics";
    }

    /**
    * The predicted spend tier of a customer with a shop.
    */

    public CustomerPredictedSpendTier getPredictedSpendTier() {
        return (CustomerPredictedSpendTier) get("predictedSpendTier");
    }

    public CustomerStatistics setPredictedSpendTier(CustomerPredictedSpendTier arg) {
        optimisticData.put(getKey("predictedSpendTier"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "predictedSpendTier": return false;

            default: return false;
        }
    }
}

