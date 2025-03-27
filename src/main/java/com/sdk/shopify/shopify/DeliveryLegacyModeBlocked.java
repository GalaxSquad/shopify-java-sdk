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
* Whether the shop is blocked from converting to full multi-location delivery profiles mode. If the
* shop is blocked, then the blocking reasons are also returned.
*/
public class DeliveryLegacyModeBlocked extends AbstractResponse<DeliveryLegacyModeBlocked> {
    public DeliveryLegacyModeBlocked() {
    }

    public DeliveryLegacyModeBlocked(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "blocked": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "reasons": {
                    List<DeliveryLegacyModeBlockedReason> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<DeliveryLegacyModeBlockedReason> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(DeliveryLegacyModeBlockedReason.fromGraphQl(jsonAsString(element1, key)));
                        }

                        optional1 = list1;
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
        return "DeliveryLegacyModeBlocked";
    }

    /**
    * Whether the shop can convert to full multi-location delivery profiles mode.
    */

    public Boolean getBlocked() {
        return (Boolean) get("blocked");
    }

    public DeliveryLegacyModeBlocked setBlocked(Boolean arg) {
        optimisticData.put(getKey("blocked"), arg);
        return this;
    }

    /**
    * The reasons why the shop is blocked from converting to full multi-location delivery profiles mode.
    */

    public List<DeliveryLegacyModeBlockedReason> getReasons() {
        return (List<DeliveryLegacyModeBlockedReason>) get("reasons");
    }

    public DeliveryLegacyModeBlocked setReasons(List<DeliveryLegacyModeBlockedReason> arg) {
        optimisticData.put(getKey("reasons"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "blocked": return false;

            case "reasons": return false;

            default: return false;
        }
    }
}

