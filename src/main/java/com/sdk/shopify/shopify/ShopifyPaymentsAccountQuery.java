// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* Balance and payout information for a
* [Shopify
* Payments](https://help.shopify.com/manual/payments/shopify-payments/getting-paid-with-shopify-paymen
* ts)
* account. Balance includes all balances for the currencies supported by the shop.
* You can also query for a list of payouts, where each payout includes the corresponding currencyCode
* field.
*/
public class ShopifyPaymentsAccountQuery extends Query<ShopifyPaymentsAccountQuery> {
    ShopifyPaymentsAccountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The name of the account opener.
    */
    public ShopifyPaymentsAccountQuery accountOpenerName() {
        startField("accountOpenerName");

        return this;
    }

    /**
    * Whether the Shopify Payments setup is completed.
    */
    public ShopifyPaymentsAccountQuery activated() {
        startField("activated");

        return this;
    }

    /**
    * Current balances in all currencies for the account.
    */
    public ShopifyPaymentsAccountQuery balance(MoneyV2QueryDefinition queryDef) {
        startField("balance");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class BalanceTransactionsArguments extends Arguments {
        BalanceTransactionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Determines if returned transactions contain transaction type transfer.
        */
        public BalanceTransactionsArguments hideTransfers(Boolean value) {
            if (value != null) {
                startArgument("hideTransfers");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BalanceTransactionsArguments first(Integer value) {
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
        public BalanceTransactionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BalanceTransactionsArguments last(Integer value) {
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
        public BalanceTransactionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public BalanceTransactionsArguments reverse(Boolean value) {
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
        public BalanceTransactionsArguments sortKey(BalanceTransactionSortKeys value) {
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
        * | available_on | time |
        * | credit_card_last4 | string |
        * | currency | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | payment_method_name | string |
        * | payments_transfer_id | id |
        * | payout_date | time |
        * | payout_status | string |
        * | processed_at | time |
        * | tax_reporting_exempt | boolean |
        * | transaction_type | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public BalanceTransactionsArguments query(String value) {
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
        public BalanceTransactionsArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface BalanceTransactionsArgumentsDefinition {
        void define(BalanceTransactionsArguments args);
    }

    /**
    * A list of balance transactions associated with the shop.
    */
    public ShopifyPaymentsAccountQuery balanceTransactions(ShopifyPaymentsBalanceTransactionConnectionQueryDefinition queryDef) {
        return balanceTransactions(args -> {}, queryDef);
    }

    /**
    * A list of balance transactions associated with the shop.
    */
    public ShopifyPaymentsAccountQuery balanceTransactions(BalanceTransactionsArgumentsDefinition argsDef, ShopifyPaymentsBalanceTransactionConnectionQueryDefinition queryDef) {
        startField("balanceTransactions");

        BalanceTransactionsArguments args = new BalanceTransactionsArguments(_queryBuilder);
        argsDef.define(args);
        BalanceTransactionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsBalanceTransactionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class BankAccountsArguments extends Arguments {
        BankAccountsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BankAccountsArguments first(Integer value) {
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
        public BankAccountsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BankAccountsArguments last(Integer value) {
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
        public BankAccountsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public BankAccountsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface BankAccountsArgumentsDefinition {
        void define(BankAccountsArguments args);
    }

    /**
    * All bank accounts configured for the Shopify Payments account.
    */
    public ShopifyPaymentsAccountQuery bankAccounts(ShopifyPaymentsBankAccountConnectionQueryDefinition queryDef) {
        return bankAccounts(args -> {}, queryDef);
    }

    /**
    * All bank accounts configured for the Shopify Payments account.
    */
    public ShopifyPaymentsAccountQuery bankAccounts(BankAccountsArgumentsDefinition argsDef, ShopifyPaymentsBankAccountConnectionQueryDefinition queryDef) {
        startField("bankAccounts");

        BankAccountsArguments args = new BankAccountsArguments(_queryBuilder);
        argsDef.define(args);
        BankAccountsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsBankAccountConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The statement descriptors used for charges.
    * These descriptors appear on a customer's credit card or bank statement when they make a purchase.
    */
    public ShopifyPaymentsAccountQuery chargeStatementDescriptors(ShopifyPaymentsChargeStatementDescriptorQueryDefinition queryDef) {
        startField("chargeStatementDescriptors");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsChargeStatementDescriptorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The Shopify Payments account country.
    */
    public ShopifyPaymentsAccountQuery country() {
        startField("country");

        return this;
    }

    /**
    * The default payout currency for the Shopify Payments account.
    */
    public ShopifyPaymentsAccountQuery defaultCurrency() {
        startField("defaultCurrency");

        return this;
    }

    public class DisputesArguments extends Arguments {
        DisputesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DisputesArguments first(Integer value) {
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
        public DisputesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DisputesArguments last(Integer value) {
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
        public DisputesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DisputesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | initiated_at | time |
        * | status | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public DisputesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface DisputesArgumentsDefinition {
        void define(DisputesArguments args);
    }

    /**
    * All disputes that originated from a transaction made with the Shopify Payments account.
    */
    public ShopifyPaymentsAccountQuery disputes(ShopifyPaymentsDisputeConnectionQueryDefinition queryDef) {
        return disputes(args -> {}, queryDef);
    }

    /**
    * All disputes that originated from a transaction made with the Shopify Payments account.
    */
    public ShopifyPaymentsAccountQuery disputes(DisputesArgumentsDefinition argsDef, ShopifyPaymentsDisputeConnectionQueryDefinition queryDef) {
        startField("disputes");

        DisputesArguments args = new DisputesArguments(_queryBuilder);
        argsDef.define(args);
        DisputesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the Shopify Payments account can be onboarded.
    */
    public ShopifyPaymentsAccountQuery onboardable() {
        startField("onboardable");

        return this;
    }

    /**
    * The payout schedule for the account.
    */
    public ShopifyPaymentsAccountQuery payoutSchedule(ShopifyPaymentsPayoutScheduleQueryDefinition queryDef) {
        startField("payoutSchedule");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsPayoutScheduleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The descriptor used for payouts.
    * The descriptor appears on a merchant's bank statement when they receive a payout.
    */
    public ShopifyPaymentsAccountQuery payoutStatementDescriptor() {
        startField("payoutStatementDescriptor");

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
    public ShopifyPaymentsAccountQuery payouts(ShopifyPaymentsPayoutConnectionQueryDefinition queryDef) {
        return payouts(args -> {}, queryDef);
    }

    /**
    * All current and previous payouts made between the account and the bank account.
    */
    public ShopifyPaymentsAccountQuery payouts(PayoutsArgumentsDefinition argsDef, ShopifyPaymentsPayoutConnectionQueryDefinition queryDef) {
        startField("payouts");

        PayoutsArguments args = new PayoutsArguments(_queryBuilder);
        argsDef.define(args);
        PayoutsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsPayoutConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
