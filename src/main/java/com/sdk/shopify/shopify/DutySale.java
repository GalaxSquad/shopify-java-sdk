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
* A sale associated with a duty charge.
*/
public class DutySale extends AbstractResponse<DutySale> implements Sale {
    public DutySale() {
    }

    public DutySale(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "actionType": {
                    responseData.put(key, SaleActionType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "duty": {
                    responseData.put(key, new Duty(jsonAsObject(field.getValue(), key)));

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
        return "DutySale";
    }

    /**
    * The type of order action that the sale represents.
    */

    public SaleActionType getActionType() {
        return (SaleActionType) get("actionType");
    }

    public DutySale setActionType(SaleActionType arg) {
        optimisticData.put(getKey("actionType"), arg);
        return this;
    }

    /**
    * The duty for the associated sale.
    */

    public Duty getDuty() {
        return (Duty) get("duty");
    }

    public DutySale setDuty(Duty arg) {
        optimisticData.put(getKey("duty"), arg);
        return this;
    }

    /**
    * The unique ID for the sale.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public DutySale setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The line type assocated with the sale.
    */

    public SaleLineType getLineType() {
        return (SaleLineType) get("lineType");
    }

    public DutySale setLineType(SaleLineType arg) {
        optimisticData.put(getKey("lineType"), arg);
        return this;
    }

    /**
    * The number of units either ordered or intended to be returned.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public DutySale setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * All individual taxes associated with the sale.
    */

    public List<SaleTax> getTaxes() {
        return (List<SaleTax>) get("taxes");
    }

    public DutySale setTaxes(List<SaleTax> arg) {
        optimisticData.put(getKey("taxes"), arg);
        return this;
    }

    /**
    * The total sale amount after taxes and discounts.
    */

    public MoneyBag getTotalAmount() {
        return (MoneyBag) get("totalAmount");
    }

    public DutySale setTotalAmount(MoneyBag arg) {
        optimisticData.put(getKey("totalAmount"), arg);
        return this;
    }

    /**
    * The total discounts allocated to the sale after taxes.
    */

    public MoneyBag getTotalDiscountAmountAfterTaxes() {
        return (MoneyBag) get("totalDiscountAmountAfterTaxes");
    }

    public DutySale setTotalDiscountAmountAfterTaxes(MoneyBag arg) {
        optimisticData.put(getKey("totalDiscountAmountAfterTaxes"), arg);
        return this;
    }

    /**
    * The total discounts allocated to the sale before taxes.
    */

    public MoneyBag getTotalDiscountAmountBeforeTaxes() {
        return (MoneyBag) get("totalDiscountAmountBeforeTaxes");
    }

    public DutySale setTotalDiscountAmountBeforeTaxes(MoneyBag arg) {
        optimisticData.put(getKey("totalDiscountAmountBeforeTaxes"), arg);
        return this;
    }

    /**
    * The total amount of taxes for the sale.
    */

    public MoneyBag getTotalTaxAmount() {
        return (MoneyBag) get("totalTaxAmount");
    }

    public DutySale setTotalTaxAmount(MoneyBag arg) {
        optimisticData.put(getKey("totalTaxAmount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "actionType": return false;

            case "duty": return true;

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

