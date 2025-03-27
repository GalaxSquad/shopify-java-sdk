// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `catalogDelete` mutation.
*/
public class CatalogDeletePayloadQuery extends Query<CatalogDeletePayloadQuery> {
    CatalogDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted catalog.
    */
    public CatalogDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CatalogDeletePayloadQuery userErrors(CatalogUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CatalogUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
