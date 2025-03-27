// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountAutomaticBxgyUpdate` mutation.
*/
public class DiscountAutomaticBxgyUpdatePayloadQuery extends Query<DiscountAutomaticBxgyUpdatePayloadQuery> {
    DiscountAutomaticBxgyUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The automatic discount that was updated.
    */
    public DiscountAutomaticBxgyUpdatePayloadQuery automaticDiscountNode(DiscountAutomaticNodeQueryDefinition queryDef) {
        startField("automaticDiscountNode");

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountAutomaticBxgyUpdatePayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
