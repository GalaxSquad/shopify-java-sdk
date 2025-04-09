// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryBulkToggleActivation` mutation.
*/
public class InventoryBulkToggleActivationPayloadQuery extends Query<InventoryBulkToggleActivationPayloadQuery> {
    InventoryBulkToggleActivationPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The inventory item that was updated.
    */
    public InventoryBulkToggleActivationPayloadQuery inventoryItem(InventoryItemQueryDefinition queryDef) {
        startField("inventoryItem");

        _queryBuilder.append('{');
        queryDef.define(new InventoryItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The activated inventory levels.
    */
    public InventoryBulkToggleActivationPayloadQuery inventoryLevels(InventoryLevelQueryDefinition queryDef) {
        startField("inventoryLevels");

        _queryBuilder.append('{');
        queryDef.define(new InventoryLevelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryBulkToggleActivationPayloadQuery userErrors(InventoryBulkToggleActivationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryBulkToggleActivationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
