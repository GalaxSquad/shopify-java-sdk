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
* Represents errors returned from apps when using the marketing activity extension.
*/
public class MarketingActivityExtensionAppErrors extends AbstractResponse<MarketingActivityExtensionAppErrors> {
    public MarketingActivityExtensionAppErrors() {
    }

    public MarketingActivityExtensionAppErrors(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, MarketingActivityExtensionAppErrorCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "userErrors": {
                    List<UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UserError(jsonAsObject(element1, key)));
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
        return "MarketingActivityExtensionAppErrors";
    }

    /**
    * The app error type.
    */

    public MarketingActivityExtensionAppErrorCode getCode() {
        return (MarketingActivityExtensionAppErrorCode) get("code");
    }

    public MarketingActivityExtensionAppErrors setCode(MarketingActivityExtensionAppErrorCode arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The list of errors returned by the app.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public MarketingActivityExtensionAppErrors setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

