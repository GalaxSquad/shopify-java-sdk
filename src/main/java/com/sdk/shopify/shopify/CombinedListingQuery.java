// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A combined listing of products.
*/
public class CombinedListingQuery extends Query<CombinedListingQuery> {
    CombinedListingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CombinedListingChildrenArguments extends Arguments {
        CombinedListingChildrenArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CombinedListingChildrenArguments first(Integer value) {
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
        public CombinedListingChildrenArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CombinedListingChildrenArguments last(Integer value) {
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
        public CombinedListingChildrenArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CombinedListingChildrenArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CombinedListingChildrenArgumentsDefinition {
        void define(CombinedListingChildrenArguments args);
    }

    /**
    * A list of child products in the combined listing.
    */
    public CombinedListingQuery combinedListingChildren(CombinedListingChildConnectionQueryDefinition queryDef) {
        return combinedListingChildren(args -> {}, queryDef);
    }

    /**
    * A list of child products in the combined listing.
    */
    public CombinedListingQuery combinedListingChildren(CombinedListingChildrenArgumentsDefinition argsDef, CombinedListingChildConnectionQueryDefinition queryDef) {
        startField("combinedListingChildren");

        CombinedListingChildrenArguments args = new CombinedListingChildrenArguments(_queryBuilder);
        argsDef.define(args);
        CombinedListingChildrenArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CombinedListingChildConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The parent product.
    */
    public CombinedListingQuery parentProduct(ProductQueryDefinition queryDef) {
        startField("parentProduct");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
