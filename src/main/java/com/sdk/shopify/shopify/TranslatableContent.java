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
* Translatable content of a resource's field.
*/
public class TranslatableContent extends AbstractResponse<TranslatableContent> {
    public TranslatableContent() {
    }

    public TranslatableContent(JsonObject fields) throws SchemaViolationError {
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

                case "locale": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "type": {
                    responseData.put(key, LocalizableContentType.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "TranslatableContent";
    }

    /**
    * Hash digest representation of the content value.
    */

    public String getDigest() {
        return (String) get("digest");
    }

    public TranslatableContent setDigest(String arg) {
        optimisticData.put(getKey("digest"), arg);
        return this;
    }

    /**
    * The resource field that's being translated.
    */

    public String getKey() {
        return (String) get("key");
    }

    public TranslatableContent setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * Locale of the content.
    */

    public String getLocale() {
        return (String) get("locale");
    }

    public TranslatableContent setLocale(String arg) {
        optimisticData.put(getKey("locale"), arg);
        return this;
    }

    /**
    * Type of the translatable content.
    */

    public LocalizableContentType getType() {
        return (LocalizableContentType) get("type");
    }

    public TranslatableContent setType(LocalizableContentType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * Content value.
    */

    public String getValue() {
        return (String) get("value");
    }

    public TranslatableContent setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "digest": return false;

            case "key": return false;

            case "locale": return false;

            case "type": return false;

            case "value": return false;

            default: return false;
        }
    }
}

