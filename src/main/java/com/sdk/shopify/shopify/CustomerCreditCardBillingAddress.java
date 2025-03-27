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

import java.util.Map;

/**
* The billing address of a credit card payment instrument.
*/
public class CustomerCreditCardBillingAddress extends AbstractResponse<CustomerCreditCardBillingAddress> {
    public CustomerCreditCardBillingAddress() {
    }

    public CustomerCreditCardBillingAddress(JsonObject fields) throws SchemaViolationError {
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

                case "countryCode": {
                    CountryCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CountryCode.fromGraphQl(jsonAsString(field.getValue(), key));
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

                case "lastName": {
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
        return "CustomerCreditCardBillingAddress";
    }

    /**
    * The first line of the address. Typically the street address or PO Box number.
    */

    public String getAddress1() {
        return (String) get("address1");
    }

    public CustomerCreditCardBillingAddress setAddress1(String arg) {
        optimisticData.put(getKey("address1"), arg);
        return this;
    }

    /**
    * The name of the city, district, village, or town.
    */

    public String getCity() {
        return (String) get("city");
    }

    public CustomerCreditCardBillingAddress setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
    * The name of the country.
    */

    public String getCountry() {
        return (String) get("country");
    }

    public CustomerCreditCardBillingAddress setCountry(String arg) {
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

    public CustomerCreditCardBillingAddress setCountryCode(CountryCode arg) {
        optimisticData.put(getKey("countryCode"), arg);
        return this;
    }

    /**
    * The first name in the billing address.
    */

    public String getFirstName() {
        return (String) get("firstName");
    }

    public CustomerCreditCardBillingAddress setFirstName(String arg) {
        optimisticData.put(getKey("firstName"), arg);
        return this;
    }

    /**
    * The last name in the billing address.
    */

    public String getLastName() {
        return (String) get("lastName");
    }

    public CustomerCreditCardBillingAddress setLastName(String arg) {
        optimisticData.put(getKey("lastName"), arg);
        return this;
    }

    /**
    * The region of the address, such as the province, state, or district.
    */

    public String getProvince() {
        return (String) get("province");
    }

    public CustomerCreditCardBillingAddress setProvince(String arg) {
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

    public CustomerCreditCardBillingAddress setProvinceCode(String arg) {
        optimisticData.put(getKey("provinceCode"), arg);
        return this;
    }

    /**
    * The zip or postal code of the address.
    */

    public String getZip() {
        return (String) get("zip");
    }

    public CustomerCreditCardBillingAddress setZip(String arg) {
        optimisticData.put(getKey("zip"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address1": return false;

            case "city": return false;

            case "country": return false;

            case "countryCode": return false;

            case "firstName": return false;

            case "lastName": return false;

            case "province": return false;

            case "provinceCode": return false;

            case "zip": return false;

            default: return false;
        }
    }
}

