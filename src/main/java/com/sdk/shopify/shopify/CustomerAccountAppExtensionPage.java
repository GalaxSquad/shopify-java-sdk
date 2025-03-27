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
* An app extension page for the customer account navigation menu.
*/
public class CustomerAccountAppExtensionPage extends AbstractResponse<CustomerAccountAppExtensionPage> implements CustomerAccountPage, Navigable, Node {
    public CustomerAccountAppExtensionPage() {
    }

    public CustomerAccountAppExtensionPage(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "appExtensionUuid": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "defaultCursor": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "title": {
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

    public CustomerAccountAppExtensionPage(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CustomerAccountAppExtensionPage";
    }

    /**
    * The UUID of the app extension.
    */

    public String getAppExtensionUuid() {
        return (String) get("appExtensionUuid");
    }

    public CustomerAccountAppExtensionPage setAppExtensionUuid(String arg) {
        optimisticData.put(getKey("appExtensionUuid"), arg);
        return this;
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */

    public String getDefaultCursor() {
        return (String) get("defaultCursor");
    }

    public CustomerAccountAppExtensionPage setDefaultCursor(String arg) {
        optimisticData.put(getKey("defaultCursor"), arg);
        return this;
    }

    /**
    * A unique, human-friendly string for the customer account page.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public CustomerAccountAppExtensionPage setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * The unique ID for the customer account page.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The title of the customer account page.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public CustomerAccountAppExtensionPage setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "appExtensionUuid": return false;

            case "defaultCursor": return false;

            case "handle": return false;

            case "id": return false;

            case "title": return false;

            default: return false;
        }
    }
}

