// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* A contract between a merchant and a customer to do business. Shopify creates a sales agreement
* whenever an order is placed, edited, or refunded. A sales agreement has one or more sales records,
* which provide itemized details about the initial agreement or subsequent changes made to the order.
* For example, when a customer places an order, Shopify creates the order, generates a sales
* agreement, and records a sale for each line item purchased in the order. A sale record is specific
* to a type of order line. Order lines can represent different things such as a purchased product, a
* tip added by a customer, shipping costs collected at checkout, and more.
*/

public interface SalesAgreement {
    String getGraphQlTypeName();

    App getApp();

    String getHappenedAt();

    ID getId();

    OrderActionType getReason();

    SaleConnection getSales();

    StaffMember getUser();
}

