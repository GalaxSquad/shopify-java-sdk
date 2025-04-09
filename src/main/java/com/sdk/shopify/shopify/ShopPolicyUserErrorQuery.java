// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of a shop policy mutation.
*/
public class ShopPolicyUserErrorQuery extends Query<ShopPolicyUserErrorQuery> {
    ShopPolicyUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ShopPolicyUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ShopPolicyUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ShopPolicyUserErrorQuery message() {
        startField("message");

        return this;
    }
}
