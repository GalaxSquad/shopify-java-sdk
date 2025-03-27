// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryAdjustQuantities` mutation.
*/
public class InventoryAdjustQuantitiesPayloadQuery extends Query<InventoryAdjustQuantitiesPayloadQuery> {
    InventoryAdjustQuantitiesPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The group of changes made by the operation.
    */
    public InventoryAdjustQuantitiesPayloadQuery inventoryAdjustmentGroup(InventoryAdjustmentGroupQueryDefinition queryDef) {
        startField("inventoryAdjustmentGroup");

        _queryBuilder.append('{');
        queryDef.define(new InventoryAdjustmentGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryAdjustQuantitiesPayloadQuery userErrors(InventoryAdjustQuantitiesUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryAdjustQuantitiesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
