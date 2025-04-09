// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Storefront password information.
*/
public class OnlineStorePasswordProtectionQuery extends Query<OnlineStorePasswordProtectionQuery> {
    OnlineStorePasswordProtectionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the storefront password is enabled.
    */
    public OnlineStorePasswordProtectionQuery enabled() {
        startField("enabled");

        return this;
    }
}
