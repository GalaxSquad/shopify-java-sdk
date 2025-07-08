// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `marketCurrencySettingsUpdate` mutation.
*/
public class MarketCurrencySettingsUpdatePayload extends AbstractResponse<MarketCurrencySettingsUpdatePayload> {
    public MarketCurrencySettingsUpdatePayload() {
    }

    public MarketCurrencySettingsUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "userErrors": {
                    List<MarketCurrencySettingsUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MarketCurrencySettingsUserError(jsonAsObject(element1, key)));
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
        return "MarketCurrencySettingsUpdatePayload";
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MarketCurrencySettingsUserError> getUserErrors() {
        return (List<MarketCurrencySettingsUserError>) get("userErrors");
    }

    public MarketCurrencySettingsUpdatePayload setUserErrors(List<MarketCurrencySettingsUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "userErrors": return true;

            default: return false;
        }
    }
}

