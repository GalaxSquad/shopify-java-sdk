// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A list of products with publishing and pricing information associated with company locations.
*/
public class CompanyLocationCatalogQuery extends Query<CompanyLocationCatalogQuery> {
    CompanyLocationCatalogQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class CompanyLocationsArguments extends Arguments {
        CompanyLocationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CompanyLocationsArguments first(Integer value) {
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
        public CompanyLocationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CompanyLocationsArguments last(Integer value) {
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
        public CompanyLocationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CompanyLocationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Sort the underlying list by the given key.
        */
        public CompanyLocationsArguments sortKey(CompanyLocationSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | company_id | id |
        * | created_at | time |
        * | external_id | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | ids | string |
        * | name | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CompanyLocationsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CompanyLocationsArgumentsDefinition {
        void define(CompanyLocationsArguments args);
    }

    /**
    * The company locations associated with the catalog.
    */
    public CompanyLocationCatalogQuery companyLocations(CompanyLocationConnectionQueryDefinition queryDef) {
        return companyLocations(args -> {}, queryDef);
    }

    /**
    * The company locations associated with the catalog.
    */
    public CompanyLocationCatalogQuery companyLocations(CompanyLocationsArgumentsDefinition argsDef, CompanyLocationConnectionQueryDefinition queryDef) {
        startField("companyLocations");

        CompanyLocationsArguments args = new CompanyLocationsArguments(_queryBuilder);
        argsDef.define(args);
        CompanyLocationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of company locations associated with the catalog.
    */
    public CompanyLocationCatalogQuery companyLocationsCount(CountQueryDefinition queryDef) {
        startField("companyLocationsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Most recent catalog operations.
    */
    public CompanyLocationCatalogQuery operations(ResourceOperationQueryDefinition queryDef) {
        startField("operations");

        _queryBuilder.append('{');
        queryDef.define(new ResourceOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price list associated with the catalog.
    */
    public CompanyLocationCatalogQuery priceList(PriceListQueryDefinition queryDef) {
        startField("priceList");

        _queryBuilder.append('{');
        queryDef.define(new PriceListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A group of products and collections that's published to a catalog.
    */
    public CompanyLocationCatalogQuery publication(PublicationQueryDefinition queryDef) {
        startField("publication");

        _queryBuilder.append('{');
        queryDef.define(new PublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the catalog.
    */
    public CompanyLocationCatalogQuery status() {
        startField("status");

        return this;
    }

    /**
    * The name of the catalog.
    */
    public CompanyLocationCatalogQuery title() {
        startField("title");

        return this;
    }
}
