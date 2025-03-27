// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A resource that has market localizable fields.
*/
public class MarketLocalizableResource extends AbstractResponse<MarketLocalizableResource> {
    public MarketLocalizableResource() {
    }

    public MarketLocalizableResource(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "marketLocalizableContent": {
                    List<MarketLocalizableContent> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MarketLocalizableContent(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "marketLocalizations": {
                    List<MarketLocalization> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MarketLocalization(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "resourceId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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
        return "MarketLocalizableResource";
    }

    /**
    * The market localizable content.
    */

    public List<MarketLocalizableContent> getMarketLocalizableContent() {
        return (List<MarketLocalizableContent>) get("marketLocalizableContent");
    }

    public MarketLocalizableResource setMarketLocalizableContent(List<MarketLocalizableContent> arg) {
        optimisticData.put(getKey("marketLocalizableContent"), arg);
        return this;
    }

    /**
    * Market localizations for the market localizable content.
    */

    public List<MarketLocalization> getMarketLocalizations() {
        return (List<MarketLocalization>) get("marketLocalizations");
    }

    public MarketLocalizableResource setMarketLocalizations(List<MarketLocalization> arg) {
        optimisticData.put(getKey("marketLocalizations"), arg);
        return this;
    }

    /**
    * The GID of the resource.
    */

    public ID getResourceId() {
        return (ID) get("resourceId");
    }

    public MarketLocalizableResource setResourceId(ID arg) {
        optimisticData.put(getKey("resourceId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "marketLocalizableContent": return true;

            case "marketLocalizations": return true;

            case "resourceId": return false;

            default: return false;
        }
    }
}

