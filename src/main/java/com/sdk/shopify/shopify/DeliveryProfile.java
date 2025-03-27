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
* A shipping profile. In Shopify, a shipping profile is a set of shipping rates scoped to a set of
* products or variants that can be shipped from selected locations to zones. Learn more about
* [building with delivery
* profiles](https://shopify.dev/apps/build/purchase-options/deferred/delivery-and-deferment/build-deli
* very-profiles).
*/
public class DeliveryProfile extends AbstractResponse<DeliveryProfile> implements Node {
    public DeliveryProfile() {
    }

    public DeliveryProfile(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "activeMethodDefinitionsCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "default": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "legacyMode": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "locationsWithoutRatesCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "originLocationCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "productVariantsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "profileItems": {
                    responseData.put(key, new DeliveryProfileItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "profileLocationGroups": {
                    List<DeliveryProfileLocationGroup> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DeliveryProfileLocationGroup(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "sellingPlanGroups": {
                    responseData.put(key, new SellingPlanGroupConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "unassignedLocations": {
                    List<Location> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Location(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "unassignedLocationsPaginated": {
                    responseData.put(key, new LocationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "zoneCountryCount": {
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

    public DeliveryProfile(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DeliveryProfile";
    }

    /**
    * The number of active shipping rates for the profile.
    */

    public Integer getActiveMethodDefinitionsCount() {
        return (Integer) get("activeMethodDefinitionsCount");
    }

    public DeliveryProfile setActiveMethodDefinitionsCount(Integer arg) {
        optimisticData.put(getKey("activeMethodDefinitionsCount"), arg);
        return this;
    }

    /**
    * Whether this is the default profile.
    */

    public Boolean getDefault() {
        return (Boolean) get("default");
    }

    public DeliveryProfile setDefault(Boolean arg) {
        optimisticData.put(getKey("default"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether this shop has enabled legacy compatibility mode for delivery profiles.
    */

    public Boolean getLegacyMode() {
        return (Boolean) get("legacyMode");
    }

    public DeliveryProfile setLegacyMode(Boolean arg) {
        optimisticData.put(getKey("legacyMode"), arg);
        return this;
    }

    /**
    * The number of locations without rates defined.
    */

    public Integer getLocationsWithoutRatesCount() {
        return (Integer) get("locationsWithoutRatesCount");
    }

    public DeliveryProfile setLocationsWithoutRatesCount(Integer arg) {
        optimisticData.put(getKey("locationsWithoutRatesCount"), arg);
        return this;
    }

    /**
    * The name of the delivery profile.
    */

    public String getName() {
        return (String) get("name");
    }

    public DeliveryProfile setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The number of active origin locations for the profile.
    */

    public Integer getOriginLocationCount() {
        return (Integer) get("originLocationCount");
    }

    public DeliveryProfile setOriginLocationCount(Integer arg) {
        optimisticData.put(getKey("originLocationCount"), arg);
        return this;
    }

    /**
    * How many product variants are in this profile.
    */

    public Count getProductVariantsCount() {
        return (Count) get("productVariantsCount");
    }

    public DeliveryProfile setProductVariantsCount(Count arg) {
        optimisticData.put(getKey("productVariantsCount"), arg);
        return this;
    }

    /**
    * The products and variants associated with this profile.
    */

    public DeliveryProfileItemConnection getProfileItems() {
        return (DeliveryProfileItemConnection) get("profileItems");
    }

    public DeliveryProfile setProfileItems(DeliveryProfileItemConnection arg) {
        optimisticData.put(getKey("profileItems"), arg);
        return this;
    }

    /**
    * The location groups and associated zones using this profile.
    */

    public List<DeliveryProfileLocationGroup> getProfileLocationGroups() {
        return (List<DeliveryProfileLocationGroup>) get("profileLocationGroups");
    }

    public DeliveryProfile setProfileLocationGroups(List<DeliveryProfileLocationGroup> arg) {
        optimisticData.put(getKey("profileLocationGroups"), arg);
        return this;
    }

    /**
    * Selling plan groups associated with the specified delivery profile.
    */

    public SellingPlanGroupConnection getSellingPlanGroups() {
        return (SellingPlanGroupConnection) get("sellingPlanGroups");
    }

    public DeliveryProfile setSellingPlanGroups(SellingPlanGroupConnection arg) {
        optimisticData.put(getKey("sellingPlanGroups"), arg);
        return this;
    }

    /**
    * List of locations that haven't been assigned to a location group for this profile.
    */

    public List<Location> getUnassignedLocations() {
        return (List<Location>) get("unassignedLocations");
    }

    public DeliveryProfile setUnassignedLocations(List<Location> arg) {
        optimisticData.put(getKey("unassignedLocations"), arg);
        return this;
    }

    /**
    * List of locations that have not been assigned to a location group for this profile.
    */

    public LocationConnection getUnassignedLocationsPaginated() {
        return (LocationConnection) get("unassignedLocationsPaginated");
    }

    public DeliveryProfile setUnassignedLocationsPaginated(LocationConnection arg) {
        optimisticData.put(getKey("unassignedLocationsPaginated"), arg);
        return this;
    }

    /**
    * The number of countries with active rates to deliver to.
    */

    public Integer getZoneCountryCount() {
        return (Integer) get("zoneCountryCount");
    }

    public DeliveryProfile setZoneCountryCount(Integer arg) {
        optimisticData.put(getKey("zoneCountryCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "activeMethodDefinitionsCount": return false;

            case "default": return false;

            case "id": return false;

            case "legacyMode": return false;

            case "locationsWithoutRatesCount": return false;

            case "name": return false;

            case "originLocationCount": return false;

            case "productVariantsCount": return true;

            case "profileItems": return true;

            case "profileLocationGroups": return true;

            case "sellingPlanGroups": return true;

            case "unassignedLocations": return true;

            case "unassignedLocationsPaginated": return true;

            case "zoneCountryCount": return false;

            default: return false;
        }
    }
}

