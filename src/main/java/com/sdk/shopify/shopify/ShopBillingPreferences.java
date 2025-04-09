// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Billing preferences for the shop.
*/
public class ShopBillingPreferences extends AbstractResponse<ShopBillingPreferences> {
    public ShopBillingPreferences() {
    }

    public ShopBillingPreferences(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "currency": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "ShopBillingPreferences";
    }

    /**
    * The currency the shop uses to pay for apps and services.
    */

    public CurrencyCode getCurrency() {
        return (CurrencyCode) get("currency");
    }

    public ShopBillingPreferences setCurrency(CurrencyCode arg) {
        optimisticData.put(getKey("currency"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "currency": return false;

            default: return false;
        }
    }
}

