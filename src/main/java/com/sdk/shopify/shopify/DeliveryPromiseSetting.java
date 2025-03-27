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
* The delivery promise settings.
*/
public class DeliveryPromiseSetting extends AbstractResponse<DeliveryPromiseSetting> {
    public DeliveryPromiseSetting() {
    }

    public DeliveryPromiseSetting(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deliveryDatesEnabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "processingTime": {
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
        return "DeliveryPromiseSetting";
    }

    /**
    * Whether delivery dates is enabled.
    */

    public Boolean getDeliveryDatesEnabled() {
        return (Boolean) get("deliveryDatesEnabled");
    }

    public DeliveryPromiseSetting setDeliveryDatesEnabled(Boolean arg) {
        optimisticData.put(getKey("deliveryDatesEnabled"), arg);
        return this;
    }

    /**
    * The number of business days required for processing the order before the package is handed off to
    * the carrier. Expressed as an ISO8601 duration.
    */

    public String getProcessingTime() {
        return (String) get("processingTime");
    }

    public DeliveryPromiseSetting setProcessingTime(String arg) {
        optimisticData.put(getKey("processingTime"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deliveryDatesEnabled": return false;

            case "processingTime": return false;

            default: return false;
        }
    }
}

