// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `themeUpdate` mutation.
*/
public class ThemeUpdatePayloadQuery extends Query<ThemeUpdatePayloadQuery> {
    ThemeUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The theme that was updated.
    */
    public ThemeUpdatePayloadQuery theme(OnlineStoreThemeQueryDefinition queryDef) {
        startField("theme");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ThemeUpdatePayloadQuery userErrors(ThemeUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ThemeUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
