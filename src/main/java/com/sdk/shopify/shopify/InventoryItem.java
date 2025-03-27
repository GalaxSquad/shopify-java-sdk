// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the goods available to be shipped to a customer.
* It holds essential information about the goods, including SKU and whether it is tracked.
* Learn [more about the relationships between inventory
* objects](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-qua
* ntities-states#inventory-object-relationships).
*/
public class InventoryItem extends AbstractResponse<InventoryItem> implements LegacyInteroperability, Node {
    public InventoryItem() {
    }

    public InventoryItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "countryCodeOfOrigin": {
                    CountryCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CountryCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "countryHarmonizedSystemCodes": {
                    responseData.put(key, new CountryHarmonizedSystemCodeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "duplicateSkuCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "harmonizedSystemCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "inventoryHistoryUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "locationsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "measurement": {
                    responseData.put(key, new InventoryItemMeasurement(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "provinceCodeOfOrigin": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "requiresShipping": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "sku": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tracked": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "trackedEditable": {
                    responseData.put(key, new EditableProperty(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "unitCost": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "variant": {
                    responseData.put(key, new ProductVariant(jsonAsObject(field.getValue(), key)));

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

    public InventoryItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "InventoryItem";
    }

    /**
    * The ISO 3166-1 alpha-2 country code of where the item originated from.
    */

    public CountryCode getCountryCodeOfOrigin() {
        return (CountryCode) get("countryCodeOfOrigin");
    }

    public InventoryItem setCountryCodeOfOrigin(CountryCode arg) {
        optimisticData.put(getKey("countryCodeOfOrigin"), arg);
        return this;
    }

    /**
    * A list of country specific harmonized system codes.
    */

    public CountryHarmonizedSystemCodeConnection getCountryHarmonizedSystemCodes() {
        return (CountryHarmonizedSystemCodeConnection) get("countryHarmonizedSystemCodes");
    }

    public InventoryItem setCountryHarmonizedSystemCodes(CountryHarmonizedSystemCodeConnection arg) {
        optimisticData.put(getKey("countryHarmonizedSystemCodes"), arg);
        return this;
    }

    /**
    * The date and time when the inventory item was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public InventoryItem setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The number of inventory items that share the same SKU with this item.
    */

    public Integer getDuplicateSkuCount() {
        return (Integer) get("duplicateSkuCount");
    }

    public InventoryItem setDuplicateSkuCount(Integer arg) {
        optimisticData.put(getKey("duplicateSkuCount"), arg);
        return this;
    }

    /**
    * The harmonized system code of the item. This must be a number between 6 and 13 digits.
    */

    public String getHarmonizedSystemCode() {
        return (String) get("harmonizedSystemCode");
    }

    public InventoryItem setHarmonizedSystemCode(String arg) {
        optimisticData.put(getKey("harmonizedSystemCode"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The URL that points to the inventory history for the item.
    */

    public String getInventoryHistoryUrl() {
        return (String) get("inventoryHistoryUrl");
    }

    public InventoryItem setInventoryHistoryUrl(String arg) {
        optimisticData.put(getKey("inventoryHistoryUrl"), arg);
        return this;
    }

    /**
    * The inventory item's quantities at the specified location.
    */

    public InventoryLevel getInventoryLevel() {
        return (InventoryLevel) get("inventoryLevel");
    }

    public InventoryItem setInventoryLevel(InventoryLevel arg) {
        optimisticData.put(getKey("inventoryLevel"), arg);
        return this;
    }

    /**
    * A list of the inventory item's quantities for each location that the inventory item can be stocked
    * at.
    */

    public InventoryLevelConnection getInventoryLevels() {
        return (InventoryLevelConnection) get("inventoryLevels");
    }

    public InventoryItem setInventoryLevels(InventoryLevelConnection arg) {
        optimisticData.put(getKey("inventoryLevels"), arg);
        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public InventoryItem setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The number of locations where this inventory item is stocked.
    */

    public Count getLocationsCount() {
        return (Count) get("locationsCount");
    }

    public InventoryItem setLocationsCount(Count arg) {
        optimisticData.put(getKey("locationsCount"), arg);
        return this;
    }

    /**
    * The packaging dimensions of the inventory item.
    */

    public InventoryItemMeasurement getMeasurement() {
        return (InventoryItemMeasurement) get("measurement");
    }

    public InventoryItem setMeasurement(InventoryItemMeasurement arg) {
        optimisticData.put(getKey("measurement"), arg);
        return this;
    }

    /**
    * The ISO 3166-2 alpha-2 province code of where the item originated from.
    */

    public String getProvinceCodeOfOrigin() {
        return (String) get("provinceCodeOfOrigin");
    }

    public InventoryItem setProvinceCodeOfOrigin(String arg) {
        optimisticData.put(getKey("provinceCodeOfOrigin"), arg);
        return this;
    }

    /**
    * Whether the inventory item requires shipping.
    */

    public Boolean getRequiresShipping() {
        return (Boolean) get("requiresShipping");
    }

    public InventoryItem setRequiresShipping(Boolean arg) {
        optimisticData.put(getKey("requiresShipping"), arg);
        return this;
    }

    /**
    * Inventory item SKU. Case-sensitive string.
    */

    public String getSku() {
        return (String) get("sku");
    }

    public InventoryItem setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    /**
    * Whether inventory levels are tracked for the item.
    */

    public Boolean getTracked() {
        return (Boolean) get("tracked");
    }

    public InventoryItem setTracked(Boolean arg) {
        optimisticData.put(getKey("tracked"), arg);
        return this;
    }

    /**
    * Whether the value of the `tracked` field for the inventory item can be changed.
    */

    public EditableProperty getTrackedEditable() {
        return (EditableProperty) get("trackedEditable");
    }

    public InventoryItem setTrackedEditable(EditableProperty arg) {
        optimisticData.put(getKey("trackedEditable"), arg);
        return this;
    }

    /**
    * Unit cost associated with the inventory item. Note: the user must have "View product costs"
    * permission granted in order to access this field once product granular permissions are enabled.
    */

    public MoneyV2 getUnitCost() {
        return (MoneyV2) get("unitCost");
    }

    public InventoryItem setUnitCost(MoneyV2 arg) {
        optimisticData.put(getKey("unitCost"), arg);
        return this;
    }

    /**
    * The date and time when the inventory item was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public InventoryItem setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * The variant that owns this inventory item.
    */

    public ProductVariant getVariant() {
        return (ProductVariant) get("variant");
    }

    public InventoryItem setVariant(ProductVariant arg) {
        optimisticData.put(getKey("variant"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "countryCodeOfOrigin": return false;

            case "countryHarmonizedSystemCodes": return true;

            case "createdAt": return false;

            case "duplicateSkuCount": return false;

            case "harmonizedSystemCode": return false;

            case "id": return false;

            case "inventoryHistoryUrl": return false;

            case "inventoryLevel": return true;

            case "inventoryLevels": return true;

            case "legacyResourceId": return false;

            case "locationsCount": return true;

            case "measurement": return true;

            case "provinceCodeOfOrigin": return false;

            case "requiresShipping": return false;

            case "sku": return false;

            case "tracked": return false;

            case "trackedEditable": return true;

            case "unitCost": return true;

            case "updatedAt": return false;

            case "variant": return true;

            default: return false;
        }
    }
}

