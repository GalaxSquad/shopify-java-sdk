// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An action associated to a resource alert, such as editing variants.
*/
public class ResourceAlertAction extends AbstractResponse<ResourceAlertAction> {
    public ResourceAlertAction() {
    }

    public ResourceAlertAction(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "primary": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "show": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "url": {
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
        return "ResourceAlertAction";
    }

    /**
    * Whether the action appears as a button or as a link.
    */

    public Boolean getPrimary() {
        return (Boolean) get("primary");
    }

    public ResourceAlertAction setPrimary(Boolean arg) {
        optimisticData.put(getKey("primary"), arg);
        return this;
    }

    /**
    * Resource for the action to show.
    */

    public String getShow() {
        return (String) get("show");
    }

    public ResourceAlertAction setShow(String arg) {
        optimisticData.put(getKey("show"), arg);
        return this;
    }

    /**
    * The text for the button in the alert. For example, _Edit variants_.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public ResourceAlertAction setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The target URL that the button links to.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public ResourceAlertAction setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "primary": return false;

            case "show": return false;

            case "title": return false;

            case "url": return false;

            default: return false;
        }
    }
}

