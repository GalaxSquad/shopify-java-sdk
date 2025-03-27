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
* Relevant reference information for an alternate currency payout.
*/
public class ShopifyPaymentsToolingProviderPayout extends AbstractResponse<ShopifyPaymentsToolingProviderPayout> {
    public ShopifyPaymentsToolingProviderPayout() {
    }

    public ShopifyPaymentsToolingProviderPayout(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "arrivalDate": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currency": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "remoteId": {
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
        return "ShopifyPaymentsToolingProviderPayout";
    }

    /**
    * The balance amount the alternate currency payout was created for.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public ShopifyPaymentsToolingProviderPayout setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * A timestamp for the arrival of the alternate currency payout.
    */

    public String getArrivalDate() {
        return (String) get("arrivalDate");
    }

    public ShopifyPaymentsToolingProviderPayout setArrivalDate(String arg) {
        optimisticData.put(getKey("arrivalDate"), arg);
        return this;
    }

    /**
    * A timestamp for the creation of the alternate currency payout.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public ShopifyPaymentsToolingProviderPayout setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The currency alternate currency payout was created in.
    */

    public String getCurrency() {
        return (String) get("currency");
    }

    public ShopifyPaymentsToolingProviderPayout setCurrency(String arg) {
        optimisticData.put(getKey("currency"), arg);
        return this;
    }

    /**
    * The remote ID for the alternate currency payout.
    */

    public String getRemoteId() {
        return (String) get("remoteId");
    }

    public ShopifyPaymentsToolingProviderPayout setRemoteId(String arg) {
        optimisticData.put(getKey("remoteId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "arrivalDate": return false;

            case "createdAt": return false;

            case "currency": return false;

            case "remoteId": return false;

            default: return false;
        }
    }
}

