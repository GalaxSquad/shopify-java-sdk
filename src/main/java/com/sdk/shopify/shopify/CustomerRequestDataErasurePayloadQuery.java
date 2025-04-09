// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerRequestDataErasure` mutation.
*/
public class CustomerRequestDataErasurePayloadQuery extends Query<CustomerRequestDataErasurePayloadQuery> {
    CustomerRequestDataErasurePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the customer that will be erased.
    */
    public CustomerRequestDataErasurePayloadQuery customerId() {
        startField("customerId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerRequestDataErasurePayloadQuery userErrors(CustomerRequestDataErasureUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerRequestDataErasureUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
