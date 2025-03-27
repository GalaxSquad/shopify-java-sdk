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
* An expiration transaction which decreases the store credit account balance.
* Expiration transactions are created automatically when a [store credit account credit
* transaction](https://shopify.dev/api/admin-graphql/latest/objects/StoreCreditAccountCreditTransactio
* n) expires.
* The amount subtracted from the balance is equal to the remaining amount of the credit transaction.
*/
public class StoreCreditAccountExpirationTransaction extends AbstractResponse<StoreCreditAccountExpirationTransaction> implements StoreCreditAccountTransaction {
    public StoreCreditAccountExpirationTransaction() {
    }

    public StoreCreditAccountExpirationTransaction(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "account": {
                    responseData.put(key, new StoreCreditAccount(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "balanceAfterTransaction": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "creditTransaction": {
                    responseData.put(key, new StoreCreditAccountCreditTransaction(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "event": {
                    responseData.put(key, StoreCreditSystemEvent.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "origin": {
                    StoreCreditAccountTransactionOrigin optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownStoreCreditAccountTransactionOrigin.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "StoreCreditAccountExpirationTransaction";
    }

    /**
    * The store credit account that the transaction belongs to.
    */

    public StoreCreditAccount getAccount() {
        return (StoreCreditAccount) get("account");
    }

    public StoreCreditAccountExpirationTransaction setAccount(StoreCreditAccount arg) {
        optimisticData.put(getKey("account"), arg);
        return this;
    }

    /**
    * The amount of the transaction.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public StoreCreditAccountExpirationTransaction setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The balance of the account after the transaction.
    */

    public MoneyV2 getBalanceAfterTransaction() {
        return (MoneyV2) get("balanceAfterTransaction");
    }

    public StoreCreditAccountExpirationTransaction setBalanceAfterTransaction(MoneyV2 arg) {
        optimisticData.put(getKey("balanceAfterTransaction"), arg);
        return this;
    }

    /**
    * The date and time when the transaction was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public StoreCreditAccountExpirationTransaction setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The credit transaction which expired.
    */

    public StoreCreditAccountCreditTransaction getCreditTransaction() {
        return (StoreCreditAccountCreditTransaction) get("creditTransaction");
    }

    public StoreCreditAccountExpirationTransaction setCreditTransaction(StoreCreditAccountCreditTransaction arg) {
        optimisticData.put(getKey("creditTransaction"), arg);
        return this;
    }

    /**
    * The event that caused the store credit account transaction.
    */

    public StoreCreditSystemEvent getEvent() {
        return (StoreCreditSystemEvent) get("event");
    }

    public StoreCreditAccountExpirationTransaction setEvent(StoreCreditSystemEvent arg) {
        optimisticData.put(getKey("event"), arg);
        return this;
    }

    /**
    * The origin of the store credit account transaction.
    */

    public StoreCreditAccountTransactionOrigin getOrigin() {
        return (StoreCreditAccountTransactionOrigin) get("origin");
    }

    public StoreCreditAccountExpirationTransaction setOrigin(StoreCreditAccountTransactionOrigin arg) {
        optimisticData.put(getKey("origin"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "account": return true;

            case "amount": return true;

            case "balanceAfterTransaction": return true;

            case "createdAt": return false;

            case "creditTransaction": return true;

            case "event": return false;

            case "origin": return false;

            default: return false;
        }
    }
}

