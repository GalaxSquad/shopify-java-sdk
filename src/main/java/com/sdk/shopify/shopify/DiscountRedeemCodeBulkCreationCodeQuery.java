// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A result of a discount redeem code creation operation created by a bulk creation.
*/
public class DiscountRedeemCodeBulkCreationCodeQuery extends Query<DiscountRedeemCodeBulkCreationCodeQuery> {
    DiscountRedeemCodeBulkCreationCodeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code to use in the discount redeem code creation operation.
    */
    public DiscountRedeemCodeBulkCreationCodeQuery code() {
        startField("code");

        return this;
    }

    /**
    * The successfully created discount redeem code.
    * If the discount redeem code couldn't be created, then this field is `null``.
    */
    public DiscountRedeemCodeBulkCreationCodeQuery discountRedeemCode(DiscountRedeemCodeQueryDefinition queryDef) {
        startField("discountRedeemCode");

        _queryBuilder.append('{');
        queryDef.define(new DiscountRedeemCodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of errors that occurred during the creation operation of the discount redeem code.
    */
    public DiscountRedeemCodeBulkCreationCodeQuery errors(DiscountUserErrorQueryDefinition queryDef) {
        startField("errors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
