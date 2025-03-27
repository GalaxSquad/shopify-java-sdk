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
* Represents a customer's visiting activities on a shop's online store.
*/
public class CustomerJourneySummaryQuery extends Query<CustomerJourneySummaryQuery> {
    CustomerJourneySummaryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of the current order within the customer's order history. Test orders aren't included.
    */
    public CustomerJourneySummaryQuery customerOrderIndex() {
        startField("customerOrderIndex");

        return this;
    }

    /**
    * The number of days between the first session and the order creation date. The first session
    * represents the first session since the last order, or the first session within the 30 day
    * attribution window, if more than 30 days have passed since the last order.
    */
    public CustomerJourneySummaryQuery daysToConversion() {
        startField("daysToConversion");

        return this;
    }

    /**
    * The customer's first session going into the shop.
    */
    public CustomerJourneySummaryQuery firstVisit(CustomerVisitQueryDefinition queryDef) {
        startField("firstVisit");

        _queryBuilder.append('{');
        queryDef.define(new CustomerVisitQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The last session before an order is made.
    */
    public CustomerJourneySummaryQuery lastVisit(CustomerVisitQueryDefinition queryDef) {
        startField("lastVisit");

        _queryBuilder.append('{');
        queryDef.define(new CustomerVisitQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MomentsArguments extends Arguments {
        MomentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MomentsArguments first(Integer value) {
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
        public MomentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MomentsArguments last(Integer value) {
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
        public MomentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MomentsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MomentsArgumentsDefinition {
        void define(MomentsArguments args);
    }

    /**
    * The events preceding a customer's order, such as shop sessions.
    */
    public CustomerJourneySummaryQuery moments(CustomerMomentConnectionQueryDefinition queryDef) {
        return moments(args -> {}, queryDef);
    }

    /**
    * The events preceding a customer's order, such as shop sessions.
    */
    public CustomerJourneySummaryQuery moments(MomentsArgumentsDefinition argsDef, CustomerMomentConnectionQueryDefinition queryDef) {
        startField("moments");

        MomentsArguments args = new MomentsArguments(_queryBuilder);
        argsDef.define(args);
        MomentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerMomentConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total number of customer moments associated with this order. Returns null if the order is still
    * in the process of being attributed.
    */
    public CustomerJourneySummaryQuery momentsCount(CountQueryDefinition queryDef) {
        startField("momentsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the attributed sessions for the order have been created yet.
    */
    public CustomerJourneySummaryQuery ready() {
        startField("ready");

        return this;
    }
}
