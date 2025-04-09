// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A subscription billing cycle.
*/
public class SubscriptionBillingCycle extends AbstractResponse<SubscriptionBillingCycle> {
    public SubscriptionBillingCycle() {
    }

    public SubscriptionBillingCycle(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "billingAttemptExpectedDate": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "billingAttempts": {
                    responseData.put(key, new SubscriptionBillingAttemptConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "cycleEndAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "cycleIndex": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "cycleStartAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "edited": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "editedContract": {
                    SubscriptionBillingCycleEditedContract optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycleEditedContract(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "skipped": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "sourceContract": {
                    responseData.put(key, new SubscriptionContract(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, SubscriptionBillingCycleBillingCycleStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "SubscriptionBillingCycle";
    }

    /**
    * The date on which the billing attempt is expected to be made.
    */

    public String getBillingAttemptExpectedDate() {
        return (String) get("billingAttemptExpectedDate");
    }

    public SubscriptionBillingCycle setBillingAttemptExpectedDate(String arg) {
        optimisticData.put(getKey("billingAttemptExpectedDate"), arg);
        return this;
    }

    /**
    * The list of billing attempts associated with the billing cycle.
    */

    public SubscriptionBillingAttemptConnection getBillingAttempts() {
        return (SubscriptionBillingAttemptConnection) get("billingAttempts");
    }

    public SubscriptionBillingCycle setBillingAttempts(SubscriptionBillingAttemptConnection arg) {
        optimisticData.put(getKey("billingAttempts"), arg);
        return this;
    }

    /**
    * The end date of the billing cycle.
    */

    public String getCycleEndAt() {
        return (String) get("cycleEndAt");
    }

    public SubscriptionBillingCycle setCycleEndAt(String arg) {
        optimisticData.put(getKey("cycleEndAt"), arg);
        return this;
    }

    /**
    * The index of the billing cycle.
    */

    public Integer getCycleIndex() {
        return (Integer) get("cycleIndex");
    }

    public SubscriptionBillingCycle setCycleIndex(Integer arg) {
        optimisticData.put(getKey("cycleIndex"), arg);
        return this;
    }

    /**
    * The start date of the billing cycle.
    */

    public String getCycleStartAt() {
        return (String) get("cycleStartAt");
    }

    public SubscriptionBillingCycle setCycleStartAt(String arg) {
        optimisticData.put(getKey("cycleStartAt"), arg);
        return this;
    }

    /**
    * Whether this billing cycle was edited.
    */

    public Boolean getEdited() {
        return (Boolean) get("edited");
    }

    public SubscriptionBillingCycle setEdited(Boolean arg) {
        optimisticData.put(getKey("edited"), arg);
        return this;
    }

    /**
    * The active edited contract for the billing cycle.
    */

    public SubscriptionBillingCycleEditedContract getEditedContract() {
        return (SubscriptionBillingCycleEditedContract) get("editedContract");
    }

    public SubscriptionBillingCycle setEditedContract(SubscriptionBillingCycleEditedContract arg) {
        optimisticData.put(getKey("editedContract"), arg);
        return this;
    }

    /**
    * Whether this billing cycle was skipped.
    */

    public Boolean getSkipped() {
        return (Boolean) get("skipped");
    }

    public SubscriptionBillingCycle setSkipped(Boolean arg) {
        optimisticData.put(getKey("skipped"), arg);
        return this;
    }

    /**
    * The subscription contract that the billing cycle belongs to.
    */

    public SubscriptionContract getSourceContract() {
        return (SubscriptionContract) get("sourceContract");
    }

    public SubscriptionBillingCycle setSourceContract(SubscriptionContract arg) {
        optimisticData.put(getKey("sourceContract"), arg);
        return this;
    }

    /**
    * The status of the billing cycle.
    */

    public SubscriptionBillingCycleBillingCycleStatus getStatus() {
        return (SubscriptionBillingCycleBillingCycleStatus) get("status");
    }

    public SubscriptionBillingCycle setStatus(SubscriptionBillingCycleBillingCycleStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "billingAttemptExpectedDate": return false;

            case "billingAttempts": return true;

            case "cycleEndAt": return false;

            case "cycleIndex": return false;

            case "cycleStartAt": return false;

            case "edited": return false;

            case "editedContract": return true;

            case "skipped": return false;

            case "sourceContract": return true;

            case "status": return false;

            default: return false;
        }
    }
}

