// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `shopLocaleEnable` mutation.
*/
public class ShopLocaleEnablePayloadQuery extends Query<ShopLocaleEnablePayloadQuery> {
    ShopLocaleEnablePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * ISO code of the locale that was enabled.
    */
    public ShopLocaleEnablePayloadQuery shopLocale(ShopLocaleQueryDefinition queryDef) {
        startField("shopLocale");

        _queryBuilder.append('{');
        queryDef.define(new ShopLocaleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ShopLocaleEnablePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
