// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* The `DiscountCodeBasic` object lets you manage
* [amount off
* discounts](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount)
* that are applied on a cart and at checkout when a customer enters a code. Amount off discounts give
* customers a
* fixed value or a percentage off the products in an order, but don't apply to shipping costs.
* The `DiscountCodeBasic` object stores information about amount off code discounts that apply to
* specific [products and
* variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountProducts),
* [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCollections),
* or [all items in a
* cart](https://shopify.dev/docs/api/admin-graphql/latest/objects/AllDiscountItems).
* Learn more about working with [Shopify's discount
* model](https://shopify.dev/docs/apps/build/discounts),
* including limitations and considerations.
* > Note:
* > The
* [`DiscountAutomaticBasic`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomat
* icBasic)
* object has similar functionality to the `DiscountCodeBasic` object, but discounts are automatically
* applied,
* without the need for customers to enter a code.
*/
public class DiscountCodeBasicQuery extends Query<DiscountCodeBasicQuery> {
    DiscountCodeBasicQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether a customer can only use the discount once.
    */
    public DiscountCodeBasicQuery appliesOncePerCustomer() {
        startField("appliesOncePerCustomer");

        return this;
    }

    /**
    * The number of times that the discount has been used.
    * For example, if a "Buy 3, Get 1 Free" t-shirt discount
    * is automatically applied in 200 transactions, then the
    * discount has been used 200 times.
    * This value is updated asynchronously. As a result,
    * it might be lower than the actual usage count until the
    * asynchronous process is completed.
    */
    public DiscountCodeBasicQuery asyncUsageCount() {
        startField("asyncUsageCount");

        return this;
    }

    public class CodesArguments extends Arguments {
        CodesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CodesArguments first(Integer value) {
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
        public CodesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CodesArguments last(Integer value) {
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
        public CodesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CodesArguments reverse(Boolean value) {
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
        public CodesArguments sortKey(DiscountCodeSortKeys value) {
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
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | times_used | integer |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CodesArguments query(String value) {
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
        public CodesArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CodesArgumentsDefinition {
        void define(CodesArguments args);
    }

    /**
    * A list codes that customers can use to redeem the discount.
    */
    public DiscountCodeBasicQuery codes(DiscountRedeemCodeConnectionQueryDefinition queryDef) {
        return codes(args -> {}, queryDef);
    }

    /**
    * A list codes that customers can use to redeem the discount.
    */
    public DiscountCodeBasicQuery codes(CodesArgumentsDefinition argsDef, DiscountRedeemCodeConnectionQueryDefinition queryDef) {
        startField("codes");

        CodesArguments args = new CodesArguments(_queryBuilder);
        argsDef.define(args);
        CodesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DiscountRedeemCodeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of codes that a customer can use to redeem the discount.
    */
    public DiscountCodeBasicQuery codesCount(CountQueryDefinition queryDef) {
        startField("codesCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The
    * [discount
    * classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * that you can use in combination with
    * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
    */
    public DiscountCodeBasicQuery combinesWith(DiscountCombinesWithQueryDefinition queryDef) {
        startField("combinesWith");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCombinesWithQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the discount was created.
    */
    public DiscountCodeBasicQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The items in the order that qualify for the discount, their quantities, and the total value of the
    * discount.
    */
    public DiscountCodeBasicQuery customerGets(DiscountCustomerGetsQueryDefinition queryDef) {
        startField("customerGets");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCustomerGetsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customers that can use the discount.
    */
    public DiscountCodeBasicQuery customerSelection(DiscountCustomerSelectionQueryDefinition queryDef) {
        startField("customerSelection");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCustomerSelectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The classes of the discount.
    */
    public DiscountCodeBasicQuery discountClasses() {
        startField("discountClasses");

        return this;
    }

    /**
    * The date and time when the discount expires and is no longer available to customers.
    * For discounts without a fixed expiration date, specify `null`.
    */
    public DiscountCodeBasicQuery endsAt() {
        startField("endsAt");

        return this;
    }

    /**
    * Whether there are
    * [timeline
    * comments](https://help.shopify.com/manual/discounts/managing-discount-codes#use-the-discount-timelin
    * e)
    * associated with the discount.
    */
    public DiscountCodeBasicQuery hasTimelineComment() {
        startField("hasTimelineComment");

        return this;
    }

    /**
    * The minimum subtotal or quantity of items that are required for the discount to be applied.
    */
    public DiscountCodeBasicQuery minimumRequirement(DiscountMinimumRequirementQueryDefinition queryDef) {
        startField("minimumRequirement");

        _queryBuilder.append('{');
        queryDef.define(new DiscountMinimumRequirementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of billing cycles for which the discount can be applied,
    * which is useful for subscription-based discounts. For example, if you set this field
    * to `3`, then the discount only applies to the first three billing cycles of a
    * subscription. If you specify `0`, then the discount applies indefinitely.
    */
    public DiscountCodeBasicQuery recurringCycleLimit() {
        startField("recurringCycleLimit");

        return this;
    }

    /**
    * A list of URLs that the app can use to share the discount.
    */
    public DiscountCodeBasicQuery shareableUrls(DiscountShareableUrlQueryDefinition queryDef) {
        startField("shareableUrls");

        _queryBuilder.append('{');
        queryDef.define(new DiscountShareableUrlQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An abbreviated version of the discount
    * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeBasic#field-summar
    * y)
    * field.
    */
    public DiscountCodeBasicQuery shortSummary() {
        startField("shortSummary");

        return this;
    }

    /**
    * The date and time when the discount becomes active and is available to customers.
    */
    public DiscountCodeBasicQuery startsAt() {
        startField("startsAt");

        return this;
    }

    /**
    * The status of the discount that describes its availability,
    * expiration, or pending activation.
    */
    public DiscountCodeBasicQuery status() {
        startField("status");

        return this;
    }

    /**
    * A detailed explanation of what the discount is,
    * who can use it, when and where it applies, and any associated
    * rules or limitations.
    */
    public DiscountCodeBasicQuery summary() {
        startField("summary");

        return this;
    }

    /**
    * The discount's name that displays to merchants in the Shopify admin and to customers.
    */
    public DiscountCodeBasicQuery title() {
        startField("title");

        return this;
    }

    /**
    * The total sales from orders where the discount was used.
    */
    public DiscountCodeBasicQuery totalSales(MoneyV2QueryDefinition queryDef) {
        startField("totalSales");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the discount was updated.
    */
    public DiscountCodeBasicQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * The maximum number of times that a customer can use the discount.
    * For discounts with unlimited usage, specify `null`.
    */
    public DiscountCodeBasicQuery usageLimit() {
        startField("usageLimit");

        return this;
    }
}
