// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Additional information about why a merchant declined the customer's return request.
*/
public class ReturnDecline extends AbstractResponse<ReturnDecline> {
    public ReturnDecline() {
    }

    public ReturnDecline(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "note": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reason": {
                    responseData.put(key, ReturnDeclineReason.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "ReturnDecline";
    }

    /**
    * The notification message sent to the customer about their declined return request.
    * Maximum length: 500 characters.
    */

    public String getNote() {
        return (String) get("note");
    }

    public ReturnDecline setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The reason the customer's return request was declined.
    */

    public ReturnDeclineReason getReason() {
        return (ReturnDeclineReason) get("reason");
    }

    public ReturnDecline setReason(ReturnDeclineReason arg) {
        optimisticData.put(getKey("reason"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "note": return false;

            case "reason": return false;

            default: return false;
        }
    }
}

