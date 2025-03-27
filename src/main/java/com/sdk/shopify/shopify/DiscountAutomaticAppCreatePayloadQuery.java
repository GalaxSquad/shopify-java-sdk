// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountAutomaticAppCreate` mutation.
*/
public class DiscountAutomaticAppCreatePayloadQuery extends Query<DiscountAutomaticAppCreatePayloadQuery> {
    DiscountAutomaticAppCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The automatic discount that the app manages.
    */
    public DiscountAutomaticAppCreatePayloadQuery automaticAppDiscount(DiscountAutomaticAppQueryDefinition queryDef) {
        startField("automaticAppDiscount");

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticAppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountAutomaticAppCreatePayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
