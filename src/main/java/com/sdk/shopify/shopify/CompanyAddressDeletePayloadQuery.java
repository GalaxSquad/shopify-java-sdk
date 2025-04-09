// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyAddressDelete` mutation.
*/
public class CompanyAddressDeletePayloadQuery extends Query<CompanyAddressDeletePayloadQuery> {
    CompanyAddressDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted address.
    */
    public CompanyAddressDeletePayloadQuery deletedAddressId() {
        startField("deletedAddressId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyAddressDeletePayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
