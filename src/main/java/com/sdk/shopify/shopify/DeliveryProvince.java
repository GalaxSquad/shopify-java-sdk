// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A region that is used to define a shipping zone.
*/
public class DeliveryProvince extends AbstractResponse<DeliveryProvince> implements Node {
    public DeliveryProvince() {
    }

    public DeliveryProvince(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "translatedName": {
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

    public DeliveryProvince(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DeliveryProvince";
    }

    /**
    * The code of the region.
    */

    public String getCode() {
        return (String) get("code");
    }

    public DeliveryProvince setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The full name of the region.
    */

    public String getName() {
        return (String) get("name");
    }

    public DeliveryProvince setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The translated name of the region. The translation returned is based on the system's locale.
    */

    public String getTranslatedName() {
        return (String) get("translatedName");
    }

    public DeliveryProvince setTranslatedName(String arg) {
        optimisticData.put(getKey("translatedName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "id": return false;

            case "name": return false;

            case "translatedName": return false;

            default: return false;
        }
    }
}

