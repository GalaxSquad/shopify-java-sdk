// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyLocationAssignStaffMembers` mutation.
*/
public class CompanyLocationAssignStaffMembersPayloadQuery extends Query<CompanyLocationAssignStaffMembersPayloadQuery> {
    CompanyLocationAssignStaffMembersPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of created staff member assignments.
    */
    public CompanyLocationAssignStaffMembersPayloadQuery companyLocationStaffMemberAssignments(CompanyLocationStaffMemberAssignmentQueryDefinition queryDef) {
        startField("companyLocationStaffMemberAssignments");

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationStaffMemberAssignmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyLocationAssignStaffMembersPayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
