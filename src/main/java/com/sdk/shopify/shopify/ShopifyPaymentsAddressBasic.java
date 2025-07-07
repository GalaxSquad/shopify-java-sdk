// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A Shopify Payments address.
*/
public class ShopifyPaymentsAddressBasic extends AbstractResponse<ShopifyPaymentsAddressBasic> {
    public ShopifyPaymentsAddressBasic() {
    }

    public ShopifyPaymentsAddressBasic(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "addressLine1": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addressLine2": {
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

                case "postalCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "zone": {
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
        return "ShopifyPaymentsAddressBasic";
    }

    /**
    * Line 1 of the address.
    */

    public String getAddressLine1() {
        return (String) get("addressLine1");
    }

    public ShopifyPaymentsAddressBasic setAddressLine1(String arg) {
        optimisticData.put(getKey("addressLine1"), arg);
        return this;
    }

    /**
    * Line 2 of the address.
    */

    public String getAddressLine2() {
        return (String) get("addressLine2");
    }

    public ShopifyPaymentsAddressBasic setAddressLine2(String arg) {
        optimisticData.put(getKey("addressLine2"), arg);
        return this;
    }

    /**
    * The address city.
    */

    public String getCity() {
        return (String) get("city");
    }

    public ShopifyPaymentsAddressBasic setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
    * The address country.
    */

    public String getCountry() {
        return (String) get("country");
    }

    public ShopifyPaymentsAddressBasic setCountry(String arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
    * The address postal code.
    */

    public String getPostalCode() {
        return (String) get("postalCode");
    }

    public ShopifyPaymentsAddressBasic setPostalCode(String arg) {
        optimisticData.put(getKey("postalCode"), arg);
        return this;
    }

    /**
    * The address state/province/zone.
    */

    public String getZone() {
        return (String) get("zone");
    }

    public ShopifyPaymentsAddressBasic setZone(String arg) {
        optimisticData.put(getKey("zone"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "addressLine1": return false;

            case "addressLine2": return false;

            case "city": return false;

            case "country": return false;

            case "postalCode": return false;

            case "zone": return false;

            default: return false;
        }
    }
}

