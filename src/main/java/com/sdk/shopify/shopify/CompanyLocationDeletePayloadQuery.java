// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyLocationDelete` mutation.
*/
public class CompanyLocationDeletePayloadQuery extends Query<CompanyLocationDeletePayloadQuery> {
    CompanyLocationDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted company location.
    */
    public CompanyLocationDeletePayloadQuery deletedCompanyLocationId() {
        startField("deletedCompanyLocationId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyLocationDeletePayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
