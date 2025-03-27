// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerSendAccountInviteEmail` mutation.
*/
public class CustomerSendAccountInviteEmailPayloadQuery extends Query<CustomerSendAccountInviteEmailPayloadQuery> {
    CustomerSendAccountInviteEmailPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The customer to whom an account invite email was sent.
    */
    public CustomerSendAccountInviteEmailPayloadQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerSendAccountInviteEmailPayloadQuery userErrors(CustomerSendAccountInviteEmailUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerSendAccountInviteEmailUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
