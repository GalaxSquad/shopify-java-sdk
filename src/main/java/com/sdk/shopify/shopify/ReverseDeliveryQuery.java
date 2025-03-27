// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A reverse delivery is a post-fulfillment object that represents a buyer sending a package to a
* merchant.
* For example, a buyer requests a return, and a merchant sends the buyer a shipping label.
* The reverse delivery contains the context of the items sent back, how they're being sent back
* (for example, a shipping label), and the current state of the delivery (tracking information).
*/
public class ReverseDeliveryQuery extends Query<ReverseDeliveryQuery> {
    ReverseDeliveryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The deliverable associated with the reverse delivery.
    */
    public ReverseDeliveryQuery deliverable(ReverseDeliveryDeliverableQueryDefinition queryDef) {
        startField("deliverable");

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryDeliverableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ReverseDeliveryLineItemsArguments extends Arguments {
        ReverseDeliveryLineItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReverseDeliveryLineItemsArguments first(Integer value) {
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
        public ReverseDeliveryLineItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReverseDeliveryLineItemsArguments last(Integer value) {
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
        public ReverseDeliveryLineItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ReverseDeliveryLineItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReverseDeliveryLineItemsArgumentsDefinition {
        void define(ReverseDeliveryLineItemsArguments args);
    }

    /**
    * The reverse delivery line items attached to the reverse delivery.
    */
    public ReverseDeliveryQuery reverseDeliveryLineItems(ReverseDeliveryLineItemConnectionQueryDefinition queryDef) {
        return reverseDeliveryLineItems(args -> {}, queryDef);
    }

    /**
    * The reverse delivery line items attached to the reverse delivery.
    */
    public ReverseDeliveryQuery reverseDeliveryLineItems(ReverseDeliveryLineItemsArgumentsDefinition argsDef, ReverseDeliveryLineItemConnectionQueryDefinition queryDef) {
        startField("reverseDeliveryLineItems");

        ReverseDeliveryLineItemsArguments args = new ReverseDeliveryLineItemsArguments(_queryBuilder);
        argsDef.define(args);
        ReverseDeliveryLineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryLineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The `ReverseFulfillmentOrder` associated with the reverse delivery.
    */
    public ReverseDeliveryQuery reverseFulfillmentOrder(ReverseFulfillmentOrderQueryDefinition queryDef) {
        startField("reverseFulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
