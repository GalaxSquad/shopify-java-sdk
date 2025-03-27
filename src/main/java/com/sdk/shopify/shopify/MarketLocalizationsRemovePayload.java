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
* Return type for `marketLocalizationsRemove` mutation.
*/
public class MarketLocalizationsRemovePayload extends AbstractResponse<MarketLocalizationsRemovePayload> {
    public MarketLocalizationsRemovePayload() {
    }

    public MarketLocalizationsRemovePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "marketLocalizations": {
                    List<MarketLocalization> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<MarketLocalization> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new MarketLocalization(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<TranslationUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TranslationUserError(jsonAsObject(element1, key)));
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
        return "MarketLocalizationsRemovePayload";
    }

    /**
    * The market localizations that were deleted.
    */

    public List<MarketLocalization> getMarketLocalizations() {
        return (List<MarketLocalization>) get("marketLocalizations");
    }

    public MarketLocalizationsRemovePayload setMarketLocalizations(List<MarketLocalization> arg) {
        optimisticData.put(getKey("marketLocalizations"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<TranslationUserError> getUserErrors() {
        return (List<TranslationUserError>) get("userErrors");
    }

    public MarketLocalizationsRemovePayload setUserErrors(List<TranslationUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "marketLocalizations": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

