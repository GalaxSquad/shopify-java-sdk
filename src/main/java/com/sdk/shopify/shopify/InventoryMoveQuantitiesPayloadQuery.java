// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryMoveQuantities` mutation.
*/
public class InventoryMoveQuantitiesPayloadQuery extends Query<InventoryMoveQuantitiesPayloadQuery> {
    InventoryMoveQuantitiesPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The group of changes made by the operation.
    */
    public InventoryMoveQuantitiesPayloadQuery inventoryAdjustmentGroup(InventoryAdjustmentGroupQueryDefinition queryDef) {
        startField("inventoryAdjustmentGroup");

        _queryBuilder.append('{');
        queryDef.define(new InventoryAdjustmentGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryMoveQuantitiesPayloadQuery userErrors(InventoryMoveQuantitiesUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryMoveQuantitiesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
