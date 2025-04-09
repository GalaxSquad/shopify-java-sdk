// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The tax allocated to a sale from a single tax line.
*/
public class SaleTax extends AbstractResponse<SaleTax> {
    public SaleTax() {
    }

    public SaleTax(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "taxLine": {
                    responseData.put(key, new TaxLine(jsonAsObject(field.getValue(), key)));

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
        return "SaleTax";
    }

    /**
    * The portion of the total tax amount on the related sale that comes from the associated tax line.
    */

    public MoneyBag getAmount() {
        return (MoneyBag) get("amount");
    }

    public SaleTax setAmount(MoneyBag arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The unique ID for the sale tax.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public SaleTax setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The tax line associated with the sale.
    */

    public TaxLine getTaxLine() {
        return (TaxLine) get("taxLine");
    }

    public SaleTax setTaxLine(TaxLine arg) {
        optimisticData.put(getKey("taxLine"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "id": return false;

            case "taxLine": return true;

            default: return false;
        }
    }
}

