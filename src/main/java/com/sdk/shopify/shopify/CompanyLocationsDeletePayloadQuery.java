// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyLocationsDelete` mutation.
*/
public class CompanyLocationsDeletePayloadQuery extends Query<CompanyLocationsDeletePayloadQuery> {
    CompanyLocationsDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A list of IDs of the deleted company locations.
    */
    public CompanyLocationsDeletePayloadQuery deletedCompanyLocationIds() {
        startField("deletedCompanyLocationIds");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyLocationsDeletePayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
