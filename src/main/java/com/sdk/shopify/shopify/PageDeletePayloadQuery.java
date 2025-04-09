// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `pageDelete` mutation.
*/
public class PageDeletePayloadQuery extends Query<PageDeletePayloadQuery> {
    PageDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted page.
    */
    public PageDeletePayloadQuery deletedPageId() {
        startField("deletedPageId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PageDeletePayloadQuery userErrors(PageDeleteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PageDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
