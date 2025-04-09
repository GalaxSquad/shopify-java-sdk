// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A TenderTransaction represents a transaction with financial impact on a shop's balance sheet. A
* tender transaction always
* represents actual money movement between a buyer and a shop. TenderTransactions can be used instead
* of OrderTransactions
* for reconciling a shop's cash flow. A TenderTransaction is immutable once created.
*/
public class TenderTransaction extends AbstractResponse<TenderTransaction> implements Node {
    public TenderTransaction() {
    }

    public TenderTransaction(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "order": {
                    Order optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Order(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentMethod": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "processedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "remoteReference": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "test": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "transactionDetails": {
                    TenderTransactionDetails optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownTenderTransactionDetails.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "user": {
                    StaffMember optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StaffMember(jsonAsObject(field.getValue(), key));
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

    public TenderTransaction(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "TenderTransaction";
    }

    /**
    * The amount and currency of the tender transaction.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public TenderTransaction setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The order that's related to the tender transaction. This value is null if the order has been
    * deleted.
    */

    public Order getOrder() {
        return (Order) get("order");
    }

    public TenderTransaction setOrder(Order arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
    * Information about the payment method used for the transaction.
    */

    public String getPaymentMethod() {
        return (String) get("paymentMethod");
    }

    public TenderTransaction setPaymentMethod(String arg) {
        optimisticData.put(getKey("paymentMethod"), arg);
        return this;
    }

    /**
    * Date and time when the transaction was processed.
    */

    public String getProcessedAt() {
        return (String) get("processedAt");
    }

    public TenderTransaction setProcessedAt(String arg) {
        optimisticData.put(getKey("processedAt"), arg);
        return this;
    }

    /**
    * The remote gateway reference associated with the tender transaction.
    */

    public String getRemoteReference() {
        return (String) get("remoteReference");
    }

    public TenderTransaction setRemoteReference(String arg) {
        optimisticData.put(getKey("remoteReference"), arg);
        return this;
    }

    /**
    * Whether the transaction is a test transaction.
    */

    public Boolean getTest() {
        return (Boolean) get("test");
    }

    public TenderTransaction setTest(Boolean arg) {
        optimisticData.put(getKey("test"), arg);
        return this;
    }

    /**
    * Information about the payment instrument used for the transaction.
    */

    public TenderTransactionDetails getTransactionDetails() {
        return (TenderTransactionDetails) get("transactionDetails");
    }

    public TenderTransaction setTransactionDetails(TenderTransactionDetails arg) {
        optimisticData.put(getKey("transactionDetails"), arg);
        return this;
    }

    /**
    * The staff member who performed the transaction.
    */

    public StaffMember getUser() {
        return (StaffMember) get("user");
    }

    public TenderTransaction setUser(StaffMember arg) {
        optimisticData.put(getKey("user"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "id": return false;

            case "order": return true;

            case "paymentMethod": return false;

            case "processedAt": return false;

            case "remoteReference": return false;

            case "test": return false;

            case "transactionDetails": return false;

            case "user": return true;

            default: return false;
        }
    }
}

