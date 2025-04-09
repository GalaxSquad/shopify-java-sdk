// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The market localizable content of a resource's field.
*/
public class MarketLocalizableContent extends AbstractResponse<MarketLocalizableContent> {
    public MarketLocalizableContent() {
    }

    public MarketLocalizableContent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "digest": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "key": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "MarketLocalizableContent";
    }

    /**
    * The hash digest representation of the content value.
    */

    public String getDigest() {
        return (String) get("digest");
    }

    public MarketLocalizableContent setDigest(String arg) {
        optimisticData.put(getKey("digest"), arg);
        return this;
    }

    /**
    * The resource field that's being localized.
    */

    public String getKey() {
        return (String) get("key");
    }

    public MarketLocalizableContent setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * The content value.
    */

    public String getValue() {
        return (String) get("value");
    }

    public MarketLocalizableContent setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "digest": return false;

            case "key": return false;

            case "value": return false;

            default: return false;
        }
    }
}

