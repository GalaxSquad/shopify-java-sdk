// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Address extends AbstractResponse<Address> {
    public Address() {
    }

    public Address(JsonObject fields) throws SchemaViolationError {
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

                case "company": {
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

                case "firstName": {
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

                case "lastName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "Address";
    }

    public String getAddress1() {
        return (String) get("address1");
    }

    public Address setAddress1(String arg) {
        optimisticData.put(getKey("address1"), arg);
        return this;
    }

    public String getAddress2() {
        return (String) get("address2");
    }

    public Address setAddress2(String arg) {
        optimisticData.put(getKey("address2"), arg);
        return this;
    }

    public String getCity() {
        return (String) get("city");
    }

    public Address setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    public String getCompany() {
        return (String) get("company");
    }

    public Address setCompany(String arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    public String getCountry() {
        return (String) get("country");
    }

    public Address setCountry(String arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    public String getCountryCode() {
        return (String) get("countryCode");
    }

    public Address setCountryCode(String arg) {
        optimisticData.put(getKey("countryCode"), arg);
        return this;
    }

    public String getFirstName() {
        return (String) get("firstName");
    }

    public Address setFirstName(String arg) {
        optimisticData.put(getKey("firstName"), arg);
        return this;
    }

    public List<String> getFormatted() {
        return (List<String>) get("formatted");
    }

    public Address setFormatted(List<String> arg) {
        optimisticData.put(getKey("formatted"), arg);
        return this;
    }

    public String getLastName() {
        return (String) get("lastName");
    }

    public Address setLastName(String arg) {
        optimisticData.put(getKey("lastName"), arg);
        return this;
    }

    public Double getLatitude() {
        return (Double) get("latitude");
    }

    public Address setLatitude(Double arg) {
        optimisticData.put(getKey("latitude"), arg);
        return this;
    }

    public Double getLongitude() {
        return (Double) get("longitude");
    }

    public Address setLongitude(Double arg) {
        optimisticData.put(getKey("longitude"), arg);
        return this;
    }

    public String getName() {
        return (String) get("name");
    }

    public Address setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public String getPhone() {
        return (String) get("phone");
    }

    public Address setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    public String getProvince() {
        return (String) get("province");
    }

    public Address setProvince(String arg) {
        optimisticData.put(getKey("province"), arg);
        return this;
    }

    public String getProvinceCode() {
        return (String) get("provinceCode");
    }

    public Address setProvinceCode(String arg) {
        optimisticData.put(getKey("provinceCode"), arg);
        return this;
    }

    public String getZip() {
        return (String) get("zip");
    }

    public Address setZip(String arg) {
        optimisticData.put(getKey("zip"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address1": return false;

            case "address2": return false;

            case "city": return false;

            case "company": return false;

            case "country": return false;

            case "countryCode": return false;

            case "firstName": return false;

            case "formatted": return false;

            case "lastName": return false;

            case "latitude": return false;

            case "longitude": return false;

            case "name": return false;

            case "phone": return false;

            case "province": return false;

            case "provinceCode": return false;

            case "zip": return false;

            default: return false;
        }
    }
}

