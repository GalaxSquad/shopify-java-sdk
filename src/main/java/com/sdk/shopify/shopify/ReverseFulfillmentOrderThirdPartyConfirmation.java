// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The third-party confirmation of a reverse fulfillment order.
*/
public class ReverseFulfillmentOrderThirdPartyConfirmation extends AbstractResponse<ReverseFulfillmentOrderThirdPartyConfirmation> {
    public ReverseFulfillmentOrderThirdPartyConfirmation() {
    }

    public ReverseFulfillmentOrderThirdPartyConfirmation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "status": {
                    responseData.put(key, ReverseFulfillmentOrderThirdPartyConfirmationStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "ReverseFulfillmentOrderThirdPartyConfirmation";
    }

    /**
    * The status of the reverse fulfillment order third-party confirmation.
    */

    public ReverseFulfillmentOrderThirdPartyConfirmationStatus getStatus() {
        return (ReverseFulfillmentOrderThirdPartyConfirmationStatus) get("status");
    }

    public ReverseFulfillmentOrderThirdPartyConfirmation setStatus(ReverseFulfillmentOrderThirdPartyConfirmationStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "status": return false;

            default: return false;
        }
    }
}

