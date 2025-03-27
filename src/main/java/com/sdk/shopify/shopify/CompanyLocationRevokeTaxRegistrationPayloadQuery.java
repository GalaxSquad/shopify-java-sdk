// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyLocationRevokeTaxRegistration` mutation.
*/
public class CompanyLocationRevokeTaxRegistrationPayloadQuery extends Query<CompanyLocationRevokeTaxRegistrationPayloadQuery> {
    CompanyLocationRevokeTaxRegistrationPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated company location.
    */
    public CompanyLocationRevokeTaxRegistrationPayloadQuery companyLocation(CompanyLocationQueryDefinition queryDef) {
        startField("companyLocation");

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyLocationRevokeTaxRegistrationPayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
