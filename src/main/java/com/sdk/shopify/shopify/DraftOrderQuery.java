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
* An order that a merchant creates on behalf of a customer. Draft orders are useful for merchants that
* need to do the following tasks:
* - Create new orders for sales made by phone, in person, by chat, or elsewhere. When a merchant
* accepts payment for a draft order, an order is created.
* - Send invoices to customers to pay with a secure checkout link.
* - Use custom items to represent additional costs or products that aren't displayed in a shop's
* inventory.
* - Re-create orders manually from active sales channels.
* - Sell products at discount or wholesale rates.
* - Take pre-orders.
* - Save an order as a draft and resume working on it later.
* For draft orders in multiple currencies `presentment_money` is the source of truth for what a
* customer is going to be charged and `shop_money` is an estimate of what the merchant might receive
* in their shop currency.
* **Caution:** Only use this data if it's required for your app's functionality. Shopify will restrict
* [access to scopes](https://shopify.dev/api/usage/access-scopes) for apps that don't have a
* legitimate use for the associated data.
*/
public class DraftOrderQuery extends Query<DraftOrderQuery> {
    DraftOrderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Whether or not to accept automatic discounts on the draft order during calculation.
    * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be
    * applied.
    * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft
    * order discounts.
    */
    public DraftOrderQuery acceptAutomaticDiscounts() {
        startField("acceptAutomaticDiscounts");

        return this;
    }

    /**
    * Whether all variant prices have been overridden.
    */
    public DraftOrderQuery allVariantPricesOverridden() {
        startField("allVariantPricesOverridden");

        return this;
    }

    /**
    * Whether discount codes are allowed during checkout of this draft order.
    */
    public DraftOrderQuery allowDiscountCodesInCheckout() {
        startField("allowDiscountCodesInCheckout");

        return this;
    }

    /**
    * Whether any variant prices have been overridden.
    */
    public DraftOrderQuery anyVariantPricesOverridden() {
        startField("anyVariantPricesOverridden");

        return this;
    }

    /**
    * The custom order-level discount applied.
    */
    public DraftOrderQuery appliedDiscount(DraftOrderAppliedDiscountQueryDefinition queryDef) {
        startField("appliedDiscount");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderAppliedDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The billing address of the customer.
    */
    public DraftOrderQuery billingAddress(MailingAddressQueryDefinition queryDef) {
        startField("billingAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the billing address matches the shipping address.
    */
    public DraftOrderQuery billingAddressMatchesShippingAddress() {
        startField("billingAddressMatchesShippingAddress");

        return this;
    }

    /**
    * The date and time when the draft order was converted to a new order,
    * and had it's status changed to **Completed**.
    */
    public DraftOrderQuery completedAt() {
        startField("completedAt");

        return this;
    }

    /**
    * The date and time when the draft order was created in Shopify.
    */
    public DraftOrderQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The shop currency used for calculation.
    */
    public DraftOrderQuery currencyCode() {
        startField("currencyCode");

        return this;
    }

    /**
    * The custom information added to the draft order on behalf of the customer.
    */
    public DraftOrderQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customer who will be sent an invoice.
    */
    public DraftOrderQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */
    public DraftOrderQuery defaultCursor() {
        startField("defaultCursor");

        return this;
    }

    /**
    * All discount codes applied.
    */
    public DraftOrderQuery discountCodes() {
        startField("discountCodes");

        return this;
    }

    /**
    * The email address of the customer, which is used to send notifications.
    */
    public DraftOrderQuery email() {
        startField("email");

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
    * The list of events associated with the draft order.
    */
    public DraftOrderQuery events(EventConnectionQueryDefinition queryDef) {
        return events(args -> {}, queryDef);
    }

    /**
    * The list of events associated with the draft order.
    */
    public DraftOrderQuery events(EventsArgumentsDefinition argsDef, EventConnectionQueryDefinition queryDef) {
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
    * Whether the merchant has added timeline comments to the draft order.
    */
    public DraftOrderQuery hasTimelineComment() {
        startField("hasTimelineComment");

        return this;
    }

    /**
    * The subject defined for the draft invoice email template.
    */
    public DraftOrderQuery invoiceEmailTemplateSubject() {
        startField("invoiceEmailTemplateSubject");

        return this;
    }

    /**
    * The date and time when the invoice was last emailed to the customer.
    */
    public DraftOrderQuery invoiceSentAt() {
        startField("invoiceSentAt");

        return this;
    }

    /**
    * The link to the checkout, which is sent to the customer in the invoice email.
    */
    public DraftOrderQuery invoiceUrl() {
        startField("invoiceUrl");

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public DraftOrderQuery legacyResourceId() {
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
    * The list of the line items in the draft order.
    */
    public DraftOrderQuery lineItems(DraftOrderLineItemConnectionQueryDefinition queryDef) {
        return lineItems(args -> {}, queryDef);
    }

    /**
    * The list of the line items in the draft order.
    */
    public DraftOrderQuery lineItems(LineItemsArgumentsDefinition argsDef, DraftOrderLineItemConnectionQueryDefinition queryDef) {
        startField("lineItems");

        LineItemsArguments args = new LineItemsArguments(_queryBuilder);
        argsDef.define(args);
        LineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderLineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A subtotal of the line items and corresponding discounts,
    * excluding include shipping charges, shipping discounts, taxes, or order discounts.
    */
    public DraftOrderQuery lineItemsSubtotalPrice(MoneyBagQueryDefinition queryDef) {
        startField("lineItemsSubtotalPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
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
    public DraftOrderQuery localizedFields(LocalizedFieldConnectionQueryDefinition queryDef) {
        return localizedFields(args -> {}, queryDef);
    }

    /**
    * List of localized fields for the resource.
    */
    public DraftOrderQuery localizedFields(LocalizedFieldsArgumentsDefinition argsDef, LocalizedFieldConnectionQueryDefinition queryDef) {
        startField("localizedFields");

        LocalizedFieldsArguments args = new LocalizedFieldsArguments(_queryBuilder);
        argsDef.define(args);
        LocalizedFieldsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocalizedFieldConnectionQuery(_queryBuilder));
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
    public DraftOrderQuery metafield(String key, MetafieldQueryDefinition queryDef) {
        return metafield(key, args -> {}, queryDef);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public DraftOrderQuery metafield(String key, MetafieldArgumentsDefinition argsDef, MetafieldQueryDefinition queryDef) {
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
    public DraftOrderQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public DraftOrderQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
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
    * The identifier for the draft order, which is unique within the store. For example, _#D1223_.
    */
    public DraftOrderQuery name() {
        startField("name");

        return this;
    }

    /**
    * The text from an optional note attached to the draft order.
    */
    public DraftOrderQuery note2() {
        startField("note2");

        return this;
    }

    /**
    * The order that was created from the draft order.
    */
    public DraftOrderQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The associated payment terms for this draft order.
    */
    public DraftOrderQuery paymentTerms(PaymentTermsQueryDefinition queryDef) {
        startField("paymentTerms");

        _queryBuilder.append('{');
        queryDef.define(new PaymentTermsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The assigned phone number.
    */
    public DraftOrderQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The list of platform discounts applied.
    */
    public DraftOrderQuery platformDiscounts(DraftOrderPlatformDiscountQueryDefinition queryDef) {
        startField("platformDiscounts");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderPlatformDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The purchase order number.
    */
    public DraftOrderQuery poNumber() {
        startField("poNumber");

        return this;
    }

    /**
    * The payment currency used for calculation.
    */
    public DraftOrderQuery presentmentCurrencyCode() {
        startField("presentmentCurrencyCode");

        return this;
    }

    /**
    * The purchasing entity.
    */
    public DraftOrderQuery purchasingEntity(PurchasingEntityQueryDefinition queryDef) {
        startField("purchasingEntity");

        _queryBuilder.append('{');
        queryDef.define(new PurchasingEntityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the draft order is ready and can be completed.
    * Draft orders might have asynchronous operations that can take time to finish.
    */
    public DraftOrderQuery ready() {
        startField("ready");

        return this;
    }

    /**
    * The time after which inventory will automatically be restocked.
    */
    public DraftOrderQuery reserveInventoryUntil() {
        startField("reserveInventoryUntil");

        return this;
    }

    /**
    * The shipping address of the customer.
    */
    public DraftOrderQuery shippingAddress(MailingAddressQueryDefinition queryDef) {
        startField("shippingAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The line item containing the shipping information and costs.
    */
    public DraftOrderQuery shippingLine(ShippingLineQueryDefinition queryDef) {
        startField("shippingLine");

        _queryBuilder.append('{');
        queryDef.define(new ShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the draft order.
    */
    public DraftOrderQuery status() {
        startField("status");

        return this;
    }

    /**
    * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts,
    * and taxes.
    */
    public DraftOrderQuery subtotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("subtotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The comma separated list of tags associated with the draft order.
    * Updating `tags` overwrites any existing tags that were previously added to the draft order.
    * To add new tags without overwriting existing tags, use the
    * [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd) mutation.
    */
    public DraftOrderQuery tags() {
        startField("tags");

        return this;
    }

    /**
    * Whether the draft order is tax exempt.
    */
    public DraftOrderQuery taxExempt() {
        startField("taxExempt");

        return this;
    }

    /**
    * The list of of taxes lines charged for each line item and shipping line.
    */
    public DraftOrderQuery taxLines(TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the line item prices include taxes.
    */
    public DraftOrderQuery taxesIncluded() {
        startField("taxesIncluded");

        return this;
    }

    /**
    * Total discounts.
    */
    public DraftOrderQuery totalDiscountsSet(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountsSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total price of line items.
    */
    public DraftOrderQuery totalLineItemsPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalLineItemsPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total price, includes taxes, shipping charges, and discounts.
    */
    public DraftOrderQuery totalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of individual line item quantities.
    * If the draft order has bundle items, this is the sum containing the quantities of individual items
    * in the bundle.
    */
    public DraftOrderQuery totalQuantityOfLineItems() {
        startField("totalQuantityOfLineItems");

        return this;
    }

    /**
    * The total shipping price.
    */
    public DraftOrderQuery totalShippingPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalShippingPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total tax.
    */
    public DraftOrderQuery totalTaxSet(MoneyBagQueryDefinition queryDef) {
        startField("totalTaxSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total weight in grams of the draft order.
    */
    public DraftOrderQuery totalWeight() {
        startField("totalWeight");

        return this;
    }

    /**
    * Fingerprint of the current cart.
    * In order to have bundles work, the fingerprint must be passed to
    * each request as it was previously returned, unmodified.
    */
    public DraftOrderQuery transformerFingerprint() {
        startField("transformerFingerprint");

        return this;
    }

    /**
    * The date and time when the draft order was last changed.
    * The format is YYYY-MM-DD HH:mm:ss. For example, 2016-02-05 17:04:01.
    */
    public DraftOrderQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * Whether the draft order will be visible to the customer on the self-serve portal.
    */
    public DraftOrderQuery visibleToCustomer() {
        startField("visibleToCustomer");

        return this;
    }

    /**
    * The list of warnings raised while calculating.
    */
    public DraftOrderQuery warnings(DraftOrderWarningQueryDefinition queryDef) {
        startField("warnings");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderWarningQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
