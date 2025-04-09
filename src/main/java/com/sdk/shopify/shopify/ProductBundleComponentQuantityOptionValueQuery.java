// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A quantity option value related to a componentized product.
*/
public class ProductBundleComponentQuantityOptionValueQuery extends Query<ProductBundleComponentQuantityOptionValueQuery> {
    ProductBundleComponentQuantityOptionValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The name of the option value.
    */
    public ProductBundleComponentQuantityOptionValueQuery name() {
        startField("name");

        return this;
    }

    /**
    * The quantity of the option value.
    */
    public ProductBundleComponentQuantityOptionValueQuery quantity() {
        startField("quantity");

        return this;
    }
}
