// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `catalogCreate` mutation.
*/
public class CatalogCreatePayloadQuery extends Query<CatalogCreatePayloadQuery> {
    CatalogCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The newly created catalog.
    */
    public CatalogCreatePayloadQuery catalog(CatalogQueryDefinition queryDef) {
        startField("catalog");

        _queryBuilder.append('{');
        queryDef.define(new CatalogQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CatalogCreatePayloadQuery userErrors(CatalogUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CatalogUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
