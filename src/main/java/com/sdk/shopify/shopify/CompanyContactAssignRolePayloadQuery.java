// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyContactAssignRole` mutation.
*/
public class CompanyContactAssignRolePayloadQuery extends Query<CompanyContactAssignRolePayloadQuery> {
    CompanyContactAssignRolePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The company contact role assignment.
    */
    public CompanyContactAssignRolePayloadQuery companyContactRoleAssignment(CompanyContactRoleAssignmentQueryDefinition queryDef) {
        startField("companyContactRoleAssignment");

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactRoleAssignmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyContactAssignRolePayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
