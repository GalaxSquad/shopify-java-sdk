// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `locationDeactivate` mutation.
*/
public class LocationDeactivatePayloadQuery extends Query<LocationDeactivatePayloadQuery> {
    LocationDeactivatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The location that was deactivated.
    */
    public LocationDeactivatePayloadQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public LocationDeactivatePayloadQuery locationDeactivateUserErrors(LocationDeactivateUserErrorQueryDefinition queryDef) {
        startField("locationDeactivateUserErrors");

        _queryBuilder.append('{');
        queryDef.define(new LocationDeactivateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
