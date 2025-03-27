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

