// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The charge descriptors for a payments account.
*/
public class ShopifyPaymentsChargeStatementDescriptorQuery extends Query<ShopifyPaymentsChargeStatementDescriptorQuery> {
    ShopifyPaymentsChargeStatementDescriptorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The default charge statement descriptor.
    */
    public ShopifyPaymentsChargeStatementDescriptorQuery defaultValue() {
        startField("default");

        return this;
    }

    /**
    * The prefix of the statement descriptor.
    */
    public ShopifyPaymentsChargeStatementDescriptorQuery prefix() {
        startField("prefix");

        return this;
    }

    public ShopifyPaymentsChargeStatementDescriptorQuery onShopifyPaymentsDefaultChargeStatementDescriptor(ShopifyPaymentsDefaultChargeStatementDescriptorQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsDefaultChargeStatementDescriptor");
        queryDef.define(new ShopifyPaymentsDefaultChargeStatementDescriptorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ShopifyPaymentsChargeStatementDescriptorQuery onShopifyPaymentsJpChargeStatementDescriptor(ShopifyPaymentsJpChargeStatementDescriptorQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsJpChargeStatementDescriptor");
        queryDef.define(new ShopifyPaymentsJpChargeStatementDescriptorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
