// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* The `Order` object represents a customer's request to purchase one or more products from a store.
* Use the `Order` object to handle the complete purchase lifecycle from checkout to fulfillment.
* Use the `Order` object when you need to:
* - Display order details on customer account pages or admin dashboards.
* - Create orders for phone sales, wholesale customers, or subscription services.
* - Update order information like shipping addresses, notes, or fulfillment status.
* - Process returns, exchanges, and partial refunds.
* - Generate invoices, receipts, and shipping labels.
* The `Order` object serves as the central hub connecting customer information, product details,
* payment processing, and fulfillment data within the GraphQL Admin API schema.
* > Note:
* > Only the last 60 days' worth of orders from a store are accessible from the `Order` object by
* default. If you want to access older records,
* > then you need to [request access to all
* orders](https://shopify.dev/docs/api/usage/access-scopes#orders-permissions). If your app is granted
* > access, then you can add the `read_all_orders`, `read_orders`, and `write_orders` scopes.
* > Caution:
* > Only use orders data if it's required for your app's functionality. Shopify will restrict [access
* to scopes](https://shopify.dev/docs/api/usage/access-scopes#requesting-specific-permissions) for
* apps that don't have a legitimate use for the associated data.
* Learn more about [building apps for orders and
* fulfillment](https://shopify.dev/docs/apps/build/orders-fulfillment).
*/
public class OrderQuery extends Query<OrderQuery> {
    OrderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A list of additional fees applied to an order, such as duties, import fees, or [tax
    * lines](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.additional
    * Fees.taxLines).
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
    * A list of sales agreements associated with the order, such as contracts defining payment terms, or
    * delivery schedules between merchants and customers.
    */
    public OrderQuery agreements(SalesAgreementConnectionQueryDefinition queryDef) {
        return agreements(args -> {}, queryDef);
    }

    /**
    * A list of sales agreements associated with the order, such as contracts defining payment terms, or
    * delivery schedules between merchants and customers.
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
    * A list of messages that appear on the **Orders** page in the Shopify admin. These alerts provide
    * merchants with important information about an order's status or required actions.
    */
    public OrderQuery alerts(ResourceAlertQueryDefinition queryDef) {
        startField("alerts");

        _queryBuilder.append('{');
        queryDef.define(new ResourceAlertQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The application that created the order. For example, "Online Store", "Point of Sale", or a custom
    * app name.
    * Use this to identify the order source for attribution and fulfillment workflows.
    * Learn more about [building apps for orders and
    * fulfillment](https://shopify.dev/docs/apps/build/orders-fulfillment).
    */
    public OrderQuery app(OrderAppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new OrderAppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The billing address associated with the payment method selected by the customer for an order.
    * Returns `null` if no billing address was provided during checkout.
    */
    public OrderQuery billingAddress(MailingAddressQueryDefinition queryDef) {
        startField("billingAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the billing address matches the [shipping
    * address](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.shipping
    * Address). Returns `true` if both addresses are the same, and `false` if they're different or if an
    * address is missing.
    */
    public OrderQuery billingAddressMatchesShippingAddress() {
        startField("billingAddressMatchesShippingAddress");

        return this;
    }

    /**
    * Whether an order can be manually marked as paid. Returns `false` if the order is already paid, is
    * canceled, has pending [Shopify
    * Payments](https://help.shopify.com/en/manual/payments/shopify-payments/payouts) transactions, or has
    * a negative payment amount.
    */
    public OrderQuery canMarkAsPaid() {
        startField("canMarkAsPaid");

        return this;
    }

    /**
    * Whether order notifications can be sent to the customer.
    * Returns `true` if the customer has a valid [email
    * address](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.email).
    */
    public OrderQuery canNotifyCustomer() {
        startField("canNotifyCustomer");

        return this;
    }

    /**
    * The reason provided for an order cancellation. For example, a merchant might cancel an order if
    * there's insufficient inventory. Returns `null` if the order hasn't been canceled.
    */
    public OrderQuery cancelReason() {
        startField("cancelReason");

        return this;
    }

    /**
    * Details of an order's cancellation, if it has been canceled. This includes the reason, date, and any
    * [staff
    * notes](https://shopify.dev/api/admin-graphql/latest/objects/OrderCancellation#field-OrderCancellatio
    * n.fields.staffNote).
    */
    public OrderQuery cancellation(OrderCancellationQueryDefinition queryDef) {
        startField("cancellation");

        _queryBuilder.append('{');
        queryDef.define(new OrderCancellationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when an order was
    * canceled.
    * Returns `null` if the order hasn't been canceled.
    */
    public OrderQuery cancelledAt() {
        startField("cancelledAt");

        return this;
    }

    /**
    * Whether an authorized payment for an order can be captured.
    * Returns `true` if an authorized payment exists that hasn't been fully captured yet. Learn more about
    * [capturing
    * payments](https://help.shopify.com/en/manual/fulfillment/managing-orders/payments/capturing-payments
    * ).
    */
    public OrderQuery capturable() {
        startField("capturable");

        return this;
    }

    /**
    * The total discount amount applied at the time the order was created, displayed in both shop and
    * presentment currencies, before returns, refunds, order edits, and cancellations. This field only
    * includes discounts applied to the entire order.
    */
    public OrderQuery cartDiscountAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("cartDiscountAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Details about the sales channel that created the order, such as the [channel app
    * type](https://shopify.dev/docs/api/admin-graphql/latest/objects/channel#field-Channel.fields.channel
    * Type)
    * and [channel
    * name](https://shopify.dev/docs/api/admin-graphql/latest/objects/ChannelDefinition#field-ChannelDefin
    * ition.fields.channelName), which helps to track order sources.
    */
    public OrderQuery channelInformation(ChannelInformationQueryDefinition queryDef) {
        startField("channelInformation");

        _queryBuilder.append('{');
        queryDef.define(new ChannelInformationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The IP address of the customer who placed the order. Useful for fraud detection and geographic
    * analysis.
    */
    public OrderQuery clientIp() {
        startField("clientIp");

        return this;
    }

    /**
    * Whether an order is closed. An order is considered closed if all its line items have been fulfilled
    * or canceled, and all financial transactions are complete.
    */
    public OrderQuery closed() {
        startField("closed");

        return this;
    }

    /**
    * The date and time [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when an order was
    * closed. Shopify automatically records this timestamp when all items have been fulfilled or canceled,
    * and all financial transactions are complete. Returns `null` if the order isn't closed.
    */
    public OrderQuery closedAt() {
        startField("closedAt");

        return this;
    }

    /**
    * A customer-facing order identifier, often shown instead of the sequential order name.
    * It uses a random alphanumeric format (for example, `XPAV284CT`) and isn't guaranteed to be unique
    * across orders.
    */
    public OrderQuery confirmationNumber() {
        startField("confirmationNumber");

        return this;
    }

    /**
    * Whether inventory has been reserved for an order. Returns `true` if inventory quantities for an
    * order's [line items](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem) have been
    * reserved.
    * Learn more about [managing inventory quantities and
    * states](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quan
    * tities-states).
    */
    public OrderQuery confirmed() {
        startField("confirmed");

        return this;
    }

    /**
    * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when an order was
    * created. This timestamp is set when the customer completes checkout and remains unchanged throughout
    * an order's lifecycle.
    */
    public OrderQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The shop currency when the order was placed. For example, "USD" or "CAD".
    */
    public OrderQuery currencyCode() {
        startField("currencyCode");

        return this;
    }

    /**
    * The current total of all discounts applied to the entire order, after returns, refunds, order edits,
    * and cancellations. This includes discount codes, automatic discounts, and other promotions that
    * affect the whole order rather than individual line items. To get the original discount amount at the
    * time of order creation, use the
    * [`cartDiscountAmountSet`](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Orde
    * r.fields.cartDiscountAmountSet) field.
    */
    public OrderQuery currentCartDiscountAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("currentCartDiscountAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The current shipping price after applying refunds and discounts.
    * If the parent `order.taxesIncluded` field is true, then this price includes taxes. Otherwise, this
    * field is the pre-tax price.
    */
    public OrderQuery currentShippingPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("currentShippingPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The current sum of the quantities for all line items that contribute to the order's subtotal price,
    * after returns, refunds, order edits, and cancellations.
    */
    public OrderQuery currentSubtotalLineItemsQuantity() {
        startField("currentSubtotalLineItemsQuantity");

        return this;
    }

    /**
    * The total price of the order, after returns and refunds, in shop and presentment currencies.
    * This includes taxes and discounts.
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
    * The current total of all additional fees for an order, after any returns or modifications.
    * Modifications include returns, refunds, order edits, and cancellations. Additional fees can include
    * charges such as duties, import fees, and special handling.
    */
    public OrderQuery currentTotalAdditionalFeesSet(MoneyBagQueryDefinition queryDef) {
        startField("currentTotalAdditionalFeesSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount discounted on the order after returns and refunds, in shop and presentment
    * currencies.
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
    * The current total duties amount for an order, after any returns or modifications. Modifications
    * include returns, refunds, order edits, and cancellations.
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
    * The sum of the prices of all tax lines applied to line items on the order, after returns and
    * refunds, in shop and presentment currencies.
    */
    public OrderQuery currentTotalTaxSet(MoneyBagQueryDefinition queryDef) {
        startField("currentTotalTaxSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total weight of the order after returns and refunds, in grams.
    */
    public OrderQuery currentTotalWeight() {
        startField("currentTotalWeight");

        return this;
    }

    /**
    * A list of additional information that has been attached to the order. For example, gift message,
    * delivery instructions, or internal notes.
    */
    public OrderQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customer who placed an order. Returns `null` if an order was created through a checkout without
    * customer authentication, such as a guest checkout.
    * Learn more about [customer accounts](https://help.shopify.com/manual/customers/customer-accounts).
    */
    public OrderQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the customer agreed to receive marketing emails at the time of purchase.
    * Use this to ensure compliance with marketing consent laws and to segment customers for email
    * campaigns.
    * Learn more about [building customer
    * segments](https://shopify.dev/docs/apps/build/marketing-analytics/customer-segments).
    */
    public OrderQuery customerAcceptsMarketing() {
        startField("customerAcceptsMarketing");

        return this;
    }

    /**
    * The customer's visits and interactions with the online store before placing the order.
    * Use this to understand customer behavior, attribution sources, and marketing effectiveness to
    * optimize your sales funnel.
    */
    public OrderQuery customerJourneySummary(CustomerJourneySummaryQueryDefinition queryDef) {
        startField("customerJourneySummary");

        _queryBuilder.append('{');
        queryDef.define(new CustomerJourneySummaryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customer's language and region preference at the time of purchase. For example, "en" for
    * English, "fr-CA" for French (Canada), or "es-MX" for Spanish (Mexico).
    * Use this to provide localized customer service and targeted marketing in the customer's preferred
    * language.
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
    * A list of discounts that are applied to the order, excluding order edits and refunds.
    * Includes discount codes, automatic discounts, and other promotions that reduce the order total.
    */
    public OrderQuery discountApplications(DiscountApplicationConnectionQueryDefinition queryDef) {
        return discountApplications(args -> {}, queryDef);
    }

    /**
    * A list of discounts that are applied to the order, excluding order edits and refunds.
    * Includes discount codes, automatic discounts, and other promotions that reduce the order total.
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
    * The discount code used for an order. Returns `null` if no discount code was applied.
    */
    public OrderQuery discountCode() {
        startField("discountCode");

        return this;
    }

    /**
    * The discount codes used for the order. Multiple codes can be applied to a single order.
    */
    public OrderQuery discountCodes() {
        startField("discountCodes");

        return this;
    }

    /**
    * The primary address of the customer, prioritizing shipping address over billing address when both
    * are available.
    * Returns `null` if neither shipping address nor billing address was provided.
    */
    public OrderQuery displayAddress(MailingAddressQueryDefinition queryDef) {
        startField("displayAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An order's financial status for display in the Shopify admin.
    */
    public OrderQuery displayFinancialStatus() {
        startField("displayFinancialStatus");

        return this;
    }

    /**
    * The order's fulfillment status that displays in the Shopify admin to merchants. For example, an
    * order might be unfulfilled or scheduled.
    * For detailed processing, use the
    * [`FulfillmentOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder)
    * object.
    */
    public OrderQuery displayFulfillmentStatus() {
        startField("displayFulfillmentStatus");

        return this;
    }

    /**
    * A list of payment disputes associated with the order, such as chargebacks or payment inquiries.
    * Disputes occur when customers challenge transactions with their bank or payment provider.
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
    * Duties are import taxes charged by customs authorities when goods cross international borders.
    */
    public OrderQuery dutiesIncluded() {
        startField("dutiesIncluded");

        return this;
    }

    /**
    * Whether the order has had any edits applied. For example, adding or removing line items, updating
    * quantities, or changing prices.
    */
    public OrderQuery edited() {
        startField("edited");

        return this;
    }

    /**
    * The email address associated with the customer for this order.
    * Used for sending order confirmations, shipping notifications, and other order-related
    * communications.
    * Returns `null` if no email address was provided during checkout.
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
    * A list of events associated with the order. Events track significant changes and activities related
    * to the order, such as creation, payment, fulfillment, and cancellation.
    */
    public OrderQuery events(EventConnectionQueryDefinition queryDef) {
        return events(args -> {}, queryDef);
    }

    /**
    * A list of events associated with the order. Events track significant changes and activities related
    * to the order, such as creation, payment, fulfillment, and cancellation.
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
    * A list of [fulfillment
    * orders](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/fulfillment-order) for an
    * order. Each fulfillment order groups [line
    * items](https://shopify.dev/api/admin-graphql/latest/objects/OrderLineItem) that are fulfilled
    * together,
    * allowing an order to be processed in parts if needed.
    */
    public OrderQuery fulfillmentOrders(FulfillmentOrderConnectionQueryDefinition queryDef) {
        return fulfillmentOrders(args -> {}, queryDef);
    }

    /**
    * A list of [fulfillment
    * orders](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/fulfillment-order) for an
    * order. Each fulfillment order groups [line
    * items](https://shopify.dev/api/admin-graphql/latest/objects/OrderLineItem) that are fulfilled
    * together,
    * allowing an order to be processed in parts if needed.
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

        /**
        * Optional query string to filter fulfillments by timestamps. Examples:
        * `created_at:>='2024-05-07T08:37:00Z' updated_at:<'2025-05-07T08:37:00Z'`,
        * `created_at:'2024-05-07T08:37:00Z'`
        */
        public FulfillmentsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface FulfillmentsArgumentsDefinition {
        void define(FulfillmentsArguments args);
    }

    /**
    * A list of shipments for the order. Fulfillments represent the physical shipment of products to
    * customers.
    */
    public OrderQuery fulfillments(FulfillmentQueryDefinition queryDef) {
        return fulfillments(args -> {}, queryDef);
    }

    /**
    * A list of shipments for the order. Fulfillments represent the physical shipment of products to
    * customers.
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
    * The total number of fulfillments for the order, including canceled ones.
    */
    public OrderQuery fulfillmentsCount(CountQueryDefinition queryDef) {
        startField("fulfillmentsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the order has been paid in full. This field returns `true` when the total amount received
    * equals or exceeds the order total.
    */
    public OrderQuery fullyPaid() {
        startField("fullyPaid");

        return this;
    }

    /**
    * Whether the merchant has added a timeline comment to the order.
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
    * A list of the order's line items. Line items represent the individual products and quantities that
    * make up the order.
    */
    public OrderQuery lineItems(LineItemConnectionQueryDefinition queryDef) {
        return lineItems(args -> {}, queryDef);
    }

    /**
    * A list of the order's line items. Line items represent the individual products and quantities that
    * make up the order.
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
    * The legal business structure that the merchant operates under for this order, such as an LLC,
    * corporation, or partnership.
    * Used for tax reporting, legal compliance, and determining which business entity is responsible for
    * the order.
    */
    public OrderQuery merchantBusinessEntity(BusinessEntityQueryDefinition queryDef) {
        startField("merchantBusinessEntity");

        _queryBuilder.append('{');
        queryDef.define(new BusinessEntityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the order can be edited by the merchant. Returns `false` for orders that can't be modified,
    * such as canceled orders or orders with specific payment statuses.
    */
    public OrderQuery merchantEditable() {
        startField("merchantEditable");

        return this;
    }

    /**
    * A list of reasons why the order can't be edited. For example, canceled orders can't be edited.
    */
    public OrderQuery merchantEditableErrors() {
        startField("merchantEditableErrors");

        return this;
    }

    /**
    * The application acting as the Merchant of Record for the order. The Merchant of Record is
    * responsible for tax collection and remittance.
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
    * **Order status** page.
    * For example, "#1001", "EN1001", or "1001-A".
    * This value isn't unique across multiple stores. Use this field to identify orders in the Shopify
    * admin and for order tracking.
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
    * The note associated with the order.
    * Contains additional information or instructions added by merchants or customers during the order
    * process.
    * Commonly used for special delivery instructions, gift messages, or internal processing notes.
    */
    public OrderQuery note() {
        startField("note");

        return this;
    }

    /**
    * The order number used to generate the name using the store's configured order number prefix/suffix.
    * This number isn't guaranteed to follow a consecutive integer sequence (e.g. 1, 2, 3..), nor is it
    * guaranteed to be unique across multiple stores, or even for a single store.
    */
    public OrderQuery number() {
        startField("number");

        return this;
    }

    /**
    * The total amount of all additional fees, such as import fees or taxes, that were applied when an
    * order was created.
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
    * The total amount of duties calculated when an order was created, before any modifications.
    * Modifications include returns, refunds, order edits, and cancellations. Use
    * [`currentTotalDutiesSet`](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Orde
    * r.fields.currentTotalDutiesSet) to retrieve the current duties amount after adjustments.
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
    * Use this to compare the original order value against the current total after edits, returns, or
    * refunds.
    */
    public OrderQuery originalTotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("originalTotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The payment collection details for the order, including payment status, outstanding amounts, and
    * collection information.
    * Use this to understand when and how payments should be collected, especially for orders with
    * deferred or installment payment terms.
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
    * The payment terms associated with the order, such as net payment due dates or early payment
    * discounts. Payment terms define when and how an order should be paid. Returns `null` if no specific
    * payment terms were set for the order.
    */
    public OrderQuery paymentTerms(PaymentTermsQueryDefinition queryDef) {
        startField("paymentTerms");

        _queryBuilder.append('{');
        queryDef.define(new PaymentTermsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The phone number associated with the customer for this order.
    * Useful for contacting customers about shipping updates, delivery notifications, or order issues.
    * Returns `null` if no phone number was provided during checkout.
    */
    public OrderQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The purchase order (PO) number that's associated with an order.
    * This is typically provided by business customers who require a PO number for their procurement.
    */
    public OrderQuery poNumber() {
        startField("poNumber");

        return this;
    }

    /**
    * The currency used by the customer when placing the order. For example, "USD", "EUR", or "CAD".
    * This may differ from the shop's base currency when serving international customers or using
    * multi-currency pricing.
    */
    public OrderQuery presentmentCurrencyCode() {
        startField("presentmentCurrencyCode");

        return this;
    }

    /**
    * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when the order was
    * processed.
    * This date and time might not match the date and time when the order was created.
    */
    public OrderQuery processedAt() {
        startField("processedAt");

        return this;
    }

    /**
    * The sales channel that the order was created from, such as the [Online
    * Store](https://shopify.dev/docs/apps/build/app-surfaces#online-store) or [Shopify
    * POS](https://shopify.dev/docs/apps/build/app-surfaces#point-of-sale).
    */
    public OrderQuery publication(PublicationQueryDefinition queryDef) {
        startField("publication");

        _queryBuilder.append('{');
        queryDef.define(new PublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The business entity that placed the order, including company details and purchasing relationships.
    * Used for B2B transactions to track which company or organization is responsible for the purchase and
    * payment terms.
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
    * to the order.
    * A positive value indicates a difference in the merchant's favor, and a negative value indicates a
    * difference in the customer's favor.
    */
    public OrderQuery refundDiscrepancySet(MoneyBagQueryDefinition queryDef) {
        startField("refundDiscrepancySet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the order can be refunded based on its payment transactions.
    * Returns `false` for orders with no eligible payment transactions, such as fully refunded orders or
    * orders with non-refundable payment methods.
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
    * Refunds represent money returned to customers for returned items, cancellations, or adjustments.
    */
    public OrderQuery refunds(RefundQueryDefinition queryDef) {
        return refunds(args -> {}, queryDef);
    }

    /**
    * A list of refunds that have been applied to the order.
    * Refunds represent money returned to customers for returned items, cancellations, or adjustments.
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
    * The URL of the source that the order originated from, if found in the domain registry. Returns
    * `null` if the source URL isn't in the domain registry.
    */
    public OrderQuery registeredSourceUrl() {
        startField("registeredSourceUrl");

        return this;
    }

    /**
    * Whether the order requires physical shipping to the customer.
    * Returns `false` for digital-only orders (such as gift cards or downloadable products) and `true` for
    * orders with physical products that need delivery.
    * Use this to determine shipping workflows and logistics requirements.
    */
    public OrderQuery requiresShipping() {
        startField("requiresShipping");

        return this;
    }

    /**
    * Whether any line items on the order can be restocked into inventory.
    * Returns `false` for digital products, custom items, or items that can't be resold.
    */
    public OrderQuery restockable() {
        startField("restockable");

        return this;
    }

    /**
    * The physical location where a retail order is created or completed, except for draft POS orders
    * completed using the "mark as paid" flow in the Shopify admin, which return `null`. Transactions
    * associated with the order might have been processed at a different location.
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
    * Indicates the overall state of returns for the order, helping merchants track and manage the return
    * process.
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
    * The returns associated with the order.
    * Contains information about items that customers have requested to return, including return reasons,
    * status, and refund details.
    * Use this to track and manage the return process for order items.
    */
    public OrderQuery returns(ReturnConnectionQueryDefinition queryDef) {
        return returns(args -> {}, queryDef);
    }

    /**
    * The returns associated with the order.
    * Contains information about items that customers have requested to return, including return reasons,
    * status, and refund details.
    * Use this to track and manage the return process for order items.
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
    * The risk assessment summary for the order.
    * Provides fraud analysis and risk scoring to help you identify potentially fraudulent orders.
    * Use this to make informed decisions about order fulfillment and payment processing.
    */
    public OrderQuery risk(OrderRiskSummaryQueryDefinition queryDef) {
        startField("risk");

        _queryBuilder.append('{');
        queryDef.define(new OrderRiskSummaryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shipping address where the order will be delivered.
    * Contains the customer's delivery location for fulfillment and shipping label generation.
    * Returns `null` for digital orders or orders that don't require shipping.
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
    * Aggregates shipping charges, discounts, and taxes to provide a single view of delivery costs.
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
    * The shipping methods applied to the order.
    * Each shipping line represents a shipping option chosen during checkout, including the carrier,
    * service level, and cost.
    * Use this to understand shipping charges and delivery options for the order.
    */
    public OrderQuery shippingLines(ShippingLineConnectionQueryDefinition queryDef) {
        return shippingLines(args -> {}, queryDef);
    }

    /**
    * The shipping methods applied to the order.
    * Each shipping line represents a shipping option chosen during checkout, including the carrier,
    * service level, and cost.
    * Use this to understand shipping charges and delivery options for the order.
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
    * The Shopify Protect details for the order, including fraud protection status and coverage
    * information.
    * Shopify Protect helps protect eligible orders against fraudulent chargebacks.
    * Returns `null` if Shopify Protect is disabled for the shop or the order isn't eligible for
    * protection.
    * Learn more about [Shopify Protect](https://www.shopify.com/protect).
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
    * For example, "1234-12-1000" or "111-98567-54". The
    * [`receiptNumber`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-receiptNumbe
    * r) field is derived from this value for POS orders.
    */
    public OrderQuery sourceIdentifier() {
        startField("sourceIdentifier");

        return this;
    }

    /**
    * The name of the source associated with the order, such as "web", "mobile_app", or "pos". Use this
    * field to identify the platform where the order was placed.
    */
    public OrderQuery sourceName() {
        startField("sourceName");

        return this;
    }

    /**
    * The staff member who created or is responsible for the order.
    * Useful for tracking which team member handled phone orders, manual orders, or order modifications.
    * Returns `null` for orders created directly by customers through the online store.
    */
    public OrderQuery staffMember(StaffMemberQueryDefinition queryDef) {
        startField("staffMember");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class StatusPageUrlArguments extends Arguments {
        StatusPageUrlArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Specifies the intended audience for the status page URL.
        */
        public StatusPageUrlArguments audience(Audience value) {
            if (value != null) {
                startArgument("audience");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * Specifies the intended notification usage for the status page URL.
        */
        public StatusPageUrlArguments notificationUsage(NotificationUsage value) {
            if (value != null) {
                startArgument("notificationUsage");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface StatusPageUrlArgumentsDefinition {
        void define(StatusPageUrlArguments args);
    }

    /**
    * The URL where customers can check their order's current status, including tracking information and
    * delivery updates.
    * Provides order tracking links in emails, apps, or customer communications.
    */
    public OrderQuery statusPageUrl() {
        return statusPageUrl(args -> {});
    }

    /**
    * The URL where customers can check their order's current status, including tracking information and
    * delivery updates.
    * Provides order tracking links in emails, apps, or customer communications.
    */
    public OrderQuery statusPageUrl(StatusPageUrlArgumentsDefinition argsDef) {
        startField("statusPageUrl");

        StatusPageUrlArguments args = new StatusPageUrlArguments(_queryBuilder);
        argsDef.define(args);
        StatusPageUrlArguments.end(args);

        return this;
    }

    /**
    * The sum of quantities for all line items that contribute to the order's subtotal price.
    * This excludes quantities for items like tips, shipping costs, or gift cards that don't affect the
    * subtotal.
    * Use this to quickly understand the total item count for pricing calculations.
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

        /**
        * Specifies which refund methods to allocate the suggested refund amount to.
        */
        public SuggestedRefundArguments refundMethodAllocation(RefundMethodAllocation value) {
            if (value != null) {
                startArgument("refundMethodAllocation");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface SuggestedRefundArgumentsDefinition {
        void define(SuggestedRefundArguments args);
    }

    /**
    * A calculated refund suggestion for the order based on specified line items, shipping, and duties.
    * Use this to preview refund amounts, taxes, and processing fees before creating an actual refund.
    */
    public OrderQuery suggestedRefund(SuggestedRefundQueryDefinition queryDef) {
        return suggestedRefund(args -> {}, queryDef);
    }

    /**
    * A calculated refund suggestion for the order based on specified line items, shipping, and duties.
    * Use this to preview refund amounts, taxes, and processing fees before creating an actual refund.
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
    * Returns `true` for orders where the customer or business has a valid tax exemption, such as
    * non-profit organizations or tax-free purchases.
    * Use this to understand if tax calculations were skipped during checkout.
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
    * When `true`, the subtotal and line item prices include tax amounts. When `false`, taxes are
    * calculated and displayed separately.
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
    * The total rounding adjustment applied to payments or refunds for an order involving cash payments.
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
    * The total shipping costs returned to the customer, in shop and presentment currencies. This includes
    * fees and any related discounts that were refunded.
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
    * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when the order was
    * last modified.
    */
    public OrderQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
