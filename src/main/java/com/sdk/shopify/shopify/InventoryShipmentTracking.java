// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the tracking information for an inventory shipment.
*/
public class InventoryShipmentTracking extends AbstractResponse<InventoryShipmentTracking> {
    public InventoryShipmentTracking() {
    }

    public InventoryShipmentTracking(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "arrivesAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "company": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "trackingNumber": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "trackingUrl": {
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
        return "InventoryShipmentTracking";
    }

    /**
    * The estimated date and time that the shipment will arrive.
    */

    public String getArrivesAt() {
        return (String) get("arrivesAt");
    }

    public InventoryShipmentTracking setArrivesAt(String arg) {
        optimisticData.put(getKey("arrivesAt"), arg);
        return this;
    }

    /**
    * The name of the shipping carrier company.
    */

    public String getCompany() {
        return (String) get("company");
    }

    public InventoryShipmentTracking setCompany(String arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
    * The tracking number used by the carrier to identify the shipment.
    */

    public String getTrackingNumber() {
        return (String) get("trackingNumber");
    }

    public InventoryShipmentTracking setTrackingNumber(String arg) {
        optimisticData.put(getKey("trackingNumber"), arg);
        return this;
    }

    /**
    * The URL to track the shipment.
    * Given a tracking number and a shipping carrier company name from
    * [the
    * list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company),
    * Shopify will return a generated tracking URL if no tracking URL was set manually.
    */

    public String getTrackingUrl() {
        return (String) get("trackingUrl");
    }

    public InventoryShipmentTracking setTrackingUrl(String arg) {
        optimisticData.put(getKey("trackingUrl"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "arrivesAt": return false;

            case "company": return false;

            case "trackingNumber": return false;

            case "trackingUrl": return false;

            default: return false;
        }
    }
}

