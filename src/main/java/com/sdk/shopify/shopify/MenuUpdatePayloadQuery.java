// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `menuUpdate` mutation.
*/
public class MenuUpdatePayloadQuery extends Query<MenuUpdatePayloadQuery> {
    MenuUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated menu.
    */
    public MenuUpdatePayloadQuery menu(MenuQueryDefinition queryDef) {
        startField("menu");

        _queryBuilder.append('{');
        queryDef.define(new MenuQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MenuUpdatePayloadQuery userErrors(MenuUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MenuUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
