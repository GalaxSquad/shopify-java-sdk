// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `shopLocaleUpdate` mutation.
*/
public class ShopLocaleUpdatePayloadQuery extends Query<ShopLocaleUpdatePayloadQuery> {
    ShopLocaleUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The locale that was updated.
    */
    public ShopLocaleUpdatePayloadQuery shopLocale(ShopLocaleQueryDefinition queryDef) {
        startField("shopLocale");

        _queryBuilder.append('{');
        queryDef.define(new ShopLocaleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ShopLocaleUpdatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
