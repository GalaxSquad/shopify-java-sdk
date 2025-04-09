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
* A carrier service and the associated list of shop locations.
*/
public class DeliveryCarrierServiceAndLocations extends AbstractResponse<DeliveryCarrierServiceAndLocations> {
    public DeliveryCarrierServiceAndLocations() {
    }

    public DeliveryCarrierServiceAndLocations(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "carrierService": {
                    responseData.put(key, new DeliveryCarrierService(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "locations": {
                    List<Location> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Location(jsonAsObject(element1, key)));
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
        return "DeliveryCarrierServiceAndLocations";
    }

    /**
    * The carrier service.
    */

    public DeliveryCarrierService getCarrierService() {
        return (DeliveryCarrierService) get("carrierService");
    }

    public DeliveryCarrierServiceAndLocations setCarrierService(DeliveryCarrierService arg) {
        optimisticData.put(getKey("carrierService"), arg);
        return this;
    }

    /**
    * The list of locations that support this carrier service.
    */

    public List<Location> getLocations() {
        return (List<Location>) get("locations");
    }

    public DeliveryCarrierServiceAndLocations setLocations(List<Location> arg) {
        optimisticData.put(getKey("locations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "carrierService": return true;

            case "locations": return true;

            default: return false;
        }
    }
}

