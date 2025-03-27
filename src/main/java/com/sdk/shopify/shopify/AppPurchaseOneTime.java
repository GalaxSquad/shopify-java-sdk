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
* Services and features purchased once by a store.
*/
public class AppPurchaseOneTime extends AbstractResponse<AppPurchaseOneTime> implements AppPurchase, Node {
    public AppPurchaseOneTime() {
    }

    public AppPurchaseOneTime(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "price": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, AppPurchaseStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "test": {
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

    public AppPurchaseOneTime(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "AppPurchaseOneTime";
    }

    /**
    * The date and time when the app purchase occurred.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public AppPurchaseOneTime setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The name of the app purchase.
    */

    public String getName() {
        return (String) get("name");
    }

    public AppPurchaseOneTime setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The amount to be charged to the store for the app purchase.
    */

    public MoneyV2 getPrice() {
        return (MoneyV2) get("price");
    }

    public AppPurchaseOneTime setPrice(MoneyV2 arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * The status of the app purchase.
    */

    public AppPurchaseStatus getStatus() {
        return (AppPurchaseStatus) get("status");
    }

    public AppPurchaseOneTime setStatus(AppPurchaseStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * Whether the app purchase is a test transaction.
    */

    public Boolean getTest() {
        return (Boolean) get("test");
    }

    public AppPurchaseOneTime setTest(Boolean arg) {
        optimisticData.put(getKey("test"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "createdAt": return false;

            case "id": return false;

            case "name": return false;

            case "price": return true;

            case "status": return false;

            case "test": return false;

            default: return false;
        }
    }
}

