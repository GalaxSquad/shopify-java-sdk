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
* Return type for `fulfillmentOrdersSetFulfillmentDeadline` mutation.
*/
public class FulfillmentOrdersSetFulfillmentDeadlinePayload extends AbstractResponse<FulfillmentOrdersSetFulfillmentDeadlinePayload> {
    public FulfillmentOrdersSetFulfillmentDeadlinePayload() {
    }

    public FulfillmentOrdersSetFulfillmentDeadlinePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "success": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<FulfillmentOrdersSetFulfillmentDeadlineUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentOrdersSetFulfillmentDeadlineUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "FulfillmentOrdersSetFulfillmentDeadlinePayload";
    }

    /**
    * Whether the fulfillment deadline was successfully set.
    */

    public Boolean getSuccess() {
        return (Boolean) get("success");
    }

    public FulfillmentOrdersSetFulfillmentDeadlinePayload setSuccess(Boolean arg) {
        optimisticData.put(getKey("success"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<FulfillmentOrdersSetFulfillmentDeadlineUserError> getUserErrors() {
        return (List<FulfillmentOrdersSetFulfillmentDeadlineUserError>) get("userErrors");
    }

    public FulfillmentOrdersSetFulfillmentDeadlinePayload setUserErrors(List<FulfillmentOrdersSetFulfillmentDeadlineUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "success": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

