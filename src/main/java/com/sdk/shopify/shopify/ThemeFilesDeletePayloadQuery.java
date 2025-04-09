// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `themeFilesDelete` mutation.
*/
public class ThemeFilesDeletePayloadQuery extends Query<ThemeFilesDeletePayloadQuery> {
    ThemeFilesDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The resulting theme files.
    */
    public ThemeFilesDeletePayloadQuery deletedThemeFiles(OnlineStoreThemeFileOperationResultQueryDefinition queryDef) {
        startField("deletedThemeFiles");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeFileOperationResultQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ThemeFilesDeletePayloadQuery userErrors(OnlineStoreThemeFilesUserErrorsQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeFilesUserErrorsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
