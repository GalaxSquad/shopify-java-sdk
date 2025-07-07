// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* The `SubscriptionDraft` object represents a draft version of a
* [subscription
* contract](https://shopify.dev/docs/api/admin-graphql/latest/objects/SubscriptionContract)
* before it's committed. It serves as a staging area for making changes to an existing subscription or
* creating
* a new one. The draft allows you to preview and modify various aspects of a subscription before
* applying the changes.
* Use the `SubscriptionDraft` object to:
* - Add, remove, or modify subscription lines and their quantities
* - Manage discounts (add, remove, or update manual and code-based discounts)
* - Configure delivery options and shipping methods
* - Set up billing and delivery policies
* - Manage customer payment methods
* - Add custom attributes and notes to generated orders
* - Configure billing cycles and next billing dates
* - Preview the projected state of the subscription
* Each `SubscriptionDraft` object maintains a projected state that shows how the subscription will
* look after the changes
* are committed. This allows you to preview the impact of your modifications before applying them. The
* draft can be
* associated with an existing subscription contract (for modifications) or used to create a new
* subscription.
* The draft remains in a draft state until it's committed, at which point the changes are applied to
* the subscription
* contract and the draft is no longer accessible.
* Learn more about
* [how subscription contracts
* work](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/contracts)
* and how to
* [build](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/contracts/build-a-subscri
* ption-contract),
* [update](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/contracts/update-a-subsc
* ription-contract), and
* [combine](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/contracts/combine-subsc
* ription-contracts) subscription contracts.
*/
public class SubscriptionDraftQuery extends Query<SubscriptionDraftQuery> {
    SubscriptionDraftQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The billing cycle that the subscription contract will be associated with.
    */
    public SubscriptionDraftQuery billingCycle(SubscriptionBillingCycleQueryDefinition queryDef) {
        startField("billingCycle");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The billing policy for the subscription contract.
    */
    public SubscriptionDraftQuery billingPolicy(SubscriptionBillingPolicyQueryDefinition queryDef) {
        startField("billingPolicy");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ConcatenatedBillingCyclesArguments extends Arguments {
        ConcatenatedBillingCyclesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ConcatenatedBillingCyclesArguments first(Integer value) {
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
        public ConcatenatedBillingCyclesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ConcatenatedBillingCyclesArguments last(Integer value) {
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
        public ConcatenatedBillingCyclesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ConcatenatedBillingCyclesArguments reverse(Boolean value) {
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
        public ConcatenatedBillingCyclesArguments sortKey(SubscriptionBillingCyclesSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface ConcatenatedBillingCyclesArgumentsDefinition {
        void define(ConcatenatedBillingCyclesArguments args);
    }

    /**
    * The billing cycles of the contracts that will be concatenated to the subscription contract.
    */
    public SubscriptionDraftQuery concatenatedBillingCycles(SubscriptionBillingCycleConnectionQueryDefinition queryDef) {
        return concatenatedBillingCycles(args -> {}, queryDef);
    }

    /**
    * The billing cycles of the contracts that will be concatenated to the subscription contract.
    */
    public SubscriptionDraftQuery concatenatedBillingCycles(ConcatenatedBillingCyclesArgumentsDefinition argsDef, SubscriptionBillingCycleConnectionQueryDefinition queryDef) {
        startField("concatenatedBillingCycles");

        ConcatenatedBillingCyclesArguments args = new ConcatenatedBillingCyclesArguments(_queryBuilder);
        argsDef.define(args);
        ConcatenatedBillingCyclesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The currency used for the subscription contract.
    */
    public SubscriptionDraftQuery currencyCode() {
        startField("currencyCode");

        return this;
    }

    /**
    * A list of the custom attributes to be added to the generated orders.
    */
    public SubscriptionDraftQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customer to whom the subscription contract belongs.
    */
    public SubscriptionDraftQuery customer(CustomerQueryDefinition queryDef) {
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
    * The customer payment method used for the subscription contract.
    */
    public SubscriptionDraftQuery customerPaymentMethod(CustomerPaymentMethodQueryDefinition queryDef) {
        return customerPaymentMethod(args -> {}, queryDef);
    }

    /**
    * The customer payment method used for the subscription contract.
    */
    public SubscriptionDraftQuery customerPaymentMethod(CustomerPaymentMethodArgumentsDefinition argsDef, CustomerPaymentMethodQueryDefinition queryDef) {
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
    public SubscriptionDraftQuery deliveryMethod(SubscriptionDeliveryMethodQueryDefinition queryDef) {
        startField("deliveryMethod");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDeliveryMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DeliveryOptionsArguments extends Arguments {
        DeliveryOptionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The address to deliver the subscription contract to.
        */
        public DeliveryOptionsArguments deliveryAddress(MailingAddressInput value) {
            if (value != null) {
                startArgument("deliveryAddress");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface DeliveryOptionsArgumentsDefinition {
        void define(DeliveryOptionsArguments args);
    }

    /**
    * The available delivery options for a given delivery address. Returns `null` for pending requests.
    */
    public SubscriptionDraftQuery deliveryOptions(SubscriptionDeliveryOptionResultQueryDefinition queryDef) {
        return deliveryOptions(args -> {}, queryDef);
    }

    /**
    * The available delivery options for a given delivery address. Returns `null` for pending requests.
    */
    public SubscriptionDraftQuery deliveryOptions(DeliveryOptionsArgumentsDefinition argsDef, SubscriptionDeliveryOptionResultQueryDefinition queryDef) {
        startField("deliveryOptions");

        DeliveryOptionsArguments args = new DeliveryOptionsArguments(_queryBuilder);
        argsDef.define(args);
        DeliveryOptionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDeliveryOptionResultQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The delivery policy for the subscription contract.
    */
    public SubscriptionDraftQuery deliveryPolicy(SubscriptionDeliveryPolicyQueryDefinition queryDef) {
        startField("deliveryPolicy");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDeliveryPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The delivery price for each billing the subscription contract.
    */
    public SubscriptionDraftQuery deliveryPrice(MoneyV2QueryDefinition queryDef) {
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
    * The list of subscription discounts which will be associated with the subscription contract.
    */
    public SubscriptionDraftQuery discounts(SubscriptionDiscountConnectionQueryDefinition queryDef) {
        return discounts(args -> {}, queryDef);
    }

    /**
    * The list of subscription discounts which will be associated with the subscription contract.
    */
    public SubscriptionDraftQuery discounts(DiscountsArgumentsDefinition argsDef, SubscriptionDiscountConnectionQueryDefinition queryDef) {
        startField("discounts");

        DiscountsArguments args = new DiscountsArguments(_queryBuilder);
        argsDef.define(args);
        DiscountsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDiscountConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountsAddedArguments extends Arguments {
        DiscountsAddedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountsAddedArguments first(Integer value) {
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
        public DiscountsAddedArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountsAddedArguments last(Integer value) {
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
        public DiscountsAddedArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DiscountsAddedArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DiscountsAddedArgumentsDefinition {
        void define(DiscountsAddedArguments args);
    }

    /**
    * The list of subscription discounts to be added to the subscription contract.
    */
    public SubscriptionDraftQuery discountsAdded(SubscriptionDiscountConnectionQueryDefinition queryDef) {
        return discountsAdded(args -> {}, queryDef);
    }

    /**
    * The list of subscription discounts to be added to the subscription contract.
    */
    public SubscriptionDraftQuery discountsAdded(DiscountsAddedArgumentsDefinition argsDef, SubscriptionDiscountConnectionQueryDefinition queryDef) {
        startField("discountsAdded");

        DiscountsAddedArguments args = new DiscountsAddedArguments(_queryBuilder);
        argsDef.define(args);
        DiscountsAddedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDiscountConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountsRemovedArguments extends Arguments {
        DiscountsRemovedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountsRemovedArguments first(Integer value) {
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
        public DiscountsRemovedArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountsRemovedArguments last(Integer value) {
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
        public DiscountsRemovedArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DiscountsRemovedArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DiscountsRemovedArgumentsDefinition {
        void define(DiscountsRemovedArguments args);
    }

    /**
    * The list of subscription discounts to be removed from the subscription contract.
    */
    public SubscriptionDraftQuery discountsRemoved(SubscriptionDiscountConnectionQueryDefinition queryDef) {
        return discountsRemoved(args -> {}, queryDef);
    }

    /**
    * The list of subscription discounts to be removed from the subscription contract.
    */
    public SubscriptionDraftQuery discountsRemoved(DiscountsRemovedArgumentsDefinition argsDef, SubscriptionDiscountConnectionQueryDefinition queryDef) {
        startField("discountsRemoved");

        DiscountsRemovedArguments args = new DiscountsRemovedArguments(_queryBuilder);
        argsDef.define(args);
        DiscountsRemovedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDiscountConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountsUpdatedArguments extends Arguments {
        DiscountsUpdatedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountsUpdatedArguments first(Integer value) {
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
        public DiscountsUpdatedArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountsUpdatedArguments last(Integer value) {
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
        public DiscountsUpdatedArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DiscountsUpdatedArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DiscountsUpdatedArgumentsDefinition {
        void define(DiscountsUpdatedArguments args);
    }

    /**
    * The list of subscription discounts to be updated on the subscription contract.
    */
    public SubscriptionDraftQuery discountsUpdated(SubscriptionDiscountConnectionQueryDefinition queryDef) {
        return discountsUpdated(args -> {}, queryDef);
    }

    /**
    * The list of subscription discounts to be updated on the subscription contract.
    */
    public SubscriptionDraftQuery discountsUpdated(DiscountsUpdatedArgumentsDefinition argsDef, SubscriptionDiscountConnectionQueryDefinition queryDef) {
        startField("discountsUpdated");

        DiscountsUpdatedArguments args = new DiscountsUpdatedArguments(_queryBuilder);
        argsDef.define(args);
        DiscountsUpdatedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDiscountConnectionQuery(_queryBuilder));
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
    * The list of subscription lines which will be associated with the subscription contract.
    */
    public SubscriptionDraftQuery lines(SubscriptionLineConnectionQueryDefinition queryDef) {
        return lines(args -> {}, queryDef);
    }

    /**
    * The list of subscription lines which will be associated with the subscription contract.
    */
    public SubscriptionDraftQuery lines(LinesArgumentsDefinition argsDef, SubscriptionLineConnectionQueryDefinition queryDef) {
        startField("lines");

        LinesArguments args = new LinesArguments(_queryBuilder);
        argsDef.define(args);
        LinesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionLineConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LinesAddedArguments extends Arguments {
        LinesAddedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LinesAddedArguments first(Integer value) {
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
        public LinesAddedArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LinesAddedArguments last(Integer value) {
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
        public LinesAddedArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public LinesAddedArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LinesAddedArgumentsDefinition {
        void define(LinesAddedArguments args);
    }

    /**
    * The list of subscription lines to be added to the subscription contract.
    */
    public SubscriptionDraftQuery linesAdded(SubscriptionLineConnectionQueryDefinition queryDef) {
        return linesAdded(args -> {}, queryDef);
    }

    /**
    * The list of subscription lines to be added to the subscription contract.
    */
    public SubscriptionDraftQuery linesAdded(LinesAddedArgumentsDefinition argsDef, SubscriptionLineConnectionQueryDefinition queryDef) {
        startField("linesAdded");

        LinesAddedArguments args = new LinesAddedArguments(_queryBuilder);
        argsDef.define(args);
        LinesAddedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionLineConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LinesRemovedArguments extends Arguments {
        LinesRemovedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LinesRemovedArguments first(Integer value) {
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
        public LinesRemovedArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LinesRemovedArguments last(Integer value) {
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
        public LinesRemovedArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public LinesRemovedArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LinesRemovedArgumentsDefinition {
        void define(LinesRemovedArguments args);
    }

    /**
    * The list of subscription lines to be removed from the subscription contract.
    */
    public SubscriptionDraftQuery linesRemoved(SubscriptionLineConnectionQueryDefinition queryDef) {
        return linesRemoved(args -> {}, queryDef);
    }

    /**
    * The list of subscription lines to be removed from the subscription contract.
    */
    public SubscriptionDraftQuery linesRemoved(LinesRemovedArgumentsDefinition argsDef, SubscriptionLineConnectionQueryDefinition queryDef) {
        startField("linesRemoved");

        LinesRemovedArguments args = new LinesRemovedArguments(_queryBuilder);
        argsDef.define(args);
        LinesRemovedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionLineConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The next billing date for the subscription contract.
    */
    public SubscriptionDraftQuery nextBillingDate() {
        startField("nextBillingDate");

        return this;
    }

    /**
    * The note field that will be applied to the generated orders.
    */
    public SubscriptionDraftQuery note() {
        startField("note");

        return this;
    }

    /**
    * The original subscription contract.
    */
    public SubscriptionDraftQuery originalContract(SubscriptionContractQueryDefinition queryDef) {
        startField("originalContract");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The current status of the subscription contract.
    */
    public SubscriptionDraftQuery status() {
        startField("status");

        return this;
    }
}
