// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An action associated to a shop alert, such as adding a credit card.
*/
public class ShopAlertAction extends AbstractResponse<ShopAlertAction> {
    public ShopAlertAction() {
    }

    public ShopAlertAction(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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
        return "ShopAlertAction";
    }

    /**
    * The text for the button in the alert. For example, _Add credit card_.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public ShopAlertAction setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The target URL that the button links to.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public ShopAlertAction setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "title": return false;

            case "url": return false;

            default: return false;
        }
    }
}

