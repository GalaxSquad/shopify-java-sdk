// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Requirements that must be met before an app can be installed.
*/
public class FailedRequirement extends AbstractResponse<FailedRequirement> {
    public FailedRequirement() {
    }

    public FailedRequirement(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "action": {
                    NavigationItem optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NavigationItem(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

    public String getGraphQlTypeName() {
        return "FailedRequirement";
    }

    /**
    * Action to be taken to resolve a failed requirement, including URL link.
    */

    public NavigationItem getAction() {
        return (NavigationItem) get("action");
    }

    public FailedRequirement setAction(NavigationItem arg) {
        optimisticData.put(getKey("action"), arg);
        return this;
    }

    /**
    * A concise set of copy strings to be displayed to merchants, to guide them in resolving problems your
    * app
    * encounters when trying to make use of their Shop and its resources.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public FailedRequirement setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "action": return true;

            case "message": return false;

            default: return false;
        }
    }
}

