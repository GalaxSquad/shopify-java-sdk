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
* The details about the app extension that's providing the
* [discount type](https://help.shopify.com/manual/discounts/discount-types).
* This information includes the app extension's name and
* [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets),
* [App Bridge configuration](https://shopify.dev/docs/api/app-bridge),
* [discount
* class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations),
* [function
* ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries),
* and other metadata about the discount type, including the discount type's name and description.
*/
public class AppDiscountType extends AbstractResponse<AppDiscountType> {
    public AppDiscountType() {
    }

    public AppDiscountType(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

                case "discountClasses": {
                    List<DiscountClass> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(DiscountClass.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "functionId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public String getGraphQlTypeName() {
        return "AppDiscountType";
    }

    /**
    * The name of the app extension that's providing the
    * [discount type](https://help.shopify.com/manual/discounts/discount-types).
    */

    public App getApp() {
        return (App) get("app");
    }

    public AppDiscountType setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The [App Bridge configuration](https://shopify.dev/docs/api/app-bridge)
    * for the [discount type](https://help.shopify.com/manual/discounts/discount-types).
    */

    public FunctionsAppBridge getAppBridge() {
        return (FunctionsAppBridge) get("appBridge");
    }

    public AppDiscountType setAppBridge(FunctionsAppBridge arg) {
        optimisticData.put(getKey("appBridge"), arg);
        return this;
    }

    /**
    * The [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets)
    * of the app extension that's providing the [discount
    * type](https://help.shopify.com/manual/discounts/discount-types).
    */

    public String getAppKey() {
        return (String) get("appKey");
    }

    public AppDiscountType setAppKey(String arg) {
        optimisticData.put(getKey("appKey"), arg);
        return this;
    }

    /**
    * A description of the
    * [discount type](https://help.shopify.com/manual/discounts/discount-types)
    * provided by the app extension.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public AppDiscountType setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The list of [discount
    * classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * that this app extension supports.
    */

    public List<DiscountClass> getDiscountClasses() {
        return (List<DiscountClass>) get("discountClasses");
    }

    public AppDiscountType setDiscountClasses(List<DiscountClass> arg) {
        optimisticData.put(getKey("discountClasses"), arg);
        return this;
    }

    /**
    * The
    * [function
    * ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries)
    * associated with the app extension providing the
    * [discount type](https://help.shopify.com/manual/discounts/discount-types).
    */

    public String getFunctionId() {
        return (String) get("functionId");
    }

    public AppDiscountType setFunctionId(String arg) {
        optimisticData.put(getKey("functionId"), arg);
        return this;
    }

    /**
    * The name of the [discount type](https://help.shopify.com/manual/discounts/discount-types)
    * that the app extension is providing.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public AppDiscountType setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "app": return true;

            case "appBridge": return true;

            case "appKey": return false;

            case "description": return false;

            case "discountClasses": return false;

            case "functionId": return false;

            case "title": return false;

            default: return false;
        }
    }
}

