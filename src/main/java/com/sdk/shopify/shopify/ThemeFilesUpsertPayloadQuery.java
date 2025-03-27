// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `themeFilesUpsert` mutation.
*/
public class ThemeFilesUpsertPayloadQuery extends Query<ThemeFilesUpsertPayloadQuery> {
    ThemeFilesUpsertPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The theme files write job triggered by the mutation.
    */
    public ThemeFilesUpsertPayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The resulting theme files.
    */
    public ThemeFilesUpsertPayloadQuery upsertedThemeFiles(OnlineStoreThemeFileOperationResultQueryDefinition queryDef) {
        startField("upsertedThemeFiles");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeFileOperationResultQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ThemeFilesUpsertPayloadQuery userErrors(OnlineStoreThemeFilesUserErrorsQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeFilesUserErrorsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
