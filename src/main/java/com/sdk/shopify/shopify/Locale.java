// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A locale.
*/
public class Locale extends AbstractResponse<Locale> {
    public Locale() {
    }

    public Locale(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "isoCode": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "Locale";
    }

    /**
    * Locale ISO code.
    */

    public String getIsoCode() {
        return (String) get("isoCode");
    }

    public Locale setIsoCode(String arg) {
        optimisticData.put(getKey("isoCode"), arg);
        return this;
    }

    /**
    * Human-readable locale name.
    */

    public String getName() {
        return (String) get("name");
    }

    public Locale setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "isoCode": return false;

            case "name": return false;

            default: return false;
        }
    }
}

