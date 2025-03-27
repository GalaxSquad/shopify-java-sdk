// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerUpdateDefaultAddress` mutation.
*/
public class CustomerUpdateDefaultAddressPayloadQuery extends Query<CustomerUpdateDefaultAddressPayloadQuery> {
    CustomerUpdateDefaultAddressPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The customer whose address was updated.
    */
    public CustomerUpdateDefaultAddressPayloadQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerUpdateDefaultAddressPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
