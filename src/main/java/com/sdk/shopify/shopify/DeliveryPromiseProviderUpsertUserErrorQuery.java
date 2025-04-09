// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `DeliveryPromiseProviderUpsert`.
*/
public class DeliveryPromiseProviderUpsertUserErrorQuery extends Query<DeliveryPromiseProviderUpsertUserErrorQuery> {
    DeliveryPromiseProviderUpsertUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public DeliveryPromiseProviderUpsertUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public DeliveryPromiseProviderUpsertUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public DeliveryPromiseProviderUpsertUserErrorQuery message() {
        startField("message");

        return this;
    }
}
