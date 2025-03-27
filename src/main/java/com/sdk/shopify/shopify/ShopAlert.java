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
* An alert message that appears in the Shopify admin about a problem with a store setting, with an
* action to take. For example, you could show an alert to ask the merchant to enter their billing
* information to activate Shopify Plus.
*/
public class ShopAlert extends AbstractResponse<ShopAlert> {
    public ShopAlert() {
    }

    public ShopAlert(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "action": {
                    responseData.put(key, new ShopAlertAction(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "description": {
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
        return "ShopAlert";
    }

    /**
    * The text for the button in the alert that links to related information. For example, _Add credit
    * card_.
    */

    public ShopAlertAction getAction() {
        return (ShopAlertAction) get("action");
    }

    public ShopAlert setAction(ShopAlertAction arg) {
        optimisticData.put(getKey("action"), arg);
        return this;
    }

    /**
    * A description of the alert and further information, such as whether the merchant will be charged.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public ShopAlert setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "action": return true;

            case "description": return false;

            default: return false;
        }
    }
}

