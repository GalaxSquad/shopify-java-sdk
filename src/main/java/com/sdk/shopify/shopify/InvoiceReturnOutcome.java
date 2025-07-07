// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The financial transfer details for a return outcome that results in an invoice.
*/
public class InvoiceReturnOutcome extends AbstractResponse<InvoiceReturnOutcome> implements ReturnOutcomeFinancialTransfer {
    public InvoiceReturnOutcome() {
    }

    public InvoiceReturnOutcome(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

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
        return "InvoiceReturnOutcome";
    }

    /**
    * The total monetary value to be invoiced in shop and presentment currencies.
    */

    public MoneyBag getAmount() {
        return (MoneyBag) get("amount");
    }

    public InvoiceReturnOutcome setAmount(MoneyBag arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            default: return false;
        }
    }
}

