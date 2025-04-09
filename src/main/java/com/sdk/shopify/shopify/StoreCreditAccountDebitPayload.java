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
* Return type for `storeCreditAccountDebit` mutation.
*/
public class StoreCreditAccountDebitPayload extends AbstractResponse<StoreCreditAccountDebitPayload> {
    public StoreCreditAccountDebitPayload() {
    }

    public StoreCreditAccountDebitPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "storeCreditAccountTransaction": {
                    StoreCreditAccountDebitTransaction optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StoreCreditAccountDebitTransaction(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<StoreCreditAccountDebitUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new StoreCreditAccountDebitUserError(jsonAsObject(element1, key)));
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
        return "StoreCreditAccountDebitPayload";
    }

    /**
    * The store credit account transaction that was created.
    */

    public StoreCreditAccountDebitTransaction getStoreCreditAccountTransaction() {
        return (StoreCreditAccountDebitTransaction) get("storeCreditAccountTransaction");
    }

    public StoreCreditAccountDebitPayload setStoreCreditAccountTransaction(StoreCreditAccountDebitTransaction arg) {
        optimisticData.put(getKey("storeCreditAccountTransaction"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<StoreCreditAccountDebitUserError> getUserErrors() {
        return (List<StoreCreditAccountDebitUserError>) get("userErrors");
    }

    public StoreCreditAccountDebitPayload setUserErrors(List<StoreCreditAccountDebitUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "storeCreditAccountTransaction": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

