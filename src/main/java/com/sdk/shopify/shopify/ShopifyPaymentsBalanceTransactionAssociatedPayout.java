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
* The payout associated with a balance transaction.
*/
public class ShopifyPaymentsBalanceTransactionAssociatedPayout extends AbstractResponse<ShopifyPaymentsBalanceTransactionAssociatedPayout> {
    public ShopifyPaymentsBalanceTransactionAssociatedPayout() {
    }

    public ShopifyPaymentsBalanceTransactionAssociatedPayout(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    ShopifyPaymentsBalanceTransactionPayoutStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = ShopifyPaymentsBalanceTransactionPayoutStatus.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "ShopifyPaymentsBalanceTransactionAssociatedPayout";
    }

    /**
    * The ID of the payout associated with the balance transaction.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public ShopifyPaymentsBalanceTransactionAssociatedPayout setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The status of the payout associated with the balance transaction.
    */

    public ShopifyPaymentsBalanceTransactionPayoutStatus getStatus() {
        return (ShopifyPaymentsBalanceTransactionPayoutStatus) get("status");
    }

    public ShopifyPaymentsBalanceTransactionAssociatedPayout setStatus(ShopifyPaymentsBalanceTransactionPayoutStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "status": return false;

            default: return false;
        }
    }
}

