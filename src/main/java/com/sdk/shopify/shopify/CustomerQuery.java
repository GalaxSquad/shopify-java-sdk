// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* Represents information about a customer of the shop, such as the customer's contact details, their
* order
* history, and whether they've agreed to receive marketing material by email.
* **Caution:** Only use this data if it's required for your app's functionality. Shopify will restrict
* [access to scopes](https://shopify.dev/api/usage/access-scopes) for apps that don't have a
* legitimate use for the associated data.
*/
public class CustomerQuery extends Query<CustomerQuery> {
    CustomerQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class AddressesArguments extends Arguments {
        AddressesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Truncate the array result to this size.
        */
        public AddressesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AddressesArgumentsDefinition {
        void define(AddressesArguments args);
    }

    /**
    * A list of addresses associated with the customer.
    */
    public CustomerQuery addresses(MailingAddressQueryDefinition queryDef) {
        return addresses(args -> {}, queryDef);
    }

    /**
    * A list of addresses associated with the customer.
    */
    public CustomerQuery addresses(AddressesArgumentsDefinition argsDef, MailingAddressQueryDefinition queryDef) {
        startField("addresses");

        AddressesArguments args = new AddressesArguments(_queryBuilder);
        argsDef.define(args);
        AddressesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AddressesV2Arguments extends Arguments {
        AddressesV2Arguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AddressesV2Arguments first(Integer value) {
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
        public AddressesV2Arguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AddressesV2Arguments last(Integer value) {
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
        public AddressesV2Arguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AddressesV2Arguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AddressesV2ArgumentsDefinition {
        void define(AddressesV2Arguments args);
    }

    /**
    * The addresses associated with the customer.
    */
    public CustomerQuery addressesV2(MailingAddressConnectionQueryDefinition queryDef) {
        return addressesV2(args -> {}, queryDef);
    }

    /**
    * The addresses associated with the customer.
    */
    public CustomerQuery addressesV2(AddressesV2ArgumentsDefinition argsDef, MailingAddressConnectionQueryDefinition queryDef) {
        startField("addressesV2");

        AddressesV2Arguments args = new AddressesV2Arguments(_queryBuilder);
        argsDef.define(args);
        AddressesV2Arguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount that the customer has spent on orders in their lifetime.
    */
    public CustomerQuery amountSpent(MoneyV2QueryDefinition queryDef) {
        startField("amountSpent");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the merchant can delete the customer from their store.
    * A customer can be deleted from a store only if they haven't yet made an order. After a customer
    * makes an
    * order, they can't be deleted from a store.
    */
    public CustomerQuery canDelete() {
        startField("canDelete");

        return this;
    }

    /**
    * A list of the customer's company contact profiles.
    */
    public CustomerQuery companyContactProfiles(CompanyContactQueryDefinition queryDef) {
        startField("companyContactProfiles");

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the customer was added to the store.
    */
    public CustomerQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Whether the customer has opted out of having their data sold.
    */
    public CustomerQuery dataSaleOptOut() {
        startField("dataSaleOptOut");

        return this;
    }

    /**
    * The default address associated with the customer.
    */
    public CustomerQuery defaultAddress(MailingAddressQueryDefinition queryDef) {
        startField("defaultAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customer's default email address.
    */
    public CustomerQuery defaultEmailAddress(CustomerEmailAddressQueryDefinition queryDef) {
        startField("defaultEmailAddress");

        _queryBuilder.append('{');
        queryDef.define(new CustomerEmailAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customer's default phone number.
    */
    public CustomerQuery defaultPhoneNumber(CustomerPhoneNumberQueryDefinition queryDef) {
        startField("defaultPhoneNumber");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPhoneNumberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The full name of the customer, based on the values for first_name and last_name. If the first_name
    * and
    * last_name are not available, then this falls back to the customer's email address, and if that is
    * not available, the customer's phone number.
    */
    public CustomerQuery displayName() {
        startField("displayName");

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
    * A list of events associated with the customer.
    */
    public CustomerQuery events(EventConnectionQueryDefinition queryDef) {
        return events(args -> {}, queryDef);
    }

    /**
    * A list of events associated with the customer.
    */
    public CustomerQuery events(EventsArgumentsDefinition argsDef, EventConnectionQueryDefinition queryDef) {
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
    * The customer's first name.
    */
    public CustomerQuery firstName() {
        startField("firstName");

        return this;
    }

    /**
    * The image associated with the customer.
    */
    public CustomerQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customer's last name.
    */
    public CustomerQuery lastName() {
        startField("lastName");

        return this;
    }

    /**
    * The customer's last order.
    */
    public CustomerQuery lastOrder(OrderQueryDefinition queryDef) {
        startField("lastOrder");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public CustomerQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    /**
    * The amount of time since the customer was first added to the store.
    * Example: 'about 12 years'.
    */
    public CustomerQuery lifetimeDuration() {
        startField("lifetimeDuration");

        return this;
    }

    /**
    * The customer's locale.
    */
    public CustomerQuery locale() {
        startField("locale");

        return this;
    }

    /**
    * Whether the customer can be merged with another customer.
    */
    public CustomerQuery mergeable(CustomerMergeableQueryDefinition queryDef) {
        startField("mergeable");

        _queryBuilder.append('{');
        queryDef.define(new CustomerMergeableQuery(_queryBuilder));
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
    public CustomerQuery metafield(String key, MetafieldQueryDefinition queryDef) {
        return metafield(key, args -> {}, queryDef);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public CustomerQuery metafield(String key, MetafieldArgumentsDefinition argsDef, MetafieldQueryDefinition queryDef) {
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
    public CustomerQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public CustomerQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
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
    * A unique identifier for the customer that's used with Multipass login.
    */
    public CustomerQuery multipassIdentifier() {
        startField("multipassIdentifier");

        return this;
    }

    /**
    * A note about the customer.
    */
    public CustomerQuery note() {
        startField("note");

        return this;
    }

    /**
    * The number of orders that the customer has made at the store in their lifetime.
    */
    public CustomerQuery numberOfOrders() {
        startField("numberOfOrders");

        return this;
    }

    public class OrdersArguments extends Arguments {
        OrdersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public OrdersArguments first(Integer value) {
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
        public OrdersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public OrdersArguments last(Integer value) {
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
        public OrdersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public OrdersArguments reverse(Boolean value) {
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
        public OrdersArguments sortKey(OrderSortKeys value) {
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
        * | cart_token | string | Filter by the cart token's unique value to track abandoned cart conversions
        * or troubleshoot checkout issues. The token references the cart that's associated with an order. | |
        * | - `cart_token:abc123` |
        * | channel | string | Filter by the channel information
        * [`handle`](https://shopify.dev/api/admin-graphql/latest/objects/ChannelInformation#field-channeldefi
        * nition) (`ChannelInformation.channelDefinition.handle`) field. | | | - `channel:web`<br/> -
        * `channel:web,pos` |
        * | channel_id | id | Filter by the channel
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Channel#field-id) field. | | | -
        * `channel_id:123` |
        * | chargeback_status | string | Filter by the order's chargeback status. A chargeback occurs when a
        * customer questions the legitimacy of a charge with their financial institution. | - `accepted`<br/>
        * - `charge_refunded`<br/> - `lost`<br/> - `needs_response`<br/> - `under_review`<br/> - `won` | | -
        * `chargeback_status:accepted` |
        * | checkout_token | string | Filter by the checkout token's unique value to analyze conversion
        * funnels or resolve payment issues. The checkout token's value references the checkout that's
        * associated with an order. | | | - `checkout_token:abc123` |
        * | confirmation_number | string | Filter by the randomly generated alpha-numeric identifier for an
        * order that can be displayed to the customer instead of the sequential order name. This value isn't
        * guaranteed to be unique. | | | - `confirmation_number:ABC123` |
        * | created_at | time | Filter by the date and time when the order was created in Shopify's system. |
        * | | - `created_at:2020-10-21T23:39:20Z`<br/> - `created_at:<now`<br/> - `created_at:<=2024` |
        * | credit_card_last4 | string | Filter by the last four digits of the payment card that was used to
        * pay for the order. This filter matches only the last four digits of the card for heightened
        * security. | | | - `credit_card_last4:1234` |
        * | customer_id | id | Filter orders by the customer
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Customer#field-id) field. | | | -
        * `customer_id:123` |
        * | delivery_method | string | Filter by the delivery
        * [`methodType`](https://shopify.dev/api/admin-graphql/2024-07/objects/DeliveryMethod#field-methodtype
        * ) field. | - `shipping`<br/> - `pick-up`<br/> - `retail`<br/> - `local`<br/> - `pickup-point`<br/> -
        * `none` | | - `delivery_method:shipping` |
        * | discount_code | string | Filter by the case-insensitive discount code that was applied to the
        * order at checkout. Maximum characters: 255. | | | - `discount_code:ABC123` |
        * | email | string | Filter by the email address that's associated with the order to provide customer
        * support or analyze purchasing patterns. | | | - `email:example@shopify.com` |
        * | financial_status | string | Filter by the order
        * [`displayFinancialStatus`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-displayf
        * inancialstatus) field. | - `paid`<br/> - `pending`<br/> - `authorized`<br/> - `partially_paid`<br/>
        * - `partially_refunded`<br/> - `refunded`<br/> - `voided`<br/> - `expired` | | -
        * `financial_status:authorized` |
        * | fraud_protection_level | string | Filter by the level of fraud protection that's applied to the
        * order. Use this filter to manage risk or handle disputes. | - `fully_protected`<br/> -
        * `partially_protected`<br/> - `not_protected`<br/> - `pending`<br/> - `not_eligible`<br/> -
        * `not_available` | | - `fraud_protection_level:fully_protected` |
        * | fulfillment_location_id | id | Filter by the fulfillment location
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Fulfillment#field-location)
        * (`Fulfillment.location.id`) field. | | | - `fulfillment_location_id:123` |
        * | fulfillment_status | string | Filter by the
        * [`displayFulfillmentStatus`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-d
        * isplayfulfillmentstatus) field to prioritize shipments or monitor order processing. | -
        * `unshipped`<br/> - `shipped`<br/> - `fulfilled`<br/> - `partial`<br/> - `scheduled`<br/> -
        * `on_hold`<br/> - `unfulfilled`<br/> - `request_declined` | | - `fulfillment_status:fulfilled` |
        * | gateway | string | Filter by the
        * [`paymentGatewayNames`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-paymen
        * tgatewaynames) field. Use this filter to find orders that were processed through specific payment
        * providers like Shopify Payments, PayPal, or other custom payment gateways. | | | -
        * `gateway:shopify_payments` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | location_id | id | Filter by the location
        * [`id`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location#field-id) that's
        * associated with the order to view and manage orders for specific locations. For POS orders,
        * locations must be defined in the Shopify admin under **Settings** > **Locations**. If no ID is
        * provided, then the primary location of the shop is returned. | | | - `location_id:123` |
        * | name | string | Filter by the order
        * [`name`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-name) field. | | | -
        * `name:1001-A` |
        * | payment_id | string | Filter by the payment ID that's associated with the order to reconcile
        * financial records or troubleshoot payment issues. | | | - `payment_id:abc123` |
        * | payment_provider_id | id | Filter by the ID of the payment provider that's associated with the
        * order to manage payment methods or troubleshoot transactions. | | | - `payment_provider_id:123` |
        * | po_number | string | Filter by the order
        * [`poNumber`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-ponumber) field. | | |
        * - `po_number:P01001` |
        * | processed_at | time | Filter by the order
        * [`processedAt`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-processedat) field.
        * | | | - `processed_at:2021-01-01T00:00:00Z` |
        * | reference_location_id | id | Filter by the ID of a location that's associated with the order, such
        * as locations from fulfillments, refunds, or the shop's primary location. | | | -
        * `reference_location_id:123` |
        * | return_status | string | Filter by the return status to monitor returns processing and track which
        * orders have active returns. | - `return_requested`<br/> - `in_progress`<br/> -
        * `inspection_complete`<br/> - `returned`<br/> - `return_failed`<br/> - `no_return` | | -
        * `return_status:in_progress` |
        * | risk_level | string | Filter by the order risk assessment
        * [`riskLevel`](https://shopify.dev/api/admin-graphql/latest/objects/OrderRiskAssessment#field-risklev
        * el) field. | - `high`<br/> - `medium`<br/> - `low`<br/> - `none`<br/> - `pending` | | -
        * `risk_level:high` |
        * | sales_channel | string | Filter by the [sales
        * channel](https://shopify.dev/docs/apps/build/sales-channels) where the order was made to analyze
        * performance or manage fulfillment processes. | | | - `sales_channel: some_sales_channel` |
        * | sku | string | Filter by the product variant
        * [`sku`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-sku) field. [Learn
        * more about SKUs](https://help.shopify.com/manual/products/details/sku). | | | - `sku:ABC123` |
        * | source_identifier | string | Filter by the ID of the order placed on the originating platform,
        * such as a unique POS or third-party identifier. This value doesn't correspond to the Shopify ID
        * that's generated from a completed draft order. | | | - `source_identifier:1234-12-1000` |
        * | source_name | string | Filter by the platform where the order was placed to distinguish between
        * web orders, POS sales, draft orders, or third-party channels. Use this filter to analyze sales
        * performance across different ordering methods. | | | - `source_name:web`<br/> -
        * `source_name:shopify_draft_order` |
        * | status | string | Filter by the order's status to manage workflows or analyze the order lifecycle.
        * | - `open`<br/> - `closed`<br/> - `cancelled`<br/> - `not_closed` | | - `status:open` |
        * | subtotal_line_items_quantity | string | Filter by the total number of items across all line items
        * in an order. This filter supports both exact values and ranges, and is useful for identifying bulk
        * orders or analyzing purchase volume patterns. | | | - `subtotal_line_items_quantity:10`<br/> -
        * `subtotal_line_items_quantity:5..20` |
        * | tag | string | Filter objects by the `tag` field. | | | - `tag:my_tag` |
        * | tag_not | string | Filter by objects that don’t have the specified tag. | | | - `tag_not:my_tag` |
        * | test | boolean | Filter by test orders. Test orders are made using the [Shopify Bogus
        * Gateway](https://help.shopify.com/manual/checkout-settings/test-orders) or a payment provider with
        * test mode enabled. | | | - `test:true` |
        * | updated_at | time | Filter by the date and time when the order was last updated in Shopify's
        * system. | | | - `updated_at:2020-10-21T23:39:20Z`<br/> - `updated_at:<now`<br/> -
        * `updated_at:<=2024` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public OrdersArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface OrdersArgumentsDefinition {
        void define(OrdersArguments args);
    }

    /**
    * A list of the customer's orders.
    */
    public CustomerQuery orders(OrderConnectionQueryDefinition queryDef) {
        return orders(args -> {}, queryDef);
    }

    /**
    * A list of the customer's orders.
    */
    public CustomerQuery orders(OrdersArgumentsDefinition argsDef, OrderConnectionQueryDefinition queryDef) {
        startField("orders");

        OrdersArguments args = new OrdersArguments(_queryBuilder);
        argsDef.define(args);
        OrdersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrderConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PaymentMethodsArguments extends Arguments {
        PaymentMethodsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Whether to show the customer's revoked payment method.
        */
        public PaymentMethodsArguments showRevoked(Boolean value) {
            if (value != null) {
                startArgument("showRevoked");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PaymentMethodsArguments first(Integer value) {
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
        public PaymentMethodsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PaymentMethodsArguments last(Integer value) {
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
        public PaymentMethodsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public PaymentMethodsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PaymentMethodsArgumentsDefinition {
        void define(PaymentMethodsArguments args);
    }

    /**
    * A list of the customer's payment methods.
    */
    public CustomerQuery paymentMethods(CustomerPaymentMethodConnectionQueryDefinition queryDef) {
        return paymentMethods(args -> {}, queryDef);
    }

    /**
    * A list of the customer's payment methods.
    */
    public CustomerQuery paymentMethods(PaymentMethodsArgumentsDefinition argsDef, CustomerPaymentMethodConnectionQueryDefinition queryDef) {
        startField("paymentMethods");

        PaymentMethodsArguments args = new PaymentMethodsArguments(_queryBuilder);
        argsDef.define(args);
        PaymentMethodsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Possible subscriber states of a customer defined by their subscription contracts.
    */
    public CustomerQuery productSubscriberStatus() {
        startField("productSubscriberStatus");

        return this;
    }

    /**
    * The state of the customer's account with the shop.
    * Please note that this only meaningful when Classic Customer Accounts is active.
    */
    public CustomerQuery state() {
        startField("state");

        return this;
    }

    /**
    * The statistics for a given customer.
    */
    public CustomerQuery statistics(CustomerStatisticsQueryDefinition queryDef) {
        startField("statistics");

        _queryBuilder.append('{');
        queryDef.define(new CustomerStatisticsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class StoreCreditAccountsArguments extends Arguments {
        StoreCreditAccountsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StoreCreditAccountsArguments first(Integer value) {
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
        public StoreCreditAccountsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StoreCreditAccountsArguments last(Integer value) {
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
        public StoreCreditAccountsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | currency_code | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public StoreCreditAccountsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface StoreCreditAccountsArgumentsDefinition {
        void define(StoreCreditAccountsArguments args);
    }

    /**
    * Returns a list of store credit accounts that belong to the owner resource.
    * A store credit account owner can hold multiple accounts each with a different currency.
    */
    public CustomerQuery storeCreditAccounts(StoreCreditAccountConnectionQueryDefinition queryDef) {
        return storeCreditAccounts(args -> {}, queryDef);
    }

    /**
    * Returns a list of store credit accounts that belong to the owner resource.
    * A store credit account owner can hold multiple accounts each with a different currency.
    */
    public CustomerQuery storeCreditAccounts(StoreCreditAccountsArgumentsDefinition argsDef, StoreCreditAccountConnectionQueryDefinition queryDef) {
        startField("storeCreditAccounts");

        StoreCreditAccountsArguments args = new StoreCreditAccountsArguments(_queryBuilder);
        argsDef.define(args);
        StoreCreditAccountsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SubscriptionContractsArguments extends Arguments {
        SubscriptionContractsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SubscriptionContractsArguments first(Integer value) {
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
        public SubscriptionContractsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SubscriptionContractsArguments last(Integer value) {
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
        public SubscriptionContractsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public SubscriptionContractsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SubscriptionContractsArgumentsDefinition {
        void define(SubscriptionContractsArguments args);
    }

    /**
    * A list of the customer's subscription contracts.
    */
    public CustomerQuery subscriptionContracts(SubscriptionContractConnectionQueryDefinition queryDef) {
        return subscriptionContracts(args -> {}, queryDef);
    }

    /**
    * A list of the customer's subscription contracts.
    */
    public CustomerQuery subscriptionContracts(SubscriptionContractsArgumentsDefinition argsDef, SubscriptionContractConnectionQueryDefinition queryDef) {
        startField("subscriptionContracts");

        SubscriptionContractsArguments args = new SubscriptionContractsArguments(_queryBuilder);
        argsDef.define(args);
        SubscriptionContractsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A comma separated list of tags that have been added to the customer.
    */
    public CustomerQuery tags() {
        startField("tags");

        return this;
    }

    /**
    * Whether the customer is exempt from being charged taxes on their orders.
    */
    public CustomerQuery taxExempt() {
        startField("taxExempt");

        return this;
    }

    /**
    * The list of tax exemptions applied to the customer.
    */
    public CustomerQuery taxExemptions() {
        startField("taxExemptions");

        return this;
    }

    /**
    * The date and time when the customer was last updated.
    */
    public CustomerQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * Whether the customer has verified their email address. Defaults to `true` if the customer is created
    * through the Shopify admin or API.
    */
    public CustomerQuery verifiedEmail() {
        startField("verifiedEmail");

        return this;
    }
}
