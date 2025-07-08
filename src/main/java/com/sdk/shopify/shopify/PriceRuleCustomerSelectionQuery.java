// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

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
        * | accepts_marketing | boolean | Filter by whether a customer has consented to receive marketing
        * material. | | | - `accepts_marketing:true` |
        * | country | string | Filter by the country associated with the customer's address. Use either the
        * country name or the two-letter country code. | | | - `country:Canada`<br/> - `country:JP` |
        * | customer_date | time | Filter by the date and time when the customer record was created. This
        * query parameter filters by the
        * [`createdAt`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer#field-createdAt)
        * field. | | | - `customer_date:'2024-03-15T14:30:00Z'`<br/> - `customer_date:'>=2024-01-01'` |
        * | email | string | The customer's email address, used to communicate information about orders and
        * for the purposes of email marketing campaigns. You can use a wildcard value to filter the query by
        * customers who have an email address specified. Please note that _email_ is a tokenized field: To
        * retrieve exact matches, quote the email address (_phrase query_) as described in [Shopify API search
        * syntax](https://shopify.dev/docs/api/usage/search-syntax). | | | - `email:gmail.com`<br/> -
        * `email:"bo.wang@example.com"`<br/> - `email:*` |
        * | first_name | string | Filter by the customer's first name. | | | - `first_name:Jane` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | last_abandoned_order_date | time | Filter by the date and time of the customer's most recent
        * abandoned checkout. An abandoned checkout occurs when a customer adds items to their cart, begins
        * the checkout process, but leaves the site without completing their purchase. | | | -
        * `last_abandoned_order_date:'2024-04-01T10:00:00Z'`<br/> - `last_abandoned_order_date:'>=2024-01-01'`
        * |
        * | last_name | string | Filter by the customer's last name. | | | - `last_name:Reeves` |
        * | order_date | time | Filter by the date and time that the order was placed by the customer. Use
        * this query filter to check if a customer has placed at least one order within a specified date
        * range. | | | - `order_date:'2024-02-20T00:00:00Z'`<br/> - `order_date:'>=2024-01-01'`<br/> -
        * `order_date:'2024-01-01..2024-03-31'` |
        * | orders_count | integer | Filter by the total number of orders a customer has placed. | | | -
        * `orders_count:5` |
        * | phone | string | The phone number of the customer, used to communicate information about orders
        * and for the purposes of SMS marketing campaigns. You can use a wildcard value to filter the query by
        * customers who have a phone number specified. | | | - `phone:+18005550100`<br/> - `phone:*` |
        * | state | string | Filter by the
        * [state](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer#field-state) of the
        * customer's account with the shop. This filter is only valid when [Classic Customer
        * Accounts](https://shopify.dev/docs/api/admin-graphql/latest/objects/CustomerAccountsV2#field-custome
        * rAccountsVersion) is active. | | | - `state:ENABLED`<br/> - `state:INVITED`<br/> -
        * `state:DISABLED`<br/> - `state:DECLINED` |
        * | tag | string | Filter by the tags that are associated with the customer. This query parameter
        * accepts multiple tags separated by commas. | | | - `tag:'VIP'`<br/> - `tag:'Wholesale,Repeat'` |
        * | tag_not | string | Filter by the tags that aren't associated with the customer. This query
        * parameter accepts multiple tags separated by commas. | | | - `tag_not:'Prospect'`<br/> -
        * `tag_not:'Test,Internal'` |
        * | total_spent | float | Filter by the total amount of money a customer has spent across all orders.
        * | | | - `total_spent:100.50`<br/> - `total_spent:50.00`<br/> - `total_spent:>100.50`<br/> -
        * `total_spent:>50.00` |
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
