// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountAutomaticAppUpdate` mutation.
*/
public class DiscountAutomaticAppUpdatePayloadQuery extends Query<DiscountAutomaticAppUpdatePayloadQuery> {
    DiscountAutomaticAppUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated automatic discount that the app provides.
    */
    public DiscountAutomaticAppUpdatePayloadQuery automaticAppDiscount(DiscountAutomaticAppQueryDefinition queryDef) {
        startField("automaticAppDiscount");

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticAppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountAutomaticAppUpdatePayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
