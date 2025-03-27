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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `storeCreditAccountCredit` mutation.
*/
public class StoreCreditAccountCreditPayload extends AbstractResponse<StoreCreditAccountCreditPayload> {
    public StoreCreditAccountCreditPayload() {
    }

    public StoreCreditAccountCreditPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "storeCreditAccountTransaction": {
                    StoreCreditAccountCreditTransaction optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StoreCreditAccountCreditTransaction(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<StoreCreditAccountCreditUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new StoreCreditAccountCreditUserError(jsonAsObject(element1, key)));
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
        return "StoreCreditAccountCreditPayload";
    }

    /**
    * The store credit account transaction that was created.
    */

    public StoreCreditAccountCreditTransaction getStoreCreditAccountTransaction() {
        return (StoreCreditAccountCreditTransaction) get("storeCreditAccountTransaction");
    }

    public StoreCreditAccountCreditPayload setStoreCreditAccountTransaction(StoreCreditAccountCreditTransaction arg) {
        optimisticData.put(getKey("storeCreditAccountTransaction"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<StoreCreditAccountCreditUserError> getUserErrors() {
        return (List<StoreCreditAccountCreditUserError>) get("userErrors");
    }

    public StoreCreditAccountCreditPayload setUserErrors(List<StoreCreditAccountCreditUserError> arg) {
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

