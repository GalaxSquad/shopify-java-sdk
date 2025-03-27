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
* Merchant approval for accelerated onboarding to channel integration apps.
*/
public class MerchantApprovalSignals extends AbstractResponse<MerchantApprovalSignals> {
    public MerchantApprovalSignals() {
    }

    public MerchantApprovalSignals(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "identityVerified": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "verifiedByShopify": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "verifiedByShopifyTier": {
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
        return "MerchantApprovalSignals";
    }

    /**
    * Whether the shop's Shopify Payments account identity is verified. Returns `false` if the identity is
    * unverified or if the shop doesn't have a Shopify Payments account.
    */

    public Boolean getIdentityVerified() {
        return (Boolean) get("identityVerified");
    }

    public MerchantApprovalSignals setIdentityVerified(Boolean arg) {
        optimisticData.put(getKey("identityVerified"), arg);
        return this;
    }

    /**
    * Whether Shopify has pre-verified the merchant's business for onboarding to channel integration apps.
    * Returns `false` if the shop isn't marked for verification.
    */

    public Boolean getVerifiedByShopify() {
        return (Boolean) get("verifiedByShopify");
    }

    public MerchantApprovalSignals setVerifiedByShopify(Boolean arg) {
        optimisticData.put(getKey("verifiedByShopify"), arg);
        return this;
    }

    /**
    * Which tier of the Shopify verification was determined for the merchant's business for onboarding to
    * channel integration apps.
    */

    public String getVerifiedByShopifyTier() {
        return (String) get("verifiedByShopifyTier");
    }

    public MerchantApprovalSignals setVerifiedByShopifyTier(String arg) {
        optimisticData.put(getKey("verifiedByShopifyTier"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "identityVerified": return false;

            case "verifiedByShopify": return false;

            case "verifiedByShopifyTier": return false;

            default: return false;
        }
    }
}

