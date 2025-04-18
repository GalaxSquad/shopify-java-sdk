// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `menuUpdate` mutation.
*/
public class MenuUpdatePayload extends AbstractResponse<MenuUpdatePayload> {
    public MenuUpdatePayload() {
    }

    public MenuUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "menu": {
                    Menu optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Menu(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<MenuUpdateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MenuUpdateUserError(jsonAsObject(element1, key)));
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

    public String getGraphQlTypeName() {
        return "MenuUpdatePayload";
    }

    /**
    * The updated menu.
    */

    public Menu getMenu() {
        return (Menu) get("menu");
    }

    public MenuUpdatePayload setMenu(Menu arg) {
        optimisticData.put(getKey("menu"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MenuUpdateUserError> getUserErrors() {
        return (List<MenuUpdateUserError>) get("userErrors");
    }

    public MenuUpdatePayload setUserErrors(List<MenuUpdateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "menu": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

