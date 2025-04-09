// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A customer's payment method.
*/
public class CustomerPaymentMethodQuery extends Query<CustomerPaymentMethodQuery> {
    CustomerPaymentMethodQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The customer to whom the payment method belongs.
    */
    public CustomerPaymentMethodQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The instrument for this payment method.
    */
    public CustomerPaymentMethodQuery instrument(CustomerPaymentInstrumentQueryDefinition queryDef) {
        startField("instrument");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentInstrumentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The time that the payment method was revoked.
    */
    public CustomerPaymentMethodQuery revokedAt() {
        startField("revokedAt");

        return this;
    }

    /**
    * The revocation reason for this payment method.
    */
    public CustomerPaymentMethodQuery revokedReason() {
        startField("revokedReason");

        return this;
    }

    public class SubscriptionContractsArguments extends Arguments {
        SubscriptionContractsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SubscriptionContractsArguments first(Integer value) {
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
        public SubscriptionContractsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SubscriptionContractsArguments last(Integer value) {
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
        public SubscriptionContractsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public SubscriptionContractsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SubscriptionContractsArgumentsDefinition {
        void define(SubscriptionContractsArguments args);
    }

    /**
    * List Subscription Contracts.
    */
    public CustomerPaymentMethodQuery subscriptionContracts(SubscriptionContractConnectionQueryDefinition queryDef) {
        return subscriptionContracts(args -> {}, queryDef);
    }

    /**
    * List Subscription Contracts.
    */
    public CustomerPaymentMethodQuery subscriptionContracts(SubscriptionContractsArgumentsDefinition argsDef, SubscriptionContractConnectionQueryDefinition queryDef) {
        startField("subscriptionContracts");

        SubscriptionContractsArguments args = new SubscriptionContractsArguments(_queryBuilder);
        argsDef.define(args);
        SubscriptionContractsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
