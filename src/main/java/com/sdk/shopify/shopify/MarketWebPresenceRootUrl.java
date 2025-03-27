// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The URL for the homepage of the online store in the context of a particular market and a
* particular locale.
*/
public class MarketWebPresenceRootUrl extends AbstractResponse<MarketWebPresenceRootUrl> {
    public MarketWebPresenceRootUrl() {
    }

    public MarketWebPresenceRootUrl(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "locale": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "url": {
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
        return "MarketWebPresenceRootUrl";
    }

    /**
    * The locale that the storefront loads in.
    */

    public String getLocale() {
        return (String) get("locale");
    }

    public MarketWebPresenceRootUrl setLocale(String arg) {
        optimisticData.put(getKey("locale"), arg);
        return this;
    }

    /**
    * The URL.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public MarketWebPresenceRootUrl setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "locale": return false;

            case "url": return false;

            default: return false;
        }
    }
}

