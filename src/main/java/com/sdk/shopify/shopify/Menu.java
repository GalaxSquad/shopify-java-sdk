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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A menu for display on the storefront.
*/
public class Menu extends AbstractResponse<Menu> implements HasPublishedTranslations, Node {
    public Menu() {
    }

    public Menu(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "isDefault": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "translations": {
                    List<Translation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Translation(jsonAsObject(element1, key)));
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

    public Menu(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Menu";
    }

    /**
    * The menu's handle.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public Menu setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether the menu is a default. The handle for default menus can't be updated and default menus can't
    * be deleted.
    */

    public Boolean getIsDefault() {
        return (Boolean) get("isDefault");
    }

    public Menu setIsDefault(Boolean arg) {
        optimisticData.put(getKey("isDefault"), arg);
        return this;
    }

    /**
    * A list of items on the menu sorted by position.
    */

    public List<MenuItem> getItems() {
        return (List<MenuItem>) get("items");
    }

    public Menu setItems(List<MenuItem> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
    * The menu's title.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public Menu setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public Menu setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "handle": return false;

            case "id": return false;

            case "isDefault": return false;

            case "items": return true;

            case "title": return false;

            case "translations": return true;

            default: return false;
        }
    }
}

