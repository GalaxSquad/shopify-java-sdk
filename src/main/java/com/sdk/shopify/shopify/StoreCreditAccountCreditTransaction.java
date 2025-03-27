// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A credit transaction which increases the store credit account balance.
*/
public class StoreCreditAccountCreditTransaction extends AbstractResponse<StoreCreditAccountCreditTransaction> implements Node, StoreCreditAccountTransaction {
    public StoreCreditAccountCreditTransaction() {
    }

    public StoreCreditAccountCreditTransaction(JsonObject fields) throws SchemaViolationError {
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

                case "event": {
                    responseData.put(key, StoreCreditSystemEvent.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "expiresAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

                case "remainingAmount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

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

    public StoreCreditAccountCreditTransaction(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "StoreCreditAccountCreditTransaction";
    }

    /**
    * The store credit account that the transaction belongs to.
    */

    public StoreCreditAccount getAccount() {
        return (StoreCreditAccount) get("account");
    }

    public StoreCreditAccountCreditTransaction setAccount(StoreCreditAccount arg) {
        optimisticData.put(getKey("account"), arg);
        return this;
    }

    /**
    * The amount of the transaction.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public StoreCreditAccountCreditTransaction setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The balance of the account after the transaction.
    */

    public MoneyV2 getBalanceAfterTransaction() {
        return (MoneyV2) get("balanceAfterTransaction");
    }

    public StoreCreditAccountCreditTransaction setBalanceAfterTransaction(MoneyV2 arg) {
        optimisticData.put(getKey("balanceAfterTransaction"), arg);
        return this;
    }

    /**
    * The date and time when the transaction was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public StoreCreditAccountCreditTransaction setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The event that caused the store credit account transaction.
    */

    public StoreCreditSystemEvent getEvent() {
        return (StoreCreditSystemEvent) get("event");
    }

    public StoreCreditAccountCreditTransaction setEvent(StoreCreditSystemEvent arg) {
        optimisticData.put(getKey("event"), arg);
        return this;
    }

    /**
    * The time at which the transaction expires.
    * Debit transactions will always spend the soonest expiring credit first.
    */

    public String getExpiresAt() {
        return (String) get("expiresAt");
    }

    public StoreCreditAccountCreditTransaction setExpiresAt(String arg) {
        optimisticData.put(getKey("expiresAt"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The origin of the store credit account transaction.
    */

    public StoreCreditAccountTransactionOrigin getOrigin() {
        return (StoreCreditAccountTransactionOrigin) get("origin");
    }

    public StoreCreditAccountCreditTransaction setOrigin(StoreCreditAccountTransactionOrigin arg) {
        optimisticData.put(getKey("origin"), arg);
        return this;
    }

    /**
    * The remaining amount of the credit.
    * The remaining amount will decrease when a debit spends this credit. It may also increase if that
    * debit is subsequently reverted.
    * In the event that the credit expires, the remaining amount will represent the amount that remained
    * as the expiry ocurred.
    */

    public MoneyV2 getRemainingAmount() {
        return (MoneyV2) get("remainingAmount");
    }

    public StoreCreditAccountCreditTransaction setRemainingAmount(MoneyV2 arg) {
        optimisticData.put(getKey("remainingAmount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "account": return true;

            case "amount": return true;

            case "balanceAfterTransaction": return true;

            case "createdAt": return false;

            case "event": return false;

            case "expiresAt": return false;

            case "id": return false;

            case "origin": return false;

            case "remainingAmount": return true;

            default: return false;
        }
    }
}

