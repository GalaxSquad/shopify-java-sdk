// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents relative adjustments from one price list to other prices.
* You can use a `PriceListParent` to specify an adjusted relative price using a percentage-based
* adjustment. Adjusted prices work in conjunction with exchange rules and rounding.
* [Adjustment types](https://shopify.dev/api/admin-graphql/latest/enums/pricelistadjustmenttype)
* support both percentage increases and decreases.
*/
public class PriceListParent extends AbstractResponse<PriceListParent> {
    public PriceListParent() {
    }

    public PriceListParent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "adjustment": {
                    responseData.put(key, new PriceListAdjustment(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "settings": {
                    responseData.put(key, new PriceListAdjustmentSettings(jsonAsObject(field.getValue(), key)));

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
        return "PriceListParent";
    }

    /**
    * A price list adjustment.
    */

    public PriceListAdjustment getAdjustment() {
        return (PriceListAdjustment) get("adjustment");
    }

    public PriceListParent setAdjustment(PriceListAdjustment arg) {
        optimisticData.put(getKey("adjustment"), arg);
        return this;
    }

    /**
    * A price list's settings for adjustment.
    */

    public PriceListAdjustmentSettings getSettings() {
        return (PriceListAdjustmentSettings) get("settings");
    }

    public PriceListParent setSettings(PriceListAdjustmentSettings arg) {
        optimisticData.put(getKey("settings"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adjustment": return true;

            case "settings": return true;

            default: return false;
        }
    }
}

