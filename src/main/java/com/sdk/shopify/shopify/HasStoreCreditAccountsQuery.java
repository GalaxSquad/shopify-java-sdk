// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Represents information about the store credit accounts associated to the specified owner.
*/
public class HasStoreCreditAccountsQuery extends Query<HasStoreCreditAccountsQuery> {
    HasStoreCreditAccountsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public class StoreCreditAccountsArguments extends Arguments {
        StoreCreditAccountsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StoreCreditAccountsArguments first(Integer value) {
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
        public StoreCreditAccountsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StoreCreditAccountsArguments last(Integer value) {
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
        public StoreCreditAccountsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | currency_code | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public StoreCreditAccountsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface StoreCreditAccountsArgumentsDefinition {
        void define(StoreCreditAccountsArguments args);
    }

    /**
    * Returns a list of store credit accounts that belong to the owner resource.
    * A store credit account owner can hold multiple accounts each with a different currency.
    */
    public HasStoreCreditAccountsQuery storeCreditAccounts(StoreCreditAccountConnectionQueryDefinition queryDef) {
        return storeCreditAccounts(args -> {}, queryDef);
    }

    /**
    * Returns a list of store credit accounts that belong to the owner resource.
    * A store credit account owner can hold multiple accounts each with a different currency.
    */
    public HasStoreCreditAccountsQuery storeCreditAccounts(StoreCreditAccountsArgumentsDefinition argsDef, StoreCreditAccountConnectionQueryDefinition queryDef) {
        startField("storeCreditAccounts");

        StoreCreditAccountsArguments args = new StoreCreditAccountsArguments(_queryBuilder);
        argsDef.define(args);
        StoreCreditAccountsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public HasStoreCreditAccountsQuery onCustomer(CustomerQueryDefinition queryDef) {
        startInlineFragment("Customer");
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
