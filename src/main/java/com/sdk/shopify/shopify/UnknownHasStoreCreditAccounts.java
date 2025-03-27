// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents information about the store credit accounts associated to the specified owner.
*/
public class UnknownHasStoreCreditAccounts extends AbstractResponse<UnknownHasStoreCreditAccounts> implements HasStoreCreditAccounts {
    public UnknownHasStoreCreditAccounts() {
    }

    public UnknownHasStoreCreditAccounts(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "storeCreditAccounts": {
                    responseData.put(key, new StoreCreditAccountConnection(jsonAsObject(field.getValue(), key)));

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

    public static HasStoreCreditAccounts create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Customer": {
                return new Customer(fields);
            }

            default: {
                return new UnknownHasStoreCreditAccounts(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * Returns a list of store credit accounts that belong to the owner resource.
    * A store credit account owner can hold multiple accounts each with a different currency.
    */

    public StoreCreditAccountConnection getStoreCreditAccounts() {
        return (StoreCreditAccountConnection) get("storeCreditAccounts");
    }

    public UnknownHasStoreCreditAccounts setStoreCreditAccounts(StoreCreditAccountConnection arg) {
        optimisticData.put(getKey("storeCreditAccounts"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "storeCreditAccounts": return true;

            default: return false;
        }
    }
}

