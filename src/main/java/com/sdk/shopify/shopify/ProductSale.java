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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A sale associated with a product.
*/
public class ProductSale extends AbstractResponse<ProductSale> implements Sale {
    public ProductSale() {
    }

    public ProductSale(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "actionType": {
                    responseData.put(key, SaleActionType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lineItem": {
                    responseData.put(key, new LineItem(jsonAsObject(field.getValue(), key)));

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
        return "ProductSale";
    }

    /**
    * The type of order action that the sale represents.
    */

    public SaleActionType getActionType() {
        return (SaleActionType) get("actionType");
    }

    public ProductSale setActionType(SaleActionType arg) {
        optimisticData.put(getKey("actionType"), arg);
        return this;
    }

    /**
    * The unique ID for the sale.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public ProductSale setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The line item for the associated sale.
    */

    public LineItem getLineItem() {
        return (LineItem) get("lineItem");
    }

    public ProductSale setLineItem(LineItem arg) {
        optimisticData.put(getKey("lineItem"), arg);
        return this;
    }

    /**
    * The line type assocated with the sale.
    */

    public SaleLineType getLineType() {
        return (SaleLineType) get("lineType");
    }

    public ProductSale setLineType(SaleLineType arg) {
        optimisticData.put(getKey("lineType"), arg);
        return this;
    }

    /**
    * The number of units either ordered or intended to be returned.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public ProductSale setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * All individual taxes associated with the sale.
    */

    public List<SaleTax> getTaxes() {
        return (List<SaleTax>) get("taxes");
    }

    public ProductSale setTaxes(List<SaleTax> arg) {
        optimisticData.put(getKey("taxes"), arg);
        return this;
    }

    /**
    * The total sale amount after taxes and discounts.
    */

    public MoneyBag getTotalAmount() {
        return (MoneyBag) get("totalAmount");
    }

    public ProductSale setTotalAmount(MoneyBag arg) {
        optimisticData.put(getKey("totalAmount"), arg);
        return this;
    }

    /**
    * The total discounts allocated to the sale after taxes.
    */

    public MoneyBag getTotalDiscountAmountAfterTaxes() {
        return (MoneyBag) get("totalDiscountAmountAfterTaxes");
    }

    public ProductSale setTotalDiscountAmountAfterTaxes(MoneyBag arg) {
        optimisticData.put(getKey("totalDiscountAmountAfterTaxes"), arg);
        return this;
    }

    /**
    * The total discounts allocated to the sale before taxes.
    */

    public MoneyBag getTotalDiscountAmountBeforeTaxes() {
        return (MoneyBag) get("totalDiscountAmountBeforeTaxes");
    }

    public ProductSale setTotalDiscountAmountBeforeTaxes(MoneyBag arg) {
        optimisticData.put(getKey("totalDiscountAmountBeforeTaxes"), arg);
        return this;
    }

    /**
    * The total amount of taxes for the sale.
    */

    public MoneyBag getTotalTaxAmount() {
        return (MoneyBag) get("totalTaxAmount");
    }

    public ProductSale setTotalTaxAmount(MoneyBag arg) {
        optimisticData.put(getKey("totalTaxAmount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "actionType": return false;

            case "id": return false;

            case "lineItem": return true;

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

