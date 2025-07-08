// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The resolved values based on the markets configuration for a buyer signal. Resolved values include
* the resolved catalogs, web presences, currency, and price inclusivity.
*/
public class MarketsResolvedValues extends AbstractResponse<MarketsResolvedValues> {
    public MarketsResolvedValues() {
    }

    public MarketsResolvedValues(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "catalogs": {
                    responseData.put(key, new MarketCatalogConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "currencyCode": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "priceInclusivity": {
                    responseData.put(key, new ResolvedPriceInclusivity(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "webPresences": {
                    responseData.put(key, new MarketWebPresenceConnection(jsonAsObject(field.getValue(), key)));

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
        return "MarketsResolvedValues";
    }

    /**
    * The resolved catalogs.
    */

    public MarketCatalogConnection getCatalogs() {
        return (MarketCatalogConnection) get("catalogs");
    }

    public MarketsResolvedValues setCatalogs(MarketCatalogConnection arg) {
        optimisticData.put(getKey("catalogs"), arg);
        return this;
    }

    /**
    * The resolved currency code.
    */

    public CurrencyCode getCurrencyCode() {
        return (CurrencyCode) get("currencyCode");
    }

    public MarketsResolvedValues setCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("currencyCode"), arg);
        return this;
    }

    /**
    * The resolved price inclusivity attributes.
    */

    public ResolvedPriceInclusivity getPriceInclusivity() {
        return (ResolvedPriceInclusivity) get("priceInclusivity");
    }

    public MarketsResolvedValues setPriceInclusivity(ResolvedPriceInclusivity arg) {
        optimisticData.put(getKey("priceInclusivity"), arg);
        return this;
    }

    /**
    * The resolved web presences ordered by priority.
    */

    public MarketWebPresenceConnection getWebPresences() {
        return (MarketWebPresenceConnection) get("webPresences");
    }

    public MarketsResolvedValues setWebPresences(MarketWebPresenceConnection arg) {
        optimisticData.put(getKey("webPresences"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "catalogs": return true;

            case "currencyCode": return false;

            case "priceInclusivity": return true;

            case "webPresences": return true;

            default: return false;
        }
    }
}

