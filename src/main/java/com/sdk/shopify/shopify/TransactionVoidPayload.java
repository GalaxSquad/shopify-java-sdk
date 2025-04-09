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
* Return type for `transactionVoid` mutation.
*/
public class TransactionVoidPayload extends AbstractResponse<TransactionVoidPayload> {
    public TransactionVoidPayload() {
    }

    public TransactionVoidPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "transaction": {
                    OrderTransaction optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderTransaction(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<TransactionVoidUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TransactionVoidUserError(jsonAsObject(element1, key)));
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
        return "TransactionVoidPayload";
    }

    /**
    * The created void transaction.
    */

    public OrderTransaction getTransaction() {
        return (OrderTransaction) get("transaction");
    }

    public TransactionVoidPayload setTransaction(OrderTransaction arg) {
        optimisticData.put(getKey("transaction"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<TransactionVoidUserError> getUserErrors() {
        return (List<TransactionVoidUserError>) get("userErrors");
    }

    public TransactionVoidPayload setUserErrors(List<TransactionVoidUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "transaction": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

