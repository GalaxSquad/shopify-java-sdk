// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A condition checking the visitor's region.
*/
public class RegionsConditionQuery extends Query<RegionsConditionQuery> {
    RegionsConditionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The application level for the condition.
    */
    public RegionsConditionQuery applicationLevel() {
        startField("applicationLevel");

        return this;
    }

    public class RegionsArguments extends Arguments {
        RegionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public RegionsArguments first(Integer value) {
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
        public RegionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public RegionsArguments last(Integer value) {
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
        public RegionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public RegionsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RegionsArgumentsDefinition {
        void define(RegionsArguments args);
    }

    /**
    * The regions that comprise the market.
    */
    public RegionsConditionQuery regions(MarketRegionConnectionQueryDefinition queryDef) {
        return regions(args -> {}, queryDef);
    }

    /**
    * The regions that comprise the market.
    */
    public RegionsConditionQuery regions(RegionsArgumentsDefinition argsDef, MarketRegionConnectionQueryDefinition queryDef) {
        startField("regions");

        RegionsArguments args = new RegionsArguments(_queryBuilder);
        argsDef.define(args);
        RegionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MarketRegionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
