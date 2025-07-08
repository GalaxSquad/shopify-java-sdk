// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A condition checking the location that the visitor is shopping from.
*/
public class LocationsConditionQuery extends Query<LocationsConditionQuery> {
    LocationsConditionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The application level for the condition.
    */
    public LocationsConditionQuery applicationLevel() {
        startField("applicationLevel");

        return this;
    }

    public class LocationsArguments extends Arguments {
        LocationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LocationsArguments first(Integer value) {
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
        public LocationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LocationsArguments last(Integer value) {
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
        public LocationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public LocationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LocationsArgumentsDefinition {
        void define(LocationsArguments args);
    }

    /**
    * The locations that comprise the market.
    */
    public LocationsConditionQuery locations(LocationConnectionQueryDefinition queryDef) {
        return locations(args -> {}, queryDef);
    }

    /**
    * The locations that comprise the market.
    */
    public LocationsConditionQuery locations(LocationsArgumentsDefinition argsDef, LocationConnectionQueryDefinition queryDef) {
        startField("locations");

        LocationsArguments args = new LocationsArguments(_queryBuilder);
        argsDef.define(args);
        LocationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
