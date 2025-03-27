// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `locationActivate` mutation.
*/
public class LocationActivatePayloadQuery extends Query<LocationActivatePayloadQuery> {
    LocationActivatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The location that was activated.
    */
    public LocationActivatePayloadQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public LocationActivatePayloadQuery locationActivateUserErrors(LocationActivateUserErrorQueryDefinition queryDef) {
        startField("locationActivateUserErrors");

        _queryBuilder.append('{');
        queryDef.define(new LocationActivateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
