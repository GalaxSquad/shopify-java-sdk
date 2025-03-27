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
* Return type for `subscriptionDraftLineRemove` mutation.
*/
public class SubscriptionDraftLineRemovePayload extends AbstractResponse<SubscriptionDraftLineRemovePayload> {
    public SubscriptionDraftLineRemovePayload() {
    }

    public SubscriptionDraftLineRemovePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "discountsUpdated": {
                    List<SubscriptionManualDiscount> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SubscriptionManualDiscount> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new SubscriptionManualDiscount(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
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

                case "lineRemoved": {
                    SubscriptionLine optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionLine(jsonAsObject(field.getValue(), key));
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
        return "SubscriptionDraftLineRemovePayload";
    }

    /**
    * The list of updated subscription discounts impacted by the removed line.
    */

    public List<SubscriptionManualDiscount> getDiscountsUpdated() {
        return (List<SubscriptionManualDiscount>) get("discountsUpdated");
    }

    public SubscriptionDraftLineRemovePayload setDiscountsUpdated(List<SubscriptionManualDiscount> arg) {
        optimisticData.put(getKey("discountsUpdated"), arg);
        return this;
    }

    /**
    * The Subscription Contract draft object.
    */

    public SubscriptionDraft getDraft() {
        return (SubscriptionDraft) get("draft");
    }

    public SubscriptionDraftLineRemovePayload setDraft(SubscriptionDraft arg) {
        optimisticData.put(getKey("draft"), arg);
        return this;
    }

    /**
    * The removed Subscription Line.
    */

    public SubscriptionLine getLineRemoved() {
        return (SubscriptionLine) get("lineRemoved");
    }

    public SubscriptionDraftLineRemovePayload setLineRemoved(SubscriptionLine arg) {
        optimisticData.put(getKey("lineRemoved"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<SubscriptionDraftUserError> getUserErrors() {
        return (List<SubscriptionDraftUserError>) get("userErrors");
    }

    public SubscriptionDraftLineRemovePayload setUserErrors(List<SubscriptionDraftUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discountsUpdated": return true;

            case "draft": return true;

            case "lineRemoved": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

