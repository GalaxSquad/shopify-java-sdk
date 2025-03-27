// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* Represents a fulfillment.
* In Shopify, a fulfillment represents a shipment of one or more items in an order.
* When an order has been completely fulfilled, it means that all the items that are included
* in the order have been sent to the customer.
* There can be more than one fulfillment for an order.
*/
public class FulfillmentQuery extends Query<FulfillmentQuery> {
    FulfillmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The date and time when the fulfillment was created.
    */
    public FulfillmentQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The date that this fulfillment was delivered.
    */
    public FulfillmentQuery deliveredAt() {
        startField("deliveredAt");

        return this;
    }

    /**
    * Human readable display status for this fulfillment.
    */
    public FulfillmentQuery displayStatus() {
        startField("displayStatus");

        return this;
    }

    /**
    * The estimated date that this fulfillment will arrive.
    */
    public FulfillmentQuery estimatedDeliveryAt() {
        startField("estimatedDeliveryAt");

        return this;
    }

    public class EventsArguments extends Arguments {
        EventsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public EventsArguments first(Integer value) {
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
        public EventsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public EventsArguments last(Integer value) {
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
        public EventsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public EventsArguments reverse(Boolean value) {
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
        public EventsArguments sortKey(FulfillmentEventSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface EventsArgumentsDefinition {
        void define(EventsArguments args);
    }

    /**
    * The history of events associated with this fulfillment.
    */
    public FulfillmentQuery events(FulfillmentEventConnectionQueryDefinition queryDef) {
        return events(args -> {}, queryDef);
    }

    /**
    * The history of events associated with this fulfillment.
    */
    public FulfillmentQuery events(EventsArgumentsDefinition argsDef, FulfillmentEventConnectionQueryDefinition queryDef) {
        startField("events");

        EventsArguments args = new EventsArguments(_queryBuilder);
        argsDef.define(args);
        EventsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentEventConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentLineItemsArguments extends Arguments {
        FulfillmentLineItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public FulfillmentLineItemsArguments first(Integer value) {
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
        public FulfillmentLineItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public FulfillmentLineItemsArguments last(Integer value) {
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
        public FulfillmentLineItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public FulfillmentLineItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FulfillmentLineItemsArgumentsDefinition {
        void define(FulfillmentLineItemsArguments args);
    }

    /**
    * List of the fulfillment's line items.
    */
    public FulfillmentQuery fulfillmentLineItems(FulfillmentLineItemConnectionQueryDefinition queryDef) {
        return fulfillmentLineItems(args -> {}, queryDef);
    }

    /**
    * List of the fulfillment's line items.
    */
    public FulfillmentQuery fulfillmentLineItems(FulfillmentLineItemsArgumentsDefinition argsDef, FulfillmentLineItemConnectionQueryDefinition queryDef) {
        startField("fulfillmentLineItems");

        FulfillmentLineItemsArguments args = new FulfillmentLineItemsArguments(_queryBuilder);
        argsDef.define(args);
        FulfillmentLineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentLineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentOrdersArguments extends Arguments {
        FulfillmentOrdersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public FulfillmentOrdersArguments first(Integer value) {
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
        public FulfillmentOrdersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public FulfillmentOrdersArguments last(Integer value) {
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
        public FulfillmentOrdersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public FulfillmentOrdersArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FulfillmentOrdersArgumentsDefinition {
        void define(FulfillmentOrdersArguments args);
    }

    /**
    * A paginated list of fulfillment orders for the fulfillment.
    */
    public FulfillmentQuery fulfillmentOrders(FulfillmentOrderConnectionQueryDefinition queryDef) {
        return fulfillmentOrders(args -> {}, queryDef);
    }

    /**
    * A paginated list of fulfillment orders for the fulfillment.
    */
    public FulfillmentQuery fulfillmentOrders(FulfillmentOrdersArgumentsDefinition argsDef, FulfillmentOrderConnectionQueryDefinition queryDef) {
        startField("fulfillmentOrders");

        FulfillmentOrdersArguments args = new FulfillmentOrdersArguments(_queryBuilder);
        argsDef.define(args);
        FulfillmentOrdersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the fulfillment went into transit.
    */
    public FulfillmentQuery inTransitAt() {
        startField("inTransitAt");

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public FulfillmentQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    /**
    * The location that the fulfillment was processed at.
    */
    public FulfillmentQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Human readable reference identifier for this fulfillment.
    */
    public FulfillmentQuery name() {
        startField("name");

        return this;
    }

    /**
    * The order for which the fulfillment was created.
    */
    public FulfillmentQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The address at which the fulfillment occurred. This field is intended for tax purposes, as a full
    * address is required for tax providers to accurately calculate taxes. Typically this is the address
    * of the warehouse or fulfillment center. To retrieve a fulfillment location's address, use the
    * `assignedLocation` field on the
    * [`FulfillmentOrder`](/docs/api/admin-graphql/latest/objects/FulfillmentOrder) object instead.
    */
    public FulfillmentQuery originAddress(FulfillmentOriginAddressQueryDefinition queryDef) {
        startField("originAddress");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOriginAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether any of the line items in the fulfillment require shipping.
    */
    public FulfillmentQuery requiresShipping() {
        startField("requiresShipping");

        return this;
    }

    /**
    * Fulfillment service associated with the fulfillment.
    */
    public FulfillmentQuery service(FulfillmentServiceQueryDefinition queryDef) {
        startField("service");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the fulfillment.
    */
    public FulfillmentQuery status() {
        startField("status");

        return this;
    }

    /**
    * Sum of all line item quantities for the fulfillment.
    */
    public FulfillmentQuery totalQuantity() {
        startField("totalQuantity");

        return this;
    }

    public class TrackingInfoArguments extends Arguments {
        TrackingInfoArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Truncate the array result to this size.
        */
        public TrackingInfoArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface TrackingInfoArgumentsDefinition {
        void define(TrackingInfoArguments args);
    }

    /**
    * Tracking information associated with the fulfillment,
    * such as the tracking company, tracking number, and tracking URL.
    */
    public FulfillmentQuery trackingInfo(FulfillmentTrackingInfoQueryDefinition queryDef) {
        return trackingInfo(args -> {}, queryDef);
    }

    /**
    * Tracking information associated with the fulfillment,
    * such as the tracking company, tracking number, and tracking URL.
    */
    public FulfillmentQuery trackingInfo(TrackingInfoArgumentsDefinition argsDef, FulfillmentTrackingInfoQueryDefinition queryDef) {
        startField("trackingInfo");

        TrackingInfoArguments args = new TrackingInfoArguments(_queryBuilder);
        argsDef.define(args);
        TrackingInfoArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentTrackingInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the fulfillment was last modified.
    */
    public FulfillmentQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
