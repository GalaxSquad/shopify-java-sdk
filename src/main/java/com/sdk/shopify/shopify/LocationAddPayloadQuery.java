// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `locationAdd` mutation.
*/
public class LocationAddPayloadQuery extends Query<LocationAddPayloadQuery> {
    LocationAddPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The location that was added.
    */
    public LocationAddPayloadQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public LocationAddPayloadQuery userErrors(LocationAddUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new LocationAddUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
