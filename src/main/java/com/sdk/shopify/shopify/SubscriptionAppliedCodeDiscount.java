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
* Represents an applied code discount.
*/
public class SubscriptionAppliedCodeDiscount extends AbstractResponse<SubscriptionAppliedCodeDiscount> implements SubscriptionDiscount {
    public SubscriptionAppliedCodeDiscount() {
    }

    public SubscriptionAppliedCodeDiscount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "redeemCode": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "rejectionReason": {
                    SubscriptionDiscountRejectionReason optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = SubscriptionDiscountRejectionReason.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "SubscriptionAppliedCodeDiscount";
    }

    /**
    * The unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public SubscriptionAppliedCodeDiscount setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The redeem code of the discount that applies on the subscription.
    */

    public String getRedeemCode() {
        return (String) get("redeemCode");
    }

    public SubscriptionAppliedCodeDiscount setRedeemCode(String arg) {
        optimisticData.put(getKey("redeemCode"), arg);
        return this;
    }

    /**
    * The reason that the discount on the subscription draft is rejected.
    */

    public SubscriptionDiscountRejectionReason getRejectionReason() {
        return (SubscriptionDiscountRejectionReason) get("rejectionReason");
    }

    public SubscriptionAppliedCodeDiscount setRejectionReason(SubscriptionDiscountRejectionReason arg) {
        optimisticData.put(getKey("rejectionReason"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "redeemCode": return false;

            case "rejectionReason": return false;

            default: return false;
        }
    }
}

