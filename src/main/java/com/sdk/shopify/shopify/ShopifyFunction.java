// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A Shopify Function.
*/
public class ShopifyFunction extends AbstractResponse<ShopifyFunction> {
    public ShopifyFunction() {
    }

    public ShopifyFunction(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "apiType": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "apiVersion": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "app": {
                    responseData.put(key, new App(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "appBridge": {
                    responseData.put(key, new FunctionsAppBridge(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "appKey": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "inputQuery": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "useCreationUi": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "ShopifyFunction";
    }

    /**
    * The API type of the Shopify Function.
    */

    public String getApiType() {
        return (String) get("apiType");
    }

    public ShopifyFunction setApiType(String arg) {
        optimisticData.put(getKey("apiType"), arg);
        return this;
    }

    /**
    * The API version of the Shopify Function.
    */

    public String getApiVersion() {
        return (String) get("apiVersion");
    }

    public ShopifyFunction setApiVersion(String arg) {
        optimisticData.put(getKey("apiVersion"), arg);
        return this;
    }

    /**
    * The app that owns the Shopify Function.
    */

    public App getApp() {
        return (App) get("app");
    }

    public ShopifyFunction setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The App Bridge information for the Shopify Function.
    */

    public FunctionsAppBridge getAppBridge() {
        return (FunctionsAppBridge) get("appBridge");
    }

    public ShopifyFunction setAppBridge(FunctionsAppBridge arg) {
        optimisticData.put(getKey("appBridge"), arg);
        return this;
    }

    /**
    * The client ID of the app that owns the Shopify Function.
    */

    public String getAppKey() {
        return (String) get("appKey");
    }

    public ShopifyFunction setAppKey(String arg) {
        optimisticData.put(getKey("appKey"), arg);
        return this;
    }

    /**
    * The description of the Shopify Function.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public ShopifyFunction setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The ID of the Shopify Function.
    */

    public String getId() {
        return (String) get("id");
    }

    public ShopifyFunction setId(String arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The input query of the Shopify Function.
    */

    public String getInputQuery() {
        return (String) get("inputQuery");
    }

    public ShopifyFunction setInputQuery(String arg) {
        optimisticData.put(getKey("inputQuery"), arg);
        return this;
    }

    /**
    * The title of the Shopify Function.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public ShopifyFunction setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * If the Shopify Function uses the creation UI in the Admin.
    */

    public Boolean getUseCreationUi() {
        return (Boolean) get("useCreationUi");
    }

    public ShopifyFunction setUseCreationUi(Boolean arg) {
        optimisticData.put(getKey("useCreationUi"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "apiType": return false;

            case "apiVersion": return false;

            case "app": return true;

            case "appBridge": return true;

            case "appKey": return false;

            case "description": return false;

            case "id": return false;

            case "inputQuery": return false;

            case "title": return false;

            case "useCreationUi": return false;

            default: return false;
        }
    }
}

