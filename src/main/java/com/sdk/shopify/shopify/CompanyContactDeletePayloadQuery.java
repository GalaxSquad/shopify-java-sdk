// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyContactDelete` mutation.
*/
public class CompanyContactDeletePayloadQuery extends Query<CompanyContactDeletePayloadQuery> {
    CompanyContactDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted company contact.
    */
    public CompanyContactDeletePayloadQuery deletedCompanyContactId() {
        startField("deletedCompanyContactId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyContactDeletePayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
