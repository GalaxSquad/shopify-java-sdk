// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountAutomaticFreeShippingUpdate` mutation.
*/
public class DiscountAutomaticFreeShippingUpdatePayloadQuery extends Query<DiscountAutomaticFreeShippingUpdatePayloadQuery> {
    DiscountAutomaticFreeShippingUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The automatic discount that was updated.
    */
    public DiscountAutomaticFreeShippingUpdatePayloadQuery automaticDiscountNode(DiscountAutomaticNodeQueryDefinition queryDef) {
        startField("automaticDiscountNode");

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountAutomaticFreeShippingUpdatePayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
