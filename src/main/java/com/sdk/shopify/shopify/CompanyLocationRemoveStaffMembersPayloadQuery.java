// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyLocationRemoveStaffMembers` mutation.
*/
public class CompanyLocationRemoveStaffMembersPayloadQuery extends Query<CompanyLocationRemoveStaffMembersPayloadQuery> {
    CompanyLocationRemoveStaffMembersPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of IDs of the deleted staff member assignment.
    */
    public CompanyLocationRemoveStaffMembersPayloadQuery deletedCompanyLocationStaffMemberAssignmentIds() {
        startField("deletedCompanyLocationStaffMemberAssignmentIds");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyLocationRemoveStaffMembersPayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
