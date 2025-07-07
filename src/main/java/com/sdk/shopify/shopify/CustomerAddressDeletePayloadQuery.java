// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerAddressDelete` mutation.
*/
public class CustomerAddressDeletePayloadQuery extends Query<CustomerAddressDeletePayloadQuery> {
    CustomerAddressDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the address deleted from the customer.
    */
    public CustomerAddressDeletePayloadQuery deletedAddressId() {
        startField("deletedAddressId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerAddressDeletePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
