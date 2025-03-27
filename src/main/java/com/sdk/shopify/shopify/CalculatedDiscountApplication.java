// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* A [discount
* application](https://shopify.dev/api/admin-graphql/latest/interfaces/discountapplication) involved
* in order editing that might be newly added or have new changes applied.
*/

public interface CalculatedDiscountApplication {
    String getGraphQlTypeName();

    DiscountApplicationAllocationMethod getAllocationMethod();

    DiscountApplicationLevel getAppliedTo();

    String getDescription();

    ID getId();

    DiscountApplicationTargetSelection getTargetSelection();

    DiscountApplicationTargetType getTargetType();

    PricingValue getValue();
}

