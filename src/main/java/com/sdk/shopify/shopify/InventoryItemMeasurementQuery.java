// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the packaged dimension for an inventory item.
*/
public class InventoryItemMeasurementQuery extends Query<InventoryItemMeasurementQuery> {
    InventoryItemMeasurementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The weight of the inventory item.
    */
    public InventoryItemMeasurementQuery weight(WeightQueryDefinition queryDef) {
        startField("weight");

        _queryBuilder.append('{');
        queryDef.define(new WeightQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
