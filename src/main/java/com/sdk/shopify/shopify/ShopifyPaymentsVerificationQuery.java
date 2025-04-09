// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Each subject (individual) of an account has a verification object giving
* information about the verification state.
*/
public class ShopifyPaymentsVerificationQuery extends Query<ShopifyPaymentsVerificationQuery> {
    ShopifyPaymentsVerificationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The status of the verification.
    */
    public ShopifyPaymentsVerificationQuery status() {
        startField("status");

        return this;
    }

    /**
    * The subject/individual who has to be verified.
    */
    public ShopifyPaymentsVerificationQuery subject(ShopifyPaymentsVerificationSubjectQueryDefinition queryDef) {
        startField("subject");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsVerificationSubjectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
