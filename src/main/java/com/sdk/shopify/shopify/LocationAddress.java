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
* Represents the address of a location.
*/
public class LocationAddress extends AbstractResponse<LocationAddress> {
    public LocationAddress() {
    }

    public LocationAddress(JsonObject fields) throws SchemaViolationError {
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

                case "address2": {
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

                case "countryCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "formatted": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

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

                case "phone": {
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

                case "provinceCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

    public String getGraphQlTypeName() {
        return "LocationAddress";
    }

    /**
    * The first line of the address for the location.
    */

    public String getAddress1() {
        return (String) get("address1");
    }

    public LocationAddress setAddress1(String arg) {
        optimisticData.put(getKey("address1"), arg);
        return this;
    }

    /**
    * The second line of the address for the location.
    */

    public String getAddress2() {
        return (String) get("address2");
    }

    public LocationAddress setAddress2(String arg) {
        optimisticData.put(getKey("address2"), arg);
        return this;
    }

    /**
    * The city of the location.
    */

    public String getCity() {
        return (String) get("city");
    }

    public LocationAddress setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
    * The country of the location.
    */

    public String getCountry() {
        return (String) get("country");
    }

    public LocationAddress setCountry(String arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
    * The country code of the location.
    */

    public String getCountryCode() {
        return (String) get("countryCode");
    }

    public LocationAddress setCountryCode(String arg) {
        optimisticData.put(getKey("countryCode"), arg);
        return this;
    }

    /**
    * A formatted version of the address for the location.
    */

    public List<String> getFormatted() {
        return (List<String>) get("formatted");
    }

    public LocationAddress setFormatted(List<String> arg) {
        optimisticData.put(getKey("formatted"), arg);
        return this;
    }

    /**
    * The approximate latitude coordinates of the location.
    */

    public Double getLatitude() {
        return (Double) get("latitude");
    }

    public LocationAddress setLatitude(Double arg) {
        optimisticData.put(getKey("latitude"), arg);
        return this;
    }

    /**
    * The approximate longitude coordinates of the location.
    */

    public Double getLongitude() {
        return (Double) get("longitude");
    }

    public LocationAddress setLongitude(Double arg) {
        optimisticData.put(getKey("longitude"), arg);
        return this;
    }

    /**
    * The phone number of the location.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public LocationAddress setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The province of the location.
    */

    public String getProvince() {
        return (String) get("province");
    }

    public LocationAddress setProvince(String arg) {
        optimisticData.put(getKey("province"), arg);
        return this;
    }

    /**
    * The code for the province, state, or district of the address of the location.
    */

    public String getProvinceCode() {
        return (String) get("provinceCode");
    }

    public LocationAddress setProvinceCode(String arg) {
        optimisticData.put(getKey("provinceCode"), arg);
        return this;
    }

    /**
    * The ZIP code of the location.
    */

    public String getZip() {
        return (String) get("zip");
    }

    public LocationAddress setZip(String arg) {
        optimisticData.put(getKey("zip"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address1": return false;

            case "address2": return false;

            case "city": return false;

            case "country": return false;

            case "countryCode": return false;

            case "formatted": return false;

            case "latitude": return false;

            case "longitude": return false;

            case "phone": return false;

            case "province": return false;

            case "provinceCode": return false;

            case "zip": return false;

            default: return false;
        }
    }
}

