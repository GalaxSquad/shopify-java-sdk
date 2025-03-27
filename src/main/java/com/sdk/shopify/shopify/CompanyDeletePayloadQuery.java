// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyDelete` mutation.
*/
public class CompanyDeletePayloadQuery extends Query<CompanyDeletePayloadQuery> {
    CompanyDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted company.
    */
    public CompanyDeletePayloadQuery deletedCompanyId() {
        startField("deletedCompanyId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyDeletePayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
