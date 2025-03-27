// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companiesDelete` mutation.
*/
public class CompaniesDeletePayloadQuery extends Query<CompaniesDeletePayloadQuery> {
    CompaniesDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A list of IDs of the deleted companies.
    */
    public CompaniesDeletePayloadQuery deletedCompanyIds() {
        startField("deletedCompanyIds");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompaniesDeletePayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
