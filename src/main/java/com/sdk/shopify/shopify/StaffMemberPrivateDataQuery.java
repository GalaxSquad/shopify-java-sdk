// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the data used to customize the Shopify admin experience for a logged-in staff member.
*/
public class StaffMemberPrivateDataQuery extends Query<StaffMemberPrivateDataQuery> {
    StaffMemberPrivateDataQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The URL to the staff member's account settings page.
    */
    public StaffMemberPrivateDataQuery accountSettingsUrl() {
        startField("accountSettingsUrl");

        return this;
    }

    /**
    * The date and time when the staff member was created.
    */
    public StaffMemberPrivateDataQuery createdAt() {
        startField("createdAt");

        return this;
    }
}
