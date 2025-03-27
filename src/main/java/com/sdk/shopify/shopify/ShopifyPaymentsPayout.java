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
* Payouts represent the movement of money between a merchant's Shopify
* Payments balance and their bank account.
*/
public class ShopifyPaymentsPayout extends AbstractResponse<ShopifyPaymentsPayout> implements LegacyInteroperability, Node {
    public ShopifyPaymentsPayout() {
    }

    public ShopifyPaymentsPayout(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "businessEntity": {
                    responseData.put(key, new BusinessEntity(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "issuedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "net": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, ShopifyPaymentsPayoutStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "summary": {
                    responseData.put(key, new ShopifyPaymentsPayoutSummary(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "transactionType": {
                    responseData.put(key, ShopifyPaymentsPayoutTransactionType.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public ShopifyPaymentsPayout(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ShopifyPaymentsPayout";
    }

    /**
    * The business entity associated with the payout.
    */

    public BusinessEntity getBusinessEntity() {
        return (BusinessEntity) get("businessEntity");
    }

    public ShopifyPaymentsPayout setBusinessEntity(BusinessEntity arg) {
        optimisticData.put(getKey("businessEntity"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The exact time when the payout was issued. The payout only contains
    * balance transactions that were available at this time.
    */

    public String getIssuedAt() {
        return (String) get("issuedAt");
    }

    public ShopifyPaymentsPayout setIssuedAt(String arg) {
        optimisticData.put(getKey("issuedAt"), arg);
        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public ShopifyPaymentsPayout setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The total amount and currency of the payout.
    */

    public MoneyV2 getNet() {
        return (MoneyV2) get("net");
    }

    public ShopifyPaymentsPayout setNet(MoneyV2 arg) {
        optimisticData.put(getKey("net"), arg);
        return this;
    }

    /**
    * The transfer status of the payout.
    */

    public ShopifyPaymentsPayoutStatus getStatus() {
        return (ShopifyPaymentsPayoutStatus) get("status");
    }

    public ShopifyPaymentsPayout setStatus(ShopifyPaymentsPayoutStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The summary of the payout.
    */

    public ShopifyPaymentsPayoutSummary getSummary() {
        return (ShopifyPaymentsPayoutSummary) get("summary");
    }

    public ShopifyPaymentsPayout setSummary(ShopifyPaymentsPayoutSummary arg) {
        optimisticData.put(getKey("summary"), arg);
        return this;
    }

    /**
    * The direction of the payout.
    */

    public ShopifyPaymentsPayoutTransactionType getTransactionType() {
        return (ShopifyPaymentsPayoutTransactionType) get("transactionType");
    }

    public ShopifyPaymentsPayout setTransactionType(ShopifyPaymentsPayoutTransactionType arg) {
        optimisticData.put(getKey("transactionType"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "businessEntity": return true;

            case "id": return false;

            case "issuedAt": return false;

            case "legacyResourceId": return false;

            case "net": return true;

            case "status": return false;

            case "summary": return true;

            case "transactionType": return false;

            default: return false;
        }
    }
}

