// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* A bank account that can receive payouts.
*/
public class ShopifyPaymentsBankAccountQuery extends Query<ShopifyPaymentsBankAccountQuery> {
    ShopifyPaymentsBankAccountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The last digits of the account number (the rest is redacted).
    */
    public ShopifyPaymentsBankAccountQuery accountNumberLastDigits() {
        startField("accountNumberLastDigits");

        return this;
    }

    /**
    * The name of the bank.
    */
    public ShopifyPaymentsBankAccountQuery bankName() {
        startField("bankName");

        return this;
    }

    /**
    * The country of the bank.
    */
    public ShopifyPaymentsBankAccountQuery country() {
        startField("country");

        return this;
    }

    /**
    * The date that the bank account was created.
    */
    public ShopifyPaymentsBankAccountQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The currency of the bank account.
    */
    public ShopifyPaymentsBankAccountQuery currency() {
        startField("currency");

        return this;
    }

    public class PayoutsArguments extends Arguments {
        PayoutsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Filter the direction of the payout.
        */
        public PayoutsArguments transactionType(ShopifyPaymentsPayoutTransactionType value) {
            if (value != null) {
                startArgument("transactionType");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PayoutsArguments first(Integer value) {
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
        public PayoutsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PayoutsArguments last(Integer value) {
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
        public PayoutsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public PayoutsArguments reverse(Boolean value) {
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
        public PayoutsArguments sortKey(PayoutSortKeys value) {
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
        * | amount | float |
        * | bank_account | string |
        * | currency | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | issued_at | time |
        * | ledger_type | string |
        * | status | string |
        * | transaction_dates | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public PayoutsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public PayoutsArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface PayoutsArgumentsDefinition {
        void define(PayoutsArguments args);
    }

    /**
    * All current and previous payouts made between the account and the bank account.
    */
    public ShopifyPaymentsBankAccountQuery payouts(ShopifyPaymentsPayoutConnectionQueryDefinition queryDef) {
        return payouts(args -> {}, queryDef);
    }

    /**
    * All current and previous payouts made between the account and the bank account.
    */
    public ShopifyPaymentsBankAccountQuery payouts(PayoutsArgumentsDefinition argsDef, ShopifyPaymentsPayoutConnectionQueryDefinition queryDef) {
        startField("payouts");

        PayoutsArguments args = new PayoutsArguments(_queryBuilder);
        argsDef.define(args);
        PayoutsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsPayoutConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the bank account.
    */
    public ShopifyPaymentsBankAccountQuery status() {
        startField("status");

        return this;
    }
}
