// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `themeFilesCopy` mutation.
*/
public class ThemeFilesCopyPayloadQuery extends Query<ThemeFilesCopyPayloadQuery> {
    ThemeFilesCopyPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The resulting theme files.
    */
    public ThemeFilesCopyPayloadQuery copiedThemeFiles(OnlineStoreThemeFileOperationResultQueryDefinition queryDef) {
        startField("copiedThemeFiles");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeFileOperationResultQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ThemeFilesCopyPayloadQuery userErrors(OnlineStoreThemeFilesUserErrorsQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeFilesUserErrorsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
