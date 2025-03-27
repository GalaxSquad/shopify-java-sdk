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
* Represents a recurring selling plan delivery policy.
*/
public class SellingPlanRecurringDeliveryPolicy extends AbstractResponse<SellingPlanRecurringDeliveryPolicy> implements SellingPlanDeliveryPolicy {
    public SellingPlanRecurringDeliveryPolicy() {
    }

    public SellingPlanRecurringDeliveryPolicy(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "anchors": {
                    List<SellingPlanAnchor> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SellingPlanAnchor(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "cutoff": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "intent": {
                    responseData.put(key, SellingPlanRecurringDeliveryPolicyIntent.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "interval": {
                    responseData.put(key, SellingPlanInterval.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "intervalCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "preAnchorBehavior": {
                    responseData.put(key, SellingPlanRecurringDeliveryPolicyPreAnchorBehavior.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "SellingPlanRecurringDeliveryPolicy";
    }

    /**
    * The specific anchor dates upon which the delivery interval calculations should be made.
    */

    public List<SellingPlanAnchor> getAnchors() {
        return (List<SellingPlanAnchor>) get("anchors");
    }

    public SellingPlanRecurringDeliveryPolicy setAnchors(List<SellingPlanAnchor> arg) {
        optimisticData.put(getKey("anchors"), arg);
        return this;
    }

    /**
    * The date and time when the selling plan delivery policy was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public SellingPlanRecurringDeliveryPolicy setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * Number of days which represent a buffer period for orders to be included in a cycle.
    */

    public Integer getCutoff() {
        return (Integer) get("cutoff");
    }

    public SellingPlanRecurringDeliveryPolicy setCutoff(Integer arg) {
        optimisticData.put(getKey("cutoff"), arg);
        return this;
    }

    /**
    * Whether the delivery policy is merchant or buyer-centric.
    * Buyer-centric delivery policies state the time when the buyer will receive the goods.
    * Merchant-centric delivery policies state the time when the fulfillment should be started.
    * Currently, only merchant-centric delivery policies are supported.
    */

    public SellingPlanRecurringDeliveryPolicyIntent getIntent() {
        return (SellingPlanRecurringDeliveryPolicyIntent) get("intent");
    }

    public SellingPlanRecurringDeliveryPolicy setIntent(SellingPlanRecurringDeliveryPolicyIntent arg) {
        optimisticData.put(getKey("intent"), arg);
        return this;
    }

    /**
    * The delivery frequency, it can be either: day, week, month or year.
    */

    public SellingPlanInterval getInterval() {
        return (SellingPlanInterval) get("interval");
    }

    public SellingPlanRecurringDeliveryPolicy setInterval(SellingPlanInterval arg) {
        optimisticData.put(getKey("interval"), arg);
        return this;
    }

    /**
    * The number of intervals between deliveries.
    */

    public Integer getIntervalCount() {
        return (Integer) get("intervalCount");
    }

    public SellingPlanRecurringDeliveryPolicy setIntervalCount(Integer arg) {
        optimisticData.put(getKey("intervalCount"), arg);
        return this;
    }

    /**
    * The fulfillment or delivery behavior of the first fulfillment when the order is placed before the
    * anchor. The default value for this field is `ASAP`.
    */

    public SellingPlanRecurringDeliveryPolicyPreAnchorBehavior getPreAnchorBehavior() {
        return (SellingPlanRecurringDeliveryPolicyPreAnchorBehavior) get("preAnchorBehavior");
    }

    public SellingPlanRecurringDeliveryPolicy setPreAnchorBehavior(SellingPlanRecurringDeliveryPolicyPreAnchorBehavior arg) {
        optimisticData.put(getKey("preAnchorBehavior"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "anchors": return true;

            case "createdAt": return false;

            case "cutoff": return false;

            case "intent": return false;

            case "interval": return false;

            case "intervalCount": return false;

            case "preAnchorBehavior": return false;

            default: return false;
        }
    }
}

