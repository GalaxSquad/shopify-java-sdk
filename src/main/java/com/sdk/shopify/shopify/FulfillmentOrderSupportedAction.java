// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* One of the actions that the fulfillment order supports in its current state.
*/
public class FulfillmentOrderSupportedAction extends AbstractResponse<FulfillmentOrderSupportedAction> {
    public FulfillmentOrderSupportedAction() {
    }

    public FulfillmentOrderSupportedAction(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "action": {
                    responseData.put(key, FulfillmentOrderAction.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "externalUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "FulfillmentOrderSupportedAction";
    }

    /**
    * The action value.
    */

    public FulfillmentOrderAction getAction() {
        return (FulfillmentOrderAction) get("action");
    }

    public FulfillmentOrderSupportedAction setAction(FulfillmentOrderAction arg) {
        optimisticData.put(getKey("action"), arg);
        return this;
    }

    /**
    * The external URL to be used to initiate the fulfillment process outside Shopify.
    * Applicable only when the `action` value is `EXTERNAL`.
    */

    public String getExternalUrl() {
        return (String) get("externalUrl");
    }

    public FulfillmentOrderSupportedAction setExternalUrl(String arg) {
        optimisticData.put(getKey("externalUrl"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "action": return false;

            case "externalUrl": return false;

            default: return false;
        }
    }
}

