// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyLocationRevokeRoles` mutation.
*/
public class CompanyLocationRevokeRolesPayloadQuery extends Query<CompanyLocationRevokeRolesPayloadQuery> {
    CompanyLocationRevokeRolesPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A list of role assignment IDs that were removed from the company location.
    */
    public CompanyLocationRevokeRolesPayloadQuery revokedRoleAssignmentIds() {
        startField("revokedRoleAssignmentIds");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyLocationRevokeRolesPayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
