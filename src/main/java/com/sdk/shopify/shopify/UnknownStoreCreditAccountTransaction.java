// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Interface for a store credit account transaction.
*/
public class UnknownStoreCreditAccountTransaction extends AbstractResponse<UnknownStoreCreditAccountTransaction> implements StoreCreditAccountTransaction {
    public UnknownStoreCreditAccountTransaction() {
    }

    public UnknownStoreCreditAccountTransaction(JsonObject fields) throws SchemaViolationError {
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

    public static StoreCreditAccountTransaction create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "StoreCreditAccountCreditTransaction": {
                return new StoreCreditAccountCreditTransaction(fields);
            }

            case "StoreCreditAccountDebitRevertTransaction": {
                return new StoreCreditAccountDebitRevertTransaction(fields);
            }

            case "StoreCreditAccountDebitTransaction": {
                return new StoreCreditAccountDebitTransaction(fields);
            }

            case "StoreCreditAccountExpirationTransaction": {
                return new StoreCreditAccountExpirationTransaction(fields);
            }

            default: {
                return new UnknownStoreCreditAccountTransaction(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The store credit account that the transaction belongs to.
    */

    public StoreCreditAccount getAccount() {
        return (StoreCreditAccount) get("account");
    }

    public UnknownStoreCreditAccountTransaction setAccount(StoreCreditAccount arg) {
        optimisticData.put(getKey("account"), arg);
        return this;
    }

    /**
    * The amount of the transaction.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public UnknownStoreCreditAccountTransaction setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The balance of the account after the transaction.
    */

    public MoneyV2 getBalanceAfterTransaction() {
        return (MoneyV2) get("balanceAfterTransaction");
    }

    public UnknownStoreCreditAccountTransaction setBalanceAfterTransaction(MoneyV2 arg) {
        optimisticData.put(getKey("balanceAfterTransaction"), arg);
        return this;
    }

    /**
    * The date and time when the transaction was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public UnknownStoreCreditAccountTransaction setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The event that caused the store credit account transaction.
    */

    public StoreCreditSystemEvent getEvent() {
        return (StoreCreditSystemEvent) get("event");
    }

    public UnknownStoreCreditAccountTransaction setEvent(StoreCreditSystemEvent arg) {
        optimisticData.put(getKey("event"), arg);
        return this;
    }

    /**
    * The origin of the store credit account transaction.
    */

    public StoreCreditAccountTransactionOrigin getOrigin() {
        return (StoreCreditAccountTransactionOrigin) get("origin");
    }

    public UnknownStoreCreditAccountTransaction setOrigin(StoreCreditAccountTransactionOrigin arg) {
        optimisticData.put(getKey("origin"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "account": return true;

            case "amount": return true;

            case "balanceAfterTransaction": return true;

            case "createdAt": return false;

            case "event": return false;

            case "origin": return false;

            default: return false;
        }
    }
}

