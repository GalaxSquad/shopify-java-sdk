// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A shop's data sale opt out page.
*/
public class DataSaleOptOutPage extends AbstractResponse<DataSaleOptOutPage> {
    public DataSaleOptOutPage() {
    }

    public DataSaleOptOutPage(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "autoManaged": {
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
        return "DataSaleOptOutPage";
    }

    /**
    * If the data sale opt out page is auto managed.
    */

    public Boolean getAutoManaged() {
        return (Boolean) get("autoManaged");
    }

    public DataSaleOptOutPage setAutoManaged(Boolean arg) {
        optimisticData.put(getKey("autoManaged"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "autoManaged": return false;

            default: return false;
        }
    }
}

