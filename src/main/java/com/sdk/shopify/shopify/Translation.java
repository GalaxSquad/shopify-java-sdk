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

import java.util.Map;

/**
* Translation of a field of a resource.
*/
public class Translation extends AbstractResponse<Translation> {
    public Translation() {
    }

    public Translation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "key": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "locale": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "market": {
                    Market optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Market(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "outdated": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "updatedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "value": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "Translation";
    }

    /**
    * On the resource that this translation belongs to, the reference to the value being translated.
    */

    public String getKey() {
        return (String) get("key");
    }

    public Translation setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * ISO code of the translation locale.
    */

    public String getLocale() {
        return (String) get("locale");
    }

    public Translation setLocale(String arg) {
        optimisticData.put(getKey("locale"), arg);
        return this;
    }

    /**
    * The market that the translation is specific to. Null value means the translation is available in all
    * markets.
    */

    public Market getMarket() {
        return (Market) get("market");
    }

    public Translation setMarket(Market arg) {
        optimisticData.put(getKey("market"), arg);
        return this;
    }

    /**
    * Whether the original content has changed since this translation was updated.
    */

    public Boolean getOutdated() {
        return (Boolean) get("outdated");
    }

    public Translation setOutdated(Boolean arg) {
        optimisticData.put(getKey("outdated"), arg);
        return this;
    }

    /**
    * The date and time when the translation was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Translation setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * Translation value.
    */

    public String getValue() {
        return (String) get("value");
    }

    public Translation setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "key": return false;

            case "locale": return false;

            case "market": return true;

            case "outdated": return false;

            case "updatedAt": return false;

            case "value": return false;

            default: return false;
        }
    }
}

