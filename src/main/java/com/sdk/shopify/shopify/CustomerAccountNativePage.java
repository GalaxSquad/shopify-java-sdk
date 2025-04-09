// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A native page for the customer account navigation menu.
*/
public class CustomerAccountNativePage extends AbstractResponse<CustomerAccountNativePage> implements CustomerAccountPage, Navigable, Node {
    public CustomerAccountNativePage() {
    }

    public CustomerAccountNativePage(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

                case "pageType": {
                    responseData.put(key, CustomerAccountNativePagePageType.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public CustomerAccountNativePage(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CustomerAccountNativePage";
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */

    public String getDefaultCursor() {
        return (String) get("defaultCursor");
    }

    public CustomerAccountNativePage setDefaultCursor(String arg) {
        optimisticData.put(getKey("defaultCursor"), arg);
        return this;
    }

    /**
    * A unique, human-friendly string for the customer account page.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public CustomerAccountNativePage setHandle(String arg) {
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
    * The type of customer account native page.
    */

    public CustomerAccountNativePagePageType getPageType() {
        return (CustomerAccountNativePagePageType) get("pageType");
    }

    public CustomerAccountNativePage setPageType(CustomerAccountNativePagePageType arg) {
        optimisticData.put(getKey("pageType"), arg);
        return this;
    }

    /**
    * The title of the customer account page.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public CustomerAccountNativePage setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "defaultCursor": return false;

            case "handle": return false;

            case "id": return false;

            case "pageType": return false;

            case "title": return false;

            default: return false;
        }
    }
}

