// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerRemoveTaxExemptions` mutation.
*/
public class CustomerRemoveTaxExemptionsPayloadQuery extends Query<CustomerRemoveTaxExemptionsPayloadQuery> {
    CustomerRemoveTaxExemptionsPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated customer.
    */
    public CustomerRemoveTaxExemptionsPayloadQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerRemoveTaxExemptionsPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
