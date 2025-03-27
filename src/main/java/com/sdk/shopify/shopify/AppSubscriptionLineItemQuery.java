// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* The plan attached to an app subscription.
*/
public class AppSubscriptionLineItemQuery extends Query<AppSubscriptionLineItemQuery> {
    AppSubscriptionLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A globally-unique ID.
    */
    public AppSubscriptionLineItemQuery id() {
        startField("id");

        return this;
    }

    /**
    * The pricing model for the app subscription.
    */
    public AppSubscriptionLineItemQuery plan(AppPlanV2QueryDefinition queryDef) {
        startField("plan");

        _queryBuilder.append('{');
        queryDef.define(new AppPlanV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UsageRecordsArguments extends Arguments {
        UsageRecordsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UsageRecordsArguments first(Integer value) {
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
        public UsageRecordsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UsageRecordsArguments last(Integer value) {
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
        public UsageRecordsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public UsageRecordsArguments reverse(Boolean value) {
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
        public UsageRecordsArguments sortKey(AppUsageRecordSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface UsageRecordsArgumentsDefinition {
        void define(UsageRecordsArguments args);
    }

    /**
    * A list of the store's usage records for a usage pricing plan.
    */
    public AppSubscriptionLineItemQuery usageRecords(AppUsageRecordConnectionQueryDefinition queryDef) {
        return usageRecords(args -> {}, queryDef);
    }

    /**
    * A list of the store's usage records for a usage pricing plan.
    */
    public AppSubscriptionLineItemQuery usageRecords(UsageRecordsArgumentsDefinition argsDef, AppUsageRecordConnectionQueryDefinition queryDef) {
        startField("usageRecords");

        UsageRecordsArguments args = new UsageRecordsArguments(_queryBuilder);
        argsDef.define(args);
        UsageRecordsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AppUsageRecordConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
