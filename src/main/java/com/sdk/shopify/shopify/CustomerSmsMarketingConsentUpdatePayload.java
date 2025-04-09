// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `customerSmsMarketingConsentUpdate` mutation.
*/
public class CustomerSmsMarketingConsentUpdatePayload extends AbstractResponse<CustomerSmsMarketingConsentUpdatePayload> {
    public CustomerSmsMarketingConsentUpdatePayload() {
    }

    public CustomerSmsMarketingConsentUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customer": {
                    Customer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Customer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<CustomerSmsMarketingConsentError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CustomerSmsMarketingConsentError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "CustomerSmsMarketingConsentUpdatePayload";
    }

    /**
    * The updated customer.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public CustomerSmsMarketingConsentUpdatePayload setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CustomerSmsMarketingConsentError> getUserErrors() {
        return (List<CustomerSmsMarketingConsentError>) get("userErrors");
    }

    public CustomerSmsMarketingConsentUpdatePayload setUserErrors(List<CustomerSmsMarketingConsentError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customer": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

