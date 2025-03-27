// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventorySetOnHandQuantities` mutation.
*/
public class InventorySetOnHandQuantitiesPayloadQuery extends Query<InventorySetOnHandQuantitiesPayloadQuery> {
    InventorySetOnHandQuantitiesPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The group of changes made by the operation.
    */
    public InventorySetOnHandQuantitiesPayloadQuery inventoryAdjustmentGroup(InventoryAdjustmentGroupQueryDefinition queryDef) {
        startField("inventoryAdjustmentGroup");

        _queryBuilder.append('{');
        queryDef.define(new InventoryAdjustmentGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventorySetOnHandQuantitiesPayloadQuery userErrors(InventorySetOnHandQuantitiesUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventorySetOnHandQuantitiesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
