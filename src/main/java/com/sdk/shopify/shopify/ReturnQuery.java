// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* The `Return` object represents the intent of a buyer to ship one or more items from an order back to
* a merchant
* or a third-party fulfillment location. A return is associated with an
* [order](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order)
* and can include multiple return [line
* items](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem).
* Each return has a
* [status](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps#return-statuses),
* which indicates the state of the return.
* Use the `Return` object to capture the financial, logistical,
* and business intent of a return. For example, you can identify eligible items for a return and issue
* customers
* a refund for returned items on behalf of the merchant.
* Learn more about providing a
* [return management
* workflow](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/build-return-managemen
* t)
* for merchants. You can also manage
* [exchanges](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-exchanges),
* [reverse fulfillment
* orders](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-reverse-fulfillme
* nt-orders),
* and [reverse
* deliveries](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-reverse-deliv
* eries)
* on behalf of merchants.
*/
public class ReturnQuery extends Query<ReturnQuery> {
    ReturnQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The date and time when the return was closed.
    */
    public ReturnQuery closedAt() {
        startField("closedAt");

        return this;
    }

    /**
    * The date and time when the return was created.
    */
    public ReturnQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Additional information about the declined return.
    */
    public ReturnQuery decline(ReturnDeclineQueryDefinition queryDef) {
        startField("decline");

        _queryBuilder.append('{');
        queryDef.define(new ReturnDeclineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ExchangeLineItemsArguments extends Arguments {
        ExchangeLineItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Include exchange line items that have been removed from the order by an order edit, return, etc.
        * Items that have been removed have a zero
        * ([LineItem.currentQuantity](https://shopify.dev/docs/api/admin-graphql/unstable/objects/LineItem#fie
        * ld-lineitem-currentquantity)).
        */
        public ExchangeLineItemsArguments includeRemovedItems(Boolean value) {
            if (value != null) {
                startArgument("includeRemovedItems");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ExchangeLineItemsArguments first(Integer value) {
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
        public ExchangeLineItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ExchangeLineItemsArguments last(Integer value) {
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
        public ExchangeLineItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ExchangeLineItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ExchangeLineItemsArgumentsDefinition {
        void define(ExchangeLineItemsArguments args);
    }

    /**
    * The exchange line items attached to the return.
    */
    public ReturnQuery exchangeLineItems(ExchangeLineItemConnectionQueryDefinition queryDef) {
        return exchangeLineItems(args -> {}, queryDef);
    }

    /**
    * The exchange line items attached to the return.
    */
    public ReturnQuery exchangeLineItems(ExchangeLineItemsArgumentsDefinition argsDef, ExchangeLineItemConnectionQueryDefinition queryDef) {
        startField("exchangeLineItems");

        ExchangeLineItemsArguments args = new ExchangeLineItemsArguments(_queryBuilder);
        argsDef.define(args);
        ExchangeLineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ExchangeLineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the return.
    */
    public ReturnQuery name() {
        startField("name");

        return this;
    }

    /**
    * The order that the return belongs to.
    */
    public ReturnQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RefundsArguments extends Arguments {
        RefundsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public RefundsArguments first(Integer value) {
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
        public RefundsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public RefundsArguments last(Integer value) {
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
        public RefundsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public RefundsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RefundsArgumentsDefinition {
        void define(RefundsArguments args);
    }

    /**
    * The list of refunds associated with the return.
    */
    public ReturnQuery refunds(RefundConnectionQueryDefinition queryDef) {
        return refunds(args -> {}, queryDef);
    }

    /**
    * The list of refunds associated with the return.
    */
    public ReturnQuery refunds(RefundsArgumentsDefinition argsDef, RefundConnectionQueryDefinition queryDef) {
        startField("refunds");

        RefundsArguments args = new RefundsArguments(_queryBuilder);
        argsDef.define(args);
        RefundsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RefundConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the return was approved.
    */
    public ReturnQuery requestApprovedAt() {
        startField("requestApprovedAt");

        return this;
    }

    public class ReturnLineItemsArguments extends Arguments {
        ReturnLineItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReturnLineItemsArguments first(Integer value) {
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
        public ReturnLineItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReturnLineItemsArguments last(Integer value) {
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
        public ReturnLineItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ReturnLineItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReturnLineItemsArgumentsDefinition {
        void define(ReturnLineItemsArguments args);
    }

    /**
    * The return line items attached to the return.
    */
    public ReturnQuery returnLineItems(ReturnLineItemTypeConnectionQueryDefinition queryDef) {
        return returnLineItems(args -> {}, queryDef);
    }

    /**
    * The return line items attached to the return.
    */
    public ReturnQuery returnLineItems(ReturnLineItemsArgumentsDefinition argsDef, ReturnLineItemTypeConnectionQueryDefinition queryDef) {
        startField("returnLineItems");

        ReturnLineItemsArguments args = new ReturnLineItemsArguments(_queryBuilder);
        argsDef.define(args);
        ReturnLineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReturnLineItemTypeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The return shipping fees for the return.
    */
    public ReturnQuery returnShippingFees(ReturnShippingFeeQueryDefinition queryDef) {
        startField("returnShippingFees");

        _queryBuilder.append('{');
        queryDef.define(new ReturnShippingFeeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ReverseFulfillmentOrdersArguments extends Arguments {
        ReverseFulfillmentOrdersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReverseFulfillmentOrdersArguments first(Integer value) {
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
        public ReverseFulfillmentOrdersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReverseFulfillmentOrdersArguments last(Integer value) {
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
        public ReverseFulfillmentOrdersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ReverseFulfillmentOrdersArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReverseFulfillmentOrdersArgumentsDefinition {
        void define(ReverseFulfillmentOrdersArguments args);
    }

    /**
    * The list of reverse fulfillment orders for the return.
    */
    public ReturnQuery reverseFulfillmentOrders(ReverseFulfillmentOrderConnectionQueryDefinition queryDef) {
        return reverseFulfillmentOrders(args -> {}, queryDef);
    }

    /**
    * The list of reverse fulfillment orders for the return.
    */
    public ReturnQuery reverseFulfillmentOrders(ReverseFulfillmentOrdersArgumentsDefinition argsDef, ReverseFulfillmentOrderConnectionQueryDefinition queryDef) {
        startField("reverseFulfillmentOrders");

        ReverseFulfillmentOrdersArguments args = new ReverseFulfillmentOrdersArguments(_queryBuilder);
        argsDef.define(args);
        ReverseFulfillmentOrdersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the return.
    */
    public ReturnQuery status() {
        startField("status");

        return this;
    }

    public class SuggestedFinancialOutcomeArguments extends Arguments {
        SuggestedFinancialOutcomeArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The shipping amount from the associated order to include as a refund.
        */
        public SuggestedFinancialOutcomeArguments refundShipping(RefundShippingInput value) {
            if (value != null) {
                startArgument("refundShipping");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * The duties from the associated order to include as a refund.
        */
        public SuggestedFinancialOutcomeArguments refundDuties(List<RefundDutyInput> value) {
            if (value != null) {
                startArgument("refundDuties");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (RefundDutyInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * Specifies which refund methods to allocate the suggested refund amount to.
        */
        public SuggestedFinancialOutcomeArguments refundMethodAllocation(RefundMethodAllocation value) {
            if (value != null) {
                startArgument("refundMethodAllocation");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface SuggestedFinancialOutcomeArgumentsDefinition {
        void define(SuggestedFinancialOutcomeArguments args);
    }

    /**
    * A suggested financial outcome for the return.
    */
    public ReturnQuery suggestedFinancialOutcome(List<SuggestedOutcomeReturnLineItemInput> returnLineItems, List<SuggestedOutcomeExchangeLineItemInput> exchangeLineItems, SuggestedReturnFinancialOutcomeQueryDefinition queryDef) {
        return suggestedFinancialOutcome(returnLineItems, exchangeLineItems, args -> {}, queryDef);
    }

    /**
    * A suggested financial outcome for the return.
    */
    public ReturnQuery suggestedFinancialOutcome(List<SuggestedOutcomeReturnLineItemInput> returnLineItems, List<SuggestedOutcomeExchangeLineItemInput> exchangeLineItems, SuggestedFinancialOutcomeArgumentsDefinition argsDef, SuggestedReturnFinancialOutcomeQueryDefinition queryDef) {
        startField("suggestedFinancialOutcome");

        _queryBuilder.append("(returnLineItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (SuggestedOutcomeReturnLineItemInput item1 : returnLineItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(",exchangeLineItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (SuggestedOutcomeExchangeLineItemInput item1 : exchangeLineItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        argsDef.define(new SuggestedFinancialOutcomeArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SuggestedReturnFinancialOutcomeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of all return line item quantities for the return.
    */
    public ReturnQuery totalQuantity() {
        startField("totalQuantity");

        return this;
    }
}
