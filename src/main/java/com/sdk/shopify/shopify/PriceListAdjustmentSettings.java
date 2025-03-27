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
* Represents the settings of price list adjustments.
*/
public class PriceListAdjustmentSettings extends AbstractResponse<PriceListAdjustmentSettings> {
    public PriceListAdjustmentSettings() {
    }

    public PriceListAdjustmentSettings(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "compareAtMode": {
                    responseData.put(key, PriceListCompareAtMode.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "PriceListAdjustmentSettings";
    }

    /**
    * The type of price list adjustment setting for compare at price.
    */

    public PriceListCompareAtMode getCompareAtMode() {
        return (PriceListCompareAtMode) get("compareAtMode");
    }

    public PriceListAdjustmentSettings setCompareAtMode(PriceListCompareAtMode arg) {
        optimisticData.put(getKey("compareAtMode"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "compareAtMode": return false;

            default: return false;
        }
    }
}

