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
* Return type for `inventoryShipmentAddItems` mutation.
*/
public class InventoryShipmentAddItemsPayload extends AbstractResponse<InventoryShipmentAddItemsPayload> {
    public InventoryShipmentAddItemsPayload() {
    }

    public InventoryShipmentAddItemsPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "addedItems": {
                    List<InventoryShipmentLineItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<InventoryShipmentLineItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new InventoryShipmentLineItem(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryShipment": {
                    InventoryShipment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryShipment(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<InventoryShipmentAddItemsUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new InventoryShipmentAddItemsUserError(jsonAsObject(element1, key)));
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
        return "InventoryShipmentAddItemsPayload";
    }

    /**
    * The list of added line items.
    */

    public List<InventoryShipmentLineItem> getAddedItems() {
        return (List<InventoryShipmentLineItem>) get("addedItems");
    }

    public InventoryShipmentAddItemsPayload setAddedItems(List<InventoryShipmentLineItem> arg) {
        optimisticData.put(getKey("addedItems"), arg);
        return this;
    }

    /**
    * The inventory shipment with the added items.
    */

    public InventoryShipment getInventoryShipment() {
        return (InventoryShipment) get("inventoryShipment");
    }

    public InventoryShipmentAddItemsPayload setInventoryShipment(InventoryShipment arg) {
        optimisticData.put(getKey("inventoryShipment"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<InventoryShipmentAddItemsUserError> getUserErrors() {
        return (List<InventoryShipmentAddItemsUserError>) get("userErrors");
    }

    public InventoryShipmentAddItemsPayload setUserErrors(List<InventoryShipmentAddItemsUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "addedItems": return true;

            case "inventoryShipment": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

