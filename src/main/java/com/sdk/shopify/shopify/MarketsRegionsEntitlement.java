// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The entitlements for region markets.
*/
public class MarketsRegionsEntitlement extends AbstractResponse<MarketsRegionsEntitlement> {
    public MarketsRegionsEntitlement() {
    }

    public MarketsRegionsEntitlement(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "catalogs": {
                    responseData.put(key, new MarketsCatalogsEntitlement(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "enabled": {
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
        return "MarketsRegionsEntitlement";
    }

    /**
    * The entitlements for region market catalogs.
    */

    public MarketsCatalogsEntitlement getCatalogs() {
        return (MarketsCatalogsEntitlement) get("catalogs");
    }

    public MarketsRegionsEntitlement setCatalogs(MarketsCatalogsEntitlement arg) {
        optimisticData.put(getKey("catalogs"), arg);
        return this;
    }

    /**
    * Whether region markets are enabled.
    */

    public Boolean getEnabled() {
        return (Boolean) get("enabled");
    }

    public MarketsRegionsEntitlement setEnabled(Boolean arg) {
        optimisticData.put(getKey("enabled"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "catalogs": return true;

            case "enabled": return false;

            default: return false;
        }
    }
}

