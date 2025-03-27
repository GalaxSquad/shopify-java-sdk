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
* Represents a billing or shipping address for a company location.
*/
public class CompanyAddress extends AbstractResponse<CompanyAddress> implements Node {
    public CompanyAddress() {
    }

    public CompanyAddress(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "address1": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "companyName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
                    responseData.put(key, CountryCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "formattedAddress": {
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

                case "lastName": {
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

                case "recipient": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "zoneCode": {
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

    public CompanyAddress(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CompanyAddress";
    }

    /**
    * The first line of the address. Typically the street address or PO Box number.
    */

    public String getAddress1() {
        return (String) get("address1");
    }

    public CompanyAddress setAddress1(String arg) {
        optimisticData.put(getKey("address1"), arg);
        return this;
    }

    /**
    * The second line of the address. Typically the number of the apartment, suite, or unit.
    */

    public String getAddress2() {
        return (String) get("address2");
    }

    public CompanyAddress setAddress2(String arg) {
        optimisticData.put(getKey("address2"), arg);
        return this;
    }

    /**
    * The name of the city, district, village, or town.
    */

    public String getCity() {
        return (String) get("city");
    }

    public CompanyAddress setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
    * The name of the company.
    */

    public String getCompanyName() {
        return (String) get("companyName");
    }

    public CompanyAddress setCompanyName(String arg) {
        optimisticData.put(getKey("companyName"), arg);
        return this;
    }

    /**
    * The name of the country.
    */

    public String getCountry() {
        return (String) get("country");
    }

    public CompanyAddress setCountry(String arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
    * The two-letter code for the country of the address.
    * For example, US.
    */

    public CountryCode getCountryCode() {
        return (CountryCode) get("countryCode");
    }

    public CompanyAddress setCountryCode(CountryCode arg) {
        optimisticData.put(getKey("countryCode"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company
    * address was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public CompanyAddress setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The first name of the recipient.
    */

    public String getFirstName() {
        return (String) get("firstName");
    }

    public CompanyAddress setFirstName(String arg) {
        optimisticData.put(getKey("firstName"), arg);
        return this;
    }

    /**
    * The formatted version of the address.
    */

    public List<String> getFormattedAddress() {
        return (List<String>) get("formattedAddress");
    }

    public CompanyAddress setFormattedAddress(List<String> arg) {
        optimisticData.put(getKey("formattedAddress"), arg);
        return this;
    }

    /**
    * A comma-separated list of the values for city, province, and country.
    */

    public String getFormattedArea() {
        return (String) get("formattedArea");
    }

    public CompanyAddress setFormattedArea(String arg) {
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
    * The last name of the recipient.
    */

    public String getLastName() {
        return (String) get("lastName");
    }

    public CompanyAddress setLastName(String arg) {
        optimisticData.put(getKey("lastName"), arg);
        return this;
    }

    /**
    * A unique phone number for the customer.
    * Formatted using E.164 standard. For example, _+16135551111_.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public CompanyAddress setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The region of the address, such as the province, state, or district.
    */

    public String getProvince() {
        return (String) get("province");
    }

    public CompanyAddress setProvince(String arg) {
        optimisticData.put(getKey("province"), arg);
        return this;
    }

    /**
    * The identity of the recipient e.g. 'Receiving Department'.
    */

    public String getRecipient() {
        return (String) get("recipient");
    }

    public CompanyAddress setRecipient(String arg) {
        optimisticData.put(getKey("recipient"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company
    * address was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public CompanyAddress setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * The zip or postal code of the address.
    */

    public String getZip() {
        return (String) get("zip");
    }

    public CompanyAddress setZip(String arg) {
        optimisticData.put(getKey("zip"), arg);
        return this;
    }

    /**
    * The alphanumeric code for the region.
    * For example, ON.
    */

    public String getZoneCode() {
        return (String) get("zoneCode");
    }

    public CompanyAddress setZoneCode(String arg) {
        optimisticData.put(getKey("zoneCode"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address1": return false;

            case "address2": return false;

            case "city": return false;

            case "companyName": return false;

            case "country": return false;

            case "countryCode": return false;

            case "createdAt": return false;

            case "firstName": return false;

            case "formattedAddress": return false;

            case "formattedArea": return false;

            case "id": return false;

            case "lastName": return false;

            case "phone": return false;

            case "province": return false;

            case "recipient": return false;

            case "updatedAt": return false;

            case "zip": return false;

            case "zoneCode": return false;

            default: return false;
        }
    }
}

