// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The charge descriptors for a Japanese payments account.
*/
public class ShopifyPaymentsJpChargeStatementDescriptorQuery extends Query<ShopifyPaymentsJpChargeStatementDescriptorQuery> {
    ShopifyPaymentsJpChargeStatementDescriptorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The default charge statement descriptor.
    */
    public ShopifyPaymentsJpChargeStatementDescriptorQuery defaultValue() {
        startField("default");

        return this;
    }

    /**
    * The charge statement descriptor in kana.
    */
    public ShopifyPaymentsJpChargeStatementDescriptorQuery kana() {
        startField("kana");

        return this;
    }

    /**
    * The charge statement descriptor in kanji.
    */
    public ShopifyPaymentsJpChargeStatementDescriptorQuery kanji() {
        startField("kanji");

        return this;
    }

    /**
    * The prefix of the statement descriptor.
    */
    public ShopifyPaymentsJpChargeStatementDescriptorQuery prefix() {
        startField("prefix");

        return this;
    }
}
