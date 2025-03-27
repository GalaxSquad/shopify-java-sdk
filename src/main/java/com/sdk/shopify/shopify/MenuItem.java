// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A menu item for display on the storefront.
*/
public class MenuItem extends AbstractResponse<MenuItem> {
    public MenuItem() {
    }

    public MenuItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "items": {
                    List<MenuItem> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MenuItem(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "resourceId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tags": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "type": {
                    responseData.put(key, MenuItemType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "MenuItem";
    }

    /**
    * A globally-unique ID of the navigation menu item.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public MenuItem setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * List of the menu items nested under this item sorted by position.
    */

    public List<MenuItem> getItems() {
        return (List<MenuItem>) get("items");
    }

    public MenuItem setItems(List<MenuItem> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
    * The ID of the resource to link to.
    */

    public ID getResourceId() {
        return (ID) get("resourceId");
    }

    public MenuItem setResourceId(ID arg) {
        optimisticData.put(getKey("resourceId"), arg);
        return this;
    }

    /**
    * The menu item's tags to filter a collection.
    */

    public List<String> getTags() {
        return (List<String>) get("tags");
    }

    public MenuItem setTags(List<String> arg) {
        optimisticData.put(getKey("tags"), arg);
        return this;
    }

    /**
    * The menu item's title.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public MenuItem setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The menu item's type.
    */

    public MenuItemType getType() {
        return (MenuItemType) get("type");
    }

    public MenuItem setType(MenuItemType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * The menu item's url.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public MenuItem setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "items": return true;

            case "resourceId": return false;

            case "tags": return false;

            case "title": return false;

            case "type": return false;

            case "url": return false;

            default: return false;
        }
    }
}

