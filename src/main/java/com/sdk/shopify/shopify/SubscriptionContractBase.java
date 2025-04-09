// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import java.util.List;

/**
* Represents subscription contract common fields.
*/

public interface SubscriptionContractBase {
    String getGraphQlTypeName();

    App getApp();

    String getAppAdminUrl();

    CurrencyCode getCurrencyCode();

    List<Attribute> getCustomAttributes();

    Customer getCustomer();

    CustomerPaymentMethod getCustomerPaymentMethod();

    SubscriptionDeliveryMethod getDeliveryMethod();

    MoneyV2 getDeliveryPrice();

    SubscriptionManualDiscountConnection getDiscounts();

    SubscriptionLineConnection getLines();

    Count getLinesCount();

    String getNote();

    OrderConnection getOrders();

    String getUpdatedAt();
}

