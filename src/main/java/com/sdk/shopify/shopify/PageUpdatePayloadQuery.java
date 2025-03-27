// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `pageUpdate` mutation.
*/
public class PageUpdatePayloadQuery extends Query<PageUpdatePayloadQuery> {
    PageUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The page that was updated.
    */
    public PageUpdatePayloadQuery page(PageQueryDefinition queryDef) {
        startField("page");

        _queryBuilder.append('{');
        queryDef.define(new PageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PageUpdatePayloadQuery userErrors(PageUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PageUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
