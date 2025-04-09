// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A preview of a URL redirect import row.
*/
public class UrlRedirectImportPreview extends AbstractResponse<UrlRedirectImportPreview> {
    public UrlRedirectImportPreview() {
    }

    public UrlRedirectImportPreview(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "path": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "target": {
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
        return "UrlRedirectImportPreview";
    }

    /**
    * The old path to be redirected from. When the user visits this path, they will be redirected to the
    * target location.
    */

    public String getPath() {
        return (String) get("path");
    }

    public UrlRedirectImportPreview setPath(String arg) {
        optimisticData.put(getKey("path"), arg);
        return this;
    }

    /**
    * The target location where the user will be redirected to.
    */

    public String getTarget() {
        return (String) get("target");
    }

    public UrlRedirectImportPreview setTarget(String arg) {
        optimisticData.put(getKey("target"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "path": return false;

            case "target": return false;

            default: return false;
        }
    }
}

