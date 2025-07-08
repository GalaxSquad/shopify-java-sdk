// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a contact field for a Shop Pay payment request.
*/
public class ShopPayPaymentRequestContactField extends AbstractResponse<ShopPayPaymentRequestContactField> {
    public ShopPayPaymentRequestContactField() {
    }

    public ShopPayPaymentRequestContactField(JsonObject fields) throws SchemaViolationError {
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
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "companyName": {
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

                case "email": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "firstName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "lastName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "postalCode": {
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
        return "ShopPayPaymentRequestContactField";
    }

    /**
    * The first address line of the contact field.
    */

    public String getAddress1() {
        return (String) get("address1");
    }

    public ShopPayPaymentRequestContactField setAddress1(String arg) {
        optimisticData.put(getKey("address1"), arg);
        return this;
    }

    /**
    * The second address line of the contact field.
    */

    public String getAddress2() {
        return (String) get("address2");
    }

    public ShopPayPaymentRequestContactField setAddress2(String arg) {
        optimisticData.put(getKey("address2"), arg);
        return this;
    }

    /**
    * The city of the contact field.
    */

    public String getCity() {
        return (String) get("city");
    }

    public ShopPayPaymentRequestContactField setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
    * The company name of the contact field.
    */

    public String getCompanyName() {
        return (String) get("companyName");
    }

    public ShopPayPaymentRequestContactField setCompanyName(String arg) {
        optimisticData.put(getKey("companyName"), arg);
        return this;
    }

    /**
    * The country of the contact field.
    */

    public String getCountryCode() {
        return (String) get("countryCode");
    }

    public ShopPayPaymentRequestContactField setCountryCode(String arg) {
        optimisticData.put(getKey("countryCode"), arg);
        return this;
    }

    /**
    * The email of the contact field.
    */

    public String getEmail() {
        return (String) get("email");
    }

    public ShopPayPaymentRequestContactField setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
    * The first name of the contact field.
    */

    public String getFirstName() {
        return (String) get("firstName");
    }

    public ShopPayPaymentRequestContactField setFirstName(String arg) {
        optimisticData.put(getKey("firstName"), arg);
        return this;
    }

    /**
    * The last name of the contact field.
    */

    public String getLastName() {
        return (String) get("lastName");
    }

    public ShopPayPaymentRequestContactField setLastName(String arg) {
        optimisticData.put(getKey("lastName"), arg);
        return this;
    }

    /**
    * The phone number of the contact field.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public ShopPayPaymentRequestContactField setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The postal code of the contact field.
    */

    public String getPostalCode() {
        return (String) get("postalCode");
    }

    public ShopPayPaymentRequestContactField setPostalCode(String arg) {
        optimisticData.put(getKey("postalCode"), arg);
        return this;
    }

    /**
    * The province of the contact field.
    */

    public String getProvinceCode() {
        return (String) get("provinceCode");
    }

    public ShopPayPaymentRequestContactField setProvinceCode(String arg) {
        optimisticData.put(getKey("provinceCode"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address1": return false;

            case "address2": return false;

            case "city": return false;

            case "companyName": return false;

            case "countryCode": return false;

            case "email": return false;

            case "firstName": return false;

            case "lastName": return false;

            case "phone": return false;

            case "postalCode": return false;

            case "provinceCode": return false;

            default: return false;
        }
    }
}

