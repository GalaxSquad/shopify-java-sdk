// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The address at which the fulfillment occurred. This object is intended for tax purposes, as a full
* address is required for tax providers to accurately calculate taxes. Typically this is the address
* of the warehouse or fulfillment center. To retrieve a fulfillment location's address, use the
* `assignedLocation` field on the
* [`FulfillmentOrder`](/docs/api/admin-graphql/latest/objects/FulfillmentOrder) object instead.
*/
public class FulfillmentOriginAddress extends AbstractResponse<FulfillmentOriginAddress> {
    public FulfillmentOriginAddress() {
    }

    public FulfillmentOriginAddress(JsonObject fields) throws SchemaViolationError {
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

                case "countryCode": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "FulfillmentOriginAddress";
    }

    /**
    * The street address of the fulfillment location.
    */

    public String getAddress1() {
        return (String) get("address1");
    }

    public FulfillmentOriginAddress setAddress1(String arg) {
        optimisticData.put(getKey("address1"), arg);
        return this;
    }

    /**
    * The second line of the address. Typically the number of the apartment, suite, or unit.
    */

    public String getAddress2() {
        return (String) get("address2");
    }

    public FulfillmentOriginAddress setAddress2(String arg) {
        optimisticData.put(getKey("address2"), arg);
        return this;
    }

    /**
    * The city in which the fulfillment location is located.
    */

    public String getCity() {
        return (String) get("city");
    }

    public FulfillmentOriginAddress setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
    * The country code of the fulfillment location.
    */

    public String getCountryCode() {
        return (String) get("countryCode");
    }

    public FulfillmentOriginAddress setCountryCode(String arg) {
        optimisticData.put(getKey("countryCode"), arg);
        return this;
    }

    /**
    * The province code of the fulfillment location.
    */

    public String getProvinceCode() {
        return (String) get("provinceCode");
    }

    public FulfillmentOriginAddress setProvinceCode(String arg) {
        optimisticData.put(getKey("provinceCode"), arg);
        return this;
    }

    /**
    * The zip code of the fulfillment location.
    */

    public String getZip() {
        return (String) get("zip");
    }

    public FulfillmentOriginAddress setZip(String arg) {
        optimisticData.put(getKey("zip"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address1": return false;

            case "address2": return false;

            case "city": return false;

            case "countryCode": return false;

            case "provinceCode": return false;

            case "zip": return false;

            default: return false;
        }
    }
}

