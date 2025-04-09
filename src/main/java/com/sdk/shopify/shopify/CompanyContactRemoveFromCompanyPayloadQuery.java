// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyContactRemoveFromCompany` mutation.
*/
public class CompanyContactRemoveFromCompanyPayloadQuery extends Query<CompanyContactRemoveFromCompanyPayloadQuery> {
    CompanyContactRemoveFromCompanyPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the removed company contact.
    */
    public CompanyContactRemoveFromCompanyPayloadQuery removedCompanyContactId() {
        startField("removedCompanyContactId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyContactRemoveFromCompanyPayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
