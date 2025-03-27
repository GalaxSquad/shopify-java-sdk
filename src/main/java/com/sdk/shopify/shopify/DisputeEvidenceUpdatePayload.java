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
* Return type for `disputeEvidenceUpdate` mutation.
*/
public class DisputeEvidenceUpdatePayload extends AbstractResponse<DisputeEvidenceUpdatePayload> {
    public DisputeEvidenceUpdatePayload() {
    }

    public DisputeEvidenceUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "disputeEvidence": {
                    ShopifyPaymentsDisputeEvidence optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsDisputeEvidence(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<DisputeEvidenceUpdateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DisputeEvidenceUpdateUserError(jsonAsObject(element1, key)));
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
        return "DisputeEvidenceUpdatePayload";
    }

    /**
    * The updated dispute evidence.
    */

    public ShopifyPaymentsDisputeEvidence getDisputeEvidence() {
        return (ShopifyPaymentsDisputeEvidence) get("disputeEvidence");
    }

    public DisputeEvidenceUpdatePayload setDisputeEvidence(ShopifyPaymentsDisputeEvidence arg) {
        optimisticData.put(getKey("disputeEvidence"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<DisputeEvidenceUpdateUserError> getUserErrors() {
        return (List<DisputeEvidenceUpdateUserError>) get("userErrors");
    }

    public DisputeEvidenceUpdatePayload setUserErrors(List<DisputeEvidenceUpdateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "disputeEvidence": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

