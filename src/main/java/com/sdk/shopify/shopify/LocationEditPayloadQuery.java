// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `locationEdit` mutation.
*/
public class LocationEditPayloadQuery extends Query<LocationEditPayloadQuery> {
    LocationEditPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The location that was edited.
    */
    public LocationEditPayloadQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public LocationEditPayloadQuery userErrors(LocationEditUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new LocationEditUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
