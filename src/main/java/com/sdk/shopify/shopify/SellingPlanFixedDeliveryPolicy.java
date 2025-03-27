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
* Represents a fixed selling plan delivery policy.
*/
public class SellingPlanFixedDeliveryPolicy extends AbstractResponse<SellingPlanFixedDeliveryPolicy> implements SellingPlanDeliveryPolicy {
    public SellingPlanFixedDeliveryPolicy() {
    }

    public SellingPlanFixedDeliveryPolicy(JsonObject fields) throws SchemaViolationError {
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

                case "cutoff": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentExactTime": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentTrigger": {
                    responseData.put(key, SellingPlanFulfillmentTrigger.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "intent": {
                    responseData.put(key, SellingPlanFixedDeliveryPolicyIntent.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "preAnchorBehavior": {
                    responseData.put(key, SellingPlanFixedDeliveryPolicyPreAnchorBehavior.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "SellingPlanFixedDeliveryPolicy";
    }

    /**
    * The specific anchor dates upon which the delivery interval calculations should be made.
    */

    public List<SellingPlanAnchor> getAnchors() {
        return (List<SellingPlanAnchor>) get("anchors");
    }

    public SellingPlanFixedDeliveryPolicy setAnchors(List<SellingPlanAnchor> arg) {
        optimisticData.put(getKey("anchors"), arg);
        return this;
    }

    /**
    * A buffer period for orders to be included in next fulfillment anchor.
    */

    public Integer getCutoff() {
        return (Integer) get("cutoff");
    }

    public SellingPlanFixedDeliveryPolicy setCutoff(Integer arg) {
        optimisticData.put(getKey("cutoff"), arg);
        return this;
    }

    /**
    * The date and time when the fulfillment should trigger.
    */

    public String getFulfillmentExactTime() {
        return (String) get("fulfillmentExactTime");
    }

    public SellingPlanFixedDeliveryPolicy setFulfillmentExactTime(String arg) {
        optimisticData.put(getKey("fulfillmentExactTime"), arg);
        return this;
    }

    /**
    * What triggers the fulfillment. The value must be one of ANCHOR, ASAP, EXACT_TIME, or UNKNOWN.
    */

    public SellingPlanFulfillmentTrigger getFulfillmentTrigger() {
        return (SellingPlanFulfillmentTrigger) get("fulfillmentTrigger");
    }

    public SellingPlanFixedDeliveryPolicy setFulfillmentTrigger(SellingPlanFulfillmentTrigger arg) {
        optimisticData.put(getKey("fulfillmentTrigger"), arg);
        return this;
    }

    /**
    * Whether the delivery policy is merchant or buyer-centric.
    * Buyer-centric delivery policies state the time when the buyer will receive the goods.
    * Merchant-centric delivery policies state the time when the fulfillment should be started.
    * Currently, only merchant-centric delivery policies are supported.
    */

    public SellingPlanFixedDeliveryPolicyIntent getIntent() {
        return (SellingPlanFixedDeliveryPolicyIntent) get("intent");
    }

    public SellingPlanFixedDeliveryPolicy setIntent(SellingPlanFixedDeliveryPolicyIntent arg) {
        optimisticData.put(getKey("intent"), arg);
        return this;
    }

    /**
    * The fulfillment or delivery behavior of the first fulfillment when the order is placed before the
    * anchor. The default value for this field is `ASAP`.
    */

    public SellingPlanFixedDeliveryPolicyPreAnchorBehavior getPreAnchorBehavior() {
        return (SellingPlanFixedDeliveryPolicyPreAnchorBehavior) get("preAnchorBehavior");
    }

    public SellingPlanFixedDeliveryPolicy setPreAnchorBehavior(SellingPlanFixedDeliveryPolicyPreAnchorBehavior arg) {
        optimisticData.put(getKey("preAnchorBehavior"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "anchors": return true;

            case "cutoff": return false;

            case "fulfillmentExactTime": return false;

            case "fulfillmentTrigger": return false;

            case "intent": return false;

            case "preAnchorBehavior": return false;

            default: return false;
        }
    }
}

