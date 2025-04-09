// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `menuCreate` mutation.
*/
public class MenuCreatePayloadQuery extends Query<MenuCreatePayloadQuery> {
    MenuCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created menu.
    */
    public MenuCreatePayloadQuery menu(MenuQueryDefinition queryDef) {
        startField("menu");

        _queryBuilder.append('{');
        queryDef.define(new MenuQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MenuCreatePayloadQuery userErrors(MenuCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MenuCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
