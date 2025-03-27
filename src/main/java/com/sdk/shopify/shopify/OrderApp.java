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
* The [application](https://shopify.dev/apps) that created the order.
*/
public class OrderApp extends AbstractResponse<OrderApp> {
    public OrderApp() {
    }

    public OrderApp(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "icon": {
                    responseData.put(key, new Image(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
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
        return "OrderApp";
    }

    /**
    * The application icon.
    */

    public Image getIcon() {
        return (Image) get("icon");
    }

    public OrderApp setIcon(Image arg) {
        optimisticData.put(getKey("icon"), arg);
        return this;
    }

    /**
    * The application ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public OrderApp setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The name of the application.
    */

    public String getName() {
        return (String) get("name");
    }

    public OrderApp setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "icon": return true;

            case "id": return false;

            case "name": return false;

            default: return false;
        }
    }
}

