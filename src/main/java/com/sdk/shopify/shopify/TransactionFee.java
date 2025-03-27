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

import java.math.BigDecimal;

import java.util.Map;

/**
* Transaction fee related to an order transaction.
*/
public class TransactionFee extends AbstractResponse<TransactionFee> implements Node {
    public TransactionFee() {
    }

    public TransactionFee(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "flatFee": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "flatFeeName": {
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

                case "rate": {
                    responseData.put(key, new BigDecimal(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "rateName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "taxAmount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "type": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public TransactionFee(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "TransactionFee";
    }

    /**
    * Amount of the fee.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public TransactionFee setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * Flat rate charge for a transaction.
    */

    public MoneyV2 getFlatFee() {
        return (MoneyV2) get("flatFee");
    }

    public TransactionFee setFlatFee(MoneyV2 arg) {
        optimisticData.put(getKey("flatFee"), arg);
        return this;
    }

    /**
    * Name of the credit card flat fee.
    */

    public String getFlatFeeName() {
        return (String) get("flatFeeName");
    }

    public TransactionFee setFlatFeeName(String arg) {
        optimisticData.put(getKey("flatFeeName"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Percentage charge.
    */

    public BigDecimal getRate() {
        return (BigDecimal) get("rate");
    }

    public TransactionFee setRate(BigDecimal arg) {
        optimisticData.put(getKey("rate"), arg);
        return this;
    }

    /**
    * Name of the credit card rate.
    */

    public String getRateName() {
        return (String) get("rateName");
    }

    public TransactionFee setRateName(String arg) {
        optimisticData.put(getKey("rateName"), arg);
        return this;
    }

    /**
    * Tax amount charged on the fee.
    */

    public MoneyV2 getTaxAmount() {
        return (MoneyV2) get("taxAmount");
    }

    public TransactionFee setTaxAmount(MoneyV2 arg) {
        optimisticData.put(getKey("taxAmount"), arg);
        return this;
    }

    /**
    * Name of the type of fee.
    */

    public String getType() {
        return (String) get("type");
    }

    public TransactionFee setType(String arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "flatFee": return true;

            case "flatFeeName": return false;

            case "id": return false;

            case "rate": return false;

            case "rateName": return false;

            case "taxAmount": return true;

            case "type": return false;

            default: return false;
        }
    }
}

