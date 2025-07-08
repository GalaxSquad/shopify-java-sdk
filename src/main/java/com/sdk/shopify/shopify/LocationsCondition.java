// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A condition checking the location that the visitor is shopping from.
*/
public class LocationsCondition extends AbstractResponse<LocationsCondition> {
    public LocationsCondition() {
    }

    public LocationsCondition(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "applicationLevel": {
                    MarketConditionApplicationType optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = MarketConditionApplicationType.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locations": {
                    responseData.put(key, new LocationConnection(jsonAsObject(field.getValue(), key)));

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
        return "LocationsCondition";
    }

    /**
    * The application level for the condition.
    */

    public MarketConditionApplicationType getApplicationLevel() {
        return (MarketConditionApplicationType) get("applicationLevel");
    }

    public LocationsCondition setApplicationLevel(MarketConditionApplicationType arg) {
        optimisticData.put(getKey("applicationLevel"), arg);
        return this;
    }

    /**
    * The locations that comprise the market.
    */

    public LocationConnection getLocations() {
        return (LocationConnection) get("locations");
    }

    public LocationsCondition setLocations(LocationConnection arg) {
        optimisticData.put(getKey("locations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "applicationLevel": return false;

            case "locations": return true;

            default: return false;
        }
    }
}

