// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The App Bridge information for a Shopify Function.
*/
public class FunctionsAppBridge extends AbstractResponse<FunctionsAppBridge> {
    public FunctionsAppBridge() {
    }

    public FunctionsAppBridge(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "createPath": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "detailsPath": {
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
        return "FunctionsAppBridge";
    }

    /**
    * The relative path for creating a customization.
    */

    public String getCreatePath() {
        return (String) get("createPath");
    }

    public FunctionsAppBridge setCreatePath(String arg) {
        optimisticData.put(getKey("createPath"), arg);
        return this;
    }

    /**
    * The relative path for viewing a customization.
    */

    public String getDetailsPath() {
        return (String) get("detailsPath");
    }

    public FunctionsAppBridge setDetailsPath(String arg) {
        optimisticData.put(getKey("detailsPath"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "createPath": return false;

            case "detailsPath": return false;

            default: return false;
        }
    }
}

