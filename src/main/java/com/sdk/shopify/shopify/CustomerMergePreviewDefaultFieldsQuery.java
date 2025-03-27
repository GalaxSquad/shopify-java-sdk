// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* The fields that will be kept as part of a customer merge preview.
*/
public class CustomerMergePreviewDefaultFieldsQuery extends Query<CustomerMergePreviewDefaultFieldsQuery> {
    CustomerMergePreviewDefaultFieldsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class AddressesArguments extends Arguments {
        AddressesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AddressesArguments first(Integer value) {
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
        public AddressesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AddressesArguments last(Integer value) {
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
        public AddressesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AddressesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AddressesArgumentsDefinition {
        void define(AddressesArguments args);
    }

    /**
    * The merged addresses resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery addresses(MailingAddressConnectionQueryDefinition queryDef) {
        return addresses(args -> {}, queryDef);
    }

    /**
    * The merged addresses resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery addresses(AddressesArgumentsDefinition argsDef, MailingAddressConnectionQueryDefinition queryDef) {
        startField("addresses");

        AddressesArguments args = new AddressesArguments(_queryBuilder);
        argsDef.define(args);
        AddressesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The default address resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery defaultAddress(MailingAddressQueryDefinition queryDef) {
        startField("defaultAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total number of customer-specific discounts resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery discountNodeCount() {
        startField("discountNodeCount");

        return this;
    }

    public class DiscountNodesArguments extends Arguments {
        DiscountNodesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountNodesArguments first(Integer value) {
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
        public DiscountNodesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountNodesArguments last(Integer value) {
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
        public DiscountNodesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DiscountNodesArguments reverse(Boolean value) {
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
        public DiscountNodesArguments sortKey(DiscountSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface DiscountNodesArgumentsDefinition {
        void define(DiscountNodesArguments args);
    }

    /**
    * The merged customer-specific discounts resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery discountNodes(DiscountNodeConnectionQueryDefinition queryDef) {
        return discountNodes(args -> {}, queryDef);
    }

    /**
    * The merged customer-specific discounts resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery discountNodes(DiscountNodesArgumentsDefinition argsDef, DiscountNodeConnectionQueryDefinition queryDef) {
        startField("discountNodes");

        DiscountNodesArguments args = new DiscountNodesArguments(_queryBuilder);
        argsDef.define(args);
        DiscountNodesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DiscountNodeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The full name of the customer, based on the values for `first_name` and `last_name`. If `first_name`
    * and `last_name` aren't available, then this field falls back to the customer's email address. If the
    * customer's email isn't available, then this field falls back to the customer's phone number.
    */
    public CustomerMergePreviewDefaultFieldsQuery displayName() {
        startField("displayName");

        return this;
    }

    /**
    * The total number of merged draft orders.
    */
    public CustomerMergePreviewDefaultFieldsQuery draftOrderCount() {
        startField("draftOrderCount");

        return this;
    }

    public class DraftOrdersArguments extends Arguments {
        DraftOrdersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DraftOrdersArguments first(Integer value) {
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
        public DraftOrdersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DraftOrdersArguments last(Integer value) {
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
        public DraftOrdersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DraftOrdersArguments reverse(Boolean value) {
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
        public DraftOrdersArguments sortKey(DraftOrderSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface DraftOrdersArgumentsDefinition {
        void define(DraftOrdersArguments args);
    }

    /**
    * The merged draft orders resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery draftOrders(DraftOrderConnectionQueryDefinition queryDef) {
        return draftOrders(args -> {}, queryDef);
    }

    /**
    * The merged draft orders resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery draftOrders(DraftOrdersArgumentsDefinition argsDef, DraftOrderConnectionQueryDefinition queryDef) {
        startField("draftOrders");

        DraftOrdersArguments args = new DraftOrdersArguments(_queryBuilder);
        argsDef.define(args);
        DraftOrdersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The email state of a customer.
    */
    public CustomerMergePreviewDefaultFieldsQuery email(CustomerEmailAddressQueryDefinition queryDef) {
        startField("email");

        _queryBuilder.append('{');
        queryDef.define(new CustomerEmailAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The first name resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery firstName() {
        startField("firstName");

        return this;
    }

    /**
    * The total number of merged gift cards.
    */
    public CustomerMergePreviewDefaultFieldsQuery giftCardCount() {
        startField("giftCardCount");

        return this;
    }

    public class GiftCardsArguments extends Arguments {
        GiftCardsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public GiftCardsArguments first(Integer value) {
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
        public GiftCardsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public GiftCardsArguments last(Integer value) {
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
        public GiftCardsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public GiftCardsArguments reverse(Boolean value) {
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
        public GiftCardsArguments sortKey(GiftCardSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface GiftCardsArgumentsDefinition {
        void define(GiftCardsArguments args);
    }

    /**
    * The merged gift cards resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery giftCards(GiftCardConnectionQueryDefinition queryDef) {
        return giftCards(args -> {}, queryDef);
    }

    /**
    * The merged gift cards resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery giftCards(GiftCardsArgumentsDefinition argsDef, GiftCardConnectionQueryDefinition queryDef) {
        startField("giftCards");

        GiftCardsArguments args = new GiftCardsArguments(_queryBuilder);
        argsDef.define(args);
        GiftCardsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new GiftCardConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The last name resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery lastName() {
        startField("lastName");

        return this;
    }

    /**
    * The total number of merged metafields.
    */
    public CustomerMergePreviewDefaultFieldsQuery metafieldCount() {
        startField("metafieldCount");

        return this;
    }

    /**
    * The merged note resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery note() {
        startField("note");

        return this;
    }

    /**
    * The total number of merged orders.
    */
    public CustomerMergePreviewDefaultFieldsQuery orderCount() {
        startField("orderCount");

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

        /**
        * Sort the underlying list using a key. If your query is slow or returns an error, then [try
        * specifying a sort key that matches the field used in the
        * search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
        */
        public OrdersArguments sortKey(OrderSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface OrdersArgumentsDefinition {
        void define(OrdersArguments args);
    }

    /**
    * The merged orders resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery orders(OrderConnectionQueryDefinition queryDef) {
        return orders(args -> {}, queryDef);
    }

    /**
    * The merged orders resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery orders(OrdersArgumentsDefinition argsDef, OrderConnectionQueryDefinition queryDef) {
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
    * The phone number state of a customer.
    */
    public CustomerMergePreviewDefaultFieldsQuery phoneNumber(CustomerPhoneNumberQueryDefinition queryDef) {
        startField("phoneNumber");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPhoneNumberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The merged tags resulting from a customer merge.
    */
    public CustomerMergePreviewDefaultFieldsQuery tags() {
        startField("tags");

        return this;
    }
}
