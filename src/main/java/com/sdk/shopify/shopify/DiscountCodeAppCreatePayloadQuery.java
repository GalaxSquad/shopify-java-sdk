// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountCodeAppCreate` mutation.
*/
public class DiscountCodeAppCreatePayloadQuery extends Query<DiscountCodeAppCreatePayloadQuery> {
    DiscountCodeAppCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The discount that the app provides.
    */
    public DiscountCodeAppCreatePayloadQuery codeAppDiscount(DiscountCodeAppQueryDefinition queryDef) {
        startField("codeAppDiscount");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeAppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountCodeAppCreatePayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
