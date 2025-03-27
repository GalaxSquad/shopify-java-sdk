// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerCancelDataErasure` mutation.
*/
public class CustomerCancelDataErasurePayloadQuery extends Query<CustomerCancelDataErasurePayloadQuery> {
    CustomerCancelDataErasurePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the customer whose pending data erasure has been cancelled.
    */
    public CustomerCancelDataErasurePayloadQuery customerId() {
        startField("customerId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerCancelDataErasurePayloadQuery userErrors(CustomerCancelDataErasureUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerCancelDataErasureUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
