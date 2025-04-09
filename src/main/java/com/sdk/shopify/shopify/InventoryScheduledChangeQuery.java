// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Returns the scheduled changes to inventory states related to the ledger document.
*/
public class InventoryScheduledChangeQuery extends Query<InventoryScheduledChangeQuery> {
    InventoryScheduledChangeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The date and time that the scheduled change is expected to happen.
    */
    public InventoryScheduledChangeQuery expectedAt() {
        startField("expectedAt");

        return this;
    }

    /**
    * The quantity
    * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-in
    * ventory-quantities-between-states)
    * to transition from.
    */
    public InventoryScheduledChangeQuery fromName() {
        startField("fromName");

        return this;
    }

    /**
    * The quantities of an inventory item that are related to a specific location.
    */
    public InventoryScheduledChangeQuery inventoryLevel(InventoryLevelQueryDefinition queryDef) {
        startField("inventoryLevel");

        _queryBuilder.append('{');
        queryDef.define(new InventoryLevelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A freeform URI that represents what changed the inventory quantities.
    */
    public InventoryScheduledChangeQuery ledgerDocumentUri() {
        startField("ledgerDocumentUri");

        return this;
    }

    /**
    * The quantity of the scheduled change associated with the ledger document in the `fromName` state.
    */
    public InventoryScheduledChangeQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The quantity
    * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-in
    * ventory-quantities-between-states)
    * to transition to.
    */
    public InventoryScheduledChangeQuery toName() {
        startField("toName");

        return this;
    }
}
