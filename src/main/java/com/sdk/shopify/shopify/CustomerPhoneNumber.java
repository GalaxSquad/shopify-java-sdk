// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A phone number.
*/
public class CustomerPhoneNumber extends AbstractResponse<CustomerPhoneNumber> {
    public CustomerPhoneNumber() {
    }

    public CustomerPhoneNumber(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "marketingState": {
                    responseData.put(key, CustomerSmsMarketingState.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "phoneNumber": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "CustomerPhoneNumber";
    }

    /**
    * Whether the customer has subscribed to SMS marketing material.
    */

    public CustomerSmsMarketingState getMarketingState() {
        return (CustomerSmsMarketingState) get("marketingState");
    }

    public CustomerPhoneNumber setMarketingState(CustomerSmsMarketingState arg) {
        optimisticData.put(getKey("marketingState"), arg);
        return this;
    }

    /**
    * A customer's phone number.
    */

    public String getPhoneNumber() {
        return (String) get("phoneNumber");
    }

    public CustomerPhoneNumber setPhoneNumber(String arg) {
        optimisticData.put(getKey("phoneNumber"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "marketingState": return false;

            case "phoneNumber": return false;

            default: return false;
        }
    }
}

