// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `shopPolicyUpdate` mutation.
*/
public class ShopPolicyUpdatePayloadQuery extends Query<ShopPolicyUpdatePayloadQuery> {
    ShopPolicyUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The shop policy that has been updated.
    */
    public ShopPolicyUpdatePayloadQuery shopPolicy(ShopPolicyQueryDefinition queryDef) {
        startField("shopPolicy");

        _queryBuilder.append('{');
        queryDef.define(new ShopPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ShopPolicyUpdatePayloadQuery userErrors(ShopPolicyUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ShopPolicyUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
