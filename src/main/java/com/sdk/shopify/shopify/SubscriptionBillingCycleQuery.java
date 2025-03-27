// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A subscription billing cycle.
*/
public class SubscriptionBillingCycleQuery extends Query<SubscriptionBillingCycleQuery> {
    SubscriptionBillingCycleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The date on which the billing attempt is expected to be made.
    */
    public SubscriptionBillingCycleQuery billingAttemptExpectedDate() {
        startField("billingAttemptExpectedDate");

        return this;
    }

    public class BillingAttemptsArguments extends Arguments {
        BillingAttemptsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BillingAttemptsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come after the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BillingAttemptsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BillingAttemptsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come before the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BillingAttemptsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public BillingAttemptsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface BillingAttemptsArgumentsDefinition {
        void define(BillingAttemptsArguments args);
    }

    /**
    * The list of billing attempts associated with the billing cycle.
    */
    public SubscriptionBillingCycleQuery billingAttempts(SubscriptionBillingAttemptConnectionQueryDefinition queryDef) {
        return billingAttempts(args -> {}, queryDef);
    }

    /**
    * The list of billing attempts associated with the billing cycle.
    */
    public SubscriptionBillingCycleQuery billingAttempts(BillingAttemptsArgumentsDefinition argsDef, SubscriptionBillingAttemptConnectionQueryDefinition queryDef) {
        startField("billingAttempts");

        BillingAttemptsArguments args = new BillingAttemptsArguments(_queryBuilder);
        argsDef.define(args);
        BillingAttemptsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingAttemptConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The end date of the billing cycle.
    */
    public SubscriptionBillingCycleQuery cycleEndAt() {
        startField("cycleEndAt");

        return this;
    }

    /**
    * The index of the billing cycle.
    */
    public SubscriptionBillingCycleQuery cycleIndex() {
        startField("cycleIndex");

        return this;
    }

    /**
    * The start date of the billing cycle.
    */
    public SubscriptionBillingCycleQuery cycleStartAt() {
        startField("cycleStartAt");

        return this;
    }

    /**
    * Whether this billing cycle was edited.
    */
    public SubscriptionBillingCycleQuery edited() {
        startField("edited");

        return this;
    }

    /**
    * The active edited contract for the billing cycle.
    */
    public SubscriptionBillingCycleQuery editedContract(SubscriptionBillingCycleEditedContractQueryDefinition queryDef) {
        startField("editedContract");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleEditedContractQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether this billing cycle was skipped.
    */
    public SubscriptionBillingCycleQuery skipped() {
        startField("skipped");

        return this;
    }

    /**
    * The subscription contract that the billing cycle belongs to.
    */
    public SubscriptionBillingCycleQuery sourceContract(SubscriptionContractQueryDefinition queryDef) {
        startField("sourceContract");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the billing cycle.
    */
    public SubscriptionBillingCycleQuery status() {
        startField("status");

        return this;
    }
}
