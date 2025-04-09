// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A representation of store's staff member who is assigned to a [company
* location](https://shopify.dev/api/admin-graphql/latest/objects/CompanyLocation) of the shop. The
* staff member's actions will be limited to objects associated with the assigned company location.
*/
public class CompanyLocationStaffMemberAssignmentQuery extends Query<CompanyLocationStaffMemberAssignmentQuery> {
    CompanyLocationStaffMemberAssignmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The company location the staff member is assigned to.
    */
    public CompanyLocationStaffMemberAssignmentQuery companyLocation(CompanyLocationQueryDefinition queryDef) {
        startField("companyLocation");

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Represents the data of a staff member who's assigned to a company location.
    */
    public CompanyLocationStaffMemberAssignmentQuery staffMember(StaffMemberQueryDefinition queryDef) {
        startField("staffMember");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
