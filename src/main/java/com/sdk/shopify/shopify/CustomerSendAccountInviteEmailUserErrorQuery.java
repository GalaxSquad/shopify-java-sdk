// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Defines errors for customerSendAccountInviteEmail mutation.
*/
public class CustomerSendAccountInviteEmailUserErrorQuery extends Query<CustomerSendAccountInviteEmailUserErrorQuery> {
    CustomerSendAccountInviteEmailUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CustomerSendAccountInviteEmailUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CustomerSendAccountInviteEmailUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CustomerSendAccountInviteEmailUserErrorQuery message() {
        startField("message");

        return this;
    }
}
