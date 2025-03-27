// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A location that a fulfillment order can potentially move to.
*/
public class FulfillmentOrderLocationForMoveQuery extends Query<FulfillmentOrderLocationForMoveQuery> {
    FulfillmentOrderLocationForMoveQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class AvailableLineItemsArguments extends Arguments {
        AvailableLineItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AvailableLineItemsArguments first(Integer value) {
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
        public AvailableLineItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AvailableLineItemsArguments last(Integer value) {
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
        public AvailableLineItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AvailableLineItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AvailableLineItemsArgumentsDefinition {
        void define(AvailableLineItemsArguments args);
    }

    /**
    * Fulfillment order line items that can be moved from their current location to the given location.
    */
    public FulfillmentOrderLocationForMoveQuery availableLineItems(FulfillmentOrderLineItemConnectionQueryDefinition queryDef) {
        return availableLineItems(args -> {}, queryDef);
    }

    /**
    * Fulfillment order line items that can be moved from their current location to the given location.
    */
    public FulfillmentOrderLocationForMoveQuery availableLineItems(AvailableLineItemsArgumentsDefinition argsDef, FulfillmentOrderLineItemConnectionQueryDefinition queryDef) {
        startField("availableLineItems");

        AvailableLineItemsArguments args = new AvailableLineItemsArguments(_queryBuilder);
        argsDef.define(args);
        AvailableLineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderLineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total number of fulfillment order line items that can be moved from their current assigned location
    * to the
    * given location.
    */
    public FulfillmentOrderLocationForMoveQuery availableLineItemsCount(CountQueryDefinition queryDef) {
        startField("availableLineItemsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The location being considered as the fulfillment order's new assigned location.
    */
    public FulfillmentOrderLocationForMoveQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A human-readable string with the reason why the fulfillment order, or some of its line items, can't
    * be
    * moved to the location.
    */
    public FulfillmentOrderLocationForMoveQuery message() {
        startField("message");

        return this;
    }

    /**
    * Whether the fulfillment order can be moved to the location.
    */
    public FulfillmentOrderLocationForMoveQuery movable() {
        startField("movable");

        return this;
    }

    public class UnavailableLineItemsArguments extends Arguments {
        UnavailableLineItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UnavailableLineItemsArguments first(Integer value) {
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
        public UnavailableLineItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UnavailableLineItemsArguments last(Integer value) {
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
        public UnavailableLineItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public UnavailableLineItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface UnavailableLineItemsArgumentsDefinition {
        void define(UnavailableLineItemsArguments args);
    }

    /**
    * Fulfillment order line items that cannot be moved from their current location to the given location.
    */
    public FulfillmentOrderLocationForMoveQuery unavailableLineItems(FulfillmentOrderLineItemConnectionQueryDefinition queryDef) {
        return unavailableLineItems(args -> {}, queryDef);
    }

    /**
    * Fulfillment order line items that cannot be moved from their current location to the given location.
    */
    public FulfillmentOrderLocationForMoveQuery unavailableLineItems(UnavailableLineItemsArgumentsDefinition argsDef, FulfillmentOrderLineItemConnectionQueryDefinition queryDef) {
        startField("unavailableLineItems");

        UnavailableLineItemsArguments args = new UnavailableLineItemsArguments(_queryBuilder);
        argsDef.define(args);
        UnavailableLineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderLineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total number of fulfillment order line items that can't be moved from their current assigned
    * location to the
    * given location.
    */
    public FulfillmentOrderLocationForMoveQuery unavailableLineItemsCount(CountQueryDefinition queryDef) {
        startField("unavailableLineItemsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
