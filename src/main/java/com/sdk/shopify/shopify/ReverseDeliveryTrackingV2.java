// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the information used to track a reverse delivery.
*/
public class ReverseDeliveryTrackingV2 extends AbstractResponse<ReverseDeliveryTrackingV2> {
    public ReverseDeliveryTrackingV2() {
    }

    public ReverseDeliveryTrackingV2(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "carrierName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "number": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "url": {
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
        return "ReverseDeliveryTrackingV2";
    }

    /**
    * The provider of the tracking information, in a human-readable format for display purposes.
    */

    public String getCarrierName() {
        return (String) get("carrierName");
    }

    public ReverseDeliveryTrackingV2 setCarrierName(String arg) {
        optimisticData.put(getKey("carrierName"), arg);
        return this;
    }

    /**
    * The identifier used by the courier to identify the shipment.
    */

    public String getNumber() {
        return (String) get("number");
    }

    public ReverseDeliveryTrackingV2 setNumber(String arg) {
        optimisticData.put(getKey("number"), arg);
        return this;
    }

    /**
    * The URL to track a shipment.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public ReverseDeliveryTrackingV2 setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "carrierName": return false;

            case "number": return false;

            case "url": return false;

            default: return false;
        }
    }
}

