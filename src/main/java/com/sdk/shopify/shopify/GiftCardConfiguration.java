// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents information about the configuration of gift cards on the shop.
*/
public class GiftCardConfiguration extends AbstractResponse<GiftCardConfiguration> {
    public GiftCardConfiguration() {
    }

    public GiftCardConfiguration(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "issueLimit": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "purchaseLimit": {
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
        return "GiftCardConfiguration";
    }

    /**
    * The issue limit for gift cards in the default shop currency.
    */

    public MoneyV2 getIssueLimit() {
        return (MoneyV2) get("issueLimit");
    }

    public GiftCardConfiguration setIssueLimit(MoneyV2 arg) {
        optimisticData.put(getKey("issueLimit"), arg);
        return this;
    }

    /**
    * The purchase limit for gift cards in the default shop currency.
    */

    public MoneyV2 getPurchaseLimit() {
        return (MoneyV2) get("purchaseLimit");
    }

    public GiftCardConfiguration setPurchaseLimit(MoneyV2 arg) {
        optimisticData.put(getKey("purchaseLimit"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "issueLimit": return true;

            case "purchaseLimit": return true;

            default: return false;
        }
    }
}

