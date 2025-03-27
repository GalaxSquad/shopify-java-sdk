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
* Represents a Subscription Billing Policy.
*/
public class SubscriptionBillingPolicy extends AbstractResponse<SubscriptionBillingPolicy> {
    public SubscriptionBillingPolicy() {
    }

    public SubscriptionBillingPolicy(JsonObject fields) throws SchemaViolationError {
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
        return "SubscriptionBillingPolicy";
    }

    /**
    * Specific anchor dates upon which the billing interval calculations should be made.
    */

    public List<SellingPlanAnchor> getAnchors() {
        return (List<SellingPlanAnchor>) get("anchors");
    }

    public SubscriptionBillingPolicy setAnchors(List<SellingPlanAnchor> arg) {
        optimisticData.put(getKey("anchors"), arg);
        return this;
    }

    /**
    * The kind of interval that's associated with this schedule (e.g. Monthly, Weekly, etc).
    */

    public SellingPlanInterval getInterval() {
        return (SellingPlanInterval) get("interval");
    }

    public SubscriptionBillingPolicy setInterval(SellingPlanInterval arg) {
        optimisticData.put(getKey("interval"), arg);
        return this;
    }

    /**
    * The number of billing intervals between invoices.
    */

    public Integer getIntervalCount() {
        return (Integer) get("intervalCount");
    }

    public SubscriptionBillingPolicy setIntervalCount(Integer arg) {
        optimisticData.put(getKey("intervalCount"), arg);
        return this;
    }

    /**
    * Maximum amount of cycles after which the subscription ends.
    */

    public Integer getMaxCycles() {
        return (Integer) get("maxCycles");
    }

    public SubscriptionBillingPolicy setMaxCycles(Integer arg) {
        optimisticData.put(getKey("maxCycles"), arg);
        return this;
    }

    /**
    * Minimum amount of cycles required in the subscription.
    */

    public Integer getMinCycles() {
        return (Integer) get("minCycles");
    }

    public SubscriptionBillingPolicy setMinCycles(Integer arg) {
        optimisticData.put(getKey("minCycles"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "anchors": return true;

            case "interval": return false;

            case "intervalCount": return false;

            case "maxCycles": return false;

            case "minCycles": return false;

            default: return false;
        }
    }
}

