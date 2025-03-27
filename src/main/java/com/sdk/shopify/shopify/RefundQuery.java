// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* The record of the line items and transactions that were refunded to a customer, along with
* restocking instructions for refunded line items.
*/
public class RefundQuery extends Query<RefundQuery> {
    RefundQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The date and time when the refund was created.
    */
    public RefundQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * A list of the refunded duties as part of this refund.
    */
    public RefundQuery duties(RefundDutyQueryDefinition queryDef) {
        startField("duties");

        _queryBuilder.append('{');
        queryDef.define(new RefundDutyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public RefundQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    /**
    * The optional note associated with the refund.
    */
    public RefundQuery note() {
        startField("note");

        return this;
    }

    /**
    * The order associated with the refund.
    */
    public RefundQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OrderAdjustmentsArguments extends Arguments {
        OrderAdjustmentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public OrderAdjustmentsArguments first(Integer value) {
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
        public OrderAdjustmentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public OrderAdjustmentsArguments last(Integer value) {
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
        public OrderAdjustmentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public OrderAdjustmentsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OrderAdjustmentsArgumentsDefinition {
        void define(OrderAdjustmentsArguments args);
    }

    /**
    * The order adjustments that are attached with the refund.
    */
    public RefundQuery orderAdjustments(OrderAdjustmentConnectionQueryDefinition queryDef) {
        return orderAdjustments(args -> {}, queryDef);
    }

    /**
    * The order adjustments that are attached with the refund.
    */
    public RefundQuery orderAdjustments(OrderAdjustmentsArgumentsDefinition argsDef, OrderAdjustmentConnectionQueryDefinition queryDef) {
        startField("orderAdjustments");

        OrderAdjustmentsArguments args = new OrderAdjustmentsArguments(_queryBuilder);
        argsDef.define(args);
        OrderAdjustmentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrderAdjustmentConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RefundLineItemsArguments extends Arguments {
        RefundLineItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public RefundLineItemsArguments first(Integer value) {
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
        public RefundLineItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public RefundLineItemsArguments last(Integer value) {
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
        public RefundLineItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public RefundLineItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RefundLineItemsArgumentsDefinition {
        void define(RefundLineItemsArguments args);
    }

    /**
    * The `RefundLineItem` resources attached to the refund.
    */
    public RefundQuery refundLineItems(RefundLineItemConnectionQueryDefinition queryDef) {
        return refundLineItems(args -> {}, queryDef);
    }

    /**
    * The `RefundLineItem` resources attached to the refund.
    */
    public RefundQuery refundLineItems(RefundLineItemsArgumentsDefinition argsDef, RefundLineItemConnectionQueryDefinition queryDef) {
        startField("refundLineItems");

        RefundLineItemsArguments args = new RefundLineItemsArguments(_queryBuilder);
        argsDef.define(args);
        RefundLineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RefundLineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RefundShippingLinesArguments extends Arguments {
        RefundShippingLinesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public RefundShippingLinesArguments first(Integer value) {
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
        public RefundShippingLinesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public RefundShippingLinesArguments last(Integer value) {
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
        public RefundShippingLinesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public RefundShippingLinesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RefundShippingLinesArgumentsDefinition {
        void define(RefundShippingLinesArguments args);
    }

    /**
    * The `RefundShippingLine` resources attached to the refund.
    */
    public RefundQuery refundShippingLines(RefundShippingLineConnectionQueryDefinition queryDef) {
        return refundShippingLines(args -> {}, queryDef);
    }

    /**
    * The `RefundShippingLine` resources attached to the refund.
    */
    public RefundQuery refundShippingLines(RefundShippingLinesArgumentsDefinition argsDef, RefundShippingLineConnectionQueryDefinition queryDef) {
        startField("refundShippingLines");

        RefundShippingLinesArguments args = new RefundShippingLinesArguments(_queryBuilder);
        argsDef.define(args);
        RefundShippingLinesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RefundShippingLineConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The return associated with the refund.
    */
    public RefundQuery returnValue(ReturnQueryDefinition queryDef) {
        startField("return");

        _queryBuilder.append('{');
        queryDef.define(new ReturnQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The staff member who created the refund.
    */
    public RefundQuery staffMember(StaffMemberQueryDefinition queryDef) {
        startField("staffMember");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount across all transactions for the refund, in shop and presentment currencies.
    */
    public RefundQuery totalRefundedSet(MoneyBagQueryDefinition queryDef) {
        startField("totalRefundedSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class TransactionsArguments extends Arguments {
        TransactionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public TransactionsArguments first(Integer value) {
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
        public TransactionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public TransactionsArguments last(Integer value) {
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
        public TransactionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public TransactionsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface TransactionsArgumentsDefinition {
        void define(TransactionsArguments args);
    }

    /**
    * The transactions associated with the refund.
    */
    public RefundQuery transactions(OrderTransactionConnectionQueryDefinition queryDef) {
        return transactions(args -> {}, queryDef);
    }

    /**
    * The transactions associated with the refund.
    */
    public RefundQuery transactions(TransactionsArgumentsDefinition argsDef, OrderTransactionConnectionQueryDefinition queryDef) {
        startField("transactions");

        TransactionsArguments args = new TransactionsArguments(_queryBuilder);
        argsDef.define(args);
        TransactionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrderTransactionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the refund was updated.
    */
    public RefundQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
