// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A suggested transaction. Suggested transaction are usually used in the context of refunds
* and exchanges.
*/
public class SuggestedOrderTransaction extends AbstractResponse<SuggestedOrderTransaction> {
    public SuggestedOrderTransaction() {
    }

    public SuggestedOrderTransaction(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accountNumber": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "amountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "formattedGateway": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gateway": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "kind": {
                    responseData.put(key, SuggestedOrderTransactionKind.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "maximumRefundableSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "parentTransaction": {
                    OrderTransaction optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderTransaction(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentDetails": {
                    PaymentDetails optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownPaymentDetails.create(jsonAsObject(field.getValue(), key));
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
        return "SuggestedOrderTransaction";
    }

    /**
    * The masked account number associated with the payment method.
    */

    public String getAccountNumber() {
        return (String) get("accountNumber");
    }

    public SuggestedOrderTransaction setAccountNumber(String arg) {
        optimisticData.put(getKey("accountNumber"), arg);
        return this;
    }

    /**
    * The amount and currency of the suggested order transaction in shop and presentment currencies.
    */

    public MoneyBag getAmountSet() {
        return (MoneyBag) get("amountSet");
    }

    public SuggestedOrderTransaction setAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("amountSet"), arg);
        return this;
    }

    /**
    * The human-readable payment gateway name suggested to process the transaction.
    */

    public String getFormattedGateway() {
        return (String) get("formattedGateway");
    }

    public SuggestedOrderTransaction setFormattedGateway(String arg) {
        optimisticData.put(getKey("formattedGateway"), arg);
        return this;
    }

    /**
    * The suggested payment gateway used to process the transaction.
    */

    public String getGateway() {
        return (String) get("gateway");
    }

    public SuggestedOrderTransaction setGateway(String arg) {
        optimisticData.put(getKey("gateway"), arg);
        return this;
    }

    /**
    * Specifies the kind of the suggested order transaction.
    */

    public SuggestedOrderTransactionKind getKind() {
        return (SuggestedOrderTransactionKind) get("kind");
    }

    public SuggestedOrderTransaction setKind(SuggestedOrderTransactionKind arg) {
        optimisticData.put(getKey("kind"), arg);
        return this;
    }

    /**
    * Specifies the available amount to refund on the gateway in shop and presentment currencies. Only
    * available within SuggestedRefund.
    */

    public MoneyBag getMaximumRefundableSet() {
        return (MoneyBag) get("maximumRefundableSet");
    }

    public SuggestedOrderTransaction setMaximumRefundableSet(MoneyBag arg) {
        optimisticData.put(getKey("maximumRefundableSet"), arg);
        return this;
    }

    /**
    * The associated parent transaction, for example the authorization of a capture.
    */

    public OrderTransaction getParentTransaction() {
        return (OrderTransaction) get("parentTransaction");
    }

    public SuggestedOrderTransaction setParentTransaction(OrderTransaction arg) {
        optimisticData.put(getKey("parentTransaction"), arg);
        return this;
    }

    /**
    * The associated payment details related to the transaction.
    */

    public PaymentDetails getPaymentDetails() {
        return (PaymentDetails) get("paymentDetails");
    }

    public SuggestedOrderTransaction setPaymentDetails(PaymentDetails arg) {
        optimisticData.put(getKey("paymentDetails"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accountNumber": return false;

            case "amountSet": return true;

            case "formattedGateway": return false;

            case "gateway": return false;

            case "kind": return false;

            case "maximumRefundableSet": return true;

            case "parentTransaction": return true;

            case "paymentDetails": return false;

            default: return false;
        }
    }
}

