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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `subscriptionDraftDiscountUpdate` mutation.
*/
public class SubscriptionDraftDiscountUpdatePayload extends AbstractResponse<SubscriptionDraftDiscountUpdatePayload> {
    public SubscriptionDraftDiscountUpdatePayload() {
    }

    public SubscriptionDraftDiscountUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "discountUpdated": {
                    SubscriptionManualDiscount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionManualDiscount(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draft": {
                    SubscriptionDraft optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionDraft(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<SubscriptionDraftUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SubscriptionDraftUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "SubscriptionDraftDiscountUpdatePayload";
    }

    /**
    * The updated Subscription Discount.
    */

    public SubscriptionManualDiscount getDiscountUpdated() {
        return (SubscriptionManualDiscount) get("discountUpdated");
    }

    public SubscriptionDraftDiscountUpdatePayload setDiscountUpdated(SubscriptionManualDiscount arg) {
        optimisticData.put(getKey("discountUpdated"), arg);
        return this;
    }

    /**
    * The Subscription Contract draft object.
    */

    public SubscriptionDraft getDraft() {
        return (SubscriptionDraft) get("draft");
    }

    public SubscriptionDraftDiscountUpdatePayload setDraft(SubscriptionDraft arg) {
        optimisticData.put(getKey("draft"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<SubscriptionDraftUserError> getUserErrors() {
        return (List<SubscriptionDraftUserError>) get("userErrors");
    }

    public SubscriptionDraftDiscountUpdatePayload setUserErrors(List<SubscriptionDraftUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discountUpdated": return true;

            case "draft": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

