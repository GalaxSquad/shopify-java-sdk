// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The `WebPixel` object enables you to manage JavaScript code snippets
* that run on an online store and collect
* [behavioral data](https://shopify.dev/docs/api/web-pixels-api/standard-events)
* for marketing campaign optimization and analytics.
* Learn how to create a
* [web pixel extension](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels)
* to subscribe your app to events that are emitted by Shopify.
*/
public class WebPixel extends AbstractResponse<WebPixel> implements Node {
    public WebPixel() {
    }

    public WebPixel(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "settings": {
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

    public WebPixel(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "WebPixel";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The
    * [settings
    * object](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-your-
    * web-pixel-settings)
    * for the web pixel. This object specifies configuration options that control the web pixel's
    * functionality and behavior. You can find the settings for a web pixel in
    * `extensions/<your_extension_name>/shopify.extension.toml`.
    */

    public String getSettings() {
        return (String) get("settings");
    }

    public WebPixel setSettings(String arg) {
        optimisticData.put(getKey("settings"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "settings": return false;

            default: return false;
        }
    }
}

