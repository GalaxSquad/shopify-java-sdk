// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The fields that can be used to override the default fields.
*/
public class CustomerMergePreviewAlternateFields extends AbstractResponse<CustomerMergePreviewAlternateFields> {
    public CustomerMergePreviewAlternateFields() {
    }

    public CustomerMergePreviewAlternateFields(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "defaultAddress": {
                    MailingAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MailingAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "email": {
                    CustomerEmailAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerEmailAddress(jsonAsObject(field.getValue(), key));
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

                case "phoneNumber": {
                    CustomerPhoneNumber optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPhoneNumber(jsonAsObject(field.getValue(), key));
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
        return "CustomerMergePreviewAlternateFields";
    }

    /**
    * The default address of a customer.
    */

    public MailingAddress getDefaultAddress() {
        return (MailingAddress) get("defaultAddress");
    }

    public CustomerMergePreviewAlternateFields setDefaultAddress(MailingAddress arg) {
        optimisticData.put(getKey("defaultAddress"), arg);
        return this;
    }

    /**
    * The email state of a customer.
    */

    public CustomerEmailAddress getEmail() {
        return (CustomerEmailAddress) get("email");
    }

    public CustomerMergePreviewAlternateFields setEmail(CustomerEmailAddress arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
    * The first name of a customer.
    */

    public String getFirstName() {
        return (String) get("firstName");
    }

    public CustomerMergePreviewAlternateFields setFirstName(String arg) {
        optimisticData.put(getKey("firstName"), arg);
        return this;
    }

    /**
    * The last name of a customer.
    */

    public String getLastName() {
        return (String) get("lastName");
    }

    public CustomerMergePreviewAlternateFields setLastName(String arg) {
        optimisticData.put(getKey("lastName"), arg);
        return this;
    }

    /**
    * The phone number state of a customer.
    */

    public CustomerPhoneNumber getPhoneNumber() {
        return (CustomerPhoneNumber) get("phoneNumber");
    }

    public CustomerMergePreviewAlternateFields setPhoneNumber(CustomerPhoneNumber arg) {
        optimisticData.put(getKey("phoneNumber"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "defaultAddress": return true;

            case "email": return true;

            case "firstName": return false;

            case "lastName": return false;

            case "phoneNumber": return true;

            default: return false;
        }
    }
}

