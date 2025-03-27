// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* An order with edits applied but not saved.
*/
public class CalculatedOrderQuery extends Query<CalculatedOrderQuery> {
    CalculatedOrderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class AddedDiscountApplicationsArguments extends Arguments {
        AddedDiscountApplicationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AddedDiscountApplicationsArguments first(Integer value) {
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
        public AddedDiscountApplicationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AddedDiscountApplicationsArguments last(Integer value) {
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
        public AddedDiscountApplicationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AddedDiscountApplicationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AddedDiscountApplicationsArgumentsDefinition {
        void define(AddedDiscountApplicationsArguments args);
    }

    /**
    * Returns only the new discount applications being added to the order in the current edit.
    */
    public CalculatedOrderQuery addedDiscountApplications(CalculatedDiscountApplicationConnectionQueryDefinition queryDef) {
        return addedDiscountApplications(args -> {}, queryDef);
    }

    /**
    * Returns only the new discount applications being added to the order in the current edit.
    */
    public CalculatedOrderQuery addedDiscountApplications(AddedDiscountApplicationsArgumentsDefinition argsDef, CalculatedDiscountApplicationConnectionQueryDefinition queryDef) {
        startField("addedDiscountApplications");

        AddedDiscountApplicationsArguments args = new AddedDiscountApplicationsArguments(_queryBuilder);
        argsDef.define(args);
        AddedDiscountApplicationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CalculatedDiscountApplicationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AddedLineItemsArguments extends Arguments {
        AddedLineItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AddedLineItemsArguments first(Integer value) {
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
        public AddedLineItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AddedLineItemsArguments last(Integer value) {
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
        public AddedLineItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AddedLineItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AddedLineItemsArgumentsDefinition {
        void define(AddedLineItemsArguments args);
    }

    /**
    * Returns only the new line items being added to the order during the current edit.
    */
    public CalculatedOrderQuery addedLineItems(CalculatedLineItemConnectionQueryDefinition queryDef) {
        return addedLineItems(args -> {}, queryDef);
    }

    /**
    * Returns only the new line items being added to the order during the current edit.
    */
    public CalculatedOrderQuery addedLineItems(AddedLineItemsArgumentsDefinition argsDef, CalculatedLineItemConnectionQueryDefinition queryDef) {
        startField("addedLineItems");

        AddedLineItemsArguments args = new AddedLineItemsArguments(_queryBuilder);
        argsDef.define(args);
        AddedLineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CalculatedLineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Amount of the order-level discount (doesn't contain any line item discounts) in shop and presentment
    * currencies.
    */
    public CalculatedOrderQuery cartDiscountAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("cartDiscountAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LineItemsArguments extends Arguments {
        LineItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LineItemsArguments first(Integer value) {
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
        public LineItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LineItemsArguments last(Integer value) {
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
        public LineItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public LineItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | editable | boolean |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public LineItemsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface LineItemsArgumentsDefinition {
        void define(LineItemsArguments args);
    }

    /**
    * Returns all items on the order that existed before starting the edit.
    * Will include any changes that have been made.
    * Will not include line items added during the current edit.
    */
    public CalculatedOrderQuery lineItems(CalculatedLineItemConnectionQueryDefinition queryDef) {
        return lineItems(args -> {}, queryDef);
    }

    /**
    * Returns all items on the order that existed before starting the edit.
    * Will include any changes that have been made.
    * Will not include line items added during the current edit.
    */
    public CalculatedOrderQuery lineItems(LineItemsArgumentsDefinition argsDef, CalculatedLineItemConnectionQueryDefinition queryDef) {
        startField("lineItems");

        LineItemsArguments args = new LineItemsArguments(_queryBuilder);
        argsDef.define(args);
        LineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CalculatedLineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The HTML of the customer notification for the order edit.
    */
    public CalculatedOrderQuery notificationPreviewHtml() {
        startField("notificationPreviewHtml");

        return this;
    }

    /**
    * The customer notification title.
    */
    public CalculatedOrderQuery notificationPreviewTitle() {
        startField("notificationPreviewTitle");

        return this;
    }

    /**
    * The order without any changes applied.
    */
    public CalculatedOrderQuery originalOrder(OrderQueryDefinition queryDef) {
        startField("originalOrder");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the shipping lines on the order that existed before starting the edit.
    * Will include any changes that have been made as well as shipping lines added during the current
    * edit.
    * Returns only the first 250 shipping lines.
    */
    public CalculatedOrderQuery shippingLines(CalculatedShippingLineQueryDefinition queryDef) {
        startField("shippingLines");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class StagedChangesArguments extends Arguments {
        StagedChangesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StagedChangesArguments first(Integer value) {
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
        public StagedChangesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StagedChangesArguments last(Integer value) {
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
        public StagedChangesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public StagedChangesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface StagedChangesArgumentsDefinition {
        void define(StagedChangesArguments args);
    }

    /**
    * List of changes made to the order during the current edit.
    */
    public CalculatedOrderQuery stagedChanges(OrderStagedChangeConnectionQueryDefinition queryDef) {
        return stagedChanges(args -> {}, queryDef);
    }

    /**
    * List of changes made to the order during the current edit.
    */
    public CalculatedOrderQuery stagedChanges(StagedChangesArgumentsDefinition argsDef, OrderStagedChangeConnectionQueryDefinition queryDef) {
        startField("stagedChanges");

        StagedChangesArguments args = new StagedChangesArguments(_queryBuilder);
        argsDef.define(args);
        StagedChangesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrderStagedChangeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of the quantities for the line items that contribute to the order's subtotal.
    */
    public CalculatedOrderQuery subtotalLineItemsQuantity() {
        startField("subtotalLineItemsQuantity");

        return this;
    }

    /**
    * The subtotal of the line items, in shop and presentment currencies, after all the discounts are
    * applied.  The subtotal doesn't include shipping.  The subtotal includes taxes for taxes-included
    * orders and excludes taxes for taxes-excluded orders.
    */
    public CalculatedOrderQuery subtotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("subtotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Taxes charged for the line item.
    */
    public CalculatedOrderQuery taxLines(TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total price of the order less the total amount received from the customer in shop and presentment
    * currencies.
    */
    public CalculatedOrderQuery totalOutstandingSet(MoneyBagQueryDefinition queryDef) {
        startField("totalOutstandingSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total amount of the order (includes taxes and discounts) in shop and presentment currencies.
    */
    public CalculatedOrderQuery totalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
