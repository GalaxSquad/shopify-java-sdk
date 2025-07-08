// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Represents the intention to move inventory between locations.
*/
public class InventoryTransfer extends AbstractResponse<InventoryTransfer> implements CommentEventSubject, HasEvents, HasMetafieldDefinitions, HasMetafields, Node {
    public InventoryTransfer() {
    }

    public InventoryTransfer(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "dateCreated": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "destination": {
                    LocationSnapshot optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LocationSnapshot(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "events": {
                    responseData.put(key, new EventConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "hasTimelineComment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lineItems": {
                    responseData.put(key, new InventoryTransferLineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "lineItemsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafield": {
                    Metafield optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metafield(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafields": {
                    responseData.put(key, new MetafieldConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "note": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "origin": {
                    LocationSnapshot optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LocationSnapshot(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "receivedQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "referenceName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shipments": {
                    responseData.put(key, new InventoryShipmentConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, InventoryTransferStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "tags": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "totalQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

    public InventoryTransfer(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "InventoryTransfer";
    }

    /**
    * The date and time the inventory transfer was created in UTC format.
    */

    public String getDateCreated() {
        return (String) get("dateCreated");
    }

    public InventoryTransfer setDateCreated(String arg) {
        optimisticData.put(getKey("dateCreated"), arg);
        return this;
    }

    /**
    * Snapshot of the destination location (name, address, when snapped) with an optional link to the live
    * Location object. If the original location is deleted, the snapshot data will still be available but
    * the location link will be nil.
    */

    public LocationSnapshot getDestination() {
        return (LocationSnapshot) get("destination");
    }

    public InventoryTransfer setDestination(LocationSnapshot arg) {
        optimisticData.put(getKey("destination"), arg);
        return this;
    }

    /**
    * The list of events associated with the inventory transfer.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public InventoryTransfer setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * Whether the merchant has added timeline comments to the inventory transfer.
    */

    public Boolean getHasTimelineComment() {
        return (Boolean) get("hasTimelineComment");
    }

    public InventoryTransfer setHasTimelineComment(Boolean arg) {
        optimisticData.put(getKey("hasTimelineComment"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The line items associated with the inventory transfer.
    */

    public InventoryTransferLineItemConnection getLineItems() {
        return (InventoryTransferLineItemConnection) get("lineItems");
    }

    public InventoryTransfer setLineItems(InventoryTransferLineItemConnection arg) {
        optimisticData.put(getKey("lineItems"), arg);
        return this;
    }

    /**
    * The number of line items associated with the inventory transfer. Limited to a maximum of 10000 by
    * default.
    */

    public Count getLineItemsCount() {
        return (Count) get("lineItemsCount");
    }

    public InventoryTransfer setLineItemsCount(Count arg) {
        optimisticData.put(getKey("lineItemsCount"), arg);
        return this;
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public InventoryTransfer setMetafield(Metafield arg) {
        optimisticData.put(getKey("metafield"), arg);
        return this;
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    public InventoryTransfer setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The name of the inventory transfer.
    */

    public String getName() {
        return (String) get("name");
    }

    public InventoryTransfer setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * Additional note attached to the inventory transfer.
    */

    public String getNote() {
        return (String) get("note");
    }

    public InventoryTransfer setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * Snapshot of the origin location (name, address, when snapped) with an optional link to the live
    * Location object. If the original location is deleted, the snapshot data will still be available but
    * the location link will be nil.
    */

    public LocationSnapshot getOrigin() {
        return (LocationSnapshot) get("origin");
    }

    public InventoryTransfer setOrigin(LocationSnapshot arg) {
        optimisticData.put(getKey("origin"), arg);
        return this;
    }

    /**
    * The total quantity of items received in the transfer.
    */

    public Integer getReceivedQuantity() {
        return (Integer) get("receivedQuantity");
    }

    public InventoryTransfer setReceivedQuantity(Integer arg) {
        optimisticData.put(getKey("receivedQuantity"), arg);
        return this;
    }

    /**
    * The reference name of the inventory transfer.
    */

    public String getReferenceName() {
        return (String) get("referenceName");
    }

    public InventoryTransfer setReferenceName(String arg) {
        optimisticData.put(getKey("referenceName"), arg);
        return this;
    }

    /**
    * The shipments associated with the inventory transfer.
    */

    public InventoryShipmentConnection getShipments() {
        return (InventoryShipmentConnection) get("shipments");
    }

    public InventoryTransfer setShipments(InventoryShipmentConnection arg) {
        optimisticData.put(getKey("shipments"), arg);
        return this;
    }

    /**
    * The current status of the transfer.
    */

    public InventoryTransferStatus getStatus() {
        return (InventoryTransferStatus) get("status");
    }

    public InventoryTransfer setStatus(InventoryTransferStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * A list of tags that have been added to the inventory transfer.
    */

    public List<String> getTags() {
        return (List<String>) get("tags");
    }

    public InventoryTransfer setTags(List<String> arg) {
        optimisticData.put(getKey("tags"), arg);
        return this;
    }

    /**
    * The total quantity of items being transferred.
    */

    public Integer getTotalQuantity() {
        return (Integer) get("totalQuantity");
    }

    public InventoryTransfer setTotalQuantity(Integer arg) {
        optimisticData.put(getKey("totalQuantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "dateCreated": return false;

            case "destination": return true;

            case "events": return true;

            case "hasTimelineComment": return false;

            case "id": return false;

            case "lineItems": return true;

            case "lineItemsCount": return true;

            case "metafield": return true;

            case "metafields": return true;

            case "name": return false;

            case "note": return false;

            case "origin": return true;

            case "receivedQuantity": return false;

            case "referenceName": return false;

            case "shipments": return true;

            case "status": return false;

            case "tags": return false;

            case "totalQuantity": return false;

            default: return false;
        }
    }
}

