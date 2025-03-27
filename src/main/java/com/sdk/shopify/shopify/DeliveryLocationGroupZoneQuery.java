// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Links a location group with a zone and the associated method definitions.
*/
public class DeliveryLocationGroupZoneQuery extends Query<DeliveryLocationGroupZoneQuery> {
    DeliveryLocationGroupZoneQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The number of method definitions for the zone.
    */
    public DeliveryLocationGroupZoneQuery methodDefinitionCounts(DeliveryMethodDefinitionCountsQueryDefinition queryDef) {
        startField("methodDefinitionCounts");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryMethodDefinitionCountsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MethodDefinitionsArguments extends Arguments {
        MethodDefinitionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Return only eligible or ineligible method definitions.
        */
        public MethodDefinitionsArguments eligible(Boolean value) {
            if (value != null) {
                startArgument("eligible");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Return only merchant or participant method definitions.
        */
        public MethodDefinitionsArguments type(DeliveryMethodDefinitionType value) {
            if (value != null) {
                startArgument("type");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MethodDefinitionsArguments first(Integer value) {
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
        public MethodDefinitionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MethodDefinitionsArguments last(Integer value) {
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
        public MethodDefinitionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MethodDefinitionsArguments reverse(Boolean value) {
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
        public MethodDefinitionsArguments sortKey(MethodDefinitionSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface MethodDefinitionsArgumentsDefinition {
        void define(MethodDefinitionsArguments args);
    }

    /**
    * The method definitions associated to a zone and location group.
    */
    public DeliveryLocationGroupZoneQuery methodDefinitions(DeliveryMethodDefinitionConnectionQueryDefinition queryDef) {
        return methodDefinitions(args -> {}, queryDef);
    }

    /**
    * The method definitions associated to a zone and location group.
    */
    public DeliveryLocationGroupZoneQuery methodDefinitions(MethodDefinitionsArgumentsDefinition argsDef, DeliveryMethodDefinitionConnectionQueryDefinition queryDef) {
        startField("methodDefinitions");

        MethodDefinitionsArguments args = new MethodDefinitionsArguments(_queryBuilder);
        argsDef.define(args);
        MethodDefinitionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DeliveryMethodDefinitionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The zone associated to a location group.
    */
    public DeliveryLocationGroupZoneQuery zone(DeliveryZoneQueryDefinition queryDef) {
        startField("zone");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryZoneQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
