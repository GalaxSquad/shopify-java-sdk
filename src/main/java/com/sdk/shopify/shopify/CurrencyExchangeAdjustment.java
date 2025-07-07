// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a currency exchange adjustment applied to an order transaction.
*/
public class CurrencyExchangeAdjustment extends AbstractResponse<CurrencyExchangeAdjustment> implements Node {
    public CurrencyExchangeAdjustment() {
    }

    public CurrencyExchangeAdjustment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "adjustment": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "finalAmountSet": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "originalAmountSet": {
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

    public CurrencyExchangeAdjustment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CurrencyExchangeAdjustment";
    }

    /**
    * The adjustment amount in both shop and presentment currencies.
    */

    public MoneyV2 getAdjustment() {
        return (MoneyV2) get("adjustment");
    }

    public CurrencyExchangeAdjustment setAdjustment(MoneyV2 arg) {
        optimisticData.put(getKey("adjustment"), arg);
        return this;
    }

    /**
    * The final amount in both shop and presentment currencies after the adjustment.
    */

    public MoneyV2 getFinalAmountSet() {
        return (MoneyV2) get("finalAmountSet");
    }

    public CurrencyExchangeAdjustment setFinalAmountSet(MoneyV2 arg) {
        optimisticData.put(getKey("finalAmountSet"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The original amount in both shop and presentment currencies before the adjustment.
    */

    public MoneyV2 getOriginalAmountSet() {
        return (MoneyV2) get("originalAmountSet");
    }

    public CurrencyExchangeAdjustment setOriginalAmountSet(MoneyV2 arg) {
        optimisticData.put(getKey("originalAmountSet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adjustment": return true;

            case "finalAmountSet": return true;

            case "id": return false;

            case "originalAmountSet": return true;

            default: return false;
        }
    }
}

