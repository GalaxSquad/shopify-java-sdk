// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Represents the subscription lines the discount applies on.
*/
public class SubscriptionDiscountEntitledLinesQuery extends Query<SubscriptionDiscountEntitledLinesQuery> {
    SubscriptionDiscountEntitledLinesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Specify whether the subscription discount will apply on all subscription lines.
    */
    public SubscriptionDiscountEntitledLinesQuery all() {
        startField("all");

        return this;
    }

    public class LinesArguments extends Arguments {
        LinesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LinesArguments first(Integer value) {
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
        public LinesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LinesArguments last(Integer value) {
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
        public LinesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public LinesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LinesArgumentsDefinition {
        void define(LinesArguments args);
    }

    /**
    * The list of subscription lines associated with the subscription discount.
    */
    public SubscriptionDiscountEntitledLinesQuery lines(SubscriptionLineConnectionQueryDefinition queryDef) {
        return lines(args -> {}, queryDef);
    }

    /**
    * The list of subscription lines associated with the subscription discount.
    */
    public SubscriptionDiscountEntitledLinesQuery lines(LinesArgumentsDefinition argsDef, SubscriptionLineConnectionQueryDefinition queryDef) {
        startField("lines");

        LinesArguments args = new LinesArguments(_queryBuilder);
        argsDef.define(args);
        LinesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionLineConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
