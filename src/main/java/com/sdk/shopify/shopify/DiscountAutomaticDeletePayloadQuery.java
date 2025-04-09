// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountAutomaticDelete` mutation.
*/
public class DiscountAutomaticDeletePayloadQuery extends Query<DiscountAutomaticDeletePayloadQuery> {
    DiscountAutomaticDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the automatic discount that was deleted.
    */
    public DiscountAutomaticDeletePayloadQuery deletedAutomaticDiscountId() {
        startField("deletedAutomaticDiscountId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountAutomaticDeletePayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
