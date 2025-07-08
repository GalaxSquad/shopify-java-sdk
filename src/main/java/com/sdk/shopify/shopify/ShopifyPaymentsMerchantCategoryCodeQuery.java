// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A MerchantCategoryCode (MCC) is a four-digit number listed in ISO 18245 for retail financial
* services and used to classify the business by the type of goods or services it provides.
*/
public class ShopifyPaymentsMerchantCategoryCodeQuery extends Query<ShopifyPaymentsMerchantCategoryCodeQuery> {
    ShopifyPaymentsMerchantCategoryCodeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The category of the MCC.
    */
    public ShopifyPaymentsMerchantCategoryCodeQuery category() {
        startField("category");

        return this;
    }

    /**
    * The category label of the MCC.
    */
    public ShopifyPaymentsMerchantCategoryCodeQuery categoryLabel() {
        startField("categoryLabel");

        return this;
    }

    /**
    * A four-digit number listed in ISO 18245.
    */
    public ShopifyPaymentsMerchantCategoryCodeQuery code() {
        startField("code");

        return this;
    }

    /**
    * The ID of the MCC.
    */
    public ShopifyPaymentsMerchantCategoryCodeQuery id() {
        startField("id");

        return this;
    }

    /**
    * The subcategory label of the MCC.
    */
    public ShopifyPaymentsMerchantCategoryCodeQuery subcategoryLabel() {
        startField("subcategoryLabel");

        return this;
    }
}
