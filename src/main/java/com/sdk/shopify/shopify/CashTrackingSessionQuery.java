// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Tracks the balance in a cash drawer for a point of sale device over the course of a shift.
*/
public class CashTrackingSessionQuery extends Query<CashTrackingSessionQuery> {
    CashTrackingSessionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class AdjustmentsArguments extends Arguments {
        AdjustmentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AdjustmentsArguments first(Integer value) {
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
        public AdjustmentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AdjustmentsArguments last(Integer value) {
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
        public AdjustmentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AdjustmentsArguments reverse(Boolean value) {
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
        public AdjustmentsArguments sortKey(AdjustmentsSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface AdjustmentsArgumentsDefinition {
        void define(AdjustmentsArguments args);
    }

    /**
    * The adjustments made to the cash drawer during this session.
    */
    public CashTrackingSessionQuery adjustments(CashTrackingAdjustmentConnectionQueryDefinition queryDef) {
        return adjustments(args -> {}, queryDef);
    }

    /**
    * The adjustments made to the cash drawer during this session.
    */
    public CashTrackingSessionQuery adjustments(AdjustmentsArgumentsDefinition argsDef, CashTrackingAdjustmentConnectionQueryDefinition queryDef) {
        startField("adjustments");

        AdjustmentsArguments args = new AdjustmentsArguments(_queryBuilder);
        argsDef.define(args);
        AdjustmentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CashTrackingAdjustmentConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether this session is tracking cash payments.
    */
    public CashTrackingSessionQuery cashTrackingEnabled() {
        startField("cashTrackingEnabled");

        return this;
    }

    public class CashTransactionsArguments extends Arguments {
        CashTransactionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CashTransactionsArguments first(Integer value) {
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
        public CashTransactionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CashTransactionsArguments last(Integer value) {
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
        public CashTransactionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CashTransactionsArguments reverse(Boolean value) {
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
        public CashTransactionsArguments sortKey(CashTrackingSessionTransactionsSortKeys value) {
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
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | kind | string |
        * | processed_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CashTransactionsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CashTransactionsArgumentsDefinition {
        void define(CashTransactionsArguments args);
    }

    /**
    * The cash transactions made during this session.
    */
    public CashTrackingSessionQuery cashTransactions(OrderTransactionConnectionQueryDefinition queryDef) {
        return cashTransactions(args -> {}, queryDef);
    }

    /**
    * The cash transactions made during this session.
    */
    public CashTrackingSessionQuery cashTransactions(CashTransactionsArgumentsDefinition argsDef, OrderTransactionConnectionQueryDefinition queryDef) {
        startField("cashTransactions");

        CashTransactionsArguments args = new CashTransactionsArguments(_queryBuilder);
        argsDef.define(args);
        CashTransactionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrderTransactionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The counted cash balance when the session was closed.
    */
    public CashTrackingSessionQuery closingBalance(MoneyV2QueryDefinition queryDef) {
        startField("closingBalance");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The note entered when the session was closed.
    */
    public CashTrackingSessionQuery closingNote() {
        startField("closingNote");

        return this;
    }

    /**
    * The user who closed the session.
    */
    public CashTrackingSessionQuery closingStaffMember(StaffMemberQueryDefinition queryDef) {
        startField("closingStaffMember");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * When the session was closed.
    */
    public CashTrackingSessionQuery closingTime() {
        startField("closingTime");

        return this;
    }

    /**
    * The expected balance at the end of the session or the expected current balance for sessions that are
    * still open.
    */
    public CashTrackingSessionQuery expectedBalance(MoneyV2QueryDefinition queryDef) {
        startField("expectedBalance");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount that was expected to be in the cash drawer at the end of the session, calculated after
    * the session was closed.
    */
    public CashTrackingSessionQuery expectedClosingBalance(MoneyV2QueryDefinition queryDef) {
        startField("expectedClosingBalance");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount expected to be in the cash drawer based on the previous session.
    */
    public CashTrackingSessionQuery expectedOpeningBalance(MoneyV2QueryDefinition queryDef) {
        startField("expectedOpeningBalance");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The location of the point of sale device during this session.
    */
    public CashTrackingSessionQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The net cash sales made for the duration of this cash tracking session.
    */
    public CashTrackingSessionQuery netCashSales(MoneyV2QueryDefinition queryDef) {
        startField("netCashSales");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The counted cash balance when the session was opened.
    */
    public CashTrackingSessionQuery openingBalance(MoneyV2QueryDefinition queryDef) {
        startField("openingBalance");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The note entered when the session was opened.
    */
    public CashTrackingSessionQuery openingNote() {
        startField("openingNote");

        return this;
    }

    /**
    * The user who opened the session.
    */
    public CashTrackingSessionQuery openingStaffMember(StaffMemberQueryDefinition queryDef) {
        startField("openingStaffMember");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * When the session was opened.
    */
    public CashTrackingSessionQuery openingTime() {
        startField("openingTime");

        return this;
    }

    /**
    * The register name for the point of sale device that this session is tracking cash for.
    */
    public CashTrackingSessionQuery registerName() {
        startField("registerName");

        return this;
    }

    /**
    * The sum of all adjustments made during the session, excluding the final adjustment.
    */
    public CashTrackingSessionQuery totalAdjustments(MoneyV2QueryDefinition queryDef) {
        startField("totalAdjustments");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of all cash refunds for the duration of this cash tracking session.
    */
    public CashTrackingSessionQuery totalCashRefunds(MoneyV2QueryDefinition queryDef) {
        startField("totalCashRefunds");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of all cash sales for the duration of this cash tracking session.
    */
    public CashTrackingSessionQuery totalCashSales(MoneyV2QueryDefinition queryDef) {
        startField("totalCashSales");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total discrepancy for the session including starting and ending.
    */
    public CashTrackingSessionQuery totalDiscrepancy(MoneyV2QueryDefinition queryDef) {
        startField("totalDiscrepancy");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
