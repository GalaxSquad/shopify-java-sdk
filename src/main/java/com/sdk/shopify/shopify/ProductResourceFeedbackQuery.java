// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Reports the status of product for a Sales Channel or Storefront API.
* This might include why a product is not available in a Sales Channel
* and how a merchant might fix this.
*/
public class ProductResourceFeedbackQuery extends Query<ProductResourceFeedbackQuery> {
    ProductResourceFeedbackQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The time when the feedback was generated. Used to help determine whether
    * incoming feedback is outdated compared to existing feedback.
    */
    public ProductResourceFeedbackQuery feedbackGeneratedAt() {
        startField("feedbackGeneratedAt");

        return this;
    }

    /**
    * The feedback messages presented to the merchant.
    */
    public ProductResourceFeedbackQuery messages() {
        startField("messages");

        return this;
    }

    /**
    * The ID of the product associated with the feedback.
    */
    public ProductResourceFeedbackQuery productId() {
        startField("productId");

        return this;
    }

    /**
    * The timestamp of the product associated with the feedback.
    */
    public ProductResourceFeedbackQuery productUpdatedAt() {
        startField("productUpdatedAt");

        return this;
    }

    /**
    * Conveys the state of the feedback and whether it requires merchant action or not.
    */
    public ProductResourceFeedbackQuery state() {
        startField("state");

        return this;
    }
}
