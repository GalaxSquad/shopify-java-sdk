// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountAutomaticDeactivate` mutation.
*/
public class DiscountAutomaticDeactivatePayloadQuery extends Query<DiscountAutomaticDeactivatePayloadQuery> {
    DiscountAutomaticDeactivatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The deactivated automatic discount.
    */
    public DiscountAutomaticDeactivatePayloadQuery automaticDiscountNode(DiscountAutomaticNodeQueryDefinition queryDef) {
        startField("automaticDiscountNode");

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountAutomaticDeactivatePayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
