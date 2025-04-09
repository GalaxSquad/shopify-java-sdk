// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* The
* [constraints](https://shopify.dev/apps/build/custom-data/metafields/conditional-metafield-definition
* s)
* that determine what subtypes of resources a metafield definition applies to.
*/
public class MetafieldDefinitionConstraintsQuery extends Query<MetafieldDefinitionConstraintsQuery> {
    MetafieldDefinitionConstraintsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The category of resource subtypes that the definition applies to.
    */
    public MetafieldDefinitionConstraintsQuery key() {
        startField("key");

        return this;
    }

    public class ValuesArguments extends Arguments {
        ValuesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ValuesArguments first(Integer value) {
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
        public ValuesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ValuesArguments last(Integer value) {
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
        public ValuesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ValuesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ValuesArgumentsDefinition {
        void define(ValuesArguments args);
    }

    /**
    * The specific constraint subtype values that the definition applies to.
    */
    public MetafieldDefinitionConstraintsQuery values(MetafieldDefinitionConstraintValueConnectionQueryDefinition queryDef) {
        return values(args -> {}, queryDef);
    }

    /**
    * The specific constraint subtype values that the definition applies to.
    */
    public MetafieldDefinitionConstraintsQuery values(ValuesArgumentsDefinition argsDef, MetafieldDefinitionConstraintValueConnectionQueryDefinition queryDef) {
        startField("values");

        ValuesArguments args = new ValuesArguments(_queryBuilder);
        argsDef.define(args);
        ValuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionConstraintValueConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
