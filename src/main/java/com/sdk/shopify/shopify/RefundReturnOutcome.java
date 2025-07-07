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
* The financial transfer details for a return outcome that results in a refund.
*/
public class RefundReturnOutcome extends AbstractResponse<RefundReturnOutcome> implements ReturnOutcomeFinancialTransfer {
    public RefundReturnOutcome() {
    }

    public RefundReturnOutcome(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "suggestedRefundMethods": {
                    List<SuggestedRefundMethod> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(UnknownSuggestedRefundMethod.create(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "suggestedTransactions": {
                    List<SuggestedOrderTransaction> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SuggestedOrderTransaction(jsonAsObject(element1, key)));
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
        return "RefundReturnOutcome";
    }

    /**
    * The total monetary value to be refunded in shop and presentment currencies.
    */

    public MoneyBag getAmount() {
        return (MoneyBag) get("amount");
    }

    public RefundReturnOutcome setAmount(MoneyBag arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * A list of suggested refund methods.
    */

    public List<SuggestedRefundMethod> getSuggestedRefundMethods() {
        return (List<SuggestedRefundMethod>) get("suggestedRefundMethods");
    }

    public RefundReturnOutcome setSuggestedRefundMethods(List<SuggestedRefundMethod> arg) {
        optimisticData.put(getKey("suggestedRefundMethods"), arg);
        return this;
    }

    /**
    * A list of suggested order transactions.
    */

    public List<SuggestedOrderTransaction> getSuggestedTransactions() {
        return (List<SuggestedOrderTransaction>) get("suggestedTransactions");
    }

    public RefundReturnOutcome setSuggestedTransactions(List<SuggestedOrderTransaction> arg) {
        optimisticData.put(getKey("suggestedTransactions"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "suggestedRefundMethods": return false;

            case "suggestedTransactions": return true;

            default: return false;
        }
    }
}

