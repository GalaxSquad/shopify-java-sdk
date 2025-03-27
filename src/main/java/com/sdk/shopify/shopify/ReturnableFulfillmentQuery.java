// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A returnable fulfillment, which is an order that has been delivered
* and is eligible to be returned to the merchant.
*/
public class ReturnableFulfillmentQuery extends Query<ReturnableFulfillmentQuery> {
    ReturnableFulfillmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The fulfillment that the returnable fulfillment refers to.
    */
    public ReturnableFulfillmentQuery fulfillment(FulfillmentQueryDefinition queryDef) {
        startField("fulfillment");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ReturnableFulfillmentLineItemsArguments extends Arguments {
        ReturnableFulfillmentLineItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReturnableFulfillmentLineItemsArguments first(Integer value) {
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
        public ReturnableFulfillmentLineItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReturnableFulfillmentLineItemsArguments last(Integer value) {
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
        public ReturnableFulfillmentLineItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ReturnableFulfillmentLineItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReturnableFulfillmentLineItemsArgumentsDefinition {
        void define(ReturnableFulfillmentLineItemsArguments args);
    }

    /**
    * The list of returnable fulfillment line items.
    */
    public ReturnableFulfillmentQuery returnableFulfillmentLineItems(ReturnableFulfillmentLineItemConnectionQueryDefinition queryDef) {
        return returnableFulfillmentLineItems(args -> {}, queryDef);
    }

    /**
    * The list of returnable fulfillment line items.
    */
    public ReturnableFulfillmentQuery returnableFulfillmentLineItems(ReturnableFulfillmentLineItemsArgumentsDefinition argsDef, ReturnableFulfillmentLineItemConnectionQueryDefinition queryDef) {
        startField("returnableFulfillmentLineItems");

        ReturnableFulfillmentLineItemsArguments args = new ReturnableFulfillmentLineItemsArguments(_queryBuilder);
        argsDef.define(args);
        ReturnableFulfillmentLineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReturnableFulfillmentLineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
