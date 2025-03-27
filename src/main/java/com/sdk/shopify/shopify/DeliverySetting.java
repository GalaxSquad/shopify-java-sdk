// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The `DeliverySetting` object enables you to manage shop-wide shipping settings.
* You can enable legacy compatibility mode for the multi-location delivery profiles feature
* if the legacy mode isn't blocked.
*/
public class DeliverySetting extends AbstractResponse<DeliverySetting> {
    public DeliverySetting() {
    }

    public DeliverySetting(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "legacyModeBlocked": {
                    responseData.put(key, new DeliveryLegacyModeBlocked(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "legacyModeProfiles": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "DeliverySetting";
    }

    /**
    * Whether the shop is blocked from converting to full multi-location delivery profiles mode. If the
    * shop is blocked, then the blocking reasons are also returned.
    */

    public DeliveryLegacyModeBlocked getLegacyModeBlocked() {
        return (DeliveryLegacyModeBlocked) get("legacyModeBlocked");
    }

    public DeliverySetting setLegacyModeBlocked(DeliveryLegacyModeBlocked arg) {
        optimisticData.put(getKey("legacyModeBlocked"), arg);
        return this;
    }

    /**
    * Enables legacy compatability mode for the multi-location delivery profiles feature.
    */

    public Boolean getLegacyModeProfiles() {
        return (Boolean) get("legacyModeProfiles");
    }

    public DeliverySetting setLegacyModeProfiles(Boolean arg) {
        optimisticData.put(getKey("legacyModeProfiles"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "legacyModeBlocked": return true;

            case "legacyModeProfiles": return false;

            default: return false;
        }
    }
}

