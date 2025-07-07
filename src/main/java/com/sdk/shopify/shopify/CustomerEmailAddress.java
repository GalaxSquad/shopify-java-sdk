// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
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

                case "marketingOptInLevel": {
                    CustomerMarketingOptInLevel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CustomerMarketingOptInLevel.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "marketingUpdatedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "sourceLocation": {
                    Location optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Location(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "validFormat": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
    * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
    * received when the marketing consent was updated.
    */

    public CustomerMarketingOptInLevel getMarketingOptInLevel() {
        return (CustomerMarketingOptInLevel) get("marketingOptInLevel");
    }

    public CustomerEmailAddress setMarketingOptInLevel(CustomerMarketingOptInLevel arg) {
        optimisticData.put(getKey("marketingOptInLevel"), arg);
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
    * The date and time at which the marketing consent was updated.
    * No date is provided if the email address never updated its marketing consent.
    */

    public String getMarketingUpdatedAt() {
        return (String) get("marketingUpdatedAt");
    }

    public CustomerEmailAddress setMarketingUpdatedAt(String arg) {
        optimisticData.put(getKey("marketingUpdatedAt"), arg);
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

    /**
    * The location where the customer consented to receive marketing material by email.
    */

    public Location getSourceLocation() {
        return (Location) get("sourceLocation");
    }

    public CustomerEmailAddress setSourceLocation(Location arg) {
        optimisticData.put(getKey("sourceLocation"), arg);
        return this;
    }

    /**
    * Whether the email address is formatted correctly.
    * Returns `true` when the email is formatted correctly. This doesn't guarantee that the email address
    * actually exists.
    */

    public Boolean getValidFormat() {
        return (Boolean) get("validFormat");
    }

    public CustomerEmailAddress setValidFormat(Boolean arg) {
        optimisticData.put(getKey("validFormat"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "emailAddress": return false;

            case "marketingOptInLevel": return false;

            case "marketingState": return false;

            case "marketingUnsubscribeUrl": return false;

            case "marketingUpdatedAt": return false;

            case "openTrackingLevel": return false;

            case "openTrackingUrl": return false;

            case "sourceLocation": return true;

            case "validFormat": return false;

            default: return false;
        }
    }
}

