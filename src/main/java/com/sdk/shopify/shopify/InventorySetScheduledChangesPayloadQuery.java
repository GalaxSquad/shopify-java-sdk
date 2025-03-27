// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventorySetScheduledChanges` mutation.
*/
public class InventorySetScheduledChangesPayloadQuery extends Query<InventorySetScheduledChangesPayloadQuery> {
    InventorySetScheduledChangesPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The scheduled changes that were created.
    */
    public InventorySetScheduledChangesPayloadQuery scheduledChanges(InventoryScheduledChangeQueryDefinition queryDef) {
        startField("scheduledChanges");

        _queryBuilder.append('{');
        queryDef.define(new InventoryScheduledChangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventorySetScheduledChangesPayloadQuery userErrors(InventorySetScheduledChangesUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventorySetScheduledChangesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
