// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountCodeAppUpdate` mutation.
*/
public class DiscountCodeAppUpdatePayloadQuery extends Query<DiscountCodeAppUpdatePayloadQuery> {
    DiscountCodeAppUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated discount that the app provides.
    */
    public DiscountCodeAppUpdatePayloadQuery codeAppDiscount(DiscountCodeAppQueryDefinition queryDef) {
        startField("codeAppDiscount");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeAppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountCodeAppUpdatePayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
