// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `mobilePlatformApplicationDelete` mutation.
*/
public class MobilePlatformApplicationDeletePayloadQuery extends Query<MobilePlatformApplicationDeletePayloadQuery> {
    MobilePlatformApplicationDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the mobile platform application that was just deleted.
    */
    public MobilePlatformApplicationDeletePayloadQuery deletedMobilePlatformApplicationId() {
        startField("deletedMobilePlatformApplicationId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MobilePlatformApplicationDeletePayloadQuery userErrors(MobilePlatformApplicationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MobilePlatformApplicationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
