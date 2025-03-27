// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* A navigation item, holding basic link attributes.
*/
public class NavigationItem extends AbstractResponse<NavigationItem> {
    public NavigationItem() {
    }

    public NavigationItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "NavigationItem";
    }

    /**
    * The unique identifier of the navigation item.
    */

    public String getId() {
        return (String) get("id");
    }

    public NavigationItem setId(String arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The name of the navigation item.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public NavigationItem setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The URL of the page that the navigation item links to.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public NavigationItem setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "title": return false;

            case "url": return false;

            default: return false;
        }
    }
}

