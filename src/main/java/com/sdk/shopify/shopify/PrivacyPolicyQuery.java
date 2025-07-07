// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A shop's privacy policy settings.
*/
public class PrivacyPolicyQuery extends Query<PrivacyPolicyQuery> {
    PrivacyPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the policy is auto managed.
    */
    public PrivacyPolicyQuery autoManaged() {
        startField("autoManaged");

        return this;
    }

    /**
    * Policy template supported locales.
    */
    public PrivacyPolicyQuery supportedLocales() {
        startField("supportedLocales");

        return this;
    }
}
