// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountCodeDeactivate` mutation.
*/
public class DiscountCodeDeactivatePayloadQuery extends Query<DiscountCodeDeactivatePayloadQuery> {
    DiscountCodeDeactivatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The deactivated code discount.
    */
    public DiscountCodeDeactivatePayloadQuery codeDiscountNode(DiscountCodeNodeQueryDefinition queryDef) {
        startField("codeDiscountNode");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountCodeDeactivatePayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
