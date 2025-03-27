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
* Presents all Shopify Payments specific information related to an order transaction.
*/
public class ShopifyPaymentsTransactionSet extends AbstractResponse<ShopifyPaymentsTransactionSet> {
    public ShopifyPaymentsTransactionSet() {
    }

    public ShopifyPaymentsTransactionSet(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "extendedAuthorizationSet": {
                    ShopifyPaymentsExtendedAuthorization optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsExtendedAuthorization(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "refundSet": {
                    ShopifyPaymentsRefundSet optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsRefundSet(jsonAsObject(field.getValue(), key));
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
        return "ShopifyPaymentsTransactionSet";
    }

    /**
    * Contains all fields related to an extended authorization.
    */

    public ShopifyPaymentsExtendedAuthorization getExtendedAuthorizationSet() {
        return (ShopifyPaymentsExtendedAuthorization) get("extendedAuthorizationSet");
    }

    public ShopifyPaymentsTransactionSet setExtendedAuthorizationSet(ShopifyPaymentsExtendedAuthorization arg) {
        optimisticData.put(getKey("extendedAuthorizationSet"), arg);
        return this;
    }

    /**
    * Contains all fields related to a refund.
    */

    public ShopifyPaymentsRefundSet getRefundSet() {
        return (ShopifyPaymentsRefundSet) get("refundSet");
    }

    public ShopifyPaymentsTransactionSet setRefundSet(ShopifyPaymentsRefundSet arg) {
        optimisticData.put(getKey("refundSet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "extendedAuthorizationSet": return true;

            case "refundSet": return true;

            default: return false;
        }
    }
}

