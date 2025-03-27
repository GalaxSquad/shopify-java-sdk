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
* A selection of customers for whom the price rule applies.
*/
public class PriceRuleCustomerSelectionQuery extends Query<PriceRuleCustomerSelectionQuery> {
    PriceRuleCustomerSelectionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CustomersArguments extends Arguments {
        CustomersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CustomersArguments first(Integer value) {
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
        public CustomersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CustomersArguments last(Integer value) {
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
        public CustomersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CustomersArguments reverse(Boolean value) {
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
        public CustomersArguments sortKey(CustomerSortKeys value) {
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
        * | accepts_marketing | boolean |
        * | country | string |
        * | customer_date | time |
        * | email | string | The customer's email address, used to communicate information about orders and
        * for the purposes of email marketing campaigns. You can use a wildcard value to filter the query by
        * customers who have an email address specified. | | | - `email:bo.wang@example.com`<br/> - `email:*`
        * |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | last_abandoned_order_date | time |
        * | order_date | time |
        * | orders_count | integer |
        * | phone | string | The phone number of the customer, used to communicate information about orders
        * and for the purposes of SMS marketing campaigns. You can use a wildcard value to filter the query by
        * customers who have a phone number specified. | | | - `phone:+18005550100`<br/> - `phone:*` |
        * | state | string |
        * | tag | string |
        * | tag_not | string |
        * | total_spent | float |
        * | updated_at | time | The date and time, matching a whole day, when the customer's information was
        * last updated. | | | - `updated_at:2024-01-01T00:00:00Z`<br/> - `updated_at:<now`<br/> -
        * `updated_at:<=2024` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CustomersArguments query(String value) {
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
        public CustomersArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CustomersArgumentsDefinition {
        void define(CustomersArguments args);
    }

    /**
    * List of customers to whom the price rule applies.
    */
    public PriceRuleCustomerSelectionQuery customers(CustomerConnectionQueryDefinition queryDef) {
        return customers(args -> {}, queryDef);
    }

    /**
    * List of customers to whom the price rule applies.
    */
    public PriceRuleCustomerSelectionQuery customers(CustomersArgumentsDefinition argsDef, CustomerConnectionQueryDefinition queryDef) {
        startField("customers");

        CustomersArguments args = new CustomersArguments(_queryBuilder);
        argsDef.define(args);
        CustomersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the price rule applies to all customers.
    */
    public PriceRuleCustomerSelectionQuery forAllCustomers() {
        startField("forAllCustomers");

        return this;
    }

    /**
    * A list of customer segments that contain the customers who can use the price rule.
    */
    public PriceRuleCustomerSelectionQuery segments(SegmentQueryDefinition queryDef) {
        startField("segments");

        _queryBuilder.append('{');
        queryDef.define(new SegmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
