// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The shop's entitlements.
*/
public class EntitlementsType extends AbstractResponse<EntitlementsType> {
    public EntitlementsType() {
    }

    public EntitlementsType(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "markets": {
                    responseData.put(key, new MarketsType(jsonAsObject(field.getValue(), key)));

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
        return "EntitlementsType";
    }

    /**
    * Represents the markets for the shop.
    */

    public MarketsType getMarkets() {
        return (MarketsType) get("markets");
    }

    public EntitlementsType setMarkets(MarketsType arg) {
        optimisticData.put(getKey("markets"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "markets": return true;

            default: return false;
        }
    }
}

