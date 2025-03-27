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
* A calculated exchange line item.
*/
public class CalculatedExchangeLineItem extends AbstractResponse<CalculatedExchangeLineItem> {
    public CalculatedExchangeLineItem() {
    }

    public CalculatedExchangeLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "calculatedDiscountAllocations": {
                    List<CalculatedDiscountAllocation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CalculatedDiscountAllocation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "discountedUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "originalUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "subtotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalTaxSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "variant": {
                    ProductVariant optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariant(jsonAsObject(field.getValue(), key));
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
        return "CalculatedExchangeLineItem";
    }

    /**
    * The discounts that have been allocated onto the line item by discount applications.
    */

    public List<CalculatedDiscountAllocation> getCalculatedDiscountAllocations() {
        return (List<CalculatedDiscountAllocation>) get("calculatedDiscountAllocations");
    }

    public CalculatedExchangeLineItem setCalculatedDiscountAllocations(List<CalculatedDiscountAllocation> arg) {
        optimisticData.put(getKey("calculatedDiscountAllocations"), arg);
        return this;
    }

    /**
    * The unit price of the exchange line item after discounts.
    */

    public MoneyBag getDiscountedUnitPriceSet() {
        return (MoneyBag) get("discountedUnitPriceSet");
    }

    public CalculatedExchangeLineItem setDiscountedUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("discountedUnitPriceSet"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public CalculatedExchangeLineItem setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The original unit price of the exchange line item before discounts.
    */

    public MoneyBag getOriginalUnitPriceSet() {
        return (MoneyBag) get("originalUnitPriceSet");
    }

    public CalculatedExchangeLineItem setOriginalUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("originalUnitPriceSet"), arg);
        return this;
    }

    /**
    * The quantity being exchanged.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public CalculatedExchangeLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The calculated subtotal set of the exchange line item, including discounts.
    */

    public MoneyBag getSubtotalSet() {
        return (MoneyBag) get("subtotalSet");
    }

    public CalculatedExchangeLineItem setSubtotalSet(MoneyBag arg) {
        optimisticData.put(getKey("subtotalSet"), arg);
        return this;
    }

    /**
    * The total tax of the exchange line item.
    */

    public MoneyBag getTotalTaxSet() {
        return (MoneyBag) get("totalTaxSet");
    }

    public CalculatedExchangeLineItem setTotalTaxSet(MoneyBag arg) {
        optimisticData.put(getKey("totalTaxSet"), arg);
        return this;
    }

    /**
    * The variant being exchanged.
    */

    public ProductVariant getVariant() {
        return (ProductVariant) get("variant");
    }

    public CalculatedExchangeLineItem setVariant(ProductVariant arg) {
        optimisticData.put(getKey("variant"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "calculatedDiscountAllocations": return true;

            case "discountedUnitPriceSet": return true;

            case "id": return false;

            case "originalUnitPriceSet": return true;

            case "quantity": return false;

            case "subtotalSet": return true;

            case "totalTaxSet": return true;

            case "variant": return true;

            default: return false;
        }
    }
}

