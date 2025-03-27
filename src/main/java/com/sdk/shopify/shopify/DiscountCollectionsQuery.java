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
* A list of collections that the discount can have as a prerequisite or a list of collections to which
* the discount can be applied.
*/
public class DiscountCollectionsQuery extends Query<DiscountCollectionsQuery> {
    DiscountCollectionsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CollectionsArguments extends Arguments {
        CollectionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CollectionsArguments first(Integer value) {
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
        public CollectionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CollectionsArguments last(Integer value) {
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
        public CollectionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CollectionsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CollectionsArgumentsDefinition {
        void define(CollectionsArguments args);
    }

    /**
    * The list of collections that the discount can have as a prerequisite or the list of collections to
    * which the discount can be applied.
    */
    public DiscountCollectionsQuery collections(CollectionConnectionQueryDefinition queryDef) {
        return collections(args -> {}, queryDef);
    }

    /**
    * The list of collections that the discount can have as a prerequisite or the list of collections to
    * which the discount can be applied.
    */
    public DiscountCollectionsQuery collections(CollectionsArgumentsDefinition argsDef, CollectionConnectionQueryDefinition queryDef) {
        startField("collections");

        CollectionsArguments args = new CollectionsArguments(_queryBuilder);
        argsDef.define(args);
        CollectionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CollectionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
