// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the destination where the items should be sent upon fulfillment.
*/
public class FulfillmentOrderDestination extends AbstractResponse<FulfillmentOrderDestination> implements Node {
    public FulfillmentOrderDestination() {
    }

    public FulfillmentOrderDestination(JsonObject fields) throws SchemaViolationError {
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

                case "countryCode": {
                    CountryCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CountryCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "email": {
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

                case "location": {
                    Location optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Location(jsonAsObject(field.getValue(), key));
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

    public FulfillmentOrderDestination(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "FulfillmentOrderDestination";
    }

    /**
    * The first line of the address of the destination.
    */

    public String getAddress1() {
        return (String) get("address1");
    }

    public FulfillmentOrderDestination setAddress1(String arg) {
        optimisticData.put(getKey("address1"), arg);
        return this;
    }

    /**
    * The second line of the address of the destination.
    */

    public String getAddress2() {
        return (String) get("address2");
    }

    public FulfillmentOrderDestination setAddress2(String arg) {
        optimisticData.put(getKey("address2"), arg);
        return this;
    }

    /**
    * The city of the destination.
    */

    public String getCity() {
        return (String) get("city");
    }

    public FulfillmentOrderDestination setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
    * The company of the destination.
    */

    public String getCompany() {
        return (String) get("company");
    }

    public FulfillmentOrderDestination setCompany(String arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
    * The two-letter country code of the destination.
    */

    public CountryCode getCountryCode() {
        return (CountryCode) get("countryCode");
    }

    public FulfillmentOrderDestination setCountryCode(CountryCode arg) {
        optimisticData.put(getKey("countryCode"), arg);
        return this;
    }

    /**
    * The email of the customer at the destination.
    */

    public String getEmail() {
        return (String) get("email");
    }

    public FulfillmentOrderDestination setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
    * The first name of the customer at the destination.
    */

    public String getFirstName() {
        return (String) get("firstName");
    }

    public FulfillmentOrderDestination setFirstName(String arg) {
        optimisticData.put(getKey("firstName"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The last name of the customer at the destination.
    */

    public String getLastName() {
        return (String) get("lastName");
    }

    public FulfillmentOrderDestination setLastName(String arg) {
        optimisticData.put(getKey("lastName"), arg);
        return this;
    }

    /**
    * The location designated for the pick-up of the fulfillment order.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public FulfillmentOrderDestination setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * The phone number of the customer at the destination.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public FulfillmentOrderDestination setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The province of the destination.
    */

    public String getProvince() {
        return (String) get("province");
    }

    public FulfillmentOrderDestination setProvince(String arg) {
        optimisticData.put(getKey("province"), arg);
        return this;
    }

    /**
    * The ZIP code of the destination.
    */

    public String getZip() {
        return (String) get("zip");
    }

    public FulfillmentOrderDestination setZip(String arg) {
        optimisticData.put(getKey("zip"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address1": return false;

            case "address2": return false;

            case "city": return false;

            case "company": return false;

            case "countryCode": return false;

            case "email": return false;

            case "firstName": return false;

            case "id": return false;

            case "lastName": return false;

            case "location": return true;

            case "phone": return false;

            case "province": return false;

            case "zip": return false;

            default: return false;
        }
    }
}

