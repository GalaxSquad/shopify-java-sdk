// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the subscription lines the discount applies on.
*/
public class SubscriptionDiscountEntitledLines extends AbstractResponse<SubscriptionDiscountEntitledLines> {
    public SubscriptionDiscountEntitledLines() {
    }

    public SubscriptionDiscountEntitledLines(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "all": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "lines": {
                    responseData.put(key, new SubscriptionLineConnection(jsonAsObject(field.getValue(), key)));

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
        return "SubscriptionDiscountEntitledLines";
    }

    /**
    * Specify whether the subscription discount will apply on all subscription lines.
    */

    public Boolean getAll() {
        return (Boolean) get("all");
    }

    public SubscriptionDiscountEntitledLines setAll(Boolean arg) {
        optimisticData.put(getKey("all"), arg);
        return this;
    }

    /**
    * The list of subscription lines associated with the subscription discount.
    */

    public SubscriptionLineConnection getLines() {
        return (SubscriptionLineConnection) get("lines");
    }

    public SubscriptionDiscountEntitledLines setLines(SubscriptionLineConnection arg) {
        optimisticData.put(getKey("lines"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "all": return false;

            case "lines": return true;

            default: return false;
        }
    }
}

