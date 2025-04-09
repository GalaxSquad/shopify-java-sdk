// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* General inventory properties for the shop.
*/
public class InventoryPropertiesQuery extends Query<InventoryPropertiesQuery> {
    InventoryPropertiesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * All the quantity names.
    */
    public InventoryPropertiesQuery quantityNames(InventoryQuantityNameQueryDefinition queryDef) {
        startField("quantityNames");

        _queryBuilder.append('{');
        queryDef.define(new InventoryQuantityNameQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
