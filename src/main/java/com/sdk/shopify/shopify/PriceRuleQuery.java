// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* Price rules are a set of conditions, including entitlements and prerequisites, that must be met in
* order for a discount code to apply.
* We recommend using the types and queries detailed at [Getting started with
* discounts](https://shopify.dev/docs/apps/selling-strategies/discounts/getting-started) instead.
* These will replace the GraphQL `PriceRule` object and REST Admin `PriceRule` and `DiscountCode`
* resources.
*/
public class PriceRuleQuery extends Query<PriceRuleQuery> {
    PriceRuleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The maximum number of times that the price rule can be allocated onto an order.
    */
    public PriceRuleQuery allocationLimit() {
        startField("allocationLimit");

        return this;
    }

    /**
    * The method by which the price rule's value is allocated to its entitled items.
    */
    public PriceRuleQuery allocationMethod() {
        startField("allocationMethod");

        return this;
    }

    /**
    * The application that created the price rule.
    */
    public PriceRuleQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
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
    public PriceRuleQuery combinesWith(DiscountCombinesWithQueryDefinition queryDef) {
        startField("combinesWith");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCombinesWithQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the price rule was created.
    */
    public PriceRuleQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The customers that can use this price rule.
    */
    public PriceRuleQuery customerSelection(PriceRuleCustomerSelectionQueryDefinition queryDef) {
        startField("customerSelection");

        _queryBuilder.append('{');
        queryDef.define(new PriceRuleCustomerSelectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The classes of the discount.
    */
    public PriceRuleQuery discountClasses() {
        startField("discountClasses");

        return this;
    }

    public class DiscountCodesArguments extends Arguments {
        DiscountCodesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountCodesArguments first(Integer value) {
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
        public DiscountCodesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountCodesArguments last(Integer value) {
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
        public DiscountCodesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DiscountCodesArguments reverse(Boolean value) {
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
        public DiscountCodesArguments sortKey(DiscountCodeSortKeys value) {
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
        public DiscountCodesArguments query(String value) {
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
        public DiscountCodesArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface DiscountCodesArgumentsDefinition {
        void define(DiscountCodesArguments args);
    }

    /**
    * List of the price rule's discount codes.
    */
    public PriceRuleQuery discountCodes(PriceRuleDiscountCodeConnectionQueryDefinition queryDef) {
        return discountCodes(args -> {}, queryDef);
    }

    /**
    * List of the price rule's discount codes.
    */
    public PriceRuleQuery discountCodes(DiscountCodesArgumentsDefinition argsDef, PriceRuleDiscountCodeConnectionQueryDefinition queryDef) {
        startField("discountCodes");

        DiscountCodesArguments args = new DiscountCodesArguments(_queryBuilder);
        argsDef.define(args);
        DiscountCodesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PriceRuleDiscountCodeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * How many discount codes associated with the price rule.
    */
    public PriceRuleQuery discountCodesCount(CountQueryDefinition queryDef) {
        startField("discountCodesCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the price rule ends. For open-ended price rules, use `null`.
    */
    public PriceRuleQuery endsAt() {
        startField("endsAt");

        return this;
    }

    public class EventsArguments extends Arguments {
        EventsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public EventsArguments first(Integer value) {
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
        public EventsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public EventsArguments last(Integer value) {
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
        public EventsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public EventsArguments reverse(Boolean value) {
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
        public EventsArguments sortKey(EventSortKeys value) {
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
        * | action | string | The action that occured. | | | - `action:create` |
        * | comments | boolean | Whether or not to include
        * [comment-events](https://shopify.dev/api/admin-graphql/latest/objects/CommentEvent) in your search,
        * passing `false` will exclude comment-events, any other value will include comment-events. | | | -
        * `false`<br/> - `true` |
        * | created_at | time | Filter by the date and time when the event happened. | | | -
        * `created_at:>2020-10-21`<br/> - `created_at:<now` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | subject_type | string | The resource type affected by this event. See
        * [EventSubjectType](https://shopify.dev/api/admin-graphql/latest/enums/EventSubjectType) for possible
        * values. | | | - `PRODUCT_VARIANT`<br/> - `PRODUCT`<br/> - `COLLECTION` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public EventsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface EventsArgumentsDefinition {
        void define(EventsArguments args);
    }

    /**
    * The paginated list of events associated with the price rule.
    */
    public PriceRuleQuery events(EventConnectionQueryDefinition queryDef) {
        return events(args -> {}, queryDef);
    }

    /**
    * The paginated list of events associated with the price rule.
    */
    public PriceRuleQuery events(EventsArgumentsDefinition argsDef, EventConnectionQueryDefinition queryDef) {
        startField("events");

        EventsArguments args = new EventsArguments(_queryBuilder);
        argsDef.define(args);
        EventsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EventConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of the price rule's features.
    */
    public PriceRuleQuery features() {
        startField("features");

        return this;
    }

    /**
    * Indicates whether there are any timeline comments on the price rule.
    */
    public PriceRuleQuery hasTimelineComment() {
        startField("hasTimelineComment");

        return this;
    }

    /**
    * The items to which the price rule applies.
    */
    public PriceRuleQuery itemEntitlements(PriceRuleItemEntitlementsQueryDefinition queryDef) {
        startField("itemEntitlements");

        _queryBuilder.append('{');
        queryDef.define(new PriceRuleItemEntitlementsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The items required for the price rule to be applicable.
    */
    public PriceRuleQuery itemPrerequisites(PriceRuleLineItemPrerequisitesQueryDefinition queryDef) {
        startField("itemPrerequisites");

        _queryBuilder.append('{');
        queryDef.define(new PriceRuleLineItemPrerequisitesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public PriceRuleQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    /**
    * Whether the price rule can be applied only once per customer.
    */
    public PriceRuleQuery oncePerCustomer() {
        startField("oncePerCustomer");

        return this;
    }

    /**
    * The number of the entitled items must fall within this range for the price rule to be applicable.
    */
    public PriceRuleQuery prerequisiteQuantityRange(PriceRuleQuantityRangeQueryDefinition queryDef) {
        startField("prerequisiteQuantityRange");

        _queryBuilder.append('{');
        queryDef.define(new PriceRuleQuantityRangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shipping cost must fall within this range for the price rule to be applicable.
    */
    public PriceRuleQuery prerequisiteShippingPriceRange(PriceRuleMoneyRangeQueryDefinition queryDef) {
        startField("prerequisiteShippingPriceRange");

        _queryBuilder.append('{');
        queryDef.define(new PriceRuleMoneyRangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of the entitled items subtotal prices must fall within this range for the price rule to be
    * applicable.
    */
    public PriceRuleQuery prerequisiteSubtotalRange(PriceRuleMoneyRangeQueryDefinition queryDef) {
        startField("prerequisiteSubtotalRange");

        _queryBuilder.append('{');
        queryDef.define(new PriceRuleMoneyRangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Quantity of prerequisite items required for the price rule to be applicable,  compared to quantity
    * of entitled items.
    */
    public PriceRuleQuery prerequisiteToEntitlementQuantityRatio(PriceRulePrerequisiteToEntitlementQuantityRatioQueryDefinition queryDef) {
        startField("prerequisiteToEntitlementQuantityRatio");

        _queryBuilder.append('{');
        queryDef.define(new PriceRulePrerequisiteToEntitlementQuantityRatioQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * URLs that can be used to share the discount.
    */
    public PriceRuleQuery shareableUrls(PriceRuleShareableUrlQueryDefinition queryDef) {
        startField("shareableUrls");

        _queryBuilder.append('{');
        queryDef.define(new PriceRuleShareableUrlQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shipping lines to which the price rule applies.
    */
    public PriceRuleQuery shippingEntitlements(PriceRuleShippingLineEntitlementsQueryDefinition queryDef) {
        startField("shippingEntitlements");

        _queryBuilder.append('{');
        queryDef.define(new PriceRuleShippingLineEntitlementsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the price rule starts.
    */
    public PriceRuleQuery startsAt() {
        startField("startsAt");

        return this;
    }

    /**
    * The status of the price rule.
    */
    public PriceRuleQuery status() {
        startField("status");

        return this;
    }

    /**
    * A detailed summary of the price rule.
    */
    public PriceRuleQuery summary() {
        startField("summary");

        return this;
    }

    /**
    * The type of lines (line_item or shipping_line) to which the price rule applies.
    */
    public PriceRuleQuery target() {
        startField("target");

        return this;
    }

    /**
    * The title of the price rule.
    */
    public PriceRuleQuery title() {
        startField("title");

        return this;
    }

    /**
    * The total sales from orders where the price rule was used.
    */
    public PriceRuleQuery totalSales(MoneyV2QueryDefinition queryDef) {
        startField("totalSales");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of times that the price rule has been used. This value is updated asynchronously and can
    * be different than the actual usage count.
    */
    public PriceRuleQuery usageCount() {
        startField("usageCount");

        return this;
    }

    /**
    * The maximum number of times that the price rule can be used in total.
    */
    public PriceRuleQuery usageLimit() {
        startField("usageLimit");

        return this;
    }

    /**
    * A time period during which a price rule is applicable.
    */
    public PriceRuleQuery validityPeriod(PriceRuleValidityPeriodQueryDefinition queryDef) {
        startField("validityPeriod");

        _queryBuilder.append('{');
        queryDef.define(new PriceRuleValidityPeriodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The value of the price rule.
    */
    public PriceRuleQuery valueV2(PricingValueQueryDefinition queryDef) {
        startField("valueV2");

        _queryBuilder.append('{');
        queryDef.define(new PricingValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
