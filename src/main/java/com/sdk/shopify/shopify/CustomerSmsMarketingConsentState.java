// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The record of when a customer consented to receive marketing material by SMS.
* The customer's consent state reflects the record with the most recent date when consent was updated.
*/
public class CustomerSmsMarketingConsentState extends AbstractResponse<CustomerSmsMarketingConsentState> {
    public CustomerSmsMarketingConsentState() {
    }

    public CustomerSmsMarketingConsentState(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "consentCollectedFrom": {
                    CustomerConsentCollectedFrom optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CustomerConsentCollectedFrom.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "consentUpdatedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingOptInLevel": {
                    responseData.put(key, CustomerMarketingOptInLevel.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "marketingState": {
                    responseData.put(key, CustomerSmsMarketingState.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "CustomerSmsMarketingConsentState";
    }

    /**
    * The source from which the SMS marketing information for the customer was collected.
    */

    public CustomerConsentCollectedFrom getConsentCollectedFrom() {
        return (CustomerConsentCollectedFrom) get("consentCollectedFrom");
    }

    public CustomerSmsMarketingConsentState setConsentCollectedFrom(CustomerConsentCollectedFrom arg) {
        optimisticData.put(getKey("consentCollectedFrom"), arg);
        return this;
    }

    /**
    * The date and time when the customer consented to receive marketing material by SMS.
    * If no date is provided, then the date and time when the consent information was sent is used.
    */

    public String getConsentUpdatedAt() {
        return (String) get("consentUpdatedAt");
    }

    public CustomerSmsMarketingConsentState setConsentUpdatedAt(String arg) {
        optimisticData.put(getKey("consentUpdatedAt"), arg);
        return this;
    }

    /**
    * The marketing subscription opt-in level that was set when the customer consented to receive
    * marketing information.
    */

    public CustomerMarketingOptInLevel getMarketingOptInLevel() {
        return (CustomerMarketingOptInLevel) get("marketingOptInLevel");
    }

    public CustomerSmsMarketingConsentState setMarketingOptInLevel(CustomerMarketingOptInLevel arg) {
        optimisticData.put(getKey("marketingOptInLevel"), arg);
        return this;
    }

    /**
    * The current SMS marketing state for the customer.
    */

    public CustomerSmsMarketingState getMarketingState() {
        return (CustomerSmsMarketingState) get("marketingState");
    }

    public CustomerSmsMarketingConsentState setMarketingState(CustomerSmsMarketingState arg) {
        optimisticData.put(getKey("marketingState"), arg);
        return this;
    }

    /**
    * The location where the customer consented to receive marketing material by SMS.
    */

    public Location getSourceLocation() {
        return (Location) get("sourceLocation");
    }

    public CustomerSmsMarketingConsentState setSourceLocation(Location arg) {
        optimisticData.put(getKey("sourceLocation"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "consentCollectedFrom": return false;

            case "consentUpdatedAt": return false;

            case "marketingOptInLevel": return false;

            case "marketingState": return false;

            case "sourceLocation": return true;

            default: return false;
        }
    }
}

