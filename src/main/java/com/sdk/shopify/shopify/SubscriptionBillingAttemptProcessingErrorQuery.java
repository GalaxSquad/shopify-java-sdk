// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that prevented a billing attempt.
*/
public class SubscriptionBillingAttemptProcessingErrorQuery extends Query<SubscriptionBillingAttemptProcessingErrorQuery> {
    SubscriptionBillingAttemptProcessingErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The code for the error.
    */
    public SubscriptionBillingAttemptProcessingErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * An explanation of the error.
    */
    public SubscriptionBillingAttemptProcessingErrorQuery message() {
        startField("message");

        return this;
    }

    public SubscriptionBillingAttemptProcessingErrorQuery onSubscriptionBillingAttemptGenericError(SubscriptionBillingAttemptGenericErrorQueryDefinition queryDef) {
        startInlineFragment("SubscriptionBillingAttemptGenericError");
        queryDef.define(new SubscriptionBillingAttemptGenericErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SubscriptionBillingAttemptProcessingErrorQuery onSubscriptionBillingAttemptInsufficientStockProductVariantsError(SubscriptionBillingAttemptInsufficientStockProductVariantsErrorQueryDefinition queryDef) {
        startInlineFragment("SubscriptionBillingAttemptInsufficientStockProductVariantsError");
        queryDef.define(new SubscriptionBillingAttemptInsufficientStockProductVariantsErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SubscriptionBillingAttemptProcessingErrorQuery onSubscriptionBillingAttemptOutOfStockProductVariantsError(SubscriptionBillingAttemptOutOfStockProductVariantsErrorQueryDefinition queryDef) {
        startInlineFragment("SubscriptionBillingAttemptOutOfStockProductVariantsError");
        queryDef.define(new SubscriptionBillingAttemptOutOfStockProductVariantsErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
