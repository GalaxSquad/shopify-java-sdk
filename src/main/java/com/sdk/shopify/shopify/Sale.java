// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;
import java.util.List;

/**
* An individual sale record associated with a sales agreement. Every money value in an order's sales
* data is represented in the currency's smallest unit. When amounts are divided across multiple line
* items, such as taxes or order discounts, the amounts might not divide evenly across all of the line
* items on the order. To address this, the remaining currency units that couldn't be divided evenly
* are allocated one at a time, starting with the first line item, until they are all accounted for. In
* aggregate, the values sum up correctly. In isolation, one line item might have a different tax or
* discount amount than another line item of the same price, before taxes and discounts. This is
* because the amount could not be divided evenly across the items. The allocation of currency units
* across line items is immutable. After they are allocated, currency units are never reallocated or
* redistributed among the line items.
*/

public interface Sale {
    String getGraphQlTypeName();

    SaleActionType getActionType();

    ID getId();

    SaleLineType getLineType();

    Integer getQuantity();

    List<SaleTax> getTaxes();

    MoneyBag getTotalAmount();

    MoneyBag getTotalDiscountAmountAfterTaxes();

    MoneyBag getTotalDiscountAmountBeforeTaxes();

    MoneyBag getTotalTaxAmount();
}

