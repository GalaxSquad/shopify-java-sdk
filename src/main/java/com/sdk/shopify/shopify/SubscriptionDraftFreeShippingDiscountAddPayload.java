// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `subscriptionDraftFreeShippingDiscountAdd` mutation.
*/
public class SubscriptionDraftFreeShippingDiscountAddPayload extends AbstractResponse<SubscriptionDraftFreeShippingDiscountAddPayload> {
    public SubscriptionDraftFreeShippingDiscountAddPayload() {
    }

    public SubscriptionDraftFreeShippingDiscountAddPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "discountAdded": {
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
        return "SubscriptionDraftFreeShippingDiscountAddPayload";
    }

    /**
    * The added subscription free shipping discount.
    */

    public SubscriptionManualDiscount getDiscountAdded() {
        return (SubscriptionManualDiscount) get("discountAdded");
    }

    public SubscriptionDraftFreeShippingDiscountAddPayload setDiscountAdded(SubscriptionManualDiscount arg) {
        optimisticData.put(getKey("discountAdded"), arg);
        return this;
    }

    /**
    * The subscription contract draft object.
    */

    public SubscriptionDraft getDraft() {
        return (SubscriptionDraft) get("draft");
    }

    public SubscriptionDraftFreeShippingDiscountAddPayload setDraft(SubscriptionDraft arg) {
        optimisticData.put(getKey("draft"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<SubscriptionDraftUserError> getUserErrors() {
        return (List<SubscriptionDraftUserError>) get("userErrors");
    }

    public SubscriptionDraftFreeShippingDiscountAddPayload setUserErrors(List<SubscriptionDraftUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discountAdded": return true;

            case "draft": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

