// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A sale associated with an additional fee charge.
*/
public class AdditionalFeeSale extends AbstractResponse<AdditionalFeeSale> implements Sale {
    public AdditionalFeeSale() {
    }

    public AdditionalFeeSale(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "actionType": {
                    responseData.put(key, SaleActionType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "additionalFee": {
                    responseData.put(key, new SaleAdditionalFee(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lineType": {
                    responseData.put(key, SaleLineType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "taxes": {
                    List<SaleTax> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SaleTax(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "totalAmount": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalDiscountAmountAfterTaxes": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalDiscountAmountBeforeTaxes": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalTaxAmount": {
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
        return "AdditionalFeeSale";
    }

    /**
    * The type of order action that the sale represents.
    */

    public SaleActionType getActionType() {
        return (SaleActionType) get("actionType");
    }

    public AdditionalFeeSale setActionType(SaleActionType arg) {
        optimisticData.put(getKey("actionType"), arg);
        return this;
    }

    /**
    * The additional fees for the associated sale.
    */

    public SaleAdditionalFee getAdditionalFee() {
        return (SaleAdditionalFee) get("additionalFee");
    }

    public AdditionalFeeSale setAdditionalFee(SaleAdditionalFee arg) {
        optimisticData.put(getKey("additionalFee"), arg);
        return this;
    }

    /**
    * The unique ID for the sale.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public AdditionalFeeSale setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The line type assocated with the sale.
    */

    public SaleLineType getLineType() {
        return (SaleLineType) get("lineType");
    }

    public AdditionalFeeSale setLineType(SaleLineType arg) {
        optimisticData.put(getKey("lineType"), arg);
        return this;
    }

    /**
    * The number of units either ordered or intended to be returned.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public AdditionalFeeSale setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * All individual taxes associated with the sale.
    */

    public List<SaleTax> getTaxes() {
        return (List<SaleTax>) get("taxes");
    }

    public AdditionalFeeSale setTaxes(List<SaleTax> arg) {
        optimisticData.put(getKey("taxes"), arg);
        return this;
    }

    /**
    * The total sale amount after taxes and discounts.
    */

    public MoneyBag getTotalAmount() {
        return (MoneyBag) get("totalAmount");
    }

    public AdditionalFeeSale setTotalAmount(MoneyBag arg) {
        optimisticData.put(getKey("totalAmount"), arg);
        return this;
    }

    /**
    * The total discounts allocated to the sale after taxes.
    */

    public MoneyBag getTotalDiscountAmountAfterTaxes() {
        return (MoneyBag) get("totalDiscountAmountAfterTaxes");
    }

    public AdditionalFeeSale setTotalDiscountAmountAfterTaxes(MoneyBag arg) {
        optimisticData.put(getKey("totalDiscountAmountAfterTaxes"), arg);
        return this;
    }

    /**
    * The total discounts allocated to the sale before taxes.
    */

    public MoneyBag getTotalDiscountAmountBeforeTaxes() {
        return (MoneyBag) get("totalDiscountAmountBeforeTaxes");
    }

    public AdditionalFeeSale setTotalDiscountAmountBeforeTaxes(MoneyBag arg) {
        optimisticData.put(getKey("totalDiscountAmountBeforeTaxes"), arg);
        return this;
    }

    /**
    * The total amount of taxes for the sale.
    */

    public MoneyBag getTotalTaxAmount() {
        return (MoneyBag) get("totalTaxAmount");
    }

    public AdditionalFeeSale setTotalTaxAmount(MoneyBag arg) {
        optimisticData.put(getKey("totalTaxAmount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "actionType": return false;

            case "additionalFee": return true;

            case "id": return false;

            case "lineType": return false;

            case "quantity": return false;

            case "taxes": return true;

            case "totalAmount": return true;

            case "totalDiscountAmountAfterTaxes": return true;

            case "totalDiscountAmountBeforeTaxes": return true;

            case "totalTaxAmount": return true;

            default: return false;
        }
    }
}

