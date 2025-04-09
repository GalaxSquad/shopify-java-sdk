// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;

/**
* Interface for a gift card transaction.
*/

public interface GiftCardTransaction {
    String getGraphQlTypeName();

    MoneyV2 getAmount();

    GiftCard getGiftCard();

    ID getId();

    Metafield getMetafield();

    MetafieldConnection getMetafields();

    String getNote();

    String getProcessedAt();
}

