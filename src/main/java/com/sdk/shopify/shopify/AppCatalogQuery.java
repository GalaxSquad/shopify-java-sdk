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
* A catalog that defines the publication associated with an app.
*/
public class AppCatalogQuery extends Query<AppCatalogQuery> {
    AppCatalogQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class AppsArguments extends Arguments {
        AppsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AppsArguments first(Integer value) {
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
        public AppsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AppsArguments last(Integer value) {
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
        public AppsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AppsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AppsArgumentsDefinition {
        void define(AppsArguments args);
    }

    /**
    * The apps associated with the catalog.
    */
    public AppCatalogQuery apps(AppConnectionQueryDefinition queryDef) {
        return apps(args -> {}, queryDef);
    }

    /**
    * The apps associated with the catalog.
    */
    public AppCatalogQuery apps(AppsArgumentsDefinition argsDef, AppConnectionQueryDefinition queryDef) {
        startField("apps");

        AppsArguments args = new AppsArguments(_queryBuilder);
        argsDef.define(args);
        AppsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AppConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Most recent catalog operations.
    */
    public AppCatalogQuery operations(ResourceOperationQueryDefinition queryDef) {
        startField("operations");

        _queryBuilder.append('{');
        queryDef.define(new ResourceOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price list associated with the catalog.
    */
    public AppCatalogQuery priceList(PriceListQueryDefinition queryDef) {
        startField("priceList");

        _queryBuilder.append('{');
        queryDef.define(new PriceListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A group of products and collections that's published to a catalog.
    */
    public AppCatalogQuery publication(PublicationQueryDefinition queryDef) {
        startField("publication");

        _queryBuilder.append('{');
        queryDef.define(new PublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the catalog.
    */
    public AppCatalogQuery status() {
        startField("status");

        return this;
    }

    /**
    * The name of the catalog.
    */
    public AppCatalogQuery title() {
        startField("title");

        return this;
    }
}
