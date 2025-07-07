// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Represents an inventory shipment.
*/
public class InventoryShipmentQuery extends Query<InventoryShipmentQuery> {
    InventoryShipmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The total quantity of all items in the shipment.
    */
    public InventoryShipmentQuery lineItemTotalQuantity() {
        startField("lineItemTotalQuantity");

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
        * Sort the underlying list using a key. If your query is slow or returns an error, then [try
        * specifying a sort key that matches the field used in the
        * search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
        */
        public LineItemsArguments sortKey(ShipmentLineItemSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
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
    * The line items included in this shipment.
    */
    public InventoryShipmentQuery lineItems(InventoryShipmentLineItemConnectionQueryDefinition queryDef) {
        return lineItems(args -> {}, queryDef);
    }

    /**
    * The line items included in this shipment.
    */
    public InventoryShipmentQuery lineItems(LineItemsArgumentsDefinition argsDef, InventoryShipmentLineItemConnectionQueryDefinition queryDef) {
        startField("lineItems");

        LineItemsArguments args = new LineItemsArguments(_queryBuilder);
        argsDef.define(args);
        LineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentLineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LineItemsCountArguments extends Arguments {
        LineItemsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public LineItemsCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public LineItemsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LineItemsCountArgumentsDefinition {
        void define(LineItemsCountArguments args);
    }

    /**
    * The number of line items associated with the inventory shipment. Limited to a maximum of 10000 by
    * default.
    */
    public InventoryShipmentQuery lineItemsCount(CountQueryDefinition queryDef) {
        return lineItemsCount(args -> {}, queryDef);
    }

    /**
    * The number of line items associated with the inventory shipment. Limited to a maximum of 10000 by
    * default.
    */
    public InventoryShipmentQuery lineItemsCount(LineItemsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("lineItemsCount");

        LineItemsCountArguments args = new LineItemsCountArguments(_queryBuilder);
        argsDef.define(args);
        LineItemsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the inventory shipment.
    */
    public InventoryShipmentQuery name() {
        startField("name");

        return this;
    }

    /**
    * The current status of the shipment.
    */
    public InventoryShipmentQuery status() {
        startField("status");

        return this;
    }

    /**
    * The total quantity of items accepted across all line items in this shipment.
    */
    public InventoryShipmentQuery totalAcceptedQuantity() {
        startField("totalAcceptedQuantity");

        return this;
    }

    /**
    * The total quantity of items received (both accepted and rejected) across all line items in this
    * shipment.
    */
    public InventoryShipmentQuery totalReceivedQuantity() {
        startField("totalReceivedQuantity");

        return this;
    }

    /**
    * The total quantity of items rejected across all line items in this shipment.
    */
    public InventoryShipmentQuery totalRejectedQuantity() {
        startField("totalRejectedQuantity");

        return this;
    }

    /**
    * The tracking information for the shipment.
    */
    public InventoryShipmentQuery tracking(InventoryShipmentTrackingQueryDefinition queryDef) {
        startField("tracking");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentTrackingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
