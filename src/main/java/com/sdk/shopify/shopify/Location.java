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
* Represents the location where the physical good resides. You can stock inventory at active
* locations. Active
* locations that have `fulfills_online_orders: true` and are configured with a shipping rate, pickup
* enabled or
* local delivery will be able to sell from their storefront.
*/
public class Location extends AbstractResponse<Location> implements HasMetafieldDefinitions, HasMetafields, LegacyInteroperability, MetafieldReferencer, Node {
    public Location() {
    }

    public Location(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "activatable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "address": {
                    responseData.put(key, new LocationAddress(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "addressVerified": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "deactivatable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "deactivatedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deletable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "fulfillmentService": {
                    FulfillmentService optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentService(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillsOnlineOrders": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "hasActiveInventory": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "hasUnfulfilledOrders": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "inventoryLevel": {
                    InventoryLevel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryLevel(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryLevels": {
                    responseData.put(key, new InventoryLevelConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "isActive": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "isFulfillmentService": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "localPickupSettingsV2": {
                    DeliveryLocalPickupSettings optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryLocalPickupSettings(jsonAsObject(field.getValue(), key));
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

                case "shipsInventory": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "suggestedAddresses": {
                    List<LocationSuggestedAddress> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new LocationSuggestedAddress(jsonAsObject(element1, key)));
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

    public Location(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Location";
    }

    /**
    * Whether the location can be reactivated. If `false`, then trying to activate the location with the
    * [`LocationActivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationActivate)
    * mutation will return an error that describes why the location can't be activated.
    */

    public Boolean getActivatable() {
        return (Boolean) get("activatable");
    }

    public Location setActivatable(Boolean arg) {
        optimisticData.put(getKey("activatable"), arg);
        return this;
    }

    /**
    * The address of this location.
    */

    public LocationAddress getAddress() {
        return (LocationAddress) get("address");
    }

    public Location setAddress(LocationAddress arg) {
        optimisticData.put(getKey("address"), arg);
        return this;
    }

    /**
    * Whether the location address has been verified.
    */

    public Boolean getAddressVerified() {
        return (Boolean) get("addressVerified");
    }

    public Location setAddressVerified(Boolean arg) {
        optimisticData.put(getKey("addressVerified"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) that the location was
    * added to a shop.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Location setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * Whether this location can be deactivated. If `true`, then the location can be deactivated by calling
    * the
    * [`LocationDeactivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationDeactivat
    * e)
    * mutation. If `false`, then calling the mutation to deactivate it will return an error that describes
    * why the
    * location can't be deactivated.
    */

    public Boolean getDeactivatable() {
        return (Boolean) get("deactivatable");
    }

    public Location setDeactivatable(Boolean arg) {
        optimisticData.put(getKey("deactivatable"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) that the location was
    * deactivated at. For example, 3:30 pm on September 7, 2019 in the time zone of UTC (Universal Time
    * Coordinated) is represented as `"2019-09-07T15:50:00Z`".
    */

    public String getDeactivatedAt() {
        return (String) get("deactivatedAt");
    }

    public Location setDeactivatedAt(String arg) {
        optimisticData.put(getKey("deactivatedAt"), arg);
        return this;
    }

    /**
    * Whether this location can be deleted.
    */

    public Boolean getDeletable() {
        return (Boolean) get("deletable");
    }

    public Location setDeletable(Boolean arg) {
        optimisticData.put(getKey("deletable"), arg);
        return this;
    }

    /**
    * Name of the service provider that fulfills from this location.
    */

    public FulfillmentService getFulfillmentService() {
        return (FulfillmentService) get("fulfillmentService");
    }

    public Location setFulfillmentService(FulfillmentService arg) {
        optimisticData.put(getKey("fulfillmentService"), arg);
        return this;
    }

    /**
    * Whether this location can fulfill online orders.
    */

    public Boolean getFulfillsOnlineOrders() {
        return (Boolean) get("fulfillsOnlineOrders");
    }

    public Location setFulfillsOnlineOrders(Boolean arg) {
        optimisticData.put(getKey("fulfillsOnlineOrders"), arg);
        return this;
    }

    /**
    * Whether this location has active inventory.
    */

    public Boolean getHasActiveInventory() {
        return (Boolean) get("hasActiveInventory");
    }

    public Location setHasActiveInventory(Boolean arg) {
        optimisticData.put(getKey("hasActiveInventory"), arg);
        return this;
    }

    /**
    * Whether this location has orders that need to be fulfilled.
    */

    public Boolean getHasUnfulfilledOrders() {
        return (Boolean) get("hasUnfulfilledOrders");
    }

    public Location setHasUnfulfilledOrders(Boolean arg) {
        optimisticData.put(getKey("hasUnfulfilledOrders"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The quantities of an inventory item at this location.
    */

    public InventoryLevel getInventoryLevel() {
        return (InventoryLevel) get("inventoryLevel");
    }

    public Location setInventoryLevel(InventoryLevel arg) {
        optimisticData.put(getKey("inventoryLevel"), arg);
        return this;
    }

    /**
    * A list of the quantities of the inventory items that can be stocked at this location.
    */

    public InventoryLevelConnection getInventoryLevels() {
        return (InventoryLevelConnection) get("inventoryLevels");
    }

    public Location setInventoryLevels(InventoryLevelConnection arg) {
        optimisticData.put(getKey("inventoryLevels"), arg);
        return this;
    }

    /**
    * Whether the location is active. A deactivated location can be activated (change `isActive: true`) if
    * it has
    * `activatable` set to `true` by calling the
    * [`locationActivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationActivate)
    * mutation.
    */

    public Boolean getIsActive() {
        return (Boolean) get("isActive");
    }

    public Location setIsActive(Boolean arg) {
        optimisticData.put(getKey("isActive"), arg);
        return this;
    }

    /**
    * Whether this location is a fulfillment service.
    */

    public Boolean getIsFulfillmentService() {
        return (Boolean) get("isFulfillmentService");
    }

    public Location setIsFulfillmentService(Boolean arg) {
        optimisticData.put(getKey("isFulfillmentService"), arg);
        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public Location setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * Local pickup settings for the location.
    */

    public DeliveryLocalPickupSettings getLocalPickupSettingsV2() {
        return (DeliveryLocalPickupSettings) get("localPickupSettingsV2");
    }

    public Location setLocalPickupSettingsV2(DeliveryLocalPickupSettings arg) {
        optimisticData.put(getKey("localPickupSettingsV2"), arg);
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

    public Location setMetafield(Metafield arg) {
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

    public Location setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The name of the location.
    */

    public String getName() {
        return (String) get("name");
    }

    public Location setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * Whether this location is used for calculating shipping rates. In multi-origin shipping mode, this
    * flag is ignored.
    */

    public Boolean getShipsInventory() {
        return (Boolean) get("shipsInventory");
    }

    public Location setShipsInventory(Boolean arg) {
        optimisticData.put(getKey("shipsInventory"), arg);
        return this;
    }

    /**
    * List of suggested addresses for this location (empty if none).
    */

    public List<LocationSuggestedAddress> getSuggestedAddresses() {
        return (List<LocationSuggestedAddress>) get("suggestedAddresses");
    }

    public Location setSuggestedAddresses(List<LocationSuggestedAddress> arg) {
        optimisticData.put(getKey("suggestedAddresses"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the location was
    * last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Location setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "activatable": return false;

            case "address": return true;

            case "addressVerified": return false;

            case "createdAt": return false;

            case "deactivatable": return false;

            case "deactivatedAt": return false;

            case "deletable": return false;

            case "fulfillmentService": return true;

            case "fulfillsOnlineOrders": return false;

            case "hasActiveInventory": return false;

            case "hasUnfulfilledOrders": return false;

            case "id": return false;

            case "inventoryLevel": return true;

            case "inventoryLevels": return true;

            case "isActive": return false;

            case "isFulfillmentService": return false;

            case "legacyResourceId": return false;

            case "localPickupSettingsV2": return true;

            case "metafield": return true;

            case "metafields": return true;

            case "name": return false;

            case "shipsInventory": return false;

            case "suggestedAddresses": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

