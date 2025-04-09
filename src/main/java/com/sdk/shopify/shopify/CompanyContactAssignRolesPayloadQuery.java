// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyContactAssignRoles` mutation.
*/
public class CompanyContactAssignRolesPayloadQuery extends Query<CompanyContactAssignRolesPayloadQuery> {
    CompanyContactAssignRolesPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A list of newly created assignments of company contacts to a company location.
    */
    public CompanyContactAssignRolesPayloadQuery roleAssignments(CompanyContactRoleAssignmentQueryDefinition queryDef) {
        startField("roleAssignments");

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactRoleAssignmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyContactAssignRolesPayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
