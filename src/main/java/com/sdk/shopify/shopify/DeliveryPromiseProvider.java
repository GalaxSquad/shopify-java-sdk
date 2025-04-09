// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A delivery promise provider. Currently restricted to select approved delivery promise partners.
*/
public class DeliveryPromiseProvider extends AbstractResponse<DeliveryPromiseProvider> implements Node {
    public DeliveryPromiseProvider() {
    }

    public DeliveryPromiseProvider(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "active": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "fulfillmentDelay": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "location": {
                    responseData.put(key, new Location(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "timeZone": {
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

    public DeliveryPromiseProvider(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DeliveryPromiseProvider";
    }

    /**
    * Whether the delivery promise provider is active. Defaults to `true` when creating a provider.
    */

    public Boolean getActive() {
        return (Boolean) get("active");
    }

    public DeliveryPromiseProvider setActive(Boolean arg) {
        optimisticData.put(getKey("active"), arg);
        return this;
    }

    /**
    * The number of seconds to add to the current time as a buffer when looking up delivery promises.
    * Represents how long the shop requires before releasing an order to the fulfillment provider.
    */

    public Integer getFulfillmentDelay() {
        return (Integer) get("fulfillmentDelay");
    }

    public DeliveryPromiseProvider setFulfillmentDelay(Integer arg) {
        optimisticData.put(getKey("fulfillmentDelay"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The location associated with this delivery promise provider.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public DeliveryPromiseProvider setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * The time zone to be used for interpreting day of week and cutoff times in delivery schedules when
    * looking up delivery promises.
    */

    public String getTimeZone() {
        return (String) get("timeZone");
    }

    public DeliveryPromiseProvider setTimeZone(String arg) {
        optimisticData.put(getKey("timeZone"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "active": return false;

            case "fulfillmentDelay": return false;

            case "id": return false;

            case "location": return true;

            case "timeZone": return false;

            default: return false;
        }
    }
}

