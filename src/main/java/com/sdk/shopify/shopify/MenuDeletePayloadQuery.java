// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `menuDelete` mutation.
*/
public class MenuDeletePayloadQuery extends Query<MenuDeletePayloadQuery> {
    MenuDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted menu.
    */
    public MenuDeletePayloadQuery deletedMenuId() {
        startField("deletedMenuId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MenuDeletePayloadQuery userErrors(MenuDeleteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MenuDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
