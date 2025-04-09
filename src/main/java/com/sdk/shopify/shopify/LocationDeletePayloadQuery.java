// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `locationDelete` mutation.
*/
public class LocationDeletePayloadQuery extends Query<LocationDeletePayloadQuery> {
    LocationDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the location that was deleted.
    */
    public LocationDeletePayloadQuery deletedLocationId() {
        startField("deletedLocationId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public LocationDeletePayloadQuery locationDeleteUserErrors(LocationDeleteUserErrorQueryDefinition queryDef) {
        startField("locationDeleteUserErrors");

        _queryBuilder.append('{');
        queryDef.define(new LocationDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
