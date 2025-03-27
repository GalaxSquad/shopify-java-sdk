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
* Represents a recurring selling plan billing policy.
*/
public class SellingPlanRecurringBillingPolicy extends AbstractResponse<SellingPlanRecurringBillingPolicy> implements SellingPlanBillingPolicy {
    public SellingPlanRecurringBillingPolicy() {
    }

    public SellingPlanRecurringBillingPolicy(JsonObject fields) throws SchemaViolationError {
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

                case "interval": {
                    responseData.put(key, SellingPlanInterval.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "intervalCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "maxCycles": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "minCycles": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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
        return "SellingPlanRecurringBillingPolicy";
    }

    /**
    * Specific anchor dates upon which the billing interval calculations should be made.
    */

    public List<SellingPlanAnchor> getAnchors() {
        return (List<SellingPlanAnchor>) get("anchors");
    }

    public SellingPlanRecurringBillingPolicy setAnchors(List<SellingPlanAnchor> arg) {
        optimisticData.put(getKey("anchors"), arg);
        return this;
    }

    /**
    * The date and time when the selling plan billing policy was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public SellingPlanRecurringBillingPolicy setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The billing frequency, it can be either: day, week, month or year.
    */

    public SellingPlanInterval getInterval() {
        return (SellingPlanInterval) get("interval");
    }

    public SellingPlanRecurringBillingPolicy setInterval(SellingPlanInterval arg) {
        optimisticData.put(getKey("interval"), arg);
        return this;
    }

    /**
    * The number of intervals between billings.
    */

    public Integer getIntervalCount() {
        return (Integer) get("intervalCount");
    }

    public SellingPlanRecurringBillingPolicy setIntervalCount(Integer arg) {
        optimisticData.put(getKey("intervalCount"), arg);
        return this;
    }

    /**
    * Maximum number of billing iterations.
    */

    public Integer getMaxCycles() {
        return (Integer) get("maxCycles");
    }

    public SellingPlanRecurringBillingPolicy setMaxCycles(Integer arg) {
        optimisticData.put(getKey("maxCycles"), arg);
        return this;
    }

    /**
    * Minimum number of billing iterations.
    */

    public Integer getMinCycles() {
        return (Integer) get("minCycles");
    }

    public SellingPlanRecurringBillingPolicy setMinCycles(Integer arg) {
        optimisticData.put(getKey("minCycles"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "anchors": return true;

            case "createdAt": return false;

            case "interval": return false;

            case "intervalCount": return false;

            case "maxCycles": return false;

            case "minCycles": return false;

            default: return false;
        }
    }
}

