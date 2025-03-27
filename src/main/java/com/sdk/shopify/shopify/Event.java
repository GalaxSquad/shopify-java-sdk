// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* Events chronicle resource activities such as the creation of an article, the fulfillment of an
* order, or the
* addition of a product.
*/

public interface Event {
    String getGraphQlTypeName();

    String getAction();

    String getAppTitle();

    Boolean getAttributeToApp();

    Boolean getAttributeToUser();

    String getCreatedAt();

    Boolean getCriticalAlert();

    ID getId();

    String getMessage();
}

