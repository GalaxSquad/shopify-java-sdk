// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The inclusive pricing strategy for a market.
*/
public class MarketPriceInclusions extends AbstractResponse<MarketPriceInclusions> {
    public MarketPriceInclusions() {
    }

    public MarketPriceInclusions(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "inclusiveDutiesPricingStrategy": {
                    responseData.put(key, InclusiveDutiesPricingStrategy.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "inclusiveTaxPricingStrategy": {
                    responseData.put(key, InclusiveTaxPricingStrategy.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "MarketPriceInclusions";
    }

    /**
    * The inclusive duties pricing strategy of the market. This determines if prices include duties.
    */

    public InclusiveDutiesPricingStrategy getInclusiveDutiesPricingStrategy() {
        return (InclusiveDutiesPricingStrategy) get("inclusiveDutiesPricingStrategy");
    }

    public MarketPriceInclusions setInclusiveDutiesPricingStrategy(InclusiveDutiesPricingStrategy arg) {
        optimisticData.put(getKey("inclusiveDutiesPricingStrategy"), arg);
        return this;
    }

    /**
    * The inclusive tax pricing strategy of the market. This determines if prices include taxes.
    */

    public InclusiveTaxPricingStrategy getInclusiveTaxPricingStrategy() {
        return (InclusiveTaxPricingStrategy) get("inclusiveTaxPricingStrategy");
    }

    public MarketPriceInclusions setInclusiveTaxPricingStrategy(InclusiveTaxPricingStrategy arg) {
        optimisticData.put(getKey("inclusiveTaxPricingStrategy"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "inclusiveDutiesPricingStrategy": return false;

            case "inclusiveTaxPricingStrategy": return false;

            default: return false;
        }
    }
}

