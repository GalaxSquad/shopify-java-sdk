// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* The `DiscountCodeApp` object stores information about code discounts
* that are managed by an app using
* [Shopify Functions](https://shopify.dev/docs/apps/build/functions).
* Use `DiscountCodeApp` when you need advanced, custom, or
* dynamic discount capabilities that aren't supported by
* [Shopify's native discount types](https://help.shopify.com/manual/discounts/discount-types).
* Learn more about creating
* [custom discount
* functionality](https://shopify.dev/docs/apps/build/discounts/build-discount-function).
* > Note:
* > The
* [`DiscountAutomaticApp`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomatic
* App)
* object has similar functionality to the `DiscountCodeApp` object, with the exception that
* `DiscountAutomaticApp`
* stores information about automatic discounts that are managed by an app using Shopify Functions.
*/
public class DiscountCodeAppQuery extends Query<DiscountCodeAppQuery> {
    DiscountCodeAppQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The details about the app extension that's providing the
    * [discount type](https://help.shopify.com/manual/discounts/discount-types).
    * This information includes the app extension's name and
    * [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets),
    * [App Bridge configuration](https://shopify.dev/docs/api/app-bridge),
    * [discount
    * class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations),
    * [function
    * ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries),
    * and other metadata about the discount type, including the discount type's name and description.
    */
    public DiscountCodeAppQuery appDiscountType(AppDiscountTypeQueryDefinition queryDef) {
        startField("appDiscountType");

        _queryBuilder.append('{');
        queryDef.define(new AppDiscountTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the discount applies on regular one-time-purchase items.
    */
    public DiscountCodeAppQuery appliesOnOneTimePurchase() {
        startField("appliesOnOneTimePurchase");

        return this;
    }

    /**
    * Whether the discount applies to subscriptions items.
    */
    public DiscountCodeAppQuery appliesOnSubscription() {
        startField("appliesOnSubscription");

        return this;
    }

    /**
    * Whether a customer can only use the discount once.
    */
    public DiscountCodeAppQuery appliesOncePerCustomer() {
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
    public DiscountCodeAppQuery asyncUsageCount() {
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
    public DiscountCodeAppQuery codes(DiscountRedeemCodeConnectionQueryDefinition queryDef) {
        return codes(args -> {}, queryDef);
    }

    /**
    * A list codes that customers can use to redeem the discount.
    */
    public DiscountCodeAppQuery codes(CodesArgumentsDefinition argsDef, DiscountRedeemCodeConnectionQueryDefinition queryDef) {
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
    public DiscountCodeAppQuery codesCount(CountQueryDefinition queryDef) {
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
    public DiscountCodeAppQuery combinesWith(DiscountCombinesWithQueryDefinition queryDef) {
        startField("combinesWith");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCombinesWithQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the discount was created.
    */
    public DiscountCodeAppQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The customers that can use the discount.
    */
    public DiscountCodeAppQuery customerSelection(DiscountCustomerSelectionQueryDefinition queryDef) {
        startField("customerSelection");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCustomerSelectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The
    * [discount
    * class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * that's used to control how discounts can be combined.
    */
    public DiscountCodeAppQuery discountClass() {
        startField("discountClass");

        return this;
    }

    /**
    * The [globally-unique ID](https://shopify.dev/docs/api/usage/gids)
    * for the discount.
    */
    public DiscountCodeAppQuery discountId() {
        startField("discountId");

        return this;
    }

    /**
    * The date and time when the discount expires and is no longer available to customers.
    * For discounts without a fixed expiration date, specify `null`.
    */
    public DiscountCodeAppQuery endsAt() {
        startField("endsAt");

        return this;
    }

    /**
    * The [error history](https://shopify.dev/docs/apps/build/functions/monitoring-and-errors)
    * for the latest version of the discount type that the app provides.
    */
    public DiscountCodeAppQuery errorHistory(FunctionsErrorHistoryQueryDefinition queryDef) {
        startField("errorHistory");

        _queryBuilder.append('{');
        queryDef.define(new FunctionsErrorHistoryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether there are
    * [timeline
    * comments](https://help.shopify.com/manual/discounts/managing-discount-codes#use-the-discount-timelin
    * e)
    * associated with the discount.
    */
    public DiscountCodeAppQuery hasTimelineComment() {
        startField("hasTimelineComment");

        return this;
    }

    /**
    * The number of billing cycles for which the discount can be applied,
    * which is useful for subscription-based discounts. For example, if you set this field
    * to `3`, then the discount only applies to the first three billing cycles of a
    * subscription. If you specify `0`, then the discount applies indefinitely.
    */
    public DiscountCodeAppQuery recurringCycleLimit() {
        startField("recurringCycleLimit");

        return this;
    }

    /**
    * A list of URLs that the app can use to share the discount.
    */
    public DiscountCodeAppQuery shareableUrls(DiscountShareableUrlQueryDefinition queryDef) {
        startField("shareableUrls");

        _queryBuilder.append('{');
        queryDef.define(new DiscountShareableUrlQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the discount becomes active and is available to customers.
    */
    public DiscountCodeAppQuery startsAt() {
        startField("startsAt");

        return this;
    }

    /**
    * The status of the discount that describes its availability,
    * expiration, or pending activation.
    */
    public DiscountCodeAppQuery status() {
        startField("status");

        return this;
    }

    /**
    * The discount's name that displays to merchants in the Shopify admin and to customers.
    */
    public DiscountCodeAppQuery title() {
        startField("title");

        return this;
    }

    /**
    * The total sales from orders where the discount was used.
    */
    public DiscountCodeAppQuery totalSales(MoneyV2QueryDefinition queryDef) {
        startField("totalSales");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the discount was updated.
    */
    public DiscountCodeAppQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * The maximum number of times that a customer can use the discount.
    * For discounts with unlimited usage, specify `null`.
    */
    public DiscountCodeAppQuery usageLimit() {
        startField("usageLimit");

        return this;
    }
}
