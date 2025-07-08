// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A warning that is displayed to the merchant when a change is made to a draft order.
*/
public class UnknownDraftOrderWarning extends AbstractResponse<UnknownDraftOrderWarning> implements DraftOrderWarning {
    public UnknownDraftOrderWarning() {
    }

    public UnknownDraftOrderWarning(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "errorCode": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "field": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "message": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public static DraftOrderWarning create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "DraftOrderBundleAddedWarning": {
                return new DraftOrderBundleAddedWarning(fields);
            }

            case "DraftOrderDiscountNotAppliedWarning": {
                return new DraftOrderDiscountNotAppliedWarning(fields);
            }

            case "DraftOrderMarketRegionCountryCodeNotSupportedWarning": {
                return new DraftOrderMarketRegionCountryCodeNotSupportedWarning(fields);
            }

            default: {
                return new UnknownDraftOrderWarning(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The error code.
    */

    public String getErrorCode() {
        return (String) get("errorCode");
    }

    public UnknownDraftOrderWarning setErrorCode(String arg) {
        optimisticData.put(getKey("errorCode"), arg);
        return this;
    }

    /**
    * The input field that the warning applies to.
    */

    public String getField() {
        return (String) get("field");
    }

    public UnknownDraftOrderWarning setField(String arg) {
        optimisticData.put(getKey("field"), arg);
        return this;
    }

    /**
    * The warning message.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public UnknownDraftOrderWarning setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "errorCode": return false;

            case "field": return false;

            case "message": return false;

            default: return false;
        }
    }
}

