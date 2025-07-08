// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Current user's access policy for a finance app.
*/
public class FinanceAppAccessPolicyQuery extends Query<FinanceAppAccessPolicyQuery> {
    FinanceAppAccessPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Current shop staff's access within the app.
    */
    public FinanceAppAccessPolicyQuery access() {
        startField("access");

        return this;
    }
}
