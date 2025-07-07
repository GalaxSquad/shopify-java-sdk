// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `backupRegionUpdate` mutation.
*/
public class BackupRegionUpdatePayloadQuery extends Query<BackupRegionUpdatePayloadQuery> {
    BackupRegionUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Returns the updated backup region.
    */
    public BackupRegionUpdatePayloadQuery backupRegion(MarketRegionQueryDefinition queryDef) {
        startField("backupRegion");

        _queryBuilder.append('{');
        queryDef.define(new MarketRegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public BackupRegionUpdatePayloadQuery userErrors(MarketUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
