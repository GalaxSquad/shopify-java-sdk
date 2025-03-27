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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Represents a fulfillment.
* In Shopify, a fulfillment represents a shipment of one or more items in an order.
* When an order has been completely fulfilled, it means that all the items that are included
* in the order have been sent to the customer.
* There can be more than one fulfillment for an order.
*/
public class Fulfillment extends AbstractResponse<Fulfillment> implements LegacyInteroperability, Node {
    public Fulfillment() {
    }

    public Fulfillment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "deliveredAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "displayStatus": {
                    FulfillmentDisplayStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = FulfillmentDisplayStatus.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "estimatedDeliveryAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "events": {
                    responseData.put(key, new FulfillmentEventConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "fulfillmentLineItems": {
                    responseData.put(key, new FulfillmentLineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "fulfillmentOrders": {
                    responseData.put(key, new FulfillmentOrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "inTransitAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "location": {
                    Location optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Location(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "order": {
                    responseData.put(key, new Order(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "originAddress": {
                    FulfillmentOriginAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOriginAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "requiresShipping": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "service": {
                    FulfillmentService optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentService(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, FulfillmentStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "totalQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "trackingInfo": {
                    List<FulfillmentTrackingInfo> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentTrackingInfo(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public Fulfillment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Fulfillment";
    }

    /**
    * The date and time when the fulfillment was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Fulfillment setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The date that this fulfillment was delivered.
    */

    public String getDeliveredAt() {
        return (String) get("deliveredAt");
    }

    public Fulfillment setDeliveredAt(String arg) {
        optimisticData.put(getKey("deliveredAt"), arg);
        return this;
    }

    /**
    * Human readable display status for this fulfillment.
    */

    public FulfillmentDisplayStatus getDisplayStatus() {
        return (FulfillmentDisplayStatus) get("displayStatus");
    }

    public Fulfillment setDisplayStatus(FulfillmentDisplayStatus arg) {
        optimisticData.put(getKey("displayStatus"), arg);
        return this;
    }

    /**
    * The estimated date that this fulfillment will arrive.
    */

    public String getEstimatedDeliveryAt() {
        return (String) get("estimatedDeliveryAt");
    }

    public Fulfillment setEstimatedDeliveryAt(String arg) {
        optimisticData.put(getKey("estimatedDeliveryAt"), arg);
        return this;
    }

    /**
    * The history of events associated with this fulfillment.
    */

    public FulfillmentEventConnection getEvents() {
        return (FulfillmentEventConnection) get("events");
    }

    public Fulfillment setEvents(FulfillmentEventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * List of the fulfillment's line items.
    */

    public FulfillmentLineItemConnection getFulfillmentLineItems() {
        return (FulfillmentLineItemConnection) get("fulfillmentLineItems");
    }

    public Fulfillment setFulfillmentLineItems(FulfillmentLineItemConnection arg) {
        optimisticData.put(getKey("fulfillmentLineItems"), arg);
        return this;
    }

    /**
    * A paginated list of fulfillment orders for the fulfillment.
    */

    public FulfillmentOrderConnection getFulfillmentOrders() {
        return (FulfillmentOrderConnection) get("fulfillmentOrders");
    }

    public Fulfillment setFulfillmentOrders(FulfillmentOrderConnection arg) {
        optimisticData.put(getKey("fulfillmentOrders"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The date and time when the fulfillment went into transit.
    */

    public String getInTransitAt() {
        return (String) get("inTransitAt");
    }

    public Fulfillment setInTransitAt(String arg) {
        optimisticData.put(getKey("inTransitAt"), arg);
        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public Fulfillment setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The location that the fulfillment was processed at.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public Fulfillment setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * Human readable reference identifier for this fulfillment.
    */

    public String getName() {
        return (String) get("name");
    }

    public Fulfillment setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The order for which the fulfillment was created.
    */

    public Order getOrder() {
        return (Order) get("order");
    }

    public Fulfillment setOrder(Order arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
    * The address at which the fulfillment occurred. This field is intended for tax purposes, as a full
    * address is required for tax providers to accurately calculate taxes. Typically this is the address
    * of the warehouse or fulfillment center. To retrieve a fulfillment location's address, use the
    * `assignedLocation` field on the
    * [`FulfillmentOrder`](/docs/api/admin-graphql/latest/objects/FulfillmentOrder) object instead.
    */

    public FulfillmentOriginAddress getOriginAddress() {
        return (FulfillmentOriginAddress) get("originAddress");
    }

    public Fulfillment setOriginAddress(FulfillmentOriginAddress arg) {
        optimisticData.put(getKey("originAddress"), arg);
        return this;
    }

    /**
    * Whether any of the line items in the fulfillment require shipping.
    */

    public Boolean getRequiresShipping() {
        return (Boolean) get("requiresShipping");
    }

    public Fulfillment setRequiresShipping(Boolean arg) {
        optimisticData.put(getKey("requiresShipping"), arg);
        return this;
    }

    /**
    * Fulfillment service associated with the fulfillment.
    */

    public FulfillmentService getService() {
        return (FulfillmentService) get("service");
    }

    public Fulfillment setService(FulfillmentService arg) {
        optimisticData.put(getKey("service"), arg);
        return this;
    }

    /**
    * The status of the fulfillment.
    */

    public FulfillmentStatus getStatus() {
        return (FulfillmentStatus) get("status");
    }

    public Fulfillment setStatus(FulfillmentStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * Sum of all line item quantities for the fulfillment.
    */

    public Integer getTotalQuantity() {
        return (Integer) get("totalQuantity");
    }

    public Fulfillment setTotalQuantity(Integer arg) {
        optimisticData.put(getKey("totalQuantity"), arg);
        return this;
    }

    /**
    * Tracking information associated with the fulfillment,
    * such as the tracking company, tracking number, and tracking URL.
    */

    public List<FulfillmentTrackingInfo> getTrackingInfo() {
        return (List<FulfillmentTrackingInfo>) get("trackingInfo");
    }

    public Fulfillment setTrackingInfo(List<FulfillmentTrackingInfo> arg) {
        optimisticData.put(getKey("trackingInfo"), arg);
        return this;
    }

    /**
    * The date and time when the fulfillment was last modified.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Fulfillment setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "createdAt": return false;

            case "deliveredAt": return false;

            case "displayStatus": return false;

            case "estimatedDeliveryAt": return false;

            case "events": return true;

            case "fulfillmentLineItems": return true;

            case "fulfillmentOrders": return true;

            case "id": return false;

            case "inTransitAt": return false;

            case "legacyResourceId": return false;

            case "location": return true;

            case "name": return false;

            case "order": return true;

            case "originAddress": return true;

            case "requiresShipping": return false;

            case "service": return true;

            case "status": return false;

            case "totalQuantity": return false;

            case "trackingInfo": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

