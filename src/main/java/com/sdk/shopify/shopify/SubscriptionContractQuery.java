// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Represents a Subscription Contract.
*/
public class SubscriptionContractQuery extends Query<SubscriptionContractQuery> {
    SubscriptionContractQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The subscription app that the subscription contract is registered to.
    */
    public SubscriptionContractQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The URL of the subscription contract page on the subscription app.
    */
    public SubscriptionContractQuery appAdminUrl() {
        startField("appAdminUrl");

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
    * The list of billing attempts associated with the subscription contract.
    */
    public SubscriptionContractQuery billingAttempts(SubscriptionBillingAttemptConnectionQueryDefinition queryDef) {
        return billingAttempts(args -> {}, queryDef);
    }

    /**
    * The list of billing attempts associated with the subscription contract.
    */
    public SubscriptionContractQuery billingAttempts(BillingAttemptsArgumentsDefinition argsDef, SubscriptionBillingAttemptConnectionQueryDefinition queryDef) {
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
    * The billing policy associated with the subscription contract.
    */
    public SubscriptionContractQuery billingPolicy(SubscriptionBillingPolicyQueryDefinition queryDef) {
        startField("billingPolicy");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the subscription contract was created.
    */
    public SubscriptionContractQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The currency that's used for the subscription contract.
    */
    public SubscriptionContractQuery currencyCode() {
        startField("currencyCode");

        return this;
    }

    /**
    * A list of the custom attributes to be added to the generated orders.
    */
    public SubscriptionContractQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customer to whom the subscription contract belongs.
    */
    public SubscriptionContractQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomerPaymentMethodArguments extends Arguments {
        CustomerPaymentMethodArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Whether to show the customer's revoked payment method.
        */
        public CustomerPaymentMethodArguments showRevoked(Boolean value) {
            if (value != null) {
                startArgument("showRevoked");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CustomerPaymentMethodArgumentsDefinition {
        void define(CustomerPaymentMethodArguments args);
    }

    /**
    * The customer payment method that's used for the subscription contract.
    */
    public SubscriptionContractQuery customerPaymentMethod(CustomerPaymentMethodQueryDefinition queryDef) {
        return customerPaymentMethod(args -> {}, queryDef);
    }

    /**
    * The customer payment method that's used for the subscription contract.
    */
    public SubscriptionContractQuery customerPaymentMethod(CustomerPaymentMethodArgumentsDefinition argsDef, CustomerPaymentMethodQueryDefinition queryDef) {
        startField("customerPaymentMethod");

        CustomerPaymentMethodArguments args = new CustomerPaymentMethodArguments(_queryBuilder);
        argsDef.define(args);
        CustomerPaymentMethodArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The delivery method for each billing of the subscription contract.
    */
    public SubscriptionContractQuery deliveryMethod(SubscriptionDeliveryMethodQueryDefinition queryDef) {
        startField("deliveryMethod");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDeliveryMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The delivery policy associated with the subscription contract.
    */
    public SubscriptionContractQuery deliveryPolicy(SubscriptionDeliveryPolicyQueryDefinition queryDef) {
        startField("deliveryPolicy");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDeliveryPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The delivery price for each billing of the subscription contract.
    */
    public SubscriptionContractQuery deliveryPrice(MoneyV2QueryDefinition queryDef) {
        startField("deliveryPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountsArguments extends Arguments {
        DiscountsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountsArguments first(Integer value) {
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
        public DiscountsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountsArguments last(Integer value) {
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
        public DiscountsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DiscountsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DiscountsArgumentsDefinition {
        void define(DiscountsArguments args);
    }

    /**
    * The list of subscription discounts associated with the subscription contract.
    */
    public SubscriptionContractQuery discounts(SubscriptionManualDiscountConnectionQueryDefinition queryDef) {
        return discounts(args -> {}, queryDef);
    }

    /**
    * The list of subscription discounts associated with the subscription contract.
    */
    public SubscriptionContractQuery discounts(DiscountsArgumentsDefinition argsDef, SubscriptionManualDiscountConnectionQueryDefinition queryDef) {
        startField("discounts");

        DiscountsArguments args = new DiscountsArguments(_queryBuilder);
        argsDef.define(args);
        DiscountsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionManualDiscountConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The last billing error type of the contract.
    */
    public SubscriptionContractQuery lastBillingAttemptErrorType() {
        startField("lastBillingAttemptErrorType");

        return this;
    }

    /**
    * The current status of the last payment.
    */
    public SubscriptionContractQuery lastPaymentStatus() {
        startField("lastPaymentStatus");

        return this;
    }

    public class LinesArguments extends Arguments {
        LinesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LinesArguments first(Integer value) {
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
        public LinesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LinesArguments last(Integer value) {
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
        public LinesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public LinesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LinesArgumentsDefinition {
        void define(LinesArguments args);
    }

    /**
    * The list of subscription lines associated with the subscription contract.
    */
    public SubscriptionContractQuery lines(SubscriptionLineConnectionQueryDefinition queryDef) {
        return lines(args -> {}, queryDef);
    }

    /**
    * The list of subscription lines associated with the subscription contract.
    */
    public SubscriptionContractQuery lines(LinesArgumentsDefinition argsDef, SubscriptionLineConnectionQueryDefinition queryDef) {
        startField("lines");

        LinesArguments args = new LinesArguments(_queryBuilder);
        argsDef.define(args);
        LinesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionLineConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of lines associated with the subscription contract.
    */
    public SubscriptionContractQuery linesCount(CountQueryDefinition queryDef) {
        startField("linesCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The next billing date for the subscription contract. This field is managed by the apps.
    * Alternatively you can utilize our
    * [Billing Cycles
    * APIs](https://shopify.dev/docs/apps/selling-strategies/subscriptions/billing-cycles),
    * which provide auto-computed billing dates and additional functionalities.
    */
    public SubscriptionContractQuery nextBillingDate() {
        startField("nextBillingDate");

        return this;
    }

    /**
    * The note field that will be applied to the generated orders.
    */
    public SubscriptionContractQuery note() {
        startField("note");

        return this;
    }

    public class OrdersArguments extends Arguments {
        OrdersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public OrdersArguments first(Integer value) {
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
        public OrdersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public OrdersArguments last(Integer value) {
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
        public OrdersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public OrdersArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OrdersArgumentsDefinition {
        void define(OrdersArguments args);
    }

    /**
    * A list of the subscription contract's orders.
    */
    public SubscriptionContractQuery orders(OrderConnectionQueryDefinition queryDef) {
        return orders(args -> {}, queryDef);
    }

    /**
    * A list of the subscription contract's orders.
    */
    public SubscriptionContractQuery orders(OrdersArgumentsDefinition argsDef, OrderConnectionQueryDefinition queryDef) {
        startField("orders");

        OrdersArguments args = new OrdersArguments(_queryBuilder);
        argsDef.define(args);
        OrdersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrderConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The order from which this contract originated.
    */
    public SubscriptionContractQuery originOrder(OrderQueryDefinition queryDef) {
        startField("originOrder");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The revision id of the contract.
    */
    public SubscriptionContractQuery revisionId() {
        startField("revisionId");

        return this;
    }

    /**
    * The current status of the subscription contract.
    */
    public SubscriptionContractQuery status() {
        startField("status");

        return this;
    }

    /**
    * The date and time when the subscription contract was updated.
    */
    public SubscriptionContractQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
