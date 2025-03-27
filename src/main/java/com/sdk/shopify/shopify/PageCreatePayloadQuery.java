// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `pageCreate` mutation.
*/
public class PageCreatePayloadQuery extends Query<PageCreatePayloadQuery> {
    PageCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The page that was created.
    */
    public PageCreatePayloadQuery page(PageQueryDefinition queryDef) {
        startField("page");

        _queryBuilder.append('{');
        queryDef.define(new PageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PageCreatePayloadQuery userErrors(PageCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PageCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
