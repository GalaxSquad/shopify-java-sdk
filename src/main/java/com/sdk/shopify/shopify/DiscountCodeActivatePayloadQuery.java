// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountCodeActivate` mutation.
*/
public class DiscountCodeActivatePayloadQuery extends Query<DiscountCodeActivatePayloadQuery> {
    DiscountCodeActivatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The activated code discount.
    */
    public DiscountCodeActivatePayloadQuery codeDiscountNode(DiscountCodeNodeQueryDefinition queryDef) {
        startField("codeDiscountNode");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountCodeActivatePayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
