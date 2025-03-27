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
* A country that is used to define a shipping zone.
*/
public class DeliveryCountry extends AbstractResponse<DeliveryCountry> implements Node {
    public DeliveryCountry() {
    }

    public DeliveryCountry(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, new DeliveryCountryCodeOrRestOfWorld(jsonAsObject(field.getValue(), key)));

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

                case "provinces": {
                    List<DeliveryProvince> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DeliveryProvince(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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

    public DeliveryCountry(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DeliveryCountry";
    }

    /**
    * A two-letter country code in ISO 3166-1 alpha-2 standard.
    * It also includes a flag indicating whether the country should be
    * a part of the 'Rest Of World' shipping zone.
    */

    public DeliveryCountryCodeOrRestOfWorld getCode() {
        return (DeliveryCountryCodeOrRestOfWorld) get("code");
    }

    public DeliveryCountry setCode(DeliveryCountryCodeOrRestOfWorld arg) {
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
    * The full name of the country.
    */

    public String getName() {
        return (String) get("name");
    }

    public DeliveryCountry setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The list of regions associated with this country.
    */

    public List<DeliveryProvince> getProvinces() {
        return (List<DeliveryProvince>) get("provinces");
    }

    public DeliveryCountry setProvinces(List<DeliveryProvince> arg) {
        optimisticData.put(getKey("provinces"), arg);
        return this;
    }

    /**
    * The translated name of the country. The translation returned is based on the system's locale.
    */

    public String getTranslatedName() {
        return (String) get("translatedName");
    }

    public DeliveryCountry setTranslatedName(String arg) {
        optimisticData.put(getKey("translatedName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return true;

            case "id": return false;

            case "name": return false;

            case "provinces": return true;

            case "translatedName": return false;

            default: return false;
        }
    }
}

