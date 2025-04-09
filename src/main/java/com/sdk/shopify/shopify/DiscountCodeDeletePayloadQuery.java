// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountCodeDelete` mutation.
*/
public class DiscountCodeDeletePayloadQuery extends Query<DiscountCodeDeletePayloadQuery> {
    DiscountCodeDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the code discount that was deleted.
    */
    public DiscountCodeDeletePayloadQuery deletedCodeDiscountId() {
        startField("deletedCodeDiscountId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountCodeDeletePayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
