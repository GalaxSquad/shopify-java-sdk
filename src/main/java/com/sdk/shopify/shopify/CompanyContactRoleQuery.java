// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The role for a [company
* contact](https://shopify.dev/api/admin-graphql/latest/objects/companycontact).
*/
public class CompanyContactRoleQuery extends Query<CompanyContactRoleQuery> {
    CompanyContactRoleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The name of a role.
    * For example, `admin` or `buyer`.
    */
    public CompanyContactRoleQuery name() {
        startField("name");

        return this;
    }

    /**
    * A note for the role.
    */
    public CompanyContactRoleQuery note() {
        startField("note");

        return this;
    }
}
