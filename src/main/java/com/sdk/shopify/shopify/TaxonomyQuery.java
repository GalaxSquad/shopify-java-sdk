// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* The Taxonomy resource lets you access the categories, attributes and values of a taxonomy tree.
*/
public class TaxonomyQuery extends Query<TaxonomyQuery> {
    TaxonomyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CategoriesArguments extends Arguments {
        CategoriesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Searches the product taxonomy for matching categories.
        */
        public CategoriesArguments search(String value) {
            if (value != null) {
                startArgument("search");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of the category associated with the child categories to return.
        */
        public CategoriesArguments childrenOf(ID value) {
            if (value != null) {
                startArgument("childrenOf");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of the category associated with the sibling categories to return.
        */
        public CategoriesArguments siblingsOf(ID value) {
            if (value != null) {
                startArgument("siblingsOf");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of the category associated with the descendant categories to return.
        */
        public CategoriesArguments descendantsOf(ID value) {
            if (value != null) {
                startArgument("descendantsOf");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CategoriesArguments first(Integer value) {
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
        public CategoriesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CategoriesArguments last(Integer value) {
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
        public CategoriesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CategoriesArgumentsDefinition {
        void define(CategoriesArguments args);
    }

    /**
    * Returns the categories of the product taxonomy based on the arguments provided.
    * If a `search` argument is provided, then all categories that match the search query globally are
    * returned.
    * If a `children_of` argument is provided, then all children of the specified category are returned.
    * If a `siblings_of` argument is provided, then all siblings of the specified category are returned.
    * If a `decendents_of` argument is provided, then all descendents of the specified category are
    * returned.
    * If no arguments are provided, then all the top-level categories of the taxonomy are returned.
    */
    public TaxonomyQuery categories(TaxonomyCategoryConnectionQueryDefinition queryDef) {
        return categories(args -> {}, queryDef);
    }

    /**
    * Returns the categories of the product taxonomy based on the arguments provided.
    * If a `search` argument is provided, then all categories that match the search query globally are
    * returned.
    * If a `children_of` argument is provided, then all children of the specified category are returned.
    * If a `siblings_of` argument is provided, then all siblings of the specified category are returned.
    * If a `decendents_of` argument is provided, then all descendents of the specified category are
    * returned.
    * If no arguments are provided, then all the top-level categories of the taxonomy are returned.
    */
    public TaxonomyQuery categories(CategoriesArgumentsDefinition argsDef, TaxonomyCategoryConnectionQueryDefinition queryDef) {
        startField("categories");

        CategoriesArguments args = new CategoriesArguments(_queryBuilder);
        argsDef.define(args);
        CategoriesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaxonomyCategoryConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
