// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A shipping service and a list of countries that the service is available for.
*/
public class DeliveryAvailableService extends AbstractResponse<DeliveryAvailableService> {
    public DeliveryAvailableService() {
    }

    public DeliveryAvailableService(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "countries": {
                    responseData.put(key, new DeliveryCountryCodesOrRestOfWorld(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "name": {
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

    public String getGraphQlTypeName() {
        return "DeliveryAvailableService";
    }

    /**
    * The countries the service provider ships to.
    */

    public DeliveryCountryCodesOrRestOfWorld getCountries() {
        return (DeliveryCountryCodesOrRestOfWorld) get("countries");
    }

    public DeliveryAvailableService setCountries(DeliveryCountryCodesOrRestOfWorld arg) {
        optimisticData.put(getKey("countries"), arg);
        return this;
    }

    /**
    * The name of the service.
    */

    public String getName() {
        return (String) get("name");
    }

    public DeliveryAvailableService setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "countries": return true;

            case "name": return false;

            default: return false;
        }
    }
}

