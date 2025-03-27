// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `themeCreate` mutation.
*/
public class ThemeCreatePayloadQuery extends Query<ThemeCreatePayloadQuery> {
    ThemeCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The theme that was created.
    */
    public ThemeCreatePayloadQuery theme(OnlineStoreThemeQueryDefinition queryDef) {
        startField("theme");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ThemeCreatePayloadQuery userErrors(ThemeCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ThemeCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
