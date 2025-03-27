// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The record of when a customer consented to receive marketing material by email.
*/
public class CustomerEmailMarketingConsentState extends AbstractResponse<CustomerEmailMarketingConsentState> {
    public CustomerEmailMarketingConsentState() {
    }

    public CustomerEmailMarketingConsentState(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "consentUpdatedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
                    responseData.put(key, CustomerEmailMarketingState.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "CustomerEmailMarketingConsentState";
    }

    /**
    * The date and time at which the customer consented to receive marketing material by email.
    * The customer's consent state reflects the consent record with the most recent `consent_updated_at`
    * date.
    * If no date is provided, then the date and time at which the consent information was sent is used.
    */

    public String getConsentUpdatedAt() {
        return (String) get("consentUpdatedAt");
    }

    public CustomerEmailMarketingConsentState setConsentUpdatedAt(String arg) {
        optimisticData.put(getKey("consentUpdatedAt"), arg);
        return this;
    }

    /**
    * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
    * that the customer gave when they consented to receive marketing material by email.
    */

    public CustomerMarketingOptInLevel getMarketingOptInLevel() {
        return (CustomerMarketingOptInLevel) get("marketingOptInLevel");
    }

    public CustomerEmailMarketingConsentState setMarketingOptInLevel(CustomerMarketingOptInLevel arg) {
        optimisticData.put(getKey("marketingOptInLevel"), arg);
        return this;
    }

    /**
    * The current email marketing state for the customer.
    */

    public CustomerEmailMarketingState getMarketingState() {
        return (CustomerEmailMarketingState) get("marketingState");
    }

    public CustomerEmailMarketingConsentState setMarketingState(CustomerEmailMarketingState arg) {
        optimisticData.put(getKey("marketingState"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "consentUpdatedAt": return false;

            case "marketingOptInLevel": return false;

            case "marketingState": return false;

            default: return false;
        }
    }
}

