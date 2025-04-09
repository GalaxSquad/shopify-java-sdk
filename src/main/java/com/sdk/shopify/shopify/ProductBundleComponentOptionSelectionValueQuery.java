// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A component option value related to a bundle line.
*/
public class ProductBundleComponentOptionSelectionValueQuery extends Query<ProductBundleComponentOptionSelectionValueQuery> {
    ProductBundleComponentOptionSelectionValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Selection status of the option.
    */
    public ProductBundleComponentOptionSelectionValueQuery selectionStatus() {
        startField("selectionStatus");

        return this;
    }

    /**
    * The value of the option.
    */
    public ProductBundleComponentOptionSelectionValueQuery value() {
        startField("value");

        return this;
    }
}
