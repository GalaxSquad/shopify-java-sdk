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
* A reverse shipping deliverable that may include a label and tracking information.
*/
public class ReverseDeliveryShippingDeliverable extends AbstractResponse<ReverseDeliveryShippingDeliverable> implements ReverseDeliveryDeliverable {
    public ReverseDeliveryShippingDeliverable() {
    }

    public ReverseDeliveryShippingDeliverable(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "label": {
                    ReverseDeliveryLabelV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReverseDeliveryLabelV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tracking": {
                    ReverseDeliveryTrackingV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReverseDeliveryTrackingV2(jsonAsObject(field.getValue(), key));
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
        return "ReverseDeliveryShippingDeliverable";
    }

    /**
    * The return label attached to the reverse delivery.
    */

    public ReverseDeliveryLabelV2 getLabel() {
        return (ReverseDeliveryLabelV2) get("label");
    }

    public ReverseDeliveryShippingDeliverable setLabel(ReverseDeliveryLabelV2 arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
    * The information to track the reverse delivery.
    */

    public ReverseDeliveryTrackingV2 getTracking() {
        return (ReverseDeliveryTrackingV2) get("tracking");
    }

    public ReverseDeliveryShippingDeliverable setTracking(ReverseDeliveryTrackingV2 arg) {
        optimisticData.put(getKey("tracking"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "label": return true;

            case "tracking": return true;

            default: return false;
        }
    }
}

