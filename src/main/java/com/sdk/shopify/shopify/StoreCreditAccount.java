// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A store credit account contains a monetary balance that can be redeemed at checkout for purchases in
* the shop.
* The account is held in the specified currency and has an owner that cannot be transferred.
* The account balance is redeemable at checkout only when the owner is authenticated via [new customer
* accounts authentication](https://shopify.dev/docs/api/customer).
*/
public class StoreCreditAccount extends AbstractResponse<StoreCreditAccount> implements Node {
    public StoreCreditAccount() {
    }

    public StoreCreditAccount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "balance": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "owner": {
                    responseData.put(key, UnknownHasStoreCreditAccounts.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "transactions": {
                    responseData.put(key, new StoreCreditAccountTransactionConnection(jsonAsObject(field.getValue(), key)));

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

    public StoreCreditAccount(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "StoreCreditAccount";
    }

    /**
    * The current balance of the store credit account.
    */

    public MoneyV2 getBalance() {
        return (MoneyV2) get("balance");
    }

    public StoreCreditAccount setBalance(MoneyV2 arg) {
        optimisticData.put(getKey("balance"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The owner of the store credit account.
    */

    public HasStoreCreditAccounts getOwner() {
        return (HasStoreCreditAccounts) get("owner");
    }

    public StoreCreditAccount setOwner(HasStoreCreditAccounts arg) {
        optimisticData.put(getKey("owner"), arg);
        return this;
    }

    /**
    * The transaction history of the store credit account.
    */

    public StoreCreditAccountTransactionConnection getTransactions() {
        return (StoreCreditAccountTransactionConnection) get("transactions");
    }

    public StoreCreditAccount setTransactions(StoreCreditAccountTransactionConnection arg) {
        optimisticData.put(getKey("transactions"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "balance": return true;

            case "id": return false;

            case "owner": return false;

            case "transactions": return true;

            default: return false;
        }
    }
}

