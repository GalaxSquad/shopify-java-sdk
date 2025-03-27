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
* A group of one or more items in a return that will be processed at a fulfillment service.
* There can be more than one reverse fulfillment order for a return at a given location.
*/
public class ReverseFulfillmentOrderQuery extends Query<ReverseFulfillmentOrderQuery> {
    ReverseFulfillmentOrderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
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
    }

    public interface LineItemsArgumentsDefinition {
        void define(LineItemsArguments args);
    }

    /**
    * The list of reverse fulfillment order line items for the reverse fulfillment order.
    */
    public ReverseFulfillmentOrderQuery lineItems(ReverseFulfillmentOrderLineItemConnectionQueryDefinition queryDef) {
        return lineItems(args -> {}, queryDef);
    }

    /**
    * The list of reverse fulfillment order line items for the reverse fulfillment order.
    */
    public ReverseFulfillmentOrderQuery lineItems(LineItemsArgumentsDefinition argsDef, ReverseFulfillmentOrderLineItemConnectionQueryDefinition queryDef) {
        startField("lineItems");

        LineItemsArguments args = new LineItemsArguments(_queryBuilder);
        argsDef.define(args);
        LineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderLineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The order associated with the reverse fulfillment order.
    */
    public ReverseFulfillmentOrderQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ReverseDeliveriesArguments extends Arguments {
        ReverseDeliveriesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReverseDeliveriesArguments first(Integer value) {
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
        public ReverseDeliveriesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReverseDeliveriesArguments last(Integer value) {
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
        public ReverseDeliveriesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ReverseDeliveriesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReverseDeliveriesArgumentsDefinition {
        void define(ReverseDeliveriesArguments args);
    }

    /**
    * The list of reverse deliveries for the reverse fulfillment order.
    */
    public ReverseFulfillmentOrderQuery reverseDeliveries(ReverseDeliveryConnectionQueryDefinition queryDef) {
        return reverseDeliveries(args -> {}, queryDef);
    }

    /**
    * The list of reverse deliveries for the reverse fulfillment order.
    */
    public ReverseFulfillmentOrderQuery reverseDeliveries(ReverseDeliveriesArgumentsDefinition argsDef, ReverseDeliveryConnectionQueryDefinition queryDef) {
        startField("reverseDeliveries");

        ReverseDeliveriesArguments args = new ReverseDeliveriesArguments(_queryBuilder);
        argsDef.define(args);
        ReverseDeliveriesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the reverse fulfillment order.
    */
    public ReverseFulfillmentOrderQuery status() {
        startField("status");

        return this;
    }

    /**
    * The current confirmation for the reverse fulfillment order from a third-party logistics service. 
    * If no third-party service is involved, then this value is `nil`.
    */
    public ReverseFulfillmentOrderQuery thirdPartyConfirmation(ReverseFulfillmentOrderThirdPartyConfirmationQueryDefinition queryDef) {
        startField("thirdPartyConfirmation");

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderThirdPartyConfirmationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
