// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The CompanyContactRoleAssignment describes the company and location associated to a company
* contact's role.
*/
public class CompanyContactRoleAssignmentQuery extends Query<CompanyContactRoleAssignmentQuery> {
    CompanyContactRoleAssignmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The company this role assignment belongs to.
    */
    public CompanyContactRoleAssignmentQuery company(CompanyQueryDefinition queryDef) {
        startField("company");

        _queryBuilder.append('{');
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The company contact for whom this role is assigned.
    */
    public CompanyContactRoleAssignmentQuery companyContact(CompanyContactQueryDefinition queryDef) {
        startField("companyContact");

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The company location to which the role is assigned.
    */
    public CompanyContactRoleAssignmentQuery companyLocation(CompanyLocationQueryDefinition queryDef) {
        startField("companyLocation");

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the assignment
    * record was created.
    */
    public CompanyContactRoleAssignmentQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The role that's assigned to the company contact.
    */
    public CompanyContactRoleAssignmentQuery role(CompanyContactRoleQueryDefinition queryDef) {
        startField("role");

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the assignment
    * record was last updated.
    */
    public CompanyContactRoleAssignmentQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
