// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A quantity option related to a bundle.
*/
public class ProductBundleComponentQuantityOptionQuery extends Query<ProductBundleComponentQuantityOptionQuery> {
    ProductBundleComponentQuantityOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The name of the option value.
    */
    public ProductBundleComponentQuantityOptionQuery name() {
        startField("name");

        return this;
    }

    /**
    * The option that was created on the parent product.
    */
    public ProductBundleComponentQuantityOptionQuery parentOption(ProductOptionQueryDefinition queryDef) {
        startField("parentOption");

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity values of the option.
    */
    public ProductBundleComponentQuantityOptionQuery values(ProductBundleComponentQuantityOptionValueQueryDefinition queryDef) {
        startField("values");

        _queryBuilder.append('{');
        queryDef.define(new ProductBundleComponentQuantityOptionValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
