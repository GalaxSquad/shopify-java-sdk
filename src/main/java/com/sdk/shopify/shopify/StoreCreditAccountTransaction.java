// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Interface for a store credit account transaction.
*/

public interface StoreCreditAccountTransaction {
    String getGraphQlTypeName();

    StoreCreditAccount getAccount();

    MoneyV2 getAmount();

    MoneyV2 getBalanceAfterTransaction();

    String getCreatedAt();

    StoreCreditSystemEvent getEvent();

    StoreCreditAccountTransactionOrigin getOrigin();
}

