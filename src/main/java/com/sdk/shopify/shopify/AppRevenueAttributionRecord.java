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
* Represents app revenue that was captured externally by the partner.
*/
public class AppRevenueAttributionRecord extends AbstractResponse<AppRevenueAttributionRecord> implements Node {
    public AppRevenueAttributionRecord() {
    }

    public AppRevenueAttributionRecord(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "capturedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "idempotencyKey": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "test": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "type": {
                    responseData.put(key, AppRevenueAttributionType.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public AppRevenueAttributionRecord(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "AppRevenueAttributionRecord";
    }

    /**
    * The financial amount captured in this attribution.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public AppRevenueAttributionRecord setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The timestamp when the financial amount was captured.
    */

    public String getCapturedAt() {
        return (String) get("capturedAt");
    }

    public AppRevenueAttributionRecord setCapturedAt(String arg) {
        optimisticData.put(getKey("capturedAt"), arg);
        return this;
    }

    /**
    * The timestamp at which this revenue attribution was issued.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public AppRevenueAttributionRecord setCreatedAt(String arg) {
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
    * The unique value submitted during the creation of the app revenue attribution record.
    * For more information, refer to
    * [Idempotent requests](https://shopify.dev/api/usage/idempotent-requests).
    */

    public String getIdempotencyKey() {
        return (String) get("idempotencyKey");
    }

    public AppRevenueAttributionRecord setIdempotencyKey(String arg) {
        optimisticData.put(getKey("idempotencyKey"), arg);
        return this;
    }

    /**
    * Indicates whether this is a test submission.
    */

    public Boolean getTest() {
        return (Boolean) get("test");
    }

    public AppRevenueAttributionRecord setTest(Boolean arg) {
        optimisticData.put(getKey("test"), arg);
        return this;
    }

    /**
    * The type of revenue attribution.
    */

    public AppRevenueAttributionType getType() {
        return (AppRevenueAttributionType) get("type");
    }

    public AppRevenueAttributionRecord setType(AppRevenueAttributionType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "capturedAt": return false;

            case "createdAt": return false;

            case "id": return false;

            case "idempotencyKey": return false;

            case "test": return false;

            case "type": return false;

            default: return false;
        }
    }
}

