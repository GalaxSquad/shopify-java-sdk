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

import java.util.List;

/**
* An order is a customer's request to purchase one or more products from a shop. You can retrieve and
* update orders using the `Order` object.
* Learn more about
* [editing an existing order with the GraphQL Admin
* API](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
* Only the last 60 days' worth of orders from a store are accessible from the `Order` object by
* default. If you want to access older orders,
* then you need to [request access to all
* orders](https://shopify.dev/api/usage/access-scopes#orders-permissions). If your app is granted
* access, then you can add the `read_all_orders` scope to your app along with `read_orders` or
* `write_orders`.
* [Private apps](https://shopify.dev/apps/auth/basic-http) are not affected by this change and are
* automatically granted the scope.
* **Caution:** Only use this data if it's required for your app's functionality. Shopify will restrict
* [access to scopes](https://shopify.dev/api/usage/access-scopes) for apps that don't have a
* legitimate use for the associated data.
*/
public class OrderQuery extends Query<OrderQuery> {
    OrderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A list of additional fees applied to the order.
    */
    public OrderQuery additionalFees(AdditionalFeeQueryDefinition queryDef) {
        startField("additionalFees");

        _queryBuilder.append('{');
        queryDef.define(new AdditionalFeeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AgreementsArguments extends Arguments {
        AgreementsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AgreementsArguments first(Integer value) {
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
        public AgreementsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AgreementsArguments last(Integer value) {
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
        public AgreementsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AgreementsArguments reverse(Boolean value) {
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
        * | happened_at | time |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public AgreementsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface AgreementsArgumentsDefinition {
        void define(AgreementsArguments args);
    }

    /**
    * A list of sales agreements associated with the order.
    */
    public OrderQuery agreements(SalesAgreementConnectionQueryDefinition queryDef) {
        return agreements(args -> {}, queryDef);
    }

    /**
    * A list of sales agreements associated with the order.
    */
    public OrderQuery agreements(AgreementsArgumentsDefinition argsDef, SalesAgreementConnectionQueryDefinition queryDef) {
        startField("agreements");

        AgreementsArguments args = new AgreementsArguments(_queryBuilder);
        argsDef.define(args);
        AgreementsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SalesAgreementConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of messages that appear on the order page in the Shopify admin.
    */
    public OrderQuery alerts(ResourceAlertQueryDefinition queryDef) {
        startField("alerts");

        _queryBuilder.append('{');
        queryDef.define(new ResourceAlertQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The application that created the order.
    */
    public OrderQuery app(OrderAppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new OrderAppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The billing address of the customer.
    */
    public OrderQuery billingAddress(MailingAddressQueryDefinition queryDef) {
        startField("billingAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the billing address matches the shipping address.
    */
    public OrderQuery billingAddressMatchesShippingAddress() {
        startField("billingAddressMatchesShippingAddress");

        return this;
    }

    /**
    * Whether the order can be manually marked as paid.
    */
    public OrderQuery canMarkAsPaid() {
        startField("canMarkAsPaid");

        return this;
    }

    /**
    * Whether a customer email exists for the order.
    */
    public OrderQuery canNotifyCustomer() {
        startField("canNotifyCustomer");

        return this;
    }

    /**
    * The reason provided when the order was canceled.
    * Returns `null` if the order wasn't canceled.
    */
    public OrderQuery cancelReason() {
        startField("cancelReason");

        return this;
    }

    /**
    * Cancellation details for the order.
    */
    public OrderQuery cancellation(OrderCancellationQueryDefinition queryDef) {
        startField("cancellation");

        _queryBuilder.append('{');
        queryDef.define(new OrderCancellationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the order was canceled.
    * Returns `null` if the order wasn't canceled.
    */
    public OrderQuery cancelledAt() {
        startField("cancelledAt");

        return this;
    }

    /**
    * Whether payment for the order can be captured.
    */
    public OrderQuery capturable() {
        startField("capturable");

        return this;
    }

    /**
    * The total order-level discount amount, before returns, in shop and presentment currencies.
    */
    public OrderQuery cartDiscountAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("cartDiscountAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Details about the channel that created the order.
    */
    public OrderQuery channelInformation(ChannelInformationQueryDefinition queryDef) {
        startField("channelInformation");

        _queryBuilder.append('{');
        queryDef.define(new ChannelInformationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The IP address of the API client that created the order.
    */
    public OrderQuery clientIp() {
        startField("clientIp");

        return this;
    }

    /**
    * Whether the order is closed.
    */
    public OrderQuery closed() {
        startField("closed");

        return this;
    }

    /**
    * The date and time when the order was closed.
    * Returns `null` if the order isn't closed.
    */
    public OrderQuery closedAt() {
        startField("closedAt");

        return this;
    }

    /**
    * A randomly generated alpha-numeric identifier for the order that may be shown to the customer
    * instead of the sequential order name. For example, "XPAV284CT", "R50KELTJP" or "35PKUN0UJ".
    * This value isn't guaranteed to be unique.
    */
    public OrderQuery confirmationNumber() {
        startField("confirmationNumber");

        return this;
    }

    /**
    * Whether inventory has been reserved for the order.
    */
    public OrderQuery confirmed() {
        startField("confirmed");

        return this;
    }

    /**
    * Date and time when the order was created in Shopify.
    */
    public OrderQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The shop currency when the order was placed.
    */
    public OrderQuery currencyCode() {
        startField("currencyCode");

        return this;
    }

    /**
    * The current order-level discount amount after all order updates, in shop and presentment currencies.
    */
    public OrderQuery currentCartDiscountAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("currentCartDiscountAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The current shipping price after applying refunds and discounts. If the parent `order.taxesIncluded`
    * field is true, then this price includes taxes. Otherwise, this field is the pre-tax price.
    */
    public OrderQuery currentShippingPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("currentShippingPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of the quantities for all line items that contribute to the order's current subtotal price.
    */
    public OrderQuery currentSubtotalLineItemsQuantity() {
        startField("currentSubtotalLineItemsQuantity");

        return this;
    }

    /**
    * The sum of the prices for all line items after discounts and returns, in shop and presentment
    * currencies.
    * If `taxesIncluded` is `true`, then the subtotal also includes tax.
    */
    public OrderQuery currentSubtotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("currentSubtotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of all tax lines applied to line items on the order, after returns.
    * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
    */
    public OrderQuery currentTaxLines(TaxLineQueryDefinition queryDef) {
        startField("currentTaxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount of additional fees after returns, in shop and presentment currencies.
    * Returns `null` if there are no additional fees for the order.
    */
    public OrderQuery currentTotalAdditionalFeesSet(MoneyBagQueryDefinition queryDef) {
        startField("currentTotalAdditionalFeesSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount discounted on the order after returns, in shop and presentment currencies.
    * This includes both order and line level discounts.
    */
    public OrderQuery currentTotalDiscountsSet(MoneyBagQueryDefinition queryDef) {
        startField("currentTotalDiscountsSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount of duties after returns, in shop and presentment currencies.
    * Returns `null` if duties aren't applicable.
    */
    public OrderQuery currentTotalDutiesSet(MoneyBagQueryDefinition queryDef) {
        startField("currentTotalDutiesSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total price of the order, after returns, in shop and presentment currencies.
    * This includes taxes and discounts.
    */
    public OrderQuery currentTotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("currentTotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of the prices of all tax lines applied to line items on the order, after returns, in shop
    * and presentment currencies.
    */
    public OrderQuery currentTotalTaxSet(MoneyBagQueryDefinition queryDef) {
        startField("currentTotalTaxSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total weight of the order after returns, in grams.
    */
    public OrderQuery currentTotalWeight() {
        startField("currentTotalWeight");

        return this;
    }

    /**
    * A list of additional merchant-facing details that have been added to the order. For example, whether
    * an order is a customer's first.
    */
    public OrderQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customer that placed the order.
    */
    public OrderQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the customer agreed to receive marketing materials.
    */
    public OrderQuery customerAcceptsMarketing() {
        startField("customerAcceptsMarketing");

        return this;
    }

    /**
    * The customer's visits and interactions with the online store before placing the order.
    */
    public OrderQuery customerJourneySummary(CustomerJourneySummaryQueryDefinition queryDef) {
        startField("customerJourneySummary");

        _queryBuilder.append('{');
        queryDef.define(new CustomerJourneySummaryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A two-letter or three-letter language code, optionally followed by a region modifier.
    */
    public OrderQuery customerLocale() {
        startField("customerLocale");

        return this;
    }

    public class DiscountApplicationsArguments extends Arguments {
        DiscountApplicationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountApplicationsArguments first(Integer value) {
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
        public DiscountApplicationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountApplicationsArguments last(Integer value) {
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
        public DiscountApplicationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DiscountApplicationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DiscountApplicationsArgumentsDefinition {
        void define(DiscountApplicationsArguments args);
    }

    /**
    * A list of discounts that are applied to the order, not including order edits and refunds.
    */
    public OrderQuery discountApplications(DiscountApplicationConnectionQueryDefinition queryDef) {
        return discountApplications(args -> {}, queryDef);
    }

    /**
    * A list of discounts that are applied to the order, not including order edits and refunds.
    */
    public OrderQuery discountApplications(DiscountApplicationsArgumentsDefinition argsDef, DiscountApplicationConnectionQueryDefinition queryDef) {
        startField("discountApplications");

        DiscountApplicationsArguments args = new DiscountApplicationsArguments(_queryBuilder);
        argsDef.define(args);
        DiscountApplicationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DiscountApplicationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The discount code used for the order.
    */
    public OrderQuery discountCode() {
        startField("discountCode");

        return this;
    }

    /**
    * The discount codes used for the order.
    */
    public OrderQuery discountCodes() {
        startField("discountCodes");

        return this;
    }

    /**
    * The primary address of the customer.
    * Returns `null` if neither the shipping address nor the billing address was provided.
    */
    public OrderQuery displayAddress(MailingAddressQueryDefinition queryDef) {
        startField("displayAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The financial status of the order that can be shown to the merchant.
    * This field doesn't capture all the details of an order's financial state. It should only be used for
    * display summary purposes.
    */
    public OrderQuery displayFinancialStatus() {
        startField("displayFinancialStatus");

        return this;
    }

    /**
    * The fulfillment status for the order that can be shown to the merchant.
    * This field does not capture all the details of an order's fulfillment state. It should only be used
    * for display summary purposes.
    * For a more granular view of the fulfillment status, refer to the
    * [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
    */
    public OrderQuery displayFulfillmentStatus() {
        startField("displayFulfillmentStatus");

        return this;
    }

    /**
    * A list of the disputes associated with the order.
    */
    public OrderQuery disputes(OrderDisputeSummaryQueryDefinition queryDef) {
        startField("disputes");

        _queryBuilder.append('{');
        queryDef.define(new OrderDisputeSummaryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether duties are included in the subtotal price of the order.
    */
    public OrderQuery dutiesIncluded() {
        startField("dutiesIncluded");

        return this;
    }

    /**
    * Whether the order has had any edits applied.
    */
    public OrderQuery edited() {
        startField("edited");

        return this;
    }

    /**
    * The email address associated with the customer.
    */
    public OrderQuery email() {
        startField("email");

        return this;
    }

    /**
    * Whether taxes on the order are estimated.
    * This field returns `false` when taxes on the order are finalized and aren't subject to any changes.
    */
    public OrderQuery estimatedTaxes() {
        startField("estimatedTaxes");

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
    * A list of events associated with the order.
    */
    public OrderQuery events(EventConnectionQueryDefinition queryDef) {
        return events(args -> {}, queryDef);
    }

    /**
    * A list of events associated with the order.
    */
    public OrderQuery events(EventsArgumentsDefinition argsDef, EventConnectionQueryDefinition queryDef) {
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
    * Whether there are line items that can be fulfilled.
    * This field returns `false` when the order has no fulfillable line items.
    * For a more granular view of the fulfillment status, refer to the
    * [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
    */
    public OrderQuery fulfillable() {
        startField("fulfillable");

        return this;
    }

    public class FulfillmentOrdersArguments extends Arguments {
        FulfillmentOrdersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * If false, all fulfillment orders will be returned. If true, fulfillment orders that are normally
        * hidden from the merchant will be excluded.
        * For example, fulfillment orders that were closed after being combined or moved are hidden.
        */
        public FulfillmentOrdersArguments displayable(Boolean value) {
            if (value != null) {
                startArgument("displayable");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public FulfillmentOrdersArguments first(Integer value) {
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
        public FulfillmentOrdersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public FulfillmentOrdersArguments last(Integer value) {
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
        public FulfillmentOrdersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public FulfillmentOrdersArguments reverse(Boolean value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | assigned_location_id | id |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | status | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public FulfillmentOrdersArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface FulfillmentOrdersArgumentsDefinition {
        void define(FulfillmentOrdersArguments args);
    }

    /**
    * A list of fulfillment orders for a specific order.
    * [FulfillmentOrder API access
    * scopes](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder#api-access-scopes)
    * govern which fulfillments orders are returned.
    * An API client will only receive a subset of the fulfillment orders which belong to an order
    * if they don't have the necessary access scopes to view all of the fulfillment orders.
    * In the case that an API client does not have the access scopes necessary to view
    * any of the fulfillment orders that belong to an order, an empty array will be returned.
    */
    public OrderQuery fulfillmentOrders(FulfillmentOrderConnectionQueryDefinition queryDef) {
        return fulfillmentOrders(args -> {}, queryDef);
    }

    /**
    * A list of fulfillment orders for a specific order.
    * [FulfillmentOrder API access
    * scopes](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder#api-access-scopes)
    * govern which fulfillments orders are returned.
    * An API client will only receive a subset of the fulfillment orders which belong to an order
    * if they don't have the necessary access scopes to view all of the fulfillment orders.
    * In the case that an API client does not have the access scopes necessary to view
    * any of the fulfillment orders that belong to an order, an empty array will be returned.
    */
    public OrderQuery fulfillmentOrders(FulfillmentOrdersArgumentsDefinition argsDef, FulfillmentOrderConnectionQueryDefinition queryDef) {
        startField("fulfillmentOrders");

        FulfillmentOrdersArguments args = new FulfillmentOrdersArguments(_queryBuilder);
        argsDef.define(args);
        FulfillmentOrdersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentsArguments extends Arguments {
        FulfillmentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Truncate the array result to this size.
        */
        public FulfillmentsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FulfillmentsArgumentsDefinition {
        void define(FulfillmentsArguments args);
    }

    /**
    * List of shipments for the order.
    */
    public OrderQuery fulfillments(FulfillmentQueryDefinition queryDef) {
        return fulfillments(args -> {}, queryDef);
    }

    /**
    * List of shipments for the order.
    */
    public OrderQuery fulfillments(FulfillmentsArgumentsDefinition argsDef, FulfillmentQueryDefinition queryDef) {
        startField("fulfillments");

        FulfillmentsArguments args = new FulfillmentsArguments(_queryBuilder);
        argsDef.define(args);
        FulfillmentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The count of fulfillments including the cancelled fulfillments.
    */
    public OrderQuery fulfillmentsCount(CountQueryDefinition queryDef) {
        startField("fulfillmentsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the order has been paid in full.
    */
    public OrderQuery fullyPaid() {
        startField("fullyPaid");

        return this;
    }

    /**
    * Whether the merchant added a timeline comment to the order.
    */
    public OrderQuery hasTimelineComment() {
        startField("hasTimelineComment");

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public OrderQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    public class LineItemsArguments extends Arguments {
        LineItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LineItemsArguments first(Integer value) {
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
        public LineItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LineItemsArguments last(Integer value) {
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
        public LineItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public LineItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LineItemsArgumentsDefinition {
        void define(LineItemsArguments args);
    }

    /**
    * A list of the order's line items.
    */
    public OrderQuery lineItems(LineItemConnectionQueryDefinition queryDef) {
        return lineItems(args -> {}, queryDef);
    }

    /**
    * A list of the order's line items.
    */
    public OrderQuery lineItems(LineItemsArgumentsDefinition argsDef, LineItemConnectionQueryDefinition queryDef) {
        startField("lineItems");

        LineItemsArguments args = new LineItemsArguments(_queryBuilder);
        argsDef.define(args);
        LineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LocalizedFieldsArguments extends Arguments {
        LocalizedFieldsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The country codes of the extensions.
        */
        public LocalizedFieldsArguments countryCodes(List<CountryCode> value) {
            if (value != null) {
                startArgument("countryCodes");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CountryCode item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The purpose of the extensions.
        */
        public LocalizedFieldsArguments purposes(List<LocalizedFieldPurpose> value) {
            if (value != null) {
                startArgument("purposes");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (LocalizedFieldPurpose item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LocalizedFieldsArguments first(Integer value) {
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
        public LocalizedFieldsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LocalizedFieldsArguments last(Integer value) {
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
        public LocalizedFieldsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public LocalizedFieldsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LocalizedFieldsArgumentsDefinition {
        void define(LocalizedFieldsArguments args);
    }

    /**
    * List of localized fields for the resource.
    */
    public OrderQuery localizedFields(LocalizedFieldConnectionQueryDefinition queryDef) {
        return localizedFields(args -> {}, queryDef);
    }

    /**
    * List of localized fields for the resource.
    */
    public OrderQuery localizedFields(LocalizedFieldsArgumentsDefinition argsDef, LocalizedFieldConnectionQueryDefinition queryDef) {
        startField("localizedFields");

        LocalizedFieldsArguments args = new LocalizedFieldsArguments(_queryBuilder);
        argsDef.define(args);
        LocalizedFieldsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocalizedFieldConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The merchant's business entity associated with the order.
    */
    public OrderQuery merchantBusinessEntity(BusinessEntityQueryDefinition queryDef) {
        startField("merchantBusinessEntity");

        _queryBuilder.append('{');
        queryDef.define(new BusinessEntityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the order can be edited by the merchant. For example, canceled orders can’t be edited.
    */
    public OrderQuery merchantEditable() {
        startField("merchantEditable");

        return this;
    }

    /**
    * A list of reasons why the order can't be edited. For example, "Canceled orders can't be edited".
    */
    public OrderQuery merchantEditableErrors() {
        startField("merchantEditableErrors");

        return this;
    }

    /**
    * The application acting as the Merchant of Record for the order.
    */
    public OrderQuery merchantOfRecordApp(OrderAppQueryDefinition queryDef) {
        startField("merchantOfRecordApp");

        _queryBuilder.append('{');
        queryDef.define(new OrderAppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldArguments extends Arguments {
        MetafieldArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MetafieldArgumentsDefinition {
        void define(MetafieldArguments args);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public OrderQuery metafield(String key, MetafieldQueryDefinition queryDef) {
        return metafield(key, args -> {}, queryDef);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public OrderQuery metafield(String key, MetafieldArgumentsDefinition argsDef, MetafieldQueryDefinition queryDef) {
        startField("metafield");

        _queryBuilder.append("(key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        argsDef.define(new MetafieldArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldsArguments extends Arguments {
        MetafieldsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The metafield namespace to filter by. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldsArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * List of keys of metafields in the format `namespace.key`, will be returned in the same format.
        */
        public MetafieldsArguments keys(List<String> value) {
            if (value != null) {
                startArgument("keys");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments first(Integer value) {
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
        public MetafieldsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments last(Integer value) {
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
        public MetafieldsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MetafieldsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MetafieldsArgumentsDefinition {
        void define(MetafieldsArguments args);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public OrderQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public OrderQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
        startField("metafields");

        MetafieldsArguments args = new MetafieldsArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The unique identifier for the order that appears on the order page in the Shopify admin and the
    * <b>Order status</b> page.
    * For example, "#1001", "EN1001", or "1001-A".
    * This value isn't unique across multiple stores.
    */
    public OrderQuery name() {
        startField("name");

        return this;
    }

    /**
    * The net payment for the order, based on the total amount received minus the total amount refunded,
    * in shop and presentment currencies.
    */
    public OrderQuery netPaymentSet(MoneyBagQueryDefinition queryDef) {
        startField("netPaymentSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class NonFulfillableLineItemsArguments extends Arguments {
        NonFulfillableLineItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public NonFulfillableLineItemsArguments first(Integer value) {
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
        public NonFulfillableLineItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public NonFulfillableLineItemsArguments last(Integer value) {
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
        public NonFulfillableLineItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public NonFulfillableLineItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NonFulfillableLineItemsArgumentsDefinition {
        void define(NonFulfillableLineItemsArguments args);
    }

    /**
    * A list of line items that can't be fulfilled.
    * For example, tips and fully refunded line items can't be fulfilled.
    * For a more granular view of the fulfillment status, refer to the
    * [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
    */
    public OrderQuery nonFulfillableLineItems(LineItemConnectionQueryDefinition queryDef) {
        return nonFulfillableLineItems(args -> {}, queryDef);
    }

    /**
    * A list of line items that can't be fulfilled.
    * For example, tips and fully refunded line items can't be fulfilled.
    * For a more granular view of the fulfillment status, refer to the
    * [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
    */
    public OrderQuery nonFulfillableLineItems(NonFulfillableLineItemsArgumentsDefinition argsDef, LineItemConnectionQueryDefinition queryDef) {
        startField("nonFulfillableLineItems");

        NonFulfillableLineItemsArguments args = new NonFulfillableLineItemsArguments(_queryBuilder);
        argsDef.define(args);
        NonFulfillableLineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The contents of the note associated with the order.
    */
    public OrderQuery note() {
        startField("note");

        return this;
    }

    /**
    * The total amount of additional fees at the time of order creation, in shop and presentment
    * currencies.
    * Returns `null` if additional fees aren't applicable.
    */
    public OrderQuery originalTotalAdditionalFeesSet(MoneyBagQueryDefinition queryDef) {
        startField("originalTotalAdditionalFeesSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount of duties at the time of order creation, in shop and presentment currencies.
    * Returns `null` if duties aren't applicable.
    */
    public OrderQuery originalTotalDutiesSet(MoneyBagQueryDefinition queryDef) {
        startField("originalTotalDutiesSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total price of the order at the time of order creation, in shop and presentment currencies.
    */
    public OrderQuery originalTotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("originalTotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The payment collection details for the order.
    */
    public OrderQuery paymentCollectionDetails(OrderPaymentCollectionDetailsQueryDefinition queryDef) {
        startField("paymentCollectionDetails");

        _queryBuilder.append('{');
        queryDef.define(new OrderPaymentCollectionDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of the names of all payment gateways used for the order.
    * For example, "Shopify Payments" and "Cash on Delivery (COD)".
    */
    public OrderQuery paymentGatewayNames() {
        startField("paymentGatewayNames");

        return this;
    }

    /**
    * The payment terms associated with the order.
    */
    public OrderQuery paymentTerms(PaymentTermsQueryDefinition queryDef) {
        startField("paymentTerms");

        _queryBuilder.append('{');
        queryDef.define(new PaymentTermsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The phone number associated with the customer.
    */
    public OrderQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The PO number associated with the order.
    */
    public OrderQuery poNumber() {
        startField("poNumber");

        return this;
    }

    /**
    * The payment `CurrencyCode` of the customer for the order.
    */
    public OrderQuery presentmentCurrencyCode() {
        startField("presentmentCurrencyCode");

        return this;
    }

    /**
    * The date and time when the order was processed.
    * This date and time might not match the date and time when the order was created.
    */
    public OrderQuery processedAt() {
        startField("processedAt");

        return this;
    }

    /**
    * The publication that the order was created from.
    */
    public OrderQuery publication(PublicationQueryDefinition queryDef) {
        startField("publication");

        _queryBuilder.append('{');
        queryDef.define(new PublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The purchasing entity for the order.
    */
    public OrderQuery purchasingEntity(PurchasingEntityQueryDefinition queryDef) {
        startField("purchasingEntity");

        _queryBuilder.append('{');
        queryDef.define(new PurchasingEntityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The difference between the suggested and actual refund amount of all refunds that have been applied
    * to the order. A positive value indicates a difference in the merchant's favor, and a negative value
    * indicates a difference in the customer's favor.
    */
    public OrderQuery refundDiscrepancySet(MoneyBagQueryDefinition queryDef) {
        startField("refundDiscrepancySet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the order can be refunded.
    */
    public OrderQuery refundable() {
        startField("refundable");

        return this;
    }

    public class RefundsArguments extends Arguments {
        RefundsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Truncate the array result to this size.
        */
        public RefundsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface RefundsArgumentsDefinition {
        void define(RefundsArguments args);
    }

    /**
    * A list of refunds that have been applied to the order.
    */
    public OrderQuery refunds(RefundQueryDefinition queryDef) {
        return refunds(args -> {}, queryDef);
    }

    /**
    * A list of refunds that have been applied to the order.
    */
    public OrderQuery refunds(RefundsArgumentsDefinition argsDef, RefundQueryDefinition queryDef) {
        startField("refunds");

        RefundsArguments args = new RefundsArguments(_queryBuilder);
        argsDef.define(args);
        RefundsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RefundQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The URL of the source that the order originated from, if found in the domain registry.
    */
    public OrderQuery registeredSourceUrl() {
        startField("registeredSourceUrl");

        return this;
    }

    /**
    * Whether the order has shipping lines or at least one line item on the order that requires shipping.
    */
    public OrderQuery requiresShipping() {
        startField("requiresShipping");

        return this;
    }

    /**
    * Whether any line item on the order can be restocked.
    */
    public OrderQuery restockable() {
        startField("restockable");

        return this;
    }

    /**
    * The physical location where a retail order is created or completed, except for draft POS orders
    * completed via the “mark as paid” flow in Admin, which return null.
    */
    public OrderQuery retailLocation(LocationQueryDefinition queryDef) {
        startField("retailLocation");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The order's aggregated return status for display purposes.
    */
    public OrderQuery returnStatus() {
        startField("returnStatus");

        return this;
    }

    public class ReturnsArguments extends Arguments {
        ReturnsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReturnsArguments first(Integer value) {
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
        public ReturnsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReturnsArguments last(Integer value) {
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
        public ReturnsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ReturnsArguments reverse(Boolean value) {
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
        * | status | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public ReturnsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ReturnsArgumentsDefinition {
        void define(ReturnsArguments args);
    }

    /**
    * A list of returns for the order.
    */
    public OrderQuery returns(ReturnConnectionQueryDefinition queryDef) {
        return returns(args -> {}, queryDef);
    }

    /**
    * A list of returns for the order.
    */
    public OrderQuery returns(ReturnsArgumentsDefinition argsDef, ReturnConnectionQueryDefinition queryDef) {
        startField("returns");

        ReturnsArguments args = new ReturnsArguments(_queryBuilder);
        argsDef.define(args);
        ReturnsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReturnConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The risk characteristics for the order.
    */
    public OrderQuery risk(OrderRiskSummaryQueryDefinition queryDef) {
        startField("risk");

        _queryBuilder.append('{');
        queryDef.define(new OrderRiskSummaryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The mailing address of the customer.
    */
    public OrderQuery shippingAddress(MailingAddressQueryDefinition queryDef) {
        startField("shippingAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A summary of all shipping costs on the order.
    */
    public OrderQuery shippingLine(ShippingLineQueryDefinition queryDef) {
        startField("shippingLine");

        _queryBuilder.append('{');
        queryDef.define(new ShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ShippingLinesArguments extends Arguments {
        ShippingLinesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Whether results should contain removed shipping lines.
        */
        public ShippingLinesArguments includeRemovals(Boolean value) {
            if (value != null) {
                startArgument("includeRemovals");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ShippingLinesArguments first(Integer value) {
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
        public ShippingLinesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ShippingLinesArguments last(Integer value) {
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
        public ShippingLinesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ShippingLinesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ShippingLinesArgumentsDefinition {
        void define(ShippingLinesArguments args);
    }

    /**
    * A list of the order's shipping lines.
    */
    public OrderQuery shippingLines(ShippingLineConnectionQueryDefinition queryDef) {
        return shippingLines(args -> {}, queryDef);
    }

    /**
    * A list of the order's shipping lines.
    */
    public OrderQuery shippingLines(ShippingLinesArgumentsDefinition argsDef, ShippingLineConnectionQueryDefinition queryDef) {
        startField("shippingLines");

        ShippingLinesArguments args = new ShippingLinesArguments(_queryBuilder);
        argsDef.define(args);
        ShippingLinesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ShippingLineConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The Shopify Protect details for the order. If Shopify Protect is disabled for the shop, then this
    * will be null.
    */
    public OrderQuery shopifyProtect(ShopifyProtectOrderSummaryQueryDefinition queryDef) {
        startField("shopifyProtect");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyProtectOrderSummaryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A unique POS or third party order identifier.
    * For example, "1234-12-1000" or "111-98567-54". The `receipt_number` field is derived from this value
    * for POS orders.
    */
    public OrderQuery sourceIdentifier() {
        startField("sourceIdentifier");

        return this;
    }

    /**
    * The name of the source associated with the order.
    */
    public OrderQuery sourceName() {
        startField("sourceName");

        return this;
    }

    /**
    * The staff member associated with the order.
    */
    public OrderQuery staffMember(StaffMemberQueryDefinition queryDef) {
        startField("staffMember");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The URL where the customer can check the order's current status.
    */
    public OrderQuery statusPageUrl() {
        startField("statusPageUrl");

        return this;
    }

    /**
    * The sum of the quantities for all line items that contribute to the order's subtotal price.
    */
    public OrderQuery subtotalLineItemsQuantity() {
        startField("subtotalLineItemsQuantity");

        return this;
    }

    /**
    * The sum of the prices for all line items after discounts and before returns, in shop and presentment
    * currencies.
    * If `taxesIncluded` is `true`, then the subtotal also includes tax.
    */
    public OrderQuery subtotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("subtotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SuggestedRefundArguments extends Arguments {
        SuggestedRefundArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The amount to refund for shipping. Overrides the `refundShipping` argument.
        */
        public SuggestedRefundArguments shippingAmount(String value) {
            if (value != null) {
                startArgument("shippingAmount");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Whether to refund the full shipping amount.
        */
        public SuggestedRefundArguments refundShipping(Boolean value) {
            if (value != null) {
                startArgument("refundShipping");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The line items from the order to include in the refund.
        */
        public SuggestedRefundArguments refundLineItems(List<RefundLineItemInput> value) {
            if (value != null) {
                startArgument("refundLineItems");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (RefundLineItemInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The duties from the order to include in the refund.
        */
        public SuggestedRefundArguments refundDuties(List<RefundDutyInput> value) {
            if (value != null) {
                startArgument("refundDuties");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (RefundDutyInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * Whether the suggested refund should be created from all refundable line items on the order.
        * If `true`, the `refundLineItems` argument will be ignored.
        */
        public SuggestedRefundArguments suggestFullRefund(Boolean value) {
            if (value != null) {
                startArgument("suggestFullRefund");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SuggestedRefundArgumentsDefinition {
        void define(SuggestedRefundArguments args);
    }

    /**
    * A suggested refund for the order.
    */
    public OrderQuery suggestedRefund(SuggestedRefundQueryDefinition queryDef) {
        return suggestedRefund(args -> {}, queryDef);
    }

    /**
    * A suggested refund for the order.
    */
    public OrderQuery suggestedRefund(SuggestedRefundArgumentsDefinition argsDef, SuggestedRefundQueryDefinition queryDef) {
        startField("suggestedRefund");

        SuggestedRefundArguments args = new SuggestedRefundArguments(_queryBuilder);
        argsDef.define(args);
        SuggestedRefundArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SuggestedRefundQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A comma separated list of tags associated with the order. Updating `tags` overwrites
    * any existing tags that were previously added to the order. To add new tags without overwriting
    * existing tags, use the [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
    * mutation.
    */
    public OrderQuery tags() {
        startField("tags");

        return this;
    }

    /**
    * Whether taxes are exempt on the order.
    */
    public OrderQuery taxExempt() {
        startField("taxExempt");

        return this;
    }

    /**
    * A list of all tax lines applied to line items on the order, before returns.
    * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
    */
    public OrderQuery taxLines(TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether taxes are included in the subtotal price of the order.
    */
    public OrderQuery taxesIncluded() {
        startField("taxesIncluded");

        return this;
    }

    /**
    * Whether the order is a test.
    * Test orders are made using the Shopify Bogus Gateway or a payment provider with test mode enabled.
    * A test order can't be converted into a real order and vice versa.
    */
    public OrderQuery test() {
        startField("test");

        return this;
    }

    /**
    * The authorized amount that's uncaptured or undercaptured, in shop and presentment currencies.
    * This amount isn't adjusted for returns.
    */
    public OrderQuery totalCapturableSet(MoneyBagQueryDefinition queryDef) {
        startField("totalCapturableSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total rounding adjustment applied to payments or refunds for an Order involving cash payments.
    * Applies to some countries where cash transactions are rounded to the nearest currency denomination.
    */
    public OrderQuery totalCashRoundingAdjustment(CashRoundingAdjustmentQueryDefinition queryDef) {
        startField("totalCashRoundingAdjustment");

        _queryBuilder.append('{');
        queryDef.define(new CashRoundingAdjustmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount discounted on the order before returns, in shop and presentment currencies.
    * This includes both order and line level discounts.
    */
    public OrderQuery totalDiscountsSet(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountsSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount not yet transacted for the order, in shop and presentment currencies.
    * A positive value indicates a difference in the merchant's favor (payment from customer to merchant)
    * and a negative value indicates a difference in the customer's favor (refund from merchant to
    * customer).
    */
    public OrderQuery totalOutstandingSet(MoneyBagQueryDefinition queryDef) {
        startField("totalOutstandingSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total price of the order, before returns, in shop and presentment currencies.
    * This includes taxes and discounts.
    */
    public OrderQuery totalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount received from the customer before returns, in shop and presentment currencies.
    */
    public OrderQuery totalReceivedSet(MoneyBagQueryDefinition queryDef) {
        startField("totalReceivedSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount that was refunded, in shop and presentment currencies.
    */
    public OrderQuery totalRefundedSet(MoneyBagQueryDefinition queryDef) {
        startField("totalRefundedSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount of shipping that was refunded, in shop and presentment currencies.
    */
    public OrderQuery totalRefundedShippingSet(MoneyBagQueryDefinition queryDef) {
        startField("totalRefundedShippingSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total shipping amount before discounts and returns, in shop and presentment currencies.
    */
    public OrderQuery totalShippingPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalShippingPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total tax amount before returns, in shop and presentment currencies.
    */
    public OrderQuery totalTaxSet(MoneyBagQueryDefinition queryDef) {
        startField("totalTaxSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of all tip amounts for the order, in shop and presentment currencies.
    */
    public OrderQuery totalTipReceivedSet(MoneyBagQueryDefinition queryDef) {
        startField("totalTipReceivedSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total weight of the order before returns, in grams.
    */
    public OrderQuery totalWeight() {
        startField("totalWeight");

        return this;
    }

    public class TransactionsArguments extends Arguments {
        TransactionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Truncate the array result to this size.
        */
        public TransactionsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Filter transactions by whether they are capturable.
        */
        public TransactionsArguments capturable(Boolean value) {
            if (value != null) {
                startArgument("capturable");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Filter transactions by whether they can be resolved manually.
        * For example, fully captured or voided transactions aren't manually resolvable.
        */
        public TransactionsArguments manuallyResolvable(Boolean value) {
            if (value != null) {
                startArgument("manuallyResolvable");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface TransactionsArgumentsDefinition {
        void define(TransactionsArguments args);
    }

    /**
    * A list of transactions associated with the order.
    */
    public OrderQuery transactions(OrderTransactionQueryDefinition queryDef) {
        return transactions(args -> {}, queryDef);
    }

    /**
    * A list of transactions associated with the order.
    */
    public OrderQuery transactions(TransactionsArgumentsDefinition argsDef, OrderTransactionQueryDefinition queryDef) {
        startField("transactions");

        TransactionsArguments args = new TransactionsArguments(_queryBuilder);
        argsDef.define(args);
        TransactionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of transactions associated with the order.
    */
    public OrderQuery transactionsCount(CountQueryDefinition queryDef) {
        startField("transactionsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether no payments have been made for the order.
    */
    public OrderQuery unpaid() {
        startField("unpaid");

        return this;
    }

    /**
    * The date and time when the order was modified last.
    */
    public OrderQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
