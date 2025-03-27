// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* An address for a shop.
*/
public class ShopAddress extends AbstractResponse<ShopAddress> implements Node {
    public ShopAddress() {
    }

    public ShopAddress(JsonObject fields) throws SchemaViolationError {
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

                case "coordinatesValidated": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "countryCodeV2": {
                    CountryCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CountryCode.fromGraphQl(jsonAsString(field.getValue(), key));
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

                case "formattedArea": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

    public ShopAddress(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ShopAddress";
    }

    /**
    * The first line of the address. Typically the street address or PO Box number.
    */

    public String getAddress1() {
        return (String) get("address1");
    }

    public ShopAddress setAddress1(String arg) {
        optimisticData.put(getKey("address1"), arg);
        return this;
    }

    /**
    * The second line of the address. Typically the number of the apartment, suite, or unit.
    */

    public String getAddress2() {
        return (String) get("address2");
    }

    public ShopAddress setAddress2(String arg) {
        optimisticData.put(getKey("address2"), arg);
        return this;
    }

    /**
    * The name of the city, district, village, or town.
    */

    public String getCity() {
        return (String) get("city");
    }

    public ShopAddress setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
    * The name of the company or organization.
    */

    public String getCompany() {
        return (String) get("company");
    }

    public ShopAddress setCompany(String arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
    * Whether the address coordinates are valid.
    */

    public Boolean getCoordinatesValidated() {
        return (Boolean) get("coordinatesValidated");
    }

    public ShopAddress setCoordinatesValidated(Boolean arg) {
        optimisticData.put(getKey("coordinatesValidated"), arg);
        return this;
    }

    /**
    * The name of the country.
    */

    public String getCountry() {
        return (String) get("country");
    }

    public ShopAddress setCountry(String arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
    * The two-letter code for the country of the address.
    * For example, US.
    */

    public CountryCode getCountryCodeV2() {
        return (CountryCode) get("countryCodeV2");
    }

    public ShopAddress setCountryCodeV2(CountryCode arg) {
        optimisticData.put(getKey("countryCodeV2"), arg);
        return this;
    }

    /**
    * A formatted version of the address, customized by the provided arguments.
    */

    public List<String> getFormatted() {
        return (List<String>) get("formatted");
    }

    public ShopAddress setFormatted(List<String> arg) {
        optimisticData.put(getKey("formatted"), arg);
        return this;
    }

    /**
    * A comma-separated list of the values for city, province, and country.
    */

    public String getFormattedArea() {
        return (String) get("formattedArea");
    }

    public ShopAddress setFormattedArea(String arg) {
        optimisticData.put(getKey("formattedArea"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The latitude coordinate of the address.
    */

    public Double getLatitude() {
        return (Double) get("latitude");
    }

    public ShopAddress setLatitude(Double arg) {
        optimisticData.put(getKey("latitude"), arg);
        return this;
    }

    /**
    * The longitude coordinate of the address.
    */

    public Double getLongitude() {
        return (Double) get("longitude");
    }

    public ShopAddress setLongitude(Double arg) {
        optimisticData.put(getKey("longitude"), arg);
        return this;
    }

    /**
    * A phone number associated with the address.
    * Formatted using E.164 standard. For example, _+16135551111_.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public ShopAddress setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The region of the address, such as the province, state, or district.
    */

    public String getProvince() {
        return (String) get("province");
    }

    public ShopAddress setProvince(String arg) {
        optimisticData.put(getKey("province"), arg);
        return this;
    }

    /**
    * The alphanumeric code for the region.
    * For example, ON.
    */

    public String getProvinceCode() {
        return (String) get("provinceCode");
    }

    public ShopAddress setProvinceCode(String arg) {
        optimisticData.put(getKey("provinceCode"), arg);
        return this;
    }

    /**
    * The zip or postal code of the address.
    */

    public String getZip() {
        return (String) get("zip");
    }

    public ShopAddress setZip(String arg) {
        optimisticData.put(getKey("zip"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address1": return false;

            case "address2": return false;

            case "city": return false;

            case "company": return false;

            case "coordinatesValidated": return false;

            case "country": return false;

            case "countryCodeV2": return false;

            case "formatted": return false;

            case "formattedArea": return false;

            case "id": return false;

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

