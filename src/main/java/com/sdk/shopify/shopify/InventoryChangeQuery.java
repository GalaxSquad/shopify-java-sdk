// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a change in an inventory quantity of an inventory item at a location.
*/
public class InventoryChangeQuery extends Query<InventoryChangeQuery> {
    InventoryChangeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The amount by which the inventory quantity was changed.
    */
    public InventoryChangeQuery delta() {
        startField("delta");

        return this;
    }

    /**
    * The inventory item associated with this inventory change.
    */
    public InventoryChangeQuery item(InventoryItemQueryDefinition queryDef) {
        startField("item");

        _queryBuilder.append('{');
        queryDef.define(new InventoryItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A URI that represents what the inventory quantity change was applied to.
    */
    public InventoryChangeQuery ledgerDocumentUri() {
        startField("ledgerDocumentUri");

        return this;
    }

    /**
    * The location associated with this inventory change.
    */
    public InventoryChangeQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
    * of the inventory quantity that was changed.
    */
    public InventoryChangeQuery name() {
        startField("name");

        return this;
    }

    /**
    * The quantity of named inventory after the change.
    */
    public InventoryChangeQuery quantityAfterChange() {
        startField("quantityAfterChange");

        return this;
    }
}
