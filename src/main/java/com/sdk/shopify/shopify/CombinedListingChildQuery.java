// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A child of a combined listing.
*/
public class CombinedListingChildQuery extends Query<CombinedListingChildQuery> {
    CombinedListingChildQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The parent variant.
    */
    public CombinedListingChildQuery parentVariant(ProductVariantQueryDefinition queryDef) {
        startField("parentVariant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The child product.
    */
    public CombinedListingChildQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
