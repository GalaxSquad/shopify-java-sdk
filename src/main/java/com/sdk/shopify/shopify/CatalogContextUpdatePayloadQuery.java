// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `catalogContextUpdate` mutation.
*/
public class CatalogContextUpdatePayloadQuery extends Query<CatalogContextUpdatePayloadQuery> {
    CatalogContextUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated catalog.
    */
    public CatalogContextUpdatePayloadQuery catalog(CatalogQueryDefinition queryDef) {
        startField("catalog");

        _queryBuilder.append('{');
        queryDef.define(new CatalogQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CatalogContextUpdatePayloadQuery userErrors(CatalogUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CatalogUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
