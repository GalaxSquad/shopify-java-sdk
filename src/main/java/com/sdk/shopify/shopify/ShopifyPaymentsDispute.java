// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A dispute occurs when a buyer questions the legitimacy of a charge with their financial institution.
*/
public class ShopifyPaymentsDispute extends AbstractResponse<ShopifyPaymentsDispute> implements LegacyInteroperability, Node {
    public ShopifyPaymentsDispute() {
    }

    public ShopifyPaymentsDispute(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "evidenceDueBy": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "evidenceSentOn": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "finalizedOn": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "initiatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "order": {
                    Order optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Order(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reasonDetails": {
                    responseData.put(key, new ShopifyPaymentsDisputeReasonDetails(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, DisputeStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "type": {
                    responseData.put(key, DisputeType.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public ShopifyPaymentsDispute(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ShopifyPaymentsDispute";
    }

    /**
    * The total amount disputed by the cardholder.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public ShopifyPaymentsDispute setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The deadline for evidence submission.
    */

    public String getEvidenceDueBy() {
        return (String) get("evidenceDueBy");
    }

    public ShopifyPaymentsDispute setEvidenceDueBy(String arg) {
        optimisticData.put(getKey("evidenceDueBy"), arg);
        return this;
    }

    /**
    * The date when evidence was sent. Returns null if evidence hasn't yet been sent.
    */

    public String getEvidenceSentOn() {
        return (String) get("evidenceSentOn");
    }

    public ShopifyPaymentsDispute setEvidenceSentOn(String arg) {
        optimisticData.put(getKey("evidenceSentOn"), arg);
        return this;
    }

    /**
    * The date when this dispute was resolved. Returns null if the dispute isn't yet resolved.
    */

    public String getFinalizedOn() {
        return (String) get("finalizedOn");
    }

    public ShopifyPaymentsDispute setFinalizedOn(String arg) {
        optimisticData.put(getKey("finalizedOn"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The date when this dispute was initiated.
    */

    public String getInitiatedAt() {
        return (String) get("initiatedAt");
    }

    public ShopifyPaymentsDispute setInitiatedAt(String arg) {
        optimisticData.put(getKey("initiatedAt"), arg);
        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public ShopifyPaymentsDispute setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The order that contains the charge that's under dispute.
    */

    public Order getOrder() {
        return (Order) get("order");
    }

    public ShopifyPaymentsDispute setOrder(Order arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
    * The reason of the dispute.
    */

    public ShopifyPaymentsDisputeReasonDetails getReasonDetails() {
        return (ShopifyPaymentsDisputeReasonDetails) get("reasonDetails");
    }

    public ShopifyPaymentsDispute setReasonDetails(ShopifyPaymentsDisputeReasonDetails arg) {
        optimisticData.put(getKey("reasonDetails"), arg);
        return this;
    }

    /**
    * The current state of the dispute.
    */

    public DisputeStatus getStatus() {
        return (DisputeStatus) get("status");
    }

    public ShopifyPaymentsDispute setStatus(DisputeStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * Indicates if this dispute is still in the inquiry phase or has turned into a chargeback.
    */

    public DisputeType getType() {
        return (DisputeType) get("type");
    }

    public ShopifyPaymentsDispute setType(DisputeType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "evidenceDueBy": return false;

            case "evidenceSentOn": return false;

            case "finalizedOn": return false;

            case "id": return false;

            case "initiatedAt": return false;

            case "legacyResourceId": return false;

            case "order": return true;

            case "reasonDetails": return true;

            case "status": return false;

            case "type": return false;

            default: return false;
        }
    }
}

