// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The charge descriptors for a payments account.
*/
public class ShopifyPaymentsDefaultChargeStatementDescriptorQuery extends Query<ShopifyPaymentsDefaultChargeStatementDescriptorQuery> {
    ShopifyPaymentsDefaultChargeStatementDescriptorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The default charge statement descriptor.
    */
    public ShopifyPaymentsDefaultChargeStatementDescriptorQuery defaultValue() {
        startField("default");

        return this;
    }

    /**
    * The prefix of the statement descriptor.
    */
    public ShopifyPaymentsDefaultChargeStatementDescriptorQuery prefix() {
        startField("prefix");

        return this;
    }
}
