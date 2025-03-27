// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `themePublish` mutation.
*/
public class ThemePublishPayloadQuery extends Query<ThemePublishPayloadQuery> {
    ThemePublishPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The theme that was published.
    */
    public ThemePublishPayloadQuery theme(OnlineStoreThemeQueryDefinition queryDef) {
        startField("theme");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ThemePublishPayloadQuery userErrors(ThemePublishUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ThemePublishUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
