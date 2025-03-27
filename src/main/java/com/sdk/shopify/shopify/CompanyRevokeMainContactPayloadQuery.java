// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyRevokeMainContact` mutation.
*/
public class CompanyRevokeMainContactPayloadQuery extends Query<CompanyRevokeMainContactPayloadQuery> {
    CompanyRevokeMainContactPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The company from which the main contact is revoked.
    */
    public CompanyRevokeMainContactPayloadQuery company(CompanyQueryDefinition queryDef) {
        startField("company");

        _queryBuilder.append('{');
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyRevokeMainContactPayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
