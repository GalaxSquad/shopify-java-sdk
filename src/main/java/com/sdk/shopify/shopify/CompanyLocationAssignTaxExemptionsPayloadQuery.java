// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyLocationAssignTaxExemptions` mutation.
*/
public class CompanyLocationAssignTaxExemptionsPayloadQuery extends Query<CompanyLocationAssignTaxExemptionsPayloadQuery> {
    CompanyLocationAssignTaxExemptionsPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated company location.
    */
    public CompanyLocationAssignTaxExemptionsPayloadQuery companyLocation(CompanyLocationQueryDefinition queryDef) {
        startField("companyLocation");

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyLocationAssignTaxExemptionsPayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
