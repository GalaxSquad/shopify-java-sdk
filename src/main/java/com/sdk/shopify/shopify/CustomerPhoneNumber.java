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
                case "marketingCollectedFrom": {
                    CustomerConsentCollectedFrom optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CustomerConsentCollectedFrom.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
                    responseData.put(key, CustomerSmsMarketingState.fromGraphQl(jsonAsString(field.getValue(), key)));

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

                case "phoneNumber": {
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
    * The source from which the SMS marketing information for the customer was collected.
    */

    public CustomerConsentCollectedFrom getMarketingCollectedFrom() {
        return (CustomerConsentCollectedFrom) get("marketingCollectedFrom");
    }

    public CustomerPhoneNumber setMarketingCollectedFrom(CustomerConsentCollectedFrom arg) {
        optimisticData.put(getKey("marketingCollectedFrom"), arg);
        return this;
    }

    /**
    * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
    * received when the marketing consent was updated.
    */

    public CustomerMarketingOptInLevel getMarketingOptInLevel() {
        return (CustomerMarketingOptInLevel) get("marketingOptInLevel");
    }

    public CustomerPhoneNumber setMarketingOptInLevel(CustomerMarketingOptInLevel arg) {
        optimisticData.put(getKey("marketingOptInLevel"), arg);
        return this;
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
    * The date and time at which the marketing consent was updated.
    * No date is provided if the email address never updated its marketing consent.
    */

    public String getMarketingUpdatedAt() {
        return (String) get("marketingUpdatedAt");
    }

    public CustomerPhoneNumber setMarketingUpdatedAt(String arg) {
        optimisticData.put(getKey("marketingUpdatedAt"), arg);
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

    /**
    * The location where the customer consented to receive marketing material by SMS.
    */

    public Location getSourceLocation() {
        return (Location) get("sourceLocation");
    }

    public CustomerPhoneNumber setSourceLocation(Location arg) {
        optimisticData.put(getKey("sourceLocation"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "marketingCollectedFrom": return false;

            case "marketingOptInLevel": return false;

            case "marketingState": return false;

            case "marketingUpdatedAt": return false;

            case "phoneNumber": return false;

            case "sourceLocation": return true;

            default: return false;
        }
    }
}

