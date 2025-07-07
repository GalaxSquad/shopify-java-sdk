// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Discount applications capture the intentions of a discount source at
* the time of application on an order's line items or shipping lines.
* Discount applications don't represent the actual final amount discounted on a line (line item or
* shipping line). The actual amount discounted on a line is represented by the
* [DiscountAllocation](https://shopify.dev/api/admin-graphql/latest/objects/discountallocation)
* object.
*/

public interface DiscountApplication {
    String getGraphQlTypeName();

    DiscountApplicationAllocationMethod getAllocationMethod();

    Integer getIndex();

    DiscountApplicationTargetSelection getTargetSelection();

    DiscountApplicationTargetType getTargetType();

    PricingValue getValue();
}

