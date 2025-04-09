// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A code that a customer can use at checkout to receive a discount. For example, a customer can use
* the redeem code 'SUMMER20' at checkout to receive a 20% discount on their entire order.
*/
public class DiscountRedeemCodeQuery extends Query<DiscountRedeemCodeQuery> {
    DiscountRedeemCodeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The number of times that the discount redeem code has been used. This value is updated
    * asynchronously and can be different than the actual usage count.
    */
    public DiscountRedeemCodeQuery asyncUsageCount() {
        startField("asyncUsageCount");

        return this;
    }

    /**
    * The code that a customer can use at checkout to receive a discount.
    */
    public DiscountRedeemCodeQuery code() {
        startField("code");

        return this;
    }

    /**
    * The application that created the discount redeem code.
    */
    public DiscountRedeemCodeQuery createdBy(AppQueryDefinition queryDef) {
        startField("createdBy");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A globally-unique ID of the discount redeem code.
    */
    public DiscountRedeemCodeQuery id() {
        startField("id");

        return this;
    }
}
