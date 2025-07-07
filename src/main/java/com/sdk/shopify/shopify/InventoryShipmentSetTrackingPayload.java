// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `inventoryShipmentSetTracking` mutation.
*/
public class InventoryShipmentSetTrackingPayload extends AbstractResponse<InventoryShipmentSetTrackingPayload> {
    public InventoryShipmentSetTrackingPayload() {
    }

    public InventoryShipmentSetTrackingPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "inventoryShipment": {
                    InventoryShipment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryShipment(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<InventoryShipmentSetTrackingUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new InventoryShipmentSetTrackingUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "InventoryShipmentSetTrackingPayload";
    }

    /**
    * The inventory shipment with the edited tracking info.
    */

    public InventoryShipment getInventoryShipment() {
        return (InventoryShipment) get("inventoryShipment");
    }

    public InventoryShipmentSetTrackingPayload setInventoryShipment(InventoryShipment arg) {
        optimisticData.put(getKey("inventoryShipment"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<InventoryShipmentSetTrackingUserError> getUserErrors() {
        return (List<InventoryShipmentSetTrackingUserError>) get("userErrors");
    }

    public InventoryShipmentSetTrackingPayload setUserErrors(List<InventoryShipmentSetTrackingUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "inventoryShipment": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

