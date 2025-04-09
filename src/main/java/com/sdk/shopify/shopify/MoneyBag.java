// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A collection of monetary values in their respective currencies. Typically used in the context of
* multi-currency pricing and transactions,
* when an amount in the shop's currency is converted to the customer's currency of choice (the
* presentment currency).
*/
public class MoneyBag extends AbstractResponse<MoneyBag> {
    public MoneyBag() {
    }

    public MoneyBag(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "presentmentMoney": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "shopMoney": {
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
        return "MoneyBag";
    }

    /**
    * Amount in presentment currency.
    */

    public MoneyV2 getPresentmentMoney() {
        return (MoneyV2) get("presentmentMoney");
    }

    public MoneyBag setPresentmentMoney(MoneyV2 arg) {
        optimisticData.put(getKey("presentmentMoney"), arg);
        return this;
    }

    /**
    * Amount in shop currency.
    */

    public MoneyV2 getShopMoney() {
        return (MoneyV2) get("shopMoney");
    }

    public MoneyBag setShopMoney(MoneyV2 arg) {
        optimisticData.put(getKey("shopMoney"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "presentmentMoney": return true;

            case "shopMoney": return true;

            default: return false;
        }
    }
}

