// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Markets entitlement information.
*/
public class MarketsType extends AbstractResponse<MarketsType> {
    public MarketsType() {
    }

    public MarketsType(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "b2b": {
                    responseData.put(key, new MarketsB2BEntitlement(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "regions": {
                    responseData.put(key, new MarketsRegionsEntitlement(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "retail": {
                    responseData.put(key, new MarketsRetailEntitlement(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "themes": {
                    responseData.put(key, new MarketsThemesEntitlement(jsonAsObject(field.getValue(), key)));

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
        return "MarketsType";
    }

    /**
    * The entitlements for B2B markets.
    */

    public MarketsB2BEntitlement getB2b() {
        return (MarketsB2BEntitlement) get("b2b");
    }

    public MarketsType setB2b(MarketsB2BEntitlement arg) {
        optimisticData.put(getKey("b2b"), arg);
        return this;
    }

    /**
    * The entitlements for region markets.
    */

    public MarketsRegionsEntitlement getRegions() {
        return (MarketsRegionsEntitlement) get("regions");
    }

    public MarketsType setRegions(MarketsRegionsEntitlement arg) {
        optimisticData.put(getKey("regions"), arg);
        return this;
    }

    /**
    * The entitlements for retail markets.
    */

    public MarketsRetailEntitlement getRetail() {
        return (MarketsRetailEntitlement) get("retail");
    }

    public MarketsType setRetail(MarketsRetailEntitlement arg) {
        optimisticData.put(getKey("retail"), arg);
        return this;
    }

    /**
    * The entitlements for themes.
    */

    public MarketsThemesEntitlement getThemes() {
        return (MarketsThemesEntitlement) get("themes");
    }

    public MarketsType setThemes(MarketsThemesEntitlement arg) {
        optimisticData.put(getKey("themes"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "b2b": return true;

            case "regions": return true;

            case "retail": return true;

            case "themes": return true;

            default: return false;
        }
    }
}

