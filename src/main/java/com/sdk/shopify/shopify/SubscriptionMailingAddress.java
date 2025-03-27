// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a Mailing Address on a Subscription.
*/
public class SubscriptionMailingAddress extends AbstractResponse<SubscriptionMailingAddress> {
    public SubscriptionMailingAddress() {
    }

    public SubscriptionMailingAddress(JsonObject fields) throws SchemaViolationError {
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
        return "SubscriptionMailingAddress";
    }

    /**
    * The first line of the address. Typically the street address or PO Box number.
    */

    public String getAddress1() {
        return (String) get("address1");
    }

    public SubscriptionMailingAddress setAddress1(String arg) {
        optimisticData.put(getKey("address1"), arg);
        return this;
    }

    /**
    * The second line of the address. Typically the number of the apartment, suite, or unit.
    */

    public String getAddress2() {
        return (String) get("address2");
    }

    public SubscriptionMailingAddress setAddress2(String arg) {
        optimisticData.put(getKey("address2"), arg);
        return this;
    }

    /**
    * The name of the city, district, village, or town.
    */

    public String getCity() {
        return (String) get("city");
    }

    public SubscriptionMailingAddress setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
    * The name of the customer's company or organization.
    */

    public String getCompany() {
        return (String) get("company");
    }

    public SubscriptionMailingAddress setCompany(String arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
    * The name of the country.
    */

    public String getCountry() {
        return (String) get("country");
    }

    public SubscriptionMailingAddress setCountry(String arg) {
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

    public SubscriptionMailingAddress setCountryCode(CountryCode arg) {
        optimisticData.put(getKey("countryCode"), arg);
        return this;
    }

    /**
    * The first name of the customer.
    */

    public String getFirstName() {
        return (String) get("firstName");
    }

    public SubscriptionMailingAddress setFirstName(String arg) {
        optimisticData.put(getKey("firstName"), arg);
        return this;
    }

    /**
    * The last name of the customer.
    */

    public String getLastName() {
        return (String) get("lastName");
    }

    public SubscriptionMailingAddress setLastName(String arg) {
        optimisticData.put(getKey("lastName"), arg);
        return this;
    }

    /**
    * The full name of the customer, based on firstName and lastName.
    */

    public String getName() {
        return (String) get("name");
    }

    public SubscriptionMailingAddress setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * A unique phone number for the customer. Formatted using E.164 standard. For example, _+16135551111_.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public SubscriptionMailingAddress setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The region of the address, such as the province, state, or district.
    */

    public String getProvince() {
        return (String) get("province");
    }

    public SubscriptionMailingAddress setProvince(String arg) {
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

    public SubscriptionMailingAddress setProvinceCode(String arg) {
        optimisticData.put(getKey("provinceCode"), arg);
        return this;
    }

    /**
    * The zip or postal code of the address.
    */

    public String getZip() {
        return (String) get("zip");
    }

    public SubscriptionMailingAddress setZip(String arg) {
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

            case "lastName": return false;

            case "name": return false;

            case "phone": return false;

            case "province": return false;

            case "provinceCode": return false;

            case "zip": return false;

            default: return false;
        }
    }
}

