// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Represents a subscription contract with billing cycles.
*/
public class SubscriptionBillingCycleEditedContractQuery extends Query<SubscriptionBillingCycleEditedContractQuery> {
    SubscriptionBillingCycleEditedContractQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The subscription app that the subscription contract is registered to.
    */
    public SubscriptionBillingCycleEditedContractQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The URL of the subscription contract page on the subscription app.
    */
    public SubscriptionBillingCycleEditedContractQuery appAdminUrl() {
        startField("appAdminUrl");

        return this;
    }

    public class BillingCyclesArguments extends Arguments {
        BillingCyclesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BillingCyclesArguments first(Integer value) {
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
        public BillingCyclesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BillingCyclesArguments last(Integer value) {
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
        public BillingCyclesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public BillingCyclesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Sort the underlying list using a key. If your query is slow or returns an error, then [try
        * specifying a sort key that matches the field used in the
        * search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
        */
        public BillingCyclesArguments sortKey(SubscriptionBillingCyclesSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface BillingCyclesArgumentsDefinition {
        void define(BillingCyclesArguments args);
    }

    /**
    * The billing cycles that the edited contract belongs to.
    */
    public SubscriptionBillingCycleEditedContractQuery billingCycles(SubscriptionBillingCycleConnectionQueryDefinition queryDef) {
        return billingCycles(args -> {}, queryDef);
    }

    /**
    * The billing cycles that the edited contract belongs to.
    */
    public SubscriptionBillingCycleEditedContractQuery billingCycles(BillingCyclesArgumentsDefinition argsDef, SubscriptionBillingCycleConnectionQueryDefinition queryDef) {
        startField("billingCycles");

        BillingCyclesArguments args = new BillingCyclesArguments(_queryBuilder);
        argsDef.define(args);
        BillingCyclesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the subscription contract was created.
    */
    public SubscriptionBillingCycleEditedContractQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The currency that's used for the subscription contract.
    */
    public SubscriptionBillingCycleEditedContractQuery currencyCode() {
        startField("currencyCode");

        return this;
    }

    /**
    * A list of the custom attributes to be added to the generated orders.
    */
    public SubscriptionBillingCycleEditedContractQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customer to whom the subscription contract belongs.
    */
    public SubscriptionBillingCycleEditedContractQuery customer(CustomerQueryDefinition queryDef) {
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
    public SubscriptionBillingCycleEditedContractQuery customerPaymentMethod(CustomerPaymentMethodQueryDefinition queryDef) {
        return customerPaymentMethod(args -> {}, queryDef);
    }

    /**
    * The customer payment method that's used for the subscription contract.
    */
    public SubscriptionBillingCycleEditedContractQuery customerPaymentMethod(CustomerPaymentMethodArgumentsDefinition argsDef, CustomerPaymentMethodQueryDefinition queryDef) {
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
    public SubscriptionBillingCycleEditedContractQuery deliveryMethod(SubscriptionDeliveryMethodQueryDefinition queryDef) {
        startField("deliveryMethod");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDeliveryMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The delivery price for each billing of the subscription contract.
    */
    public SubscriptionBillingCycleEditedContractQuery deliveryPrice(MoneyV2QueryDefinition queryDef) {
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
    public SubscriptionBillingCycleEditedContractQuery discounts(SubscriptionManualDiscountConnectionQueryDefinition queryDef) {
        return discounts(args -> {}, queryDef);
    }

    /**
    * The list of subscription discounts associated with the subscription contract.
    */
    public SubscriptionBillingCycleEditedContractQuery discounts(DiscountsArgumentsDefinition argsDef, SubscriptionManualDiscountConnectionQueryDefinition queryDef) {
        startField("discounts");

        DiscountsArguments args = new DiscountsArguments(_queryBuilder);
        argsDef.define(args);
        DiscountsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionManualDiscountConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public SubscriptionBillingCycleEditedContractQuery lines(SubscriptionLineConnectionQueryDefinition queryDef) {
        return lines(args -> {}, queryDef);
    }

    /**
    * The list of subscription lines associated with the subscription contract.
    */
    public SubscriptionBillingCycleEditedContractQuery lines(LinesArgumentsDefinition argsDef, SubscriptionLineConnectionQueryDefinition queryDef) {
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
    public SubscriptionBillingCycleEditedContractQuery linesCount(CountQueryDefinition queryDef) {
        startField("linesCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The note field that will be applied to the generated orders.
    */
    public SubscriptionBillingCycleEditedContractQuery note() {
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
    public SubscriptionBillingCycleEditedContractQuery orders(OrderConnectionQueryDefinition queryDef) {
        return orders(args -> {}, queryDef);
    }

    /**
    * A list of the subscription contract's orders.
    */
    public SubscriptionBillingCycleEditedContractQuery orders(OrdersArgumentsDefinition argsDef, OrderConnectionQueryDefinition queryDef) {
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
    * The date and time when the subscription contract was updated.
    */
    public SubscriptionBillingCycleEditedContractQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
