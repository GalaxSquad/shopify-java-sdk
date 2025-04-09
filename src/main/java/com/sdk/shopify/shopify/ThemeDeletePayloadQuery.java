// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `themeDelete` mutation.
*/
public class ThemeDeletePayloadQuery extends Query<ThemeDeletePayloadQuery> {
    ThemeDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted theme.
    */
    public ThemeDeletePayloadQuery deletedThemeId() {
        startField("deletedThemeId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ThemeDeletePayloadQuery userErrors(ThemeDeleteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ThemeDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
