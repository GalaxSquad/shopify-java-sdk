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
* Information about the credit card used for this transaction.
*/
public class TenderTransactionCreditCardDetails extends AbstractResponse<TenderTransactionCreditCardDetails> implements TenderTransactionDetails {
    public TenderTransactionCreditCardDetails() {
    }

    public TenderTransactionCreditCardDetails(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "creditCardCompany": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "creditCardNumber": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "TenderTransactionCreditCardDetails";
    }

    /**
    * The name of the company that issued the customer's credit card. Example: `Visa`.
    */

    public String getCreditCardCompany() {
        return (String) get("creditCardCompany");
    }

    public TenderTransactionCreditCardDetails setCreditCardCompany(String arg) {
        optimisticData.put(getKey("creditCardCompany"), arg);
        return this;
    }

    /**
    * The customer's credit card number, with all digits except the last 4 redacted. Example: `•••• ••••
    * •••• 1234`
    */

    public String getCreditCardNumber() {
        return (String) get("creditCardNumber");
    }

    public TenderTransactionCreditCardDetails setCreditCardNumber(String arg) {
        optimisticData.put(getKey("creditCardNumber"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "creditCardCompany": return false;

            case "creditCardNumber": return false;

            default: return false;
        }
    }
}

