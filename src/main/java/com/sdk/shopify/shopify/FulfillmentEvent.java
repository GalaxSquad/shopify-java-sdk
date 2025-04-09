// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The fulfillment event that describes the fulfilllment status at a particular time.
*/
public class FulfillmentEvent extends AbstractResponse<FulfillmentEvent> implements Node {
    public FulfillmentEvent() {
    }

    public FulfillmentEvent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "address1": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "city": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "country": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "happenedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "latitude": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "longitude": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "message": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "province": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, FulfillmentEventStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "zip": {
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

    public FulfillmentEvent(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "FulfillmentEvent";
    }

    /**
    * The street address where this fulfillment event occurred.
    */

    public String getAddress1() {
        return (String) get("address1");
    }

    public FulfillmentEvent setAddress1(String arg) {
        optimisticData.put(getKey("address1"), arg);
        return this;
    }

    /**
    * The city where this fulfillment event occurred.
    */

    public String getCity() {
        return (String) get("city");
    }

    public FulfillmentEvent setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
    * The country where this fulfillment event occurred.
    */

    public String getCountry() {
        return (String) get("country");
    }

    public FulfillmentEvent setCountry(String arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
    * The date and time when the fulfillment event was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public FulfillmentEvent setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The estimated delivery date and time of the fulfillment.
    */

    public String getEstimatedDeliveryAt() {
        return (String) get("estimatedDeliveryAt");
    }

    public FulfillmentEvent setEstimatedDeliveryAt(String arg) {
        optimisticData.put(getKey("estimatedDeliveryAt"), arg);
        return this;
    }

    /**
    * The time at which this fulfillment event happened.
    */

    public String getHappenedAt() {
        return (String) get("happenedAt");
    }

    public FulfillmentEvent setHappenedAt(String arg) {
        optimisticData.put(getKey("happenedAt"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The latitude where this fulfillment event occurred.
    */

    public Double getLatitude() {
        return (Double) get("latitude");
    }

    public FulfillmentEvent setLatitude(Double arg) {
        optimisticData.put(getKey("latitude"), arg);
        return this;
    }

    /**
    * The longitude where this fulfillment event occurred.
    */

    public Double getLongitude() {
        return (Double) get("longitude");
    }

    public FulfillmentEvent setLongitude(Double arg) {
        optimisticData.put(getKey("longitude"), arg);
        return this;
    }

    /**
    * A message associated with this fulfillment event.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public FulfillmentEvent setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
    * The province where this fulfillment event occurred.
    */

    public String getProvince() {
        return (String) get("province");
    }

    public FulfillmentEvent setProvince(String arg) {
        optimisticData.put(getKey("province"), arg);
        return this;
    }

    /**
    * The status of this fulfillment event.
    */

    public FulfillmentEventStatus getStatus() {
        return (FulfillmentEventStatus) get("status");
    }

    public FulfillmentEvent setStatus(FulfillmentEventStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The zip code of the location where this fulfillment event occurred.
    */

    public String getZip() {
        return (String) get("zip");
    }

    public FulfillmentEvent setZip(String arg) {
        optimisticData.put(getKey("zip"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address1": return false;

            case "city": return false;

            case "country": return false;

            case "createdAt": return false;

            case "estimatedDeliveryAt": return false;

            case "happenedAt": return false;

            case "id": return false;

            case "latitude": return false;

            case "longitude": return false;

            case "message": return false;

            case "province": return false;

            case "status": return false;

            case "zip": return false;

            default: return false;
        }
    }
}

