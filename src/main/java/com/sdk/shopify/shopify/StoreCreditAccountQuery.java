// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A store credit account contains a monetary balance that can be redeemed at checkout for purchases in
* the shop.
* The account is held in the specified currency and has an owner that cannot be transferred.
* The account balance is redeemable at checkout only when the owner is authenticated via [new customer
* accounts authentication](https://shopify.dev/docs/api/customer).
*/
public class StoreCreditAccountQuery extends Query<StoreCreditAccountQuery> {
    StoreCreditAccountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The current balance of the store credit account.
    */
    public StoreCreditAccountQuery balance(MoneyV2QueryDefinition queryDef) {
        startField("balance");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The owner of the store credit account.
    */
    public StoreCreditAccountQuery owner(HasStoreCreditAccountsQueryDefinition queryDef) {
        startField("owner");

        _queryBuilder.append('{');
        queryDef.define(new HasStoreCreditAccountsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class TransactionsArguments extends Arguments {
        TransactionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public TransactionsArguments first(Integer value) {
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
        public TransactionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public TransactionsArguments last(Integer value) {
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
        public TransactionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public TransactionsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Sort the underlying list by the given key.
        */
        public TransactionsArguments sortKey(TransactionSortKeys value) {
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
        * | expires_at | time | Filter transactions by expiry date. Only applicable to
        * StoreCreditAccountCreditTransaction objects. All other objects are handled as if they have a null
        * expiry date. | | | - `expires_at:<='2025-01-01T00:00:00+01:00'`<br/> -
        * `expires_at:<='2025-12-31T23:00:00Z'` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | type | string | Filter transactions by type. Any value other than the accepted values will be
        * ignored. | - `credit`<br/> - `debit`<br/> - `debit_revert`<br/> - `expiration` | | -
        * `type:expiration`<br/> - `type:credit OR type:debit_revert` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public TransactionsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface TransactionsArgumentsDefinition {
        void define(TransactionsArguments args);
    }

    /**
    * The transaction history of the store credit account.
    */
    public StoreCreditAccountQuery transactions(StoreCreditAccountTransactionConnectionQueryDefinition queryDef) {
        return transactions(args -> {}, queryDef);
    }

    /**
    * The transaction history of the store credit account.
    */
    public StoreCreditAccountQuery transactions(TransactionsArgumentsDefinition argsDef, StoreCreditAccountTransactionConnectionQueryDefinition queryDef) {
        startField("transactions");

        TransactionsArguments args = new TransactionsArguments(_queryBuilder);
        argsDef.define(args);
        TransactionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountTransactionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
