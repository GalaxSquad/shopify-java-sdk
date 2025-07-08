// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerSet` mutation.
*/
public class CustomerSetPayloadQuery extends Query<CustomerSetPayloadQuery> {
    CustomerSetPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created or updated customer.
    */
    public CustomerSetPayloadQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerSetPayloadQuery userErrors(CustomerSetUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerSetUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
