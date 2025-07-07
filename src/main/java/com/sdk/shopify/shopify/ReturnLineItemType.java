// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* A return line item of any type.
*/

public interface ReturnLineItemType {
    String getGraphQlTypeName();

    String getCustomerNote();

    ID getId();

    Integer getProcessableQuantity();

    Integer getProcessedQuantity();

    Integer getQuantity();

    Integer getRefundableQuantity();

    Integer getRefundedQuantity();

    ReturnReason getReturnReason();

    String getReturnReasonNote();

    Integer getUnprocessedQuantity();
}

