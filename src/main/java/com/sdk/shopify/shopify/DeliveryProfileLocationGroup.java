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
* Links a location group with zones. Both are associated to a delivery profile.
*/
public class DeliveryProfileLocationGroup extends AbstractResponse<DeliveryProfileLocationGroup> {
    public DeliveryProfileLocationGroup() {
    }

    public DeliveryProfileLocationGroup(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "countriesInAnyZone": {
                    List<DeliveryCountryAndZone> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DeliveryCountryAndZone(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "locationGroup": {
                    responseData.put(key, new DeliveryLocationGroup(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "locationGroupZones": {
                    responseData.put(key, new DeliveryLocationGroupZoneConnection(jsonAsObject(field.getValue(), key)));

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
        return "DeliveryProfileLocationGroup";
    }

    /**
    * The countries already selected in any zone for the specified location group.
    */

    public List<DeliveryCountryAndZone> getCountriesInAnyZone() {
        return (List<DeliveryCountryAndZone>) get("countriesInAnyZone");
    }

    public DeliveryProfileLocationGroup setCountriesInAnyZone(List<DeliveryCountryAndZone> arg) {
        optimisticData.put(getKey("countriesInAnyZone"), arg);
        return this;
    }

    /**
    * The collection of locations that make up the specified location group.
    */

    public DeliveryLocationGroup getLocationGroup() {
        return (DeliveryLocationGroup) get("locationGroup");
    }

    public DeliveryProfileLocationGroup setLocationGroup(DeliveryLocationGroup arg) {
        optimisticData.put(getKey("locationGroup"), arg);
        return this;
    }

    /**
    * The applicable zones associated to the specified location group.
    */

    public DeliveryLocationGroupZoneConnection getLocationGroupZones() {
        return (DeliveryLocationGroupZoneConnection) get("locationGroupZones");
    }

    public DeliveryProfileLocationGroup setLocationGroupZones(DeliveryLocationGroupZoneConnection arg) {
        optimisticData.put(getKey("locationGroupZones"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "countriesInAnyZone": return true;

            case "locationGroup": return true;

            case "locationGroupZones": return true;

            default: return false;
        }
    }
}

