// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A locale that's been enabled on a shop.
*/
public class ShopLocale extends AbstractResponse<ShopLocale> {
    public ShopLocale() {
    }

    public ShopLocale(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "locale": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "marketWebPresences": {
                    List<MarketWebPresence> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MarketWebPresence(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "primary": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "published": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "ShopLocale";
    }

    /**
    * The locale ISO code.
    */

    public String getLocale() {
        return (String) get("locale");
    }

    public ShopLocale setLocale(String arg) {
        optimisticData.put(getKey("locale"), arg);
        return this;
    }

    /**
    * The market web presences that use the locale.
    */

    public List<MarketWebPresence> getMarketWebPresences() {
        return (List<MarketWebPresence>) get("marketWebPresences");
    }

    public ShopLocale setMarketWebPresences(List<MarketWebPresence> arg) {
        optimisticData.put(getKey("marketWebPresences"), arg);
        return this;
    }

    /**
    * The human-readable locale name.
    */

    public String getName() {
        return (String) get("name");
    }

    public ShopLocale setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * Whether the locale is the default locale for the shop.
    */

    public Boolean getPrimary() {
        return (Boolean) get("primary");
    }

    public ShopLocale setPrimary(Boolean arg) {
        optimisticData.put(getKey("primary"), arg);
        return this;
    }

    /**
    * Whether the locale is visible to buyers.
    */

    public Boolean getPublished() {
        return (Boolean) get("published");
    }

    public ShopLocale setPublished(Boolean arg) {
        optimisticData.put(getKey("published"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "locale": return false;

            case "marketWebPresences": return true;

            case "name": return false;

            case "primary": return false;

            case "published": return false;

            default: return false;
        }
    }
}

