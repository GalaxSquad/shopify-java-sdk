// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A change to the order representing the addition of an existing product variant.
*/
public class OrderStagedChangeAddVariantQuery extends Query<OrderStagedChangeAddVariantQuery> {
    OrderStagedChangeAddVariantQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The quantity of the product variant that was added.
    */
    public OrderStagedChangeAddVariantQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The product variant that was added.
    */
    public OrderStagedChangeAddVariantQuery variant(ProductVariantQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
