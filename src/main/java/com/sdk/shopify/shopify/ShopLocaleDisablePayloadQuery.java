// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `shopLocaleDisable` mutation.
*/
public class ShopLocaleDisablePayloadQuery extends Query<ShopLocaleDisablePayloadQuery> {
    ShopLocaleDisablePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * ISO code of the locale that was deleted.
    */
    public ShopLocaleDisablePayloadQuery locale() {
        startField("locale");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ShopLocaleDisablePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
