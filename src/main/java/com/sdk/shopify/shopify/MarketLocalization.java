// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The market localization of a field within a resource, which is determined by the market ID.
*/
public class MarketLocalization extends AbstractResponse<MarketLocalization> {
    public MarketLocalization() {
    }

    public MarketLocalization(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "key": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "market": {
                    responseData.put(key, new Market(jsonAsObject(field.getValue(), key)));

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
        return "MarketLocalization";
    }

    /**
    * A reference to the value being localized on the resource that this market localization belongs to.
    */

    public String getKey() {
        return (String) get("key");
    }

    public MarketLocalization setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * The market that the localization is specific to.
    */

    public Market getMarket() {
        return (Market) get("market");
    }

    public MarketLocalization setMarket(Market arg) {
        optimisticData.put(getKey("market"), arg);
        return this;
    }

    /**
    * Whether the original content has changed since this market localization was updated.
    */

    public Boolean getOutdated() {
        return (Boolean) get("outdated");
    }

    public MarketLocalization setOutdated(Boolean arg) {
        optimisticData.put(getKey("outdated"), arg);
        return this;
    }

    /**
    * The date and time when the market localization was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public MarketLocalization setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * The value of the market localization.
    */

    public String getValue() {
        return (String) get("value");
    }

    public MarketLocalization setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "key": return false;

            case "market": return true;

            case "outdated": return false;

            case "updatedAt": return false;

            case "value": return false;

            default: return false;
        }
    }
}

