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
* Represents an email address.
*/
public class CustomerEmailAddress extends AbstractResponse<CustomerEmailAddress> {
    public CustomerEmailAddress() {
    }

    public CustomerEmailAddress(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "emailAddress": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "marketingState": {
                    responseData.put(key, CustomerEmailAddressMarketingState.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "marketingUnsubscribeUrl": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "openTrackingLevel": {
                    responseData.put(key, CustomerEmailAddressOpenTrackingLevel.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "openTrackingUrl": {
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
        return "CustomerEmailAddress";
    }

    /**
    * The customer's default email address.
    */

    public String getEmailAddress() {
        return (String) get("emailAddress");
    }

    public CustomerEmailAddress setEmailAddress(String arg) {
        optimisticData.put(getKey("emailAddress"), arg);
        return this;
    }

    /**
    * Whether the customer has subscribed to email marketing.
    */

    public CustomerEmailAddressMarketingState getMarketingState() {
        return (CustomerEmailAddressMarketingState) get("marketingState");
    }

    public CustomerEmailAddress setMarketingState(CustomerEmailAddressMarketingState arg) {
        optimisticData.put(getKey("marketingState"), arg);
        return this;
    }

    /**
    * The URL to unsubscribe a member from all mailing lists.
    */

    public String getMarketingUnsubscribeUrl() {
        return (String) get("marketingUnsubscribeUrl");
    }

    public CustomerEmailAddress setMarketingUnsubscribeUrl(String arg) {
        optimisticData.put(getKey("marketingUnsubscribeUrl"), arg);
        return this;
    }

    /**
    * Whether the customer has opted in to having their opened emails tracked.
    */

    public CustomerEmailAddressOpenTrackingLevel getOpenTrackingLevel() {
        return (CustomerEmailAddressOpenTrackingLevel) get("openTrackingLevel");
    }

    public CustomerEmailAddress setOpenTrackingLevel(CustomerEmailAddressOpenTrackingLevel arg) {
        optimisticData.put(getKey("openTrackingLevel"), arg);
        return this;
    }

    /**
    * The URL that can be used to opt a customer in or out of email open tracking.
    */

    public String getOpenTrackingUrl() {
        return (String) get("openTrackingUrl");
    }

    public CustomerEmailAddress setOpenTrackingUrl(String arg) {
        optimisticData.put(getKey("openTrackingUrl"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "emailAddress": return false;

            case "marketingState": return false;

            case "marketingUnsubscribeUrl": return false;

            case "openTrackingLevel": return false;

            case "openTrackingUrl": return false;

            default: return false;
        }
    }
}

