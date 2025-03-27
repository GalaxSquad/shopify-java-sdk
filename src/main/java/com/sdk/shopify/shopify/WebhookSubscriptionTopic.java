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
* The supported topics for webhook subscriptions. You can use webhook subscriptions to receive
* notifications about particular events in a shop.
* You create [mandatory
* webhooks](https://shopify.dev/apps/webhooks/configuration/mandatory-webhooks#mandatory-compliance-we
* bhooks) either via the
* [Partner
* Dashboard](https://shopify.dev/apps/webhooks/configuration/mandatory-webhooks#subscribe-to-privacy-w
* ebhooks)
* or by updating the [app configuration
* file](https://shopify.dev/apps/tools/cli/configuration#app-configuration-file-example).
* > Tip: 
* >To configure your subscription using the app configuration file, refer to the [full list of topic
* names](https://shopify.dev/docs/api/webhooks?reference=graphql).
*/
public enum WebhookSubscriptionTopic {
    /**
    * The webhook topic for `app_purchases_one_time/update` events. Occurs whenever a one-time app charge
    * is updated.
    */
    APP_PURCHASES_ONE_TIME_UPDATE,

    /**
    * The webhook topic for `app/scopes_update` events. Occurs whenever the access scopes of any
    * installation are modified. Allows apps to keep track of the granted access scopes of their
    * installations.
    */
    APP_SCOPES_UPDATE,

    /**
    * The webhook topic for `app_subscriptions/approaching_capped_amount` events. Occurs when the balance
    * used on an app subscription crosses 90% of the capped amount.
    */
    APP_SUBSCRIPTIONS_APPROACHING_CAPPED_AMOUNT,

    /**
    * The webhook topic for `app_subscriptions/update` events. Occurs whenever an app subscription is
    * updated.
    */
    APP_SUBSCRIPTIONS_UPDATE,

    /**
    * The webhook topic for `app/uninstalled` events. Occurs whenever a shop has uninstalled the app.
    */
    APP_UNINSTALLED,

    /**
    * The webhook topic for `attributed_sessions/first` events. Occurs whenever an order with a "first"
    * attributed session is attributed. Requires the `read_marketing_events` scope.
    */
    ATTRIBUTED_SESSIONS_FIRST,

    /**
    * The webhook topic for `attributed_sessions/last` events. Occurs whenever an order with a "last"
    * attributed session is attributed. Requires the `read_marketing_events` scope.
    */
    ATTRIBUTED_SESSIONS_LAST,

    /**
    * The webhook topic for `audit_events/admin_api_activity` events. Triggers for each auditable Admin
    * API request. This topic is limited to one active subscription per Plus store and requires the use of
    * Google Cloud Pub/Sub or AWS EventBridge. Requires the `read_audit_events` scope.
    */
    AUDIT_EVENTS_ADMIN_API_ACTIVITY,

    /**
    * The webhook topic for `bulk_operations/finish` events. Notifies when a Bulk Operation finishes.
    */
    BULK_OPERATIONS_FINISH,

    /**
    * The webhook topic for `carts/create` events. Occurs when a cart is created in the online store.
    * Other types of carts aren't supported. For example, the webhook doesn't support carts that are
    * created in a custom storefront. Requires the `read_orders` scope.
    */
    CARTS_CREATE,

    /**
    * The webhook topic for `carts/update` events. Occurs when a cart is updated in the online store.
    * Other types of carts aren't supported. For example, the webhook doesn't support carts that are
    * updated in a custom storefront. Requires the `read_orders` scope.
    */
    CARTS_UPDATE,

    /**
    * The webhook topic for `channels/delete` events. Occurs whenever a channel is deleted. Requires the
    * `read_publications` scope.
    */
    CHANNELS_DELETE,

    /**
    * The webhook topic for `checkouts/create` events. Occurs whenever a checkout is created. Requires the
    * `read_orders` scope.
    */
    CHECKOUTS_CREATE,

    /**
    * The webhook topic for `checkouts/delete` events. Occurs whenever a checkout is deleted. Requires the
    * `read_orders` scope.
    */
    CHECKOUTS_DELETE,

    /**
    * The webhook topic for `checkouts/update` events. Occurs whenever a checkout is updated. Requires the
    * `read_orders` scope.
    */
    CHECKOUTS_UPDATE,

    /**
    * The webhook topic for `collections/create` events. Occurs whenever a collection is created. Requires
    * the `read_products` scope.
    */
    COLLECTIONS_CREATE,

    /**
    * The webhook topic for `collections/delete` events. Occurs whenever a collection is deleted. Requires
    * the `read_products` scope.
    */
    COLLECTIONS_DELETE,

    /**
    * The webhook topic for `collections/update` events. Occurs whenever a collection is updated,
    * including whenever products are added or removed from the collection. Occurs once if multiple
    * products are added or removed from a collection at the same time. Requires the `read_products`
    * scope.
    */
    COLLECTIONS_UPDATE,

    /**
    * The webhook topic for `collection_listings/add` events. Occurs whenever a collection listing is
    * added. Requires the `read_product_listings` scope.
    */
    COLLECTION_LISTINGS_ADD,

    /**
    * The webhook topic for `collection_listings/remove` events. Occurs whenever a collection listing is
    * removed. Requires the `read_product_listings` scope.
    */
    COLLECTION_LISTINGS_REMOVE,

    /**
    * The webhook topic for `collection_listings/update` events. Occurs whenever a collection listing is
    * updated. Requires the `read_product_listings` scope.
    */
    COLLECTION_LISTINGS_UPDATE,

    /**
    * The webhook topic for `collection_publications/create` events. Occurs whenever a collection
    * publication listing is created. Requires the `read_publications` scope.
    */
    COLLECTION_PUBLICATIONS_CREATE,

    /**
    * The webhook topic for `collection_publications/delete` events. Occurs whenever a collection
    * publication listing is deleted. Requires the `read_publications` scope.
    */
    COLLECTION_PUBLICATIONS_DELETE,

    /**
    * The webhook topic for `collection_publications/update` events. Occurs whenever a collection
    * publication listing is updated. Requires the `read_publications` scope.
    */
    COLLECTION_PUBLICATIONS_UPDATE,

    /**
    * The webhook topic for `companies/create` events. Occurs whenever a company is created. Requires at
    * least one of the following scopes: read_customers, read_companies.
    */
    COMPANIES_CREATE,

    /**
    * The webhook topic for `companies/delete` events. Occurs whenever a company is deleted. Requires at
    * least one of the following scopes: read_customers, read_companies.
    */
    COMPANIES_DELETE,

    /**
    * The webhook topic for `companies/update` events. Occurs whenever a company is updated. Requires at
    * least one of the following scopes: read_customers, read_companies.
    */
    COMPANIES_UPDATE,

    /**
    * The webhook topic for `company_contacts/create` events. Occurs whenever a company contact is
    * created. Requires at least one of the following scopes: read_customers, read_companies.
    */
    COMPANY_CONTACTS_CREATE,

    /**
    * The webhook topic for `company_contacts/delete` events. Occurs whenever a company contact is
    * deleted. Requires at least one of the following scopes: read_customers, read_companies.
    */
    COMPANY_CONTACTS_DELETE,

    /**
    * The webhook topic for `company_contacts/update` events. Occurs whenever a company contact is
    * updated. Requires at least one of the following scopes: read_customers, read_companies.
    */
    COMPANY_CONTACTS_UPDATE,

    /**
    * The webhook topic for `company_contact_roles/assign` events. Occurs whenever a role is assigned to a
    * contact at a location. Requires at least one of the following scopes: read_customers,
    * read_companies.
    */
    COMPANY_CONTACT_ROLES_ASSIGN,

    /**
    * The webhook topic for `company_contact_roles/revoke` events. Occurs whenever a role is revoked from
    * a contact at a location. Requires at least one of the following scopes: read_customers,
    * read_companies.
    */
    COMPANY_CONTACT_ROLES_REVOKE,

    /**
    * The webhook topic for `company_locations/create` events. Occurs whenever a company location is
    * created. Requires at least one of the following scopes: read_customers, read_companies.
    */
    COMPANY_LOCATIONS_CREATE,

    /**
    * The webhook topic for `company_locations/delete` events. Occurs whenever a company location is
    * deleted. Requires at least one of the following scopes: read_customers, read_companies.
    */
    COMPANY_LOCATIONS_DELETE,

    /**
    * The webhook topic for `company_locations/update` events. Occurs whenever a company location is
    * updated. Requires at least one of the following scopes: read_customers, read_companies.
    */
    COMPANY_LOCATIONS_UPDATE,

    /**
    * The webhook topic for `customers/create` events. Occurs whenever a customer is created. Requires the
    * `read_customers` scope.
    */
    CUSTOMERS_CREATE,

    /**
    * The webhook topic for `customers/delete` events. Occurs whenever a customer is deleted. Requires the
    * `read_customers` scope.
    */
    CUSTOMERS_DELETE,

    /**
    * The webhook topic for `customers/disable` events. Occurs whenever a customer account is disabled.
    * Requires the `read_customers` scope.
    */
    CUSTOMERS_DISABLE,

    /**
    * The webhook topic for `customers_email_marketing_consent/update` events. Occurs whenever a
    * customer's email marketing consent is updated. Requires the `read_customers` scope.
    */
    CUSTOMERS_EMAIL_MARKETING_CONSENT_UPDATE,

    /**
    * The webhook topic for `customers/enable` events. Occurs whenever a customer account is enabled.
    * Requires the `read_customers` scope.
    */
    CUSTOMERS_ENABLE,

    /**
    * The webhook topic for `customers_marketing_consent/update` events. Occurs whenever a customer's SMS
    * marketing consent is updated. Requires the `read_customers` scope.
    */
    CUSTOMERS_MARKETING_CONSENT_UPDATE,

    /**
    * The webhook topic for `customers/merge` events. Triggers when two customers are merged Requires the
    * `read_customer_merge` scope.
    */
    CUSTOMERS_MERGE,

    /**
    * The webhook topic for `customers/purchasing_summary` events. Occurs when a customer sales history
    * change. Requires the `read_customers` scope.
    */
    CUSTOMERS_PURCHASING_SUMMARY,

    /**
    * The webhook topic for `customers/update` events. Occurs whenever a customer is updated. Requires the
    * `read_customers` scope.
    */
    CUSTOMERS_UPDATE,

    /**
    * The webhook topic for `customer_account_settings/update` events. Triggers when merchants change
    * customer account setting.
    */
    CUSTOMER_ACCOUNT_SETTINGS_UPDATE,

    /**
    * The webhook topic for `customer_groups/create` events. Occurs whenever a customer saved search is
    * created. Requires the `read_customers` scope.
    */
    CUSTOMER_GROUPS_CREATE,

    /**
    * The webhook topic for `customer_groups/delete` events. Occurs whenever a customer saved search is
    * deleted. Requires the `read_customers` scope.
    */
    CUSTOMER_GROUPS_DELETE,

    /**
    * The webhook topic for `customer_groups/update` events. Occurs whenever a customer saved search is
    * updated. Requires the `read_customers` scope.
    */
    CUSTOMER_GROUPS_UPDATE,

    /**
    * The webhook topic for `customer.joined_segment` events. Triggers when a customer joins a segment.
    * Requires the `read_customers` scope.
    */
    CUSTOMER_JOINED_SEGMENT,

    /**
    * The webhook topic for `customer.left_segment` events. Triggers when a customer leaves a segment.
    * Requires the `read_customers` scope.
    */
    CUSTOMER_LEFT_SEGMENT,

    /**
    * The webhook topic for `customer_payment_methods/create` events. Occurs whenever a customer payment
    * method is created. Requires the `read_customer_payment_methods` scope.
    */
    CUSTOMER_PAYMENT_METHODS_CREATE,

    /**
    * The webhook topic for `customer_payment_methods/revoke` events. Occurs whenever a customer payment
    * method is revoked. Requires the `read_customer_payment_methods` scope.
    */
    CUSTOMER_PAYMENT_METHODS_REVOKE,

    /**
    * The webhook topic for `customer_payment_methods/update` events. Occurs whenever a customer payment
    * method is updated. Requires the `read_customer_payment_methods` scope.
    */
    CUSTOMER_PAYMENT_METHODS_UPDATE,

    /**
    * The webhook topic for `customer.tags_added` events. Triggers when tags are added to a customer.
    * Requires the `read_customers` scope.
    */
    CUSTOMER_TAGS_ADDED,

    /**
    * The webhook topic for `customer.tags_removed` events. Triggers when tags are removed from a
    * customer. Requires the `read_customers` scope.
    */
    CUSTOMER_TAGS_REMOVED,

    /**
    * The webhook topic for `delivery_promise_settings/update` events. Occurs when a promise setting is
    * updated. Requires the `read_shipping` scope.
    */
    DELIVERY_PROMISE_SETTINGS_UPDATE,

    /**
    * The webhook topic for `discounts/create` events. Occurs whenever a discount is created. Requires the
    * `read_discounts` scope.
    */
    DISCOUNTS_CREATE,

    /**
    * The webhook topic for `discounts/delete` events. Occurs whenever a discount is deleted. Requires the
    * `read_discounts` scope.
    */
    DISCOUNTS_DELETE,

    /**
    * The webhook topic for `discounts/redeemcode_added` events. Occurs whenever a redeem code is added to
    * a code discount. Requires the `read_discounts` scope.
    */
    DISCOUNTS_REDEEMCODE_ADDED,

    /**
    * The webhook topic for `discounts/redeemcode_removed` events. Occurs whenever a redeem code on a code
    * discount is deleted. Requires the `read_discounts` scope.
    */
    DISCOUNTS_REDEEMCODE_REMOVED,

    /**
    * The webhook topic for `discounts/update` events. Occurs whenever a discount is updated. Requires the
    * `read_discounts` scope.
    */
    DISCOUNTS_UPDATE,

    /**
    * The webhook topic for `disputes/create` events. Occurs whenever a dispute is created. Requires the
    * `read_shopify_payments_disputes` scope.
    */
    DISPUTES_CREATE,

    /**
    * The webhook topic for `disputes/update` events. Occurs whenever a dispute is updated. Requires the
    * `read_shopify_payments_disputes` scope.
    */
    DISPUTES_UPDATE,

    /**
    * The webhook topic for `domains/create` events. Occurs whenever a domain is created.
    */
    DOMAINS_CREATE,

    /**
    * The webhook topic for `domains/destroy` events. Occurs whenever a domain is destroyed.
    */
    DOMAINS_DESTROY,

    /**
    * The webhook topic for `domains/update` events. Occurs whenever a domain is updated.
    */
    DOMAINS_UPDATE,

    /**
    * The webhook topic for `draft_orders/create` events. Occurs whenever a draft order is created.
    * Requires the `read_draft_orders` scope.
    */
    DRAFT_ORDERS_CREATE,

    /**
    * The webhook topic for `draft_orders/delete` events. Occurs whenever a draft order is deleted.
    * Requires the `read_draft_orders` scope.
    */
    DRAFT_ORDERS_DELETE,

    /**
    * The webhook topic for `draft_orders/update` events. Occurs whenever a draft order is updated.
    * Requires the `read_draft_orders` scope.
    */
    DRAFT_ORDERS_UPDATE,

    /**
    * The webhook topic for `fulfillments/create` events. Occurs whenever a fulfillment is created.
    * Requires at least one of the following scopes: read_fulfillments, read_marketplace_orders.
    */
    FULFILLMENTS_CREATE,

    /**
    * The webhook topic for `fulfillments/update` events. Occurs whenever a fulfillment is updated.
    * Requires at least one of the following scopes: read_fulfillments, read_marketplace_orders.
    */
    FULFILLMENTS_UPDATE,

    /**
    * The webhook topic for `fulfillment_events/create` events. Occurs whenever a fulfillment event is
    * created. Requires the `read_fulfillments` scope.
    */
    FULFILLMENT_EVENTS_CREATE,

    /**
    * The webhook topic for `fulfillment_events/delete` events. Occurs whenever a fulfillment event is
    * deleted. Requires the `read_fulfillments` scope.
    */
    FULFILLMENT_EVENTS_DELETE,

    /**
    * The webhook topic for `fulfillment_holds/added` events. Occurs each time that a hold is added to a
    * fulfillment order.
    * For cases where multiple holds are applied to a fulfillment order, this webhook will trigger after
    * each hold is applied.
    * Requires at least one of the following scopes: read_merchant_managed_fulfillment_orders,
    * read_assigned_fulfillment_orders, read_third_party_fulfillment_orders,
    * read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_HOLDS_ADDED,

    /**
    * The webhook topic for `fulfillment_holds/released` events. Occurs each time that a hold is released
    * from a fulfillment order.
    * For cases where multiple holds are released from a fulfillment order a the same time, this webhook
    * will trigger for each released hold.
    * Requires at least one of the following scopes: read_merchant_managed_fulfillment_orders,
    * read_assigned_fulfillment_orders, read_third_party_fulfillment_orders,
    * read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_HOLDS_RELEASED,

    /**
    * The webhook topic for `fulfillment_orders/cancellation_request_accepted` events. Occurs when a 3PL
    * accepts a fulfillment cancellation request, received from a merchant. Requires at least one of the
    * following scopes: read_merchant_managed_fulfillment_orders, read_assigned_fulfillment_orders,
    * read_third_party_fulfillment_orders, read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_CANCELLATION_REQUEST_ACCEPTED,

    /**
    * The webhook topic for `fulfillment_orders/cancellation_request_rejected` events. Occurs when a 3PL
    * rejects a fulfillment cancellation request, received from a merchant. Requires at least one of the
    * following scopes: read_merchant_managed_fulfillment_orders, read_assigned_fulfillment_orders,
    * read_third_party_fulfillment_orders, read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_CANCELLATION_REQUEST_REJECTED,

    /**
    * The webhook topic for `fulfillment_orders/cancellation_request_submitted` events. Occurs when a
    * merchant requests a fulfillment request to be cancelled after that request was approved by a 3PL.
    * Requires at least one of the following scopes: read_merchant_managed_fulfillment_orders,
    * read_assigned_fulfillment_orders, read_third_party_fulfillment_orders,
    * read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_CANCELLATION_REQUEST_SUBMITTED,

    /**
    * The webhook topic for `fulfillment_orders/cancelled` events. Occurs when a fulfillment order is
    * cancelled. Requires at least one of the following scopes: read_merchant_managed_fulfillment_orders,
    * read_assigned_fulfillment_orders, read_third_party_fulfillment_orders,
    * read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_CANCELLED,

    /**
    * The webhook topic for `fulfillment_orders/fulfillment_request_accepted` events. Occurs when a
    * fulfillment service accepts a request to fulfill a fulfillment order. Requires at least one of the
    * following scopes: read_merchant_managed_fulfillment_orders, read_assigned_fulfillment_orders,
    * read_third_party_fulfillment_orders, read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_ACCEPTED,

    /**
    * The webhook topic for `fulfillment_orders/fulfillment_request_rejected` events. Occurs when a 3PL
    * rejects a fulfillment request that was sent by a merchant. Requires at least one of the following
    * scopes: read_merchant_managed_fulfillment_orders, read_assigned_fulfillment_orders,
    * read_third_party_fulfillment_orders, read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_REJECTED,

    /**
    * The webhook topic for `fulfillment_orders/fulfillment_request_submitted` events. Occurs when a
    * merchant submits a fulfillment request to a 3PL. Requires at least one of the following scopes:
    * read_merchant_managed_fulfillment_orders, read_assigned_fulfillment_orders,
    * read_third_party_fulfillment_orders, read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_SUBMITTED,

    /**
    * The webhook topic for `fulfillment_orders/fulfillment_service_failed_to_complete` events. Occurs
    * when a fulfillment service intends to close an in_progress fulfillment order. Requires at least one
    * of the following scopes: read_merchant_managed_fulfillment_orders, read_assigned_fulfillment_orders,
    * read_third_party_fulfillment_orders, read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_FULFILLMENT_SERVICE_FAILED_TO_COMPLETE,

    /**
    * The webhook topic for `fulfillment_orders/hold_released` events. Occurs when a fulfillment order is
    * released and is no longer on hold.
    * If a fulfillment order has multiple holds then this webhook will only be triggered once when the
    * last hold is released and the status of the fulfillment order is no longer `ON_HOLD`.
    * Requires at least one of the following scopes: read_merchant_managed_fulfillment_orders,
    * read_assigned_fulfillment_orders, read_third_party_fulfillment_orders,
    * read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_HOLD_RELEASED,

    /**
    * The webhook topic for `fulfillment_orders/line_items_prepared_for_local_delivery` events. Occurs
    * whenever a fulfillment order's line items are prepared for local delivery. Requires at least one of
    * the following scopes: read_merchant_managed_fulfillment_orders, read_assigned_fulfillment_orders,
    * read_third_party_fulfillment_orders, read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_LINE_ITEMS_PREPARED_FOR_LOCAL_DELIVERY,

    /**
    * The webhook topic for `fulfillment_orders/line_items_prepared_for_pickup` events. Triggers when one
    * or more of the line items for a fulfillment order are prepared for pickup Requires at least one of
    * the following scopes: read_merchant_managed_fulfillment_orders, read_assigned_fulfillment_orders,
    * read_third_party_fulfillment_orders, read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_LINE_ITEMS_PREPARED_FOR_PICKUP,

    /**
    * The webhook topic for `fulfillment_orders/merged` events. Occurs when multiple fulfillment orders
    * are merged into a single fulfillment order. Requires at least one of the following scopes:
    * read_merchant_managed_fulfillment_orders, read_assigned_fulfillment_orders,
    * read_third_party_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_MERGED,

    /**
    * The webhook topic for `fulfillment_orders/moved` events. Occurs whenever the location which is
    * assigned to fulfill one or more fulfillment order line items is changed.
    * * `original_fulfillment_order` - The final state of the original fulfillment order.
    * * `moved_fulfillment_order` - The fulfillment order which now contains the re-assigned line items.
    * * `source_location` - The original location which was assigned to fulfill the line items (available
    * as of the `2023-04` API version).
    * * `destination_location_id` - The ID of the location which is now responsible for fulfilling the
    * line items.
    * **Note:** The
    * [assignedLocation](https://shopify.dev/docs/api/admin-graphql/latest/objects/fulfillmentorder#field-
    * fulfillmentorder-assignedlocation)
    * of the `original_fulfillment_order` might be changed by the move operation.
    * If you need to determine the originally assigned location, then you should refer to the
    * `source_location`.
    * [Learn more about moving line
    * items](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fulfillmentOrderMove).
    * Requires at least one of the following scopes: read_merchant_managed_fulfillment_orders,
    * read_assigned_fulfillment_orders, read_third_party_fulfillment_orders,
    * read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_MOVED,

    /**
    * The webhook topic for `fulfillment_orders/order_routing_complete` events. Occurs when an order has
    * finished being routed and it's fulfillment orders assigned to a fulfillment service's location.
    * Requires at least one of the following scopes: read_merchant_managed_fulfillment_orders,
    * read_assigned_fulfillment_orders, read_third_party_fulfillment_orders, read_buyer_membership_orders,
    * read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_ORDER_ROUTING_COMPLETE,

    /**
    * The webhook topic for `fulfillment_orders/placed_on_hold` events. Occurs when a fulfillment order
    * transitions to the `ON_HOLD` status
    * For cases where multiple holds are applied to a fulfillment order, this webhook will only trigger
    * once when the first hold is applied and the fulfillment order status changes to `ON_HOLD`.
    * Requires at least one of the following scopes: read_merchant_managed_fulfillment_orders,
    * read_assigned_fulfillment_orders, read_third_party_fulfillment_orders,
    * read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_PLACED_ON_HOLD,

    /**
    * The webhook topic for `fulfillment_orders/rescheduled` events. Triggers when a fulfillment order is
    * rescheduled.
    * Fulfillment orders may be merged if they have the same `fulfillAt` datetime.
    * If the fulfillment order is merged then the resulting fulfillment order will be indicated in the
    * webhook body.
    * Otherwise it will be the original fulfillment order with an updated `fulfill_at` datetime.
    * Requires at least one of the following scopes: read_merchant_managed_fulfillment_orders,
    * read_assigned_fulfillment_orders, read_third_party_fulfillment_orders,
    * read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_RESCHEDULED,

    /**
    * The webhook topic for `fulfillment_orders/scheduled_fulfillment_order_ready` events. Occurs whenever
    * a fulfillment order which was scheduled becomes due. Requires at least one of the following scopes:
    * read_merchant_managed_fulfillment_orders, read_assigned_fulfillment_orders,
    * read_third_party_fulfillment_orders, read_marketplace_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_SCHEDULED_FULFILLMENT_ORDER_READY,

    /**
    * The webhook topic for `fulfillment_orders/split` events. Occurs when a fulfillment order is split
    * into multiple fulfillment orders. Requires at least one of the following scopes:
    * read_merchant_managed_fulfillment_orders, read_assigned_fulfillment_orders,
    * read_third_party_fulfillment_orders.
    */
    FULFILLMENT_ORDERS_SPLIT,

    /**
    * The webhook topic for `inventory_items/create` events. Occurs whenever an inventory item is created.
    * Requires the `read_inventory` scope.
    */
    INVENTORY_ITEMS_CREATE,

    /**
    * The webhook topic for `inventory_items/delete` events. Occurs whenever an inventory item is deleted.
    * Requires the `read_inventory` scope.
    */
    INVENTORY_ITEMS_DELETE,

    /**
    * The webhook topic for `inventory_items/update` events. Occurs whenever an inventory item is updated.
    * Requires the `read_inventory` scope.
    */
    INVENTORY_ITEMS_UPDATE,

    /**
    * The webhook topic for `inventory_levels/connect` events. Occurs whenever an inventory level is
    * connected. Requires the `read_inventory` scope.
    */
    INVENTORY_LEVELS_CONNECT,

    /**
    * The webhook topic for `inventory_levels/disconnect` events. Occurs whenever an inventory level is
    * disconnected. Requires the `read_inventory` scope.
    */
    INVENTORY_LEVELS_DISCONNECT,

    /**
    * The webhook topic for `inventory_levels/update` events. Occurs whenever an inventory level is
    * updated. Requires the `read_inventory` scope.
    */
    INVENTORY_LEVELS_UPDATE,

    /**
    * The webhook topic for `locales/create` events. Occurs whenever a shop locale is created Requires the
    * `read_locales` scope.
    */
    LOCALES_CREATE,

    /**
    * The webhook topic for `locales/update` events. Occurs whenever a shop locale is updated, such as
    * published or unpublished Requires the `read_locales` scope.
    */
    LOCALES_UPDATE,

    /**
    * The webhook topic for `locations/activate` events. Occurs whenever a deactivated location is
    * re-activated. Requires the `read_locations` scope.
    */
    LOCATIONS_ACTIVATE,

    /**
    * The webhook topic for `locations/create` events. Occurs whenever a location is created. Requires the
    * `read_locations` scope.
    */
    LOCATIONS_CREATE,

    /**
    * The webhook topic for `locations/deactivate` events. Occurs whenever a location is deactivated.
    * Requires the `read_locations` scope.
    */
    LOCATIONS_DEACTIVATE,

    /**
    * The webhook topic for `locations/delete` events. Occurs whenever a location is deleted. Requires the
    * `read_locations` scope.
    */
    LOCATIONS_DELETE,

    /**
    * The webhook topic for `locations/update` events. Occurs whenever a location is updated. Requires the
    * `read_locations` scope.
    */
    LOCATIONS_UPDATE,

    /**
    * The webhook topic for `markets/create` events. Occurs when a new market is created. Requires the
    * `read_markets` scope.
    */
    MARKETS_CREATE,

    /**
    * The webhook topic for `markets/delete` events. Occurs when a market is deleted. Requires the
    * `read_markets` scope.
    */
    MARKETS_DELETE,

    /**
    * The webhook topic for `markets/update` events. Occurs when a market is updated. Requires the
    * `read_markets` scope.
    */
    MARKETS_UPDATE,

    /**
    * The webhook topic for `metafield_definitions/create` events. Occurs when a metafield definition is
    * created. Requires the `read_content` scope.
    */
    METAFIELD_DEFINITIONS_CREATE,

    /**
    * The webhook topic for `metafield_definitions/delete` events. Occurs when a metafield definition is
    * deleted. Requires the `read_content` scope.
    */
    METAFIELD_DEFINITIONS_DELETE,

    /**
    * The webhook topic for `metafield_definitions/update` events. Occurs when a metafield definition is
    * updated. Requires the `read_content` scope.
    */
    METAFIELD_DEFINITIONS_UPDATE,

    /**
    * The webhook topic for `metaobjects/create` events. Occurs when a metaobject is created. Requires the
    * `read_metaobjects` scope.
    */
    METAOBJECTS_CREATE,

    /**
    * The webhook topic for `metaobjects/delete` events. Occurs when a metaobject is deleted. Requires the
    * `read_metaobjects` scope.
    */
    METAOBJECTS_DELETE,

    /**
    * The webhook topic for `metaobjects/update` events. Occurs when a metaobject is updated. Requires the
    * `read_metaobjects` scope.
    */
    METAOBJECTS_UPDATE,

    /**
    * The webhook topic for `orders/cancelled` events. Occurs whenever an order is cancelled. Requires at
    * least one of the following scopes: read_orders, read_marketplace_orders,
    * read_buyer_membership_orders.
    */
    ORDERS_CANCELLED,

    /**
    * The webhook topic for `orders/create` events. Occurs whenever an order is created. Requires at least
    * one of the following scopes: read_orders, read_marketplace_orders.
    */
    ORDERS_CREATE,

    /**
    * The webhook topic for `orders/delete` events. Occurs whenever an order is deleted. Requires the
    * `read_orders` scope.
    */
    ORDERS_DELETE,

    /**
    * The webhook topic for `orders/edited` events. Occurs whenever an order is edited. Requires at least
    * one of the following scopes: read_orders, read_marketplace_orders, read_buyer_membership_orders.
    */
    ORDERS_EDITED,

    /**
    * The webhook topic for `orders/fulfilled` events. Occurs whenever an order is fulfilled. Requires at
    * least one of the following scopes: read_orders, read_marketplace_orders.
    */
    ORDERS_FULFILLED,

    /**
    * The webhook topic for `orders/paid` events. Occurs whenever an order is paid. Requires at least one
    * of the following scopes: read_orders, read_marketplace_orders.
    */
    ORDERS_PAID,

    /**
    * The webhook topic for `orders/partially_fulfilled` events. Occurs whenever an order is partially
    * fulfilled. Requires at least one of the following scopes: read_orders, read_marketplace_orders.
    */
    ORDERS_PARTIALLY_FULFILLED,

    /**
    * The webhook topic for `orders/risk_assessment_changed` events. Triggers when a new risk assessment
    * is available on the order.
    * This can be the first or a subsequent risk assessment.
    * New risk assessments can be provided until the order is marked as fulfilled.
    * Includes the risk level, risk facts, the provider and the order ID.
    * Does not include the risk recommendation for the order.
    * The Shop ID is available in the headers.
    * Requires the `read_orders` scope.
    */
    ORDERS_RISK_ASSESSMENT_CHANGED,

    /**
    * The webhook topic for `orders/shopify_protect_eligibility_changed` events. Occurs whenever Shopify
    * Protect's eligibility for an order is changed. Requires the `read_orders` scope.
    */
    ORDERS_SHOPIFY_PROTECT_ELIGIBILITY_CHANGED,

    /**
    * The webhook topic for `orders/updated` events. Occurs whenever an order is updated. Requires at
    * least one of the following scopes: read_orders, read_marketplace_orders,
    * read_buyer_membership_orders.
    */
    ORDERS_UPDATED,

    /**
    * The webhook topic for `order_transactions/create` events. Occurs when a order transaction is created
    * or when it's status is updated. Only occurs for transactions with a status of success, failure or
    * error. Requires at least one of the following scopes: read_orders, read_marketplace_orders,
    * read_buyer_membership_orders.
    */
    ORDER_TRANSACTIONS_CREATE,

    /**
    * The webhook topic for `payment_schedules/due` events. Occurs whenever payment schedules are due.
    * Requires the `read_payment_terms` scope.
    */
    PAYMENT_SCHEDULES_DUE,

    /**
    * The webhook topic for `payment_terms/create` events. Occurs whenever payment terms are created.
    * Requires the `read_payment_terms` scope.
    */
    PAYMENT_TERMS_CREATE,

    /**
    * The webhook topic for `payment_terms/delete` events. Occurs whenever payment terms are deleted.
    * Requires the `read_payment_terms` scope.
    */
    PAYMENT_TERMS_DELETE,

    /**
    * The webhook topic for `payment_terms/update` events. Occurs whenever payment terms are updated.
    * Requires the `read_payment_terms` scope.
    */
    PAYMENT_TERMS_UPDATE,

    /**
    * The webhook topic for `products/create` events. Occurs whenever a product is created. Requires the
    * `read_products` scope.
    */
    PRODUCTS_CREATE,

    /**
    * The webhook topic for `products/delete` events. Occurs whenever a product is deleted. Requires the
    * `read_products` scope.
    */
    PRODUCTS_DELETE,

    /**
    * The webhook topic for `products/update` events. Occurs whenever a product is updated, ordered, or
    * variants are added, removed or updated. Requires the `read_products` scope.
    */
    PRODUCTS_UPDATE,

    /**
    * The webhook topic for `product_feeds/create` events. Triggers when product feed is created Requires
    * the `read_product_listings` scope.
    */
    PRODUCT_FEEDS_CREATE,

    /**
    * The webhook topic for `product_feeds/full_sync` events. Triggers when a full sync for a product feed
    * is performed Requires the `read_product_listings` scope.
    */
    PRODUCT_FEEDS_FULL_SYNC,

    /**
    * The webhook topic for `product_feeds/full_sync_finish` events. Triggers when a full sync finishes
    * Requires the `read_product_listings` scope.
    */
    PRODUCT_FEEDS_FULL_SYNC_FINISH,

    /**
    * The webhook topic for `product_feeds/incremental_sync` events. Occurs whenever a product publication
    * is created, updated or removed for a product feed Requires the `read_product_listings` scope.
    */
    PRODUCT_FEEDS_INCREMENTAL_SYNC,

    /**
    * The webhook topic for `product_feeds/update` events. Triggers when product feed is updated Requires
    * the `read_product_listings` scope.
    */
    PRODUCT_FEEDS_UPDATE,

    /**
    * The webhook topic for `product_listings/add` events. Occurs whenever an active product is listed on
    * a channel. Requires the `read_product_listings` scope.
    */
    PRODUCT_LISTINGS_ADD,

    /**
    * The webhook topic for `product_listings/remove` events. Occurs whenever a product listing is removed
    * from the channel. Requires the `read_product_listings` scope.
    */
    PRODUCT_LISTINGS_REMOVE,

    /**
    * The webhook topic for `product_listings/update` events. Occurs whenever a product publication is
    * updated. Requires the `read_product_listings` scope.
    */
    PRODUCT_LISTINGS_UPDATE,

    /**
    * The webhook topic for `product_publications/create` events. Occurs whenever a product publication
    * for an active product is created, or whenever an existing product publication is published on the
    * app that is subscribed to this webhook topic. Note that a webhook is only emitted when there are
    * publishing changes to the app that is subscribed to the topic (ie. no webhook will be emitted if
    * there is a publishing change to the online store and the webhook subscriber of the topic is a
    * third-party app). Requires the `read_publications` scope.
    */
    PRODUCT_PUBLICATIONS_CREATE,

    /**
    * The webhook topic for `product_publications/delete` events. Occurs whenever a product publication
    * for an active product is removed, or whenever an existing product publication is unpublished from
    * the app that is subscribed to this webhook topic. Note that a webhook is only emitted when there are
    * publishing changes to the app that is subscribed to the topic (ie. no webhook will be emitted if
    * there is a publishing change to the online store and the webhook subscriber of the topic is a
    * third-party app). Requires the `read_publications` scope.
    */
    PRODUCT_PUBLICATIONS_DELETE,

    /**
    * The webhook topic for `product_publications/update` events. Occurs whenever a product publication is
    * updated from the app that is subscribed to this webhook topic. Note that a webhook is only emitted
    * when there are publishing changes to the app that is subscribed to the topic (ie. no webhook will be
    * emitted if there is a publishing change to the online store and the webhook subscriber of the topic
    * is a third-party app). Requires the `read_publications` scope.
    */
    PRODUCT_PUBLICATIONS_UPDATE,

    /**
    * The webhook topic for `profiles/create` events. Occurs whenever a delivery profile is created
    * Requires at least one of the following scopes: read_shipping, read_assigned_shipping.
    */
    PROFILES_CREATE,

    /**
    * The webhook topic for `profiles/delete` events. Occurs whenever a delivery profile is deleted
    * Requires at least one of the following scopes: read_shipping, read_assigned_shipping.
    */
    PROFILES_DELETE,

    /**
    * The webhook topic for `profiles/update` events. Occurs whenever a delivery profile is updated
    * Requires at least one of the following scopes: read_shipping, read_assigned_shipping.
    */
    PROFILES_UPDATE,

    /**
    * The webhook topic for `publications/delete` events. Occurs whenever a publication is deleted.
    * Requires the `read_publications` scope.
    */
    PUBLICATIONS_DELETE,

    /**
    * The webhook topic for `refunds/create` events. Occurs whenever a new refund is created without
    * errors on an order, independent from the movement of money. Requires at least one of the following
    * scopes: read_orders, read_marketplace_orders, read_buyer_membership_orders.
    */
    REFUNDS_CREATE,

    /**
    * The webhook topic for `returns/approve` events. Occurs whenever a return is approved. This means
    * `Return.status` is `OPEN`. Requires at least one of the following scopes: read_returns,
    * read_marketplace_returns, read_buyer_membership_orders.
    */
    RETURNS_APPROVE,

    /**
    * The webhook topic for `returns/cancel` events. Occurs whenever a return is canceled. Requires at
    * least one of the following scopes: read_orders, read_marketplace_orders, read_returns,
    * read_marketplace_returns, read_buyer_membership_orders.
    */
    RETURNS_CANCEL,

    /**
    * The webhook topic for `returns/close` events. Occurs whenever a return is closed. Requires at least
    * one of the following scopes: read_orders, read_marketplace_orders, read_returns,
    * read_marketplace_returns, read_buyer_membership_orders.
    */
    RETURNS_CLOSE,

    /**
    * The webhook topic for `returns/decline` events. Occurs whenever a return is declined. This means
    * `Return.status` is `DECLINED`. Requires at least one of the following scopes: read_returns,
    * read_marketplace_returns, read_buyer_membership_orders.
    */
    RETURNS_DECLINE,

    /**
    * The webhook topic for `returns/reopen` events. Occurs whenever a closed return is reopened. Requires
    * at least one of the following scopes: read_orders, read_marketplace_orders, read_returns,
    * read_marketplace_returns, read_buyer_membership_orders.
    */
    RETURNS_REOPEN,

    /**
    * The webhook topic for `returns/request` events. Occurs whenever a return is requested. This means
    * `Return.status` is `REQUESTED`. Requires at least one of the following scopes: read_returns,
    * read_marketplace_returns, read_buyer_membership_orders.
    */
    RETURNS_REQUEST,

    /**
    * The webhook topic for `returns/update` events. Occurs whenever a return is updated. Requires at
    * least one of the following scopes: read_returns, read_marketplace_returns,
    * read_buyer_membership_orders.
    */
    RETURNS_UPDATE,

    /**
    * The webhook topic for `reverse_deliveries/attach_deliverable` events. Occurs whenever a deliverable
    * is attached to a reverse delivery.
    * This occurs when a reverse delivery is created or updated with delivery metadata.
    * Metadata includes the delivery method, label, and tracking information associated with a reverse
    * delivery.
    * Requires at least one of the following scopes: read_returns, read_marketplace_returns.
    */
    REVERSE_DELIVERIES_ATTACH_DELIVERABLE,

    /**
    * The webhook topic for `reverse_fulfillment_orders/dispose` events. Occurs whenever a disposition is
    * made on a reverse fulfillment order.
    * This includes dispositions made on reverse deliveries that are associated with the reverse
    * fulfillment order.
    * Requires at least one of the following scopes: read_returns, read_marketplace_returns.
    */
    REVERSE_FULFILLMENT_ORDERS_DISPOSE,

    /**
    * The webhook topic for `scheduled_product_listings/add` events. Occurs whenever a product is
    * scheduled to be published. Requires the `read_product_listings` scope.
    */
    SCHEDULED_PRODUCT_LISTINGS_ADD,

    /**
    * The webhook topic for `scheduled_product_listings/remove` events. Occurs whenever a product is no
    * longer scheduled to be published. Requires the `read_product_listings` scope.
    */
    SCHEDULED_PRODUCT_LISTINGS_REMOVE,

    /**
    * The webhook topic for `scheduled_product_listings/update` events. Occurs whenever a product's
    * scheduled availability date changes. Requires the `read_product_listings` scope.
    */
    SCHEDULED_PRODUCT_LISTINGS_UPDATE,

    /**
    * The webhook topic for `segments/create` events. Occurs whenever a segment is created. Requires the
    * `read_customers` scope.
    */
    SEGMENTS_CREATE,

    /**
    * The webhook topic for `segments/delete` events. Occurs whenever a segment is deleted. Requires the
    * `read_customers` scope.
    */
    SEGMENTS_DELETE,

    /**
    * The webhook topic for `segments/update` events. Occurs whenever a segment is updated. Requires the
    * `read_customers` scope.
    */
    SEGMENTS_UPDATE,

    /**
    * The webhook topic for `selling_plan_groups/create` events. Notifies when a SellingPlanGroup is
    * created. Requires the `read_products` scope.
    */
    SELLING_PLAN_GROUPS_CREATE,

    /**
    * The webhook topic for `selling_plan_groups/delete` events. Notifies when a SellingPlanGroup is
    * deleted. Requires the `read_products` scope.
    */
    SELLING_PLAN_GROUPS_DELETE,

    /**
    * The webhook topic for `selling_plan_groups/update` events. Notifies when a SellingPlanGroup is
    * updated. Requires the `read_products` scope.
    */
    SELLING_PLAN_GROUPS_UPDATE,

    /**
    * The webhook topic for `shipping_addresses/create` events. Occurs whenever a shipping address is
    * created. Requires the `read_shipping` scope.
    */
    SHIPPING_ADDRESSES_CREATE,

    /**
    * The webhook topic for `shipping_addresses/update` events. Occurs whenever a shipping address is
    * updated. Requires the `read_shipping` scope.
    */
    SHIPPING_ADDRESSES_UPDATE,

    /**
    * The webhook topic for `shop/update` events. Occurs whenever a shop is updated.
    */
    SHOP_UPDATE,

    /**
    * The webhook topic for `subscription_billing_attempts/challenged` events. Occurs when the financial
    * instutition challenges the subscripttion billing attempt charge as per 3D Secure. Requires the
    * `read_own_subscription_contracts` scope.
    */
    SUBSCRIPTION_BILLING_ATTEMPTS_CHALLENGED,

    /**
    * The webhook topic for `subscription_billing_attempts/failure` events. Occurs whenever a subscription
    * billing attempt fails. Requires the `read_own_subscription_contracts` scope.
    */
    SUBSCRIPTION_BILLING_ATTEMPTS_FAILURE,

    /**
    * The webhook topic for `subscription_billing_attempts/success` events. Occurs whenever a subscription
    * billing attempt succeeds. Requires the `read_own_subscription_contracts` scope.
    */
    SUBSCRIPTION_BILLING_ATTEMPTS_SUCCESS,

    /**
    * The webhook topic for `subscription_billing_cycles/skip` events. Occurs whenever a subscription
    * contract billing cycle is skipped. Requires the `read_own_subscription_contracts` scope.
    */
    SUBSCRIPTION_BILLING_CYCLES_SKIP,

    /**
    * The webhook topic for `subscription_billing_cycles/unskip` events. Occurs whenever a subscription
    * contract billing cycle is unskipped. Requires the `read_own_subscription_contracts` scope.
    */
    SUBSCRIPTION_BILLING_CYCLES_UNSKIP,

    /**
    * The webhook topic for `subscription_billing_cycle_edits/create` events. Occurs whenever a
    * subscription contract billing cycle is edited. Requires the `read_own_subscription_contracts` scope.
    */
    SUBSCRIPTION_BILLING_CYCLE_EDITS_CREATE,

    /**
    * The webhook topic for `subscription_billing_cycle_edits/delete` events. Occurs whenever a
    * subscription contract billing cycle edit is deleted. Requires the `read_own_subscription_contracts`
    * scope.
    */
    SUBSCRIPTION_BILLING_CYCLE_EDITS_DELETE,

    /**
    * The webhook topic for `subscription_billing_cycle_edits/update` events. Occurs whenever a
    * subscription contract billing cycle edit is updated. Requires the `read_own_subscription_contracts`
    * scope.
    */
    SUBSCRIPTION_BILLING_CYCLE_EDITS_UPDATE,

    /**
    * The webhook topic for `subscription_contracts/activate` events. Occurs when a subscription contract
    * is activated. Requires the `read_own_subscription_contracts` scope.
    */
    SUBSCRIPTION_CONTRACTS_ACTIVATE,

    /**
    * The webhook topic for `subscription_contracts/cancel` events. Occurs when a subscription contract is
    * canceled. Requires the `read_own_subscription_contracts` scope.
    */
    SUBSCRIPTION_CONTRACTS_CANCEL,

    /**
    * The webhook topic for `subscription_contracts/create` events. Occurs whenever a subscription
    * contract is created. Requires the `read_own_subscription_contracts` scope.
    */
    SUBSCRIPTION_CONTRACTS_CREATE,

    /**
    * The webhook topic for `subscription_contracts/expire` events. Occurs when a subscription contract
    * expires. Requires the `read_own_subscription_contracts` scope.
    */
    SUBSCRIPTION_CONTRACTS_EXPIRE,

    /**
    * The webhook topic for `subscription_contracts/fail` events. Occurs when a subscription contract is
    * failed. Requires the `read_own_subscription_contracts` scope.
    */
    SUBSCRIPTION_CONTRACTS_FAIL,

    /**
    * The webhook topic for `subscription_contracts/pause` events. Occurs when a subscription contract is
    * paused. Requires the `read_own_subscription_contracts` scope.
    */
    SUBSCRIPTION_CONTRACTS_PAUSE,

    /**
    * The webhook topic for `subscription_contracts/update` events. Occurs whenever a subscription
    * contract is updated. Requires the `read_own_subscription_contracts` scope.
    */
    SUBSCRIPTION_CONTRACTS_UPDATE,

    /**
    * The webhook topic for `tax_partners/update` events. Occurs whenever a tax partner is created or
    * updated. Requires the `read_taxes` scope.
    */
    TAX_PARTNERS_UPDATE,

    /**
    * The webhook topic for `tax_services/create` events. Occurs whenever a tax service is created.
    * Requires the `read_taxes` scope.
    */
    TAX_SERVICES_CREATE,

    /**
    * The webhook topic for `tax_services/update` events. Occurs whenver a tax service is updated.
    * Requires the `read_taxes` scope.
    */
    TAX_SERVICES_UPDATE,

    /**
    * The webhook topic for `tender_transactions/create` events. Occurs when a tender transaction is
    * created. Requires the `read_orders` scope.
    */
    TENDER_TRANSACTIONS_CREATE,

    /**
    * The webhook topic for `themes/create` events. Occurs whenever a theme is created. Does not occur
    * when theme files are created. Requires the `read_themes` scope.
    */
    THEMES_CREATE,

    /**
    * The webhook topic for `themes/delete` events. Occurs whenever a theme is deleted. Does not occur
    * when theme files are deleted. Requires the `read_themes` scope.
    */
    THEMES_DELETE,

    /**
    * The webhook topic for `themes/publish` events. Occurs whenever a theme with the main or mobile
    * (deprecated) role is published. Requires the `read_themes` scope.
    */
    THEMES_PUBLISH,

    /**
    * The webhook topic for `themes/update` events. Occurs whenever a theme is updated. Does not occur
    * when theme files are updated. Requires the `read_themes` scope.
    */
    THEMES_UPDATE,

    /**
    * The webhook topic for `variants/in_stock` events. Occurs whenever a variant becomes in stock.
    * Requires the `read_products` scope.
    */
    VARIANTS_IN_STOCK,

    /**
    * The webhook topic for `variants/out_of_stock` events. Occurs whenever a variant becomes out of
    * stock. Requires the `read_products` scope.
    */
    VARIANTS_OUT_OF_STOCK,

    UNKNOWN_VALUE;

    public static WebhookSubscriptionTopic fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "APP_PURCHASES_ONE_TIME_UPDATE": {
                return APP_PURCHASES_ONE_TIME_UPDATE;
            }

            case "APP_SCOPES_UPDATE": {
                return APP_SCOPES_UPDATE;
            }

            case "APP_SUBSCRIPTIONS_APPROACHING_CAPPED_AMOUNT": {
                return APP_SUBSCRIPTIONS_APPROACHING_CAPPED_AMOUNT;
            }

            case "APP_SUBSCRIPTIONS_UPDATE": {
                return APP_SUBSCRIPTIONS_UPDATE;
            }

            case "APP_UNINSTALLED": {
                return APP_UNINSTALLED;
            }

            case "ATTRIBUTED_SESSIONS_FIRST": {
                return ATTRIBUTED_SESSIONS_FIRST;
            }

            case "ATTRIBUTED_SESSIONS_LAST": {
                return ATTRIBUTED_SESSIONS_LAST;
            }

            case "AUDIT_EVENTS_ADMIN_API_ACTIVITY": {
                return AUDIT_EVENTS_ADMIN_API_ACTIVITY;
            }

            case "BULK_OPERATIONS_FINISH": {
                return BULK_OPERATIONS_FINISH;
            }

            case "CARTS_CREATE": {
                return CARTS_CREATE;
            }

            case "CARTS_UPDATE": {
                return CARTS_UPDATE;
            }

            case "CHANNELS_DELETE": {
                return CHANNELS_DELETE;
            }

            case "CHECKOUTS_CREATE": {
                return CHECKOUTS_CREATE;
            }

            case "CHECKOUTS_DELETE": {
                return CHECKOUTS_DELETE;
            }

            case "CHECKOUTS_UPDATE": {
                return CHECKOUTS_UPDATE;
            }

            case "COLLECTIONS_CREATE": {
                return COLLECTIONS_CREATE;
            }

            case "COLLECTIONS_DELETE": {
                return COLLECTIONS_DELETE;
            }

            case "COLLECTIONS_UPDATE": {
                return COLLECTIONS_UPDATE;
            }

            case "COLLECTION_LISTINGS_ADD": {
                return COLLECTION_LISTINGS_ADD;
            }

            case "COLLECTION_LISTINGS_REMOVE": {
                return COLLECTION_LISTINGS_REMOVE;
            }

            case "COLLECTION_LISTINGS_UPDATE": {
                return COLLECTION_LISTINGS_UPDATE;
            }

            case "COLLECTION_PUBLICATIONS_CREATE": {
                return COLLECTION_PUBLICATIONS_CREATE;
            }

            case "COLLECTION_PUBLICATIONS_DELETE": {
                return COLLECTION_PUBLICATIONS_DELETE;
            }

            case "COLLECTION_PUBLICATIONS_UPDATE": {
                return COLLECTION_PUBLICATIONS_UPDATE;
            }

            case "COMPANIES_CREATE": {
                return COMPANIES_CREATE;
            }

            case "COMPANIES_DELETE": {
                return COMPANIES_DELETE;
            }

            case "COMPANIES_UPDATE": {
                return COMPANIES_UPDATE;
            }

            case "COMPANY_CONTACTS_CREATE": {
                return COMPANY_CONTACTS_CREATE;
            }

            case "COMPANY_CONTACTS_DELETE": {
                return COMPANY_CONTACTS_DELETE;
            }

            case "COMPANY_CONTACTS_UPDATE": {
                return COMPANY_CONTACTS_UPDATE;
            }

            case "COMPANY_CONTACT_ROLES_ASSIGN": {
                return COMPANY_CONTACT_ROLES_ASSIGN;
            }

            case "COMPANY_CONTACT_ROLES_REVOKE": {
                return COMPANY_CONTACT_ROLES_REVOKE;
            }

            case "COMPANY_LOCATIONS_CREATE": {
                return COMPANY_LOCATIONS_CREATE;
            }

            case "COMPANY_LOCATIONS_DELETE": {
                return COMPANY_LOCATIONS_DELETE;
            }

            case "COMPANY_LOCATIONS_UPDATE": {
                return COMPANY_LOCATIONS_UPDATE;
            }

            case "CUSTOMERS_CREATE": {
                return CUSTOMERS_CREATE;
            }

            case "CUSTOMERS_DELETE": {
                return CUSTOMERS_DELETE;
            }

            case "CUSTOMERS_DISABLE": {
                return CUSTOMERS_DISABLE;
            }

            case "CUSTOMERS_EMAIL_MARKETING_CONSENT_UPDATE": {
                return CUSTOMERS_EMAIL_MARKETING_CONSENT_UPDATE;
            }

            case "CUSTOMERS_ENABLE": {
                return CUSTOMERS_ENABLE;
            }

            case "CUSTOMERS_MARKETING_CONSENT_UPDATE": {
                return CUSTOMERS_MARKETING_CONSENT_UPDATE;
            }

            case "CUSTOMERS_MERGE": {
                return CUSTOMERS_MERGE;
            }

            case "CUSTOMERS_PURCHASING_SUMMARY": {
                return CUSTOMERS_PURCHASING_SUMMARY;
            }

            case "CUSTOMERS_UPDATE": {
                return CUSTOMERS_UPDATE;
            }

            case "CUSTOMER_ACCOUNT_SETTINGS_UPDATE": {
                return CUSTOMER_ACCOUNT_SETTINGS_UPDATE;
            }

            case "CUSTOMER_GROUPS_CREATE": {
                return CUSTOMER_GROUPS_CREATE;
            }

            case "CUSTOMER_GROUPS_DELETE": {
                return CUSTOMER_GROUPS_DELETE;
            }

            case "CUSTOMER_GROUPS_UPDATE": {
                return CUSTOMER_GROUPS_UPDATE;
            }

            case "CUSTOMER_JOINED_SEGMENT": {
                return CUSTOMER_JOINED_SEGMENT;
            }

            case "CUSTOMER_LEFT_SEGMENT": {
                return CUSTOMER_LEFT_SEGMENT;
            }

            case "CUSTOMER_PAYMENT_METHODS_CREATE": {
                return CUSTOMER_PAYMENT_METHODS_CREATE;
            }

            case "CUSTOMER_PAYMENT_METHODS_REVOKE": {
                return CUSTOMER_PAYMENT_METHODS_REVOKE;
            }

            case "CUSTOMER_PAYMENT_METHODS_UPDATE": {
                return CUSTOMER_PAYMENT_METHODS_UPDATE;
            }

            case "CUSTOMER_TAGS_ADDED": {
                return CUSTOMER_TAGS_ADDED;
            }

            case "CUSTOMER_TAGS_REMOVED": {
                return CUSTOMER_TAGS_REMOVED;
            }

            case "DELIVERY_PROMISE_SETTINGS_UPDATE": {
                return DELIVERY_PROMISE_SETTINGS_UPDATE;
            }

            case "DISCOUNTS_CREATE": {
                return DISCOUNTS_CREATE;
            }

            case "DISCOUNTS_DELETE": {
                return DISCOUNTS_DELETE;
            }

            case "DISCOUNTS_REDEEMCODE_ADDED": {
                return DISCOUNTS_REDEEMCODE_ADDED;
            }

            case "DISCOUNTS_REDEEMCODE_REMOVED": {
                return DISCOUNTS_REDEEMCODE_REMOVED;
            }

            case "DISCOUNTS_UPDATE": {
                return DISCOUNTS_UPDATE;
            }

            case "DISPUTES_CREATE": {
                return DISPUTES_CREATE;
            }

            case "DISPUTES_UPDATE": {
                return DISPUTES_UPDATE;
            }

            case "DOMAINS_CREATE": {
                return DOMAINS_CREATE;
            }

            case "DOMAINS_DESTROY": {
                return DOMAINS_DESTROY;
            }

            case "DOMAINS_UPDATE": {
                return DOMAINS_UPDATE;
            }

            case "DRAFT_ORDERS_CREATE": {
                return DRAFT_ORDERS_CREATE;
            }

            case "DRAFT_ORDERS_DELETE": {
                return DRAFT_ORDERS_DELETE;
            }

            case "DRAFT_ORDERS_UPDATE": {
                return DRAFT_ORDERS_UPDATE;
            }

            case "FULFILLMENTS_CREATE": {
                return FULFILLMENTS_CREATE;
            }

            case "FULFILLMENTS_UPDATE": {
                return FULFILLMENTS_UPDATE;
            }

            case "FULFILLMENT_EVENTS_CREATE": {
                return FULFILLMENT_EVENTS_CREATE;
            }

            case "FULFILLMENT_EVENTS_DELETE": {
                return FULFILLMENT_EVENTS_DELETE;
            }

            case "FULFILLMENT_HOLDS_ADDED": {
                return FULFILLMENT_HOLDS_ADDED;
            }

            case "FULFILLMENT_HOLDS_RELEASED": {
                return FULFILLMENT_HOLDS_RELEASED;
            }

            case "FULFILLMENT_ORDERS_CANCELLATION_REQUEST_ACCEPTED": {
                return FULFILLMENT_ORDERS_CANCELLATION_REQUEST_ACCEPTED;
            }

            case "FULFILLMENT_ORDERS_CANCELLATION_REQUEST_REJECTED": {
                return FULFILLMENT_ORDERS_CANCELLATION_REQUEST_REJECTED;
            }

            case "FULFILLMENT_ORDERS_CANCELLATION_REQUEST_SUBMITTED": {
                return FULFILLMENT_ORDERS_CANCELLATION_REQUEST_SUBMITTED;
            }

            case "FULFILLMENT_ORDERS_CANCELLED": {
                return FULFILLMENT_ORDERS_CANCELLED;
            }

            case "FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_ACCEPTED": {
                return FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_ACCEPTED;
            }

            case "FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_REJECTED": {
                return FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_REJECTED;
            }

            case "FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_SUBMITTED": {
                return FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_SUBMITTED;
            }

            case "FULFILLMENT_ORDERS_FULFILLMENT_SERVICE_FAILED_TO_COMPLETE": {
                return FULFILLMENT_ORDERS_FULFILLMENT_SERVICE_FAILED_TO_COMPLETE;
            }

            case "FULFILLMENT_ORDERS_HOLD_RELEASED": {
                return FULFILLMENT_ORDERS_HOLD_RELEASED;
            }

            case "FULFILLMENT_ORDERS_LINE_ITEMS_PREPARED_FOR_LOCAL_DELIVERY": {
                return FULFILLMENT_ORDERS_LINE_ITEMS_PREPARED_FOR_LOCAL_DELIVERY;
            }

            case "FULFILLMENT_ORDERS_LINE_ITEMS_PREPARED_FOR_PICKUP": {
                return FULFILLMENT_ORDERS_LINE_ITEMS_PREPARED_FOR_PICKUP;
            }

            case "FULFILLMENT_ORDERS_MERGED": {
                return FULFILLMENT_ORDERS_MERGED;
            }

            case "FULFILLMENT_ORDERS_MOVED": {
                return FULFILLMENT_ORDERS_MOVED;
            }

            case "FULFILLMENT_ORDERS_ORDER_ROUTING_COMPLETE": {
                return FULFILLMENT_ORDERS_ORDER_ROUTING_COMPLETE;
            }

            case "FULFILLMENT_ORDERS_PLACED_ON_HOLD": {
                return FULFILLMENT_ORDERS_PLACED_ON_HOLD;
            }

            case "FULFILLMENT_ORDERS_RESCHEDULED": {
                return FULFILLMENT_ORDERS_RESCHEDULED;
            }

            case "FULFILLMENT_ORDERS_SCHEDULED_FULFILLMENT_ORDER_READY": {
                return FULFILLMENT_ORDERS_SCHEDULED_FULFILLMENT_ORDER_READY;
            }

            case "FULFILLMENT_ORDERS_SPLIT": {
                return FULFILLMENT_ORDERS_SPLIT;
            }

            case "INVENTORY_ITEMS_CREATE": {
                return INVENTORY_ITEMS_CREATE;
            }

            case "INVENTORY_ITEMS_DELETE": {
                return INVENTORY_ITEMS_DELETE;
            }

            case "INVENTORY_ITEMS_UPDATE": {
                return INVENTORY_ITEMS_UPDATE;
            }

            case "INVENTORY_LEVELS_CONNECT": {
                return INVENTORY_LEVELS_CONNECT;
            }

            case "INVENTORY_LEVELS_DISCONNECT": {
                return INVENTORY_LEVELS_DISCONNECT;
            }

            case "INVENTORY_LEVELS_UPDATE": {
                return INVENTORY_LEVELS_UPDATE;
            }

            case "LOCALES_CREATE": {
                return LOCALES_CREATE;
            }

            case "LOCALES_UPDATE": {
                return LOCALES_UPDATE;
            }

            case "LOCATIONS_ACTIVATE": {
                return LOCATIONS_ACTIVATE;
            }

            case "LOCATIONS_CREATE": {
                return LOCATIONS_CREATE;
            }

            case "LOCATIONS_DEACTIVATE": {
                return LOCATIONS_DEACTIVATE;
            }

            case "LOCATIONS_DELETE": {
                return LOCATIONS_DELETE;
            }

            case "LOCATIONS_UPDATE": {
                return LOCATIONS_UPDATE;
            }

            case "MARKETS_CREATE": {
                return MARKETS_CREATE;
            }

            case "MARKETS_DELETE": {
                return MARKETS_DELETE;
            }

            case "MARKETS_UPDATE": {
                return MARKETS_UPDATE;
            }

            case "METAFIELD_DEFINITIONS_CREATE": {
                return METAFIELD_DEFINITIONS_CREATE;
            }

            case "METAFIELD_DEFINITIONS_DELETE": {
                return METAFIELD_DEFINITIONS_DELETE;
            }

            case "METAFIELD_DEFINITIONS_UPDATE": {
                return METAFIELD_DEFINITIONS_UPDATE;
            }

            case "METAOBJECTS_CREATE": {
                return METAOBJECTS_CREATE;
            }

            case "METAOBJECTS_DELETE": {
                return METAOBJECTS_DELETE;
            }

            case "METAOBJECTS_UPDATE": {
                return METAOBJECTS_UPDATE;
            }

            case "ORDERS_CANCELLED": {
                return ORDERS_CANCELLED;
            }

            case "ORDERS_CREATE": {
                return ORDERS_CREATE;
            }

            case "ORDERS_DELETE": {
                return ORDERS_DELETE;
            }

            case "ORDERS_EDITED": {
                return ORDERS_EDITED;
            }

            case "ORDERS_FULFILLED": {
                return ORDERS_FULFILLED;
            }

            case "ORDERS_PAID": {
                return ORDERS_PAID;
            }

            case "ORDERS_PARTIALLY_FULFILLED": {
                return ORDERS_PARTIALLY_FULFILLED;
            }

            case "ORDERS_RISK_ASSESSMENT_CHANGED": {
                return ORDERS_RISK_ASSESSMENT_CHANGED;
            }

            case "ORDERS_SHOPIFY_PROTECT_ELIGIBILITY_CHANGED": {
                return ORDERS_SHOPIFY_PROTECT_ELIGIBILITY_CHANGED;
            }

            case "ORDERS_UPDATED": {
                return ORDERS_UPDATED;
            }

            case "ORDER_TRANSACTIONS_CREATE": {
                return ORDER_TRANSACTIONS_CREATE;
            }

            case "PAYMENT_SCHEDULES_DUE": {
                return PAYMENT_SCHEDULES_DUE;
            }

            case "PAYMENT_TERMS_CREATE": {
                return PAYMENT_TERMS_CREATE;
            }

            case "PAYMENT_TERMS_DELETE": {
                return PAYMENT_TERMS_DELETE;
            }

            case "PAYMENT_TERMS_UPDATE": {
                return PAYMENT_TERMS_UPDATE;
            }

            case "PRODUCTS_CREATE": {
                return PRODUCTS_CREATE;
            }

            case "PRODUCTS_DELETE": {
                return PRODUCTS_DELETE;
            }

            case "PRODUCTS_UPDATE": {
                return PRODUCTS_UPDATE;
            }

            case "PRODUCT_FEEDS_CREATE": {
                return PRODUCT_FEEDS_CREATE;
            }

            case "PRODUCT_FEEDS_FULL_SYNC": {
                return PRODUCT_FEEDS_FULL_SYNC;
            }

            case "PRODUCT_FEEDS_FULL_SYNC_FINISH": {
                return PRODUCT_FEEDS_FULL_SYNC_FINISH;
            }

            case "PRODUCT_FEEDS_INCREMENTAL_SYNC": {
                return PRODUCT_FEEDS_INCREMENTAL_SYNC;
            }

            case "PRODUCT_FEEDS_UPDATE": {
                return PRODUCT_FEEDS_UPDATE;
            }

            case "PRODUCT_LISTINGS_ADD": {
                return PRODUCT_LISTINGS_ADD;
            }

            case "PRODUCT_LISTINGS_REMOVE": {
                return PRODUCT_LISTINGS_REMOVE;
            }

            case "PRODUCT_LISTINGS_UPDATE": {
                return PRODUCT_LISTINGS_UPDATE;
            }

            case "PRODUCT_PUBLICATIONS_CREATE": {
                return PRODUCT_PUBLICATIONS_CREATE;
            }

            case "PRODUCT_PUBLICATIONS_DELETE": {
                return PRODUCT_PUBLICATIONS_DELETE;
            }

            case "PRODUCT_PUBLICATIONS_UPDATE": {
                return PRODUCT_PUBLICATIONS_UPDATE;
            }

            case "PROFILES_CREATE": {
                return PROFILES_CREATE;
            }

            case "PROFILES_DELETE": {
                return PROFILES_DELETE;
            }

            case "PROFILES_UPDATE": {
                return PROFILES_UPDATE;
            }

            case "PUBLICATIONS_DELETE": {
                return PUBLICATIONS_DELETE;
            }

            case "REFUNDS_CREATE": {
                return REFUNDS_CREATE;
            }

            case "RETURNS_APPROVE": {
                return RETURNS_APPROVE;
            }

            case "RETURNS_CANCEL": {
                return RETURNS_CANCEL;
            }

            case "RETURNS_CLOSE": {
                return RETURNS_CLOSE;
            }

            case "RETURNS_DECLINE": {
                return RETURNS_DECLINE;
            }

            case "RETURNS_REOPEN": {
                return RETURNS_REOPEN;
            }

            case "RETURNS_REQUEST": {
                return RETURNS_REQUEST;
            }

            case "RETURNS_UPDATE": {
                return RETURNS_UPDATE;
            }

            case "REVERSE_DELIVERIES_ATTACH_DELIVERABLE": {
                return REVERSE_DELIVERIES_ATTACH_DELIVERABLE;
            }

            case "REVERSE_FULFILLMENT_ORDERS_DISPOSE": {
                return REVERSE_FULFILLMENT_ORDERS_DISPOSE;
            }

            case "SCHEDULED_PRODUCT_LISTINGS_ADD": {
                return SCHEDULED_PRODUCT_LISTINGS_ADD;
            }

            case "SCHEDULED_PRODUCT_LISTINGS_REMOVE": {
                return SCHEDULED_PRODUCT_LISTINGS_REMOVE;
            }

            case "SCHEDULED_PRODUCT_LISTINGS_UPDATE": {
                return SCHEDULED_PRODUCT_LISTINGS_UPDATE;
            }

            case "SEGMENTS_CREATE": {
                return SEGMENTS_CREATE;
            }

            case "SEGMENTS_DELETE": {
                return SEGMENTS_DELETE;
            }

            case "SEGMENTS_UPDATE": {
                return SEGMENTS_UPDATE;
            }

            case "SELLING_PLAN_GROUPS_CREATE": {
                return SELLING_PLAN_GROUPS_CREATE;
            }

            case "SELLING_PLAN_GROUPS_DELETE": {
                return SELLING_PLAN_GROUPS_DELETE;
            }

            case "SELLING_PLAN_GROUPS_UPDATE": {
                return SELLING_PLAN_GROUPS_UPDATE;
            }

            case "SHIPPING_ADDRESSES_CREATE": {
                return SHIPPING_ADDRESSES_CREATE;
            }

            case "SHIPPING_ADDRESSES_UPDATE": {
                return SHIPPING_ADDRESSES_UPDATE;
            }

            case "SHOP_UPDATE": {
                return SHOP_UPDATE;
            }

            case "SUBSCRIPTION_BILLING_ATTEMPTS_CHALLENGED": {
                return SUBSCRIPTION_BILLING_ATTEMPTS_CHALLENGED;
            }

            case "SUBSCRIPTION_BILLING_ATTEMPTS_FAILURE": {
                return SUBSCRIPTION_BILLING_ATTEMPTS_FAILURE;
            }

            case "SUBSCRIPTION_BILLING_ATTEMPTS_SUCCESS": {
                return SUBSCRIPTION_BILLING_ATTEMPTS_SUCCESS;
            }

            case "SUBSCRIPTION_BILLING_CYCLES_SKIP": {
                return SUBSCRIPTION_BILLING_CYCLES_SKIP;
            }

            case "SUBSCRIPTION_BILLING_CYCLES_UNSKIP": {
                return SUBSCRIPTION_BILLING_CYCLES_UNSKIP;
            }

            case "SUBSCRIPTION_BILLING_CYCLE_EDITS_CREATE": {
                return SUBSCRIPTION_BILLING_CYCLE_EDITS_CREATE;
            }

            case "SUBSCRIPTION_BILLING_CYCLE_EDITS_DELETE": {
                return SUBSCRIPTION_BILLING_CYCLE_EDITS_DELETE;
            }

            case "SUBSCRIPTION_BILLING_CYCLE_EDITS_UPDATE": {
                return SUBSCRIPTION_BILLING_CYCLE_EDITS_UPDATE;
            }

            case "SUBSCRIPTION_CONTRACTS_ACTIVATE": {
                return SUBSCRIPTION_CONTRACTS_ACTIVATE;
            }

            case "SUBSCRIPTION_CONTRACTS_CANCEL": {
                return SUBSCRIPTION_CONTRACTS_CANCEL;
            }

            case "SUBSCRIPTION_CONTRACTS_CREATE": {
                return SUBSCRIPTION_CONTRACTS_CREATE;
            }

            case "SUBSCRIPTION_CONTRACTS_EXPIRE": {
                return SUBSCRIPTION_CONTRACTS_EXPIRE;
            }

            case "SUBSCRIPTION_CONTRACTS_FAIL": {
                return SUBSCRIPTION_CONTRACTS_FAIL;
            }

            case "SUBSCRIPTION_CONTRACTS_PAUSE": {
                return SUBSCRIPTION_CONTRACTS_PAUSE;
            }

            case "SUBSCRIPTION_CONTRACTS_UPDATE": {
                return SUBSCRIPTION_CONTRACTS_UPDATE;
            }

            case "TAX_PARTNERS_UPDATE": {
                return TAX_PARTNERS_UPDATE;
            }

            case "TAX_SERVICES_CREATE": {
                return TAX_SERVICES_CREATE;
            }

            case "TAX_SERVICES_UPDATE": {
                return TAX_SERVICES_UPDATE;
            }

            case "TENDER_TRANSACTIONS_CREATE": {
                return TENDER_TRANSACTIONS_CREATE;
            }

            case "THEMES_CREATE": {
                return THEMES_CREATE;
            }

            case "THEMES_DELETE": {
                return THEMES_DELETE;
            }

            case "THEMES_PUBLISH": {
                return THEMES_PUBLISH;
            }

            case "THEMES_UPDATE": {
                return THEMES_UPDATE;
            }

            case "VARIANTS_IN_STOCK": {
                return VARIANTS_IN_STOCK;
            }

            case "VARIANTS_OUT_OF_STOCK": {
                return VARIANTS_OUT_OF_STOCK;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case APP_PURCHASES_ONE_TIME_UPDATE: {
                return "APP_PURCHASES_ONE_TIME_UPDATE";
            }

            case APP_SCOPES_UPDATE: {
                return "APP_SCOPES_UPDATE";
            }

            case APP_SUBSCRIPTIONS_APPROACHING_CAPPED_AMOUNT: {
                return "APP_SUBSCRIPTIONS_APPROACHING_CAPPED_AMOUNT";
            }

            case APP_SUBSCRIPTIONS_UPDATE: {
                return "APP_SUBSCRIPTIONS_UPDATE";
            }

            case APP_UNINSTALLED: {
                return "APP_UNINSTALLED";
            }

            case ATTRIBUTED_SESSIONS_FIRST: {
                return "ATTRIBUTED_SESSIONS_FIRST";
            }

            case ATTRIBUTED_SESSIONS_LAST: {
                return "ATTRIBUTED_SESSIONS_LAST";
            }

            case AUDIT_EVENTS_ADMIN_API_ACTIVITY: {
                return "AUDIT_EVENTS_ADMIN_API_ACTIVITY";
            }

            case BULK_OPERATIONS_FINISH: {
                return "BULK_OPERATIONS_FINISH";
            }

            case CARTS_CREATE: {
                return "CARTS_CREATE";
            }

            case CARTS_UPDATE: {
                return "CARTS_UPDATE";
            }

            case CHANNELS_DELETE: {
                return "CHANNELS_DELETE";
            }

            case CHECKOUTS_CREATE: {
                return "CHECKOUTS_CREATE";
            }

            case CHECKOUTS_DELETE: {
                return "CHECKOUTS_DELETE";
            }

            case CHECKOUTS_UPDATE: {
                return "CHECKOUTS_UPDATE";
            }

            case COLLECTIONS_CREATE: {
                return "COLLECTIONS_CREATE";
            }

            case COLLECTIONS_DELETE: {
                return "COLLECTIONS_DELETE";
            }

            case COLLECTIONS_UPDATE: {
                return "COLLECTIONS_UPDATE";
            }

            case COLLECTION_LISTINGS_ADD: {
                return "COLLECTION_LISTINGS_ADD";
            }

            case COLLECTION_LISTINGS_REMOVE: {
                return "COLLECTION_LISTINGS_REMOVE";
            }

            case COLLECTION_LISTINGS_UPDATE: {
                return "COLLECTION_LISTINGS_UPDATE";
            }

            case COLLECTION_PUBLICATIONS_CREATE: {
                return "COLLECTION_PUBLICATIONS_CREATE";
            }

            case COLLECTION_PUBLICATIONS_DELETE: {
                return "COLLECTION_PUBLICATIONS_DELETE";
            }

            case COLLECTION_PUBLICATIONS_UPDATE: {
                return "COLLECTION_PUBLICATIONS_UPDATE";
            }

            case COMPANIES_CREATE: {
                return "COMPANIES_CREATE";
            }

            case COMPANIES_DELETE: {
                return "COMPANIES_DELETE";
            }

            case COMPANIES_UPDATE: {
                return "COMPANIES_UPDATE";
            }

            case COMPANY_CONTACTS_CREATE: {
                return "COMPANY_CONTACTS_CREATE";
            }

            case COMPANY_CONTACTS_DELETE: {
                return "COMPANY_CONTACTS_DELETE";
            }

            case COMPANY_CONTACTS_UPDATE: {
                return "COMPANY_CONTACTS_UPDATE";
            }

            case COMPANY_CONTACT_ROLES_ASSIGN: {
                return "COMPANY_CONTACT_ROLES_ASSIGN";
            }

            case COMPANY_CONTACT_ROLES_REVOKE: {
                return "COMPANY_CONTACT_ROLES_REVOKE";
            }

            case COMPANY_LOCATIONS_CREATE: {
                return "COMPANY_LOCATIONS_CREATE";
            }

            case COMPANY_LOCATIONS_DELETE: {
                return "COMPANY_LOCATIONS_DELETE";
            }

            case COMPANY_LOCATIONS_UPDATE: {
                return "COMPANY_LOCATIONS_UPDATE";
            }

            case CUSTOMERS_CREATE: {
                return "CUSTOMERS_CREATE";
            }

            case CUSTOMERS_DELETE: {
                return "CUSTOMERS_DELETE";
            }

            case CUSTOMERS_DISABLE: {
                return "CUSTOMERS_DISABLE";
            }

            case CUSTOMERS_EMAIL_MARKETING_CONSENT_UPDATE: {
                return "CUSTOMERS_EMAIL_MARKETING_CONSENT_UPDATE";
            }

            case CUSTOMERS_ENABLE: {
                return "CUSTOMERS_ENABLE";
            }

            case CUSTOMERS_MARKETING_CONSENT_UPDATE: {
                return "CUSTOMERS_MARKETING_CONSENT_UPDATE";
            }

            case CUSTOMERS_MERGE: {
                return "CUSTOMERS_MERGE";
            }

            case CUSTOMERS_PURCHASING_SUMMARY: {
                return "CUSTOMERS_PURCHASING_SUMMARY";
            }

            case CUSTOMERS_UPDATE: {
                return "CUSTOMERS_UPDATE";
            }

            case CUSTOMER_ACCOUNT_SETTINGS_UPDATE: {
                return "CUSTOMER_ACCOUNT_SETTINGS_UPDATE";
            }

            case CUSTOMER_GROUPS_CREATE: {
                return "CUSTOMER_GROUPS_CREATE";
            }

            case CUSTOMER_GROUPS_DELETE: {
                return "CUSTOMER_GROUPS_DELETE";
            }

            case CUSTOMER_GROUPS_UPDATE: {
                return "CUSTOMER_GROUPS_UPDATE";
            }

            case CUSTOMER_JOINED_SEGMENT: {
                return "CUSTOMER_JOINED_SEGMENT";
            }

            case CUSTOMER_LEFT_SEGMENT: {
                return "CUSTOMER_LEFT_SEGMENT";
            }

            case CUSTOMER_PAYMENT_METHODS_CREATE: {
                return "CUSTOMER_PAYMENT_METHODS_CREATE";
            }

            case CUSTOMER_PAYMENT_METHODS_REVOKE: {
                return "CUSTOMER_PAYMENT_METHODS_REVOKE";
            }

            case CUSTOMER_PAYMENT_METHODS_UPDATE: {
                return "CUSTOMER_PAYMENT_METHODS_UPDATE";
            }

            case CUSTOMER_TAGS_ADDED: {
                return "CUSTOMER_TAGS_ADDED";
            }

            case CUSTOMER_TAGS_REMOVED: {
                return "CUSTOMER_TAGS_REMOVED";
            }

            case DELIVERY_PROMISE_SETTINGS_UPDATE: {
                return "DELIVERY_PROMISE_SETTINGS_UPDATE";
            }

            case DISCOUNTS_CREATE: {
                return "DISCOUNTS_CREATE";
            }

            case DISCOUNTS_DELETE: {
                return "DISCOUNTS_DELETE";
            }

            case DISCOUNTS_REDEEMCODE_ADDED: {
                return "DISCOUNTS_REDEEMCODE_ADDED";
            }

            case DISCOUNTS_REDEEMCODE_REMOVED: {
                return "DISCOUNTS_REDEEMCODE_REMOVED";
            }

            case DISCOUNTS_UPDATE: {
                return "DISCOUNTS_UPDATE";
            }

            case DISPUTES_CREATE: {
                return "DISPUTES_CREATE";
            }

            case DISPUTES_UPDATE: {
                return "DISPUTES_UPDATE";
            }

            case DOMAINS_CREATE: {
                return "DOMAINS_CREATE";
            }

            case DOMAINS_DESTROY: {
                return "DOMAINS_DESTROY";
            }

            case DOMAINS_UPDATE: {
                return "DOMAINS_UPDATE";
            }

            case DRAFT_ORDERS_CREATE: {
                return "DRAFT_ORDERS_CREATE";
            }

            case DRAFT_ORDERS_DELETE: {
                return "DRAFT_ORDERS_DELETE";
            }

            case DRAFT_ORDERS_UPDATE: {
                return "DRAFT_ORDERS_UPDATE";
            }

            case FULFILLMENTS_CREATE: {
                return "FULFILLMENTS_CREATE";
            }

            case FULFILLMENTS_UPDATE: {
                return "FULFILLMENTS_UPDATE";
            }

            case FULFILLMENT_EVENTS_CREATE: {
                return "FULFILLMENT_EVENTS_CREATE";
            }

            case FULFILLMENT_EVENTS_DELETE: {
                return "FULFILLMENT_EVENTS_DELETE";
            }

            case FULFILLMENT_HOLDS_ADDED: {
                return "FULFILLMENT_HOLDS_ADDED";
            }

            case FULFILLMENT_HOLDS_RELEASED: {
                return "FULFILLMENT_HOLDS_RELEASED";
            }

            case FULFILLMENT_ORDERS_CANCELLATION_REQUEST_ACCEPTED: {
                return "FULFILLMENT_ORDERS_CANCELLATION_REQUEST_ACCEPTED";
            }

            case FULFILLMENT_ORDERS_CANCELLATION_REQUEST_REJECTED: {
                return "FULFILLMENT_ORDERS_CANCELLATION_REQUEST_REJECTED";
            }

            case FULFILLMENT_ORDERS_CANCELLATION_REQUEST_SUBMITTED: {
                return "FULFILLMENT_ORDERS_CANCELLATION_REQUEST_SUBMITTED";
            }

            case FULFILLMENT_ORDERS_CANCELLED: {
                return "FULFILLMENT_ORDERS_CANCELLED";
            }

            case FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_ACCEPTED: {
                return "FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_ACCEPTED";
            }

            case FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_REJECTED: {
                return "FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_REJECTED";
            }

            case FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_SUBMITTED: {
                return "FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_SUBMITTED";
            }

            case FULFILLMENT_ORDERS_FULFILLMENT_SERVICE_FAILED_TO_COMPLETE: {
                return "FULFILLMENT_ORDERS_FULFILLMENT_SERVICE_FAILED_TO_COMPLETE";
            }

            case FULFILLMENT_ORDERS_HOLD_RELEASED: {
                return "FULFILLMENT_ORDERS_HOLD_RELEASED";
            }

            case FULFILLMENT_ORDERS_LINE_ITEMS_PREPARED_FOR_LOCAL_DELIVERY: {
                return "FULFILLMENT_ORDERS_LINE_ITEMS_PREPARED_FOR_LOCAL_DELIVERY";
            }

            case FULFILLMENT_ORDERS_LINE_ITEMS_PREPARED_FOR_PICKUP: {
                return "FULFILLMENT_ORDERS_LINE_ITEMS_PREPARED_FOR_PICKUP";
            }

            case FULFILLMENT_ORDERS_MERGED: {
                return "FULFILLMENT_ORDERS_MERGED";
            }

            case FULFILLMENT_ORDERS_MOVED: {
                return "FULFILLMENT_ORDERS_MOVED";
            }

            case FULFILLMENT_ORDERS_ORDER_ROUTING_COMPLETE: {
                return "FULFILLMENT_ORDERS_ORDER_ROUTING_COMPLETE";
            }

            case FULFILLMENT_ORDERS_PLACED_ON_HOLD: {
                return "FULFILLMENT_ORDERS_PLACED_ON_HOLD";
            }

            case FULFILLMENT_ORDERS_RESCHEDULED: {
                return "FULFILLMENT_ORDERS_RESCHEDULED";
            }

            case FULFILLMENT_ORDERS_SCHEDULED_FULFILLMENT_ORDER_READY: {
                return "FULFILLMENT_ORDERS_SCHEDULED_FULFILLMENT_ORDER_READY";
            }

            case FULFILLMENT_ORDERS_SPLIT: {
                return "FULFILLMENT_ORDERS_SPLIT";
            }

            case INVENTORY_ITEMS_CREATE: {
                return "INVENTORY_ITEMS_CREATE";
            }

            case INVENTORY_ITEMS_DELETE: {
                return "INVENTORY_ITEMS_DELETE";
            }

            case INVENTORY_ITEMS_UPDATE: {
                return "INVENTORY_ITEMS_UPDATE";
            }

            case INVENTORY_LEVELS_CONNECT: {
                return "INVENTORY_LEVELS_CONNECT";
            }

            case INVENTORY_LEVELS_DISCONNECT: {
                return "INVENTORY_LEVELS_DISCONNECT";
            }

            case INVENTORY_LEVELS_UPDATE: {
                return "INVENTORY_LEVELS_UPDATE";
            }

            case LOCALES_CREATE: {
                return "LOCALES_CREATE";
            }

            case LOCALES_UPDATE: {
                return "LOCALES_UPDATE";
            }

            case LOCATIONS_ACTIVATE: {
                return "LOCATIONS_ACTIVATE";
            }

            case LOCATIONS_CREATE: {
                return "LOCATIONS_CREATE";
            }

            case LOCATIONS_DEACTIVATE: {
                return "LOCATIONS_DEACTIVATE";
            }

            case LOCATIONS_DELETE: {
                return "LOCATIONS_DELETE";
            }

            case LOCATIONS_UPDATE: {
                return "LOCATIONS_UPDATE";
            }

            case MARKETS_CREATE: {
                return "MARKETS_CREATE";
            }

            case MARKETS_DELETE: {
                return "MARKETS_DELETE";
            }

            case MARKETS_UPDATE: {
                return "MARKETS_UPDATE";
            }

            case METAFIELD_DEFINITIONS_CREATE: {
                return "METAFIELD_DEFINITIONS_CREATE";
            }

            case METAFIELD_DEFINITIONS_DELETE: {
                return "METAFIELD_DEFINITIONS_DELETE";
            }

            case METAFIELD_DEFINITIONS_UPDATE: {
                return "METAFIELD_DEFINITIONS_UPDATE";
            }

            case METAOBJECTS_CREATE: {
                return "METAOBJECTS_CREATE";
            }

            case METAOBJECTS_DELETE: {
                return "METAOBJECTS_DELETE";
            }

            case METAOBJECTS_UPDATE: {
                return "METAOBJECTS_UPDATE";
            }

            case ORDERS_CANCELLED: {
                return "ORDERS_CANCELLED";
            }

            case ORDERS_CREATE: {
                return "ORDERS_CREATE";
            }

            case ORDERS_DELETE: {
                return "ORDERS_DELETE";
            }

            case ORDERS_EDITED: {
                return "ORDERS_EDITED";
            }

            case ORDERS_FULFILLED: {
                return "ORDERS_FULFILLED";
            }

            case ORDERS_PAID: {
                return "ORDERS_PAID";
            }

            case ORDERS_PARTIALLY_FULFILLED: {
                return "ORDERS_PARTIALLY_FULFILLED";
            }

            case ORDERS_RISK_ASSESSMENT_CHANGED: {
                return "ORDERS_RISK_ASSESSMENT_CHANGED";
            }

            case ORDERS_SHOPIFY_PROTECT_ELIGIBILITY_CHANGED: {
                return "ORDERS_SHOPIFY_PROTECT_ELIGIBILITY_CHANGED";
            }

            case ORDERS_UPDATED: {
                return "ORDERS_UPDATED";
            }

            case ORDER_TRANSACTIONS_CREATE: {
                return "ORDER_TRANSACTIONS_CREATE";
            }

            case PAYMENT_SCHEDULES_DUE: {
                return "PAYMENT_SCHEDULES_DUE";
            }

            case PAYMENT_TERMS_CREATE: {
                return "PAYMENT_TERMS_CREATE";
            }

            case PAYMENT_TERMS_DELETE: {
                return "PAYMENT_TERMS_DELETE";
            }

            case PAYMENT_TERMS_UPDATE: {
                return "PAYMENT_TERMS_UPDATE";
            }

            case PRODUCTS_CREATE: {
                return "PRODUCTS_CREATE";
            }

            case PRODUCTS_DELETE: {
                return "PRODUCTS_DELETE";
            }

            case PRODUCTS_UPDATE: {
                return "PRODUCTS_UPDATE";
            }

            case PRODUCT_FEEDS_CREATE: {
                return "PRODUCT_FEEDS_CREATE";
            }

            case PRODUCT_FEEDS_FULL_SYNC: {
                return "PRODUCT_FEEDS_FULL_SYNC";
            }

            case PRODUCT_FEEDS_FULL_SYNC_FINISH: {
                return "PRODUCT_FEEDS_FULL_SYNC_FINISH";
            }

            case PRODUCT_FEEDS_INCREMENTAL_SYNC: {
                return "PRODUCT_FEEDS_INCREMENTAL_SYNC";
            }

            case PRODUCT_FEEDS_UPDATE: {
                return "PRODUCT_FEEDS_UPDATE";
            }

            case PRODUCT_LISTINGS_ADD: {
                return "PRODUCT_LISTINGS_ADD";
            }

            case PRODUCT_LISTINGS_REMOVE: {
                return "PRODUCT_LISTINGS_REMOVE";
            }

            case PRODUCT_LISTINGS_UPDATE: {
                return "PRODUCT_LISTINGS_UPDATE";
            }

            case PRODUCT_PUBLICATIONS_CREATE: {
                return "PRODUCT_PUBLICATIONS_CREATE";
            }

            case PRODUCT_PUBLICATIONS_DELETE: {
                return "PRODUCT_PUBLICATIONS_DELETE";
            }

            case PRODUCT_PUBLICATIONS_UPDATE: {
                return "PRODUCT_PUBLICATIONS_UPDATE";
            }

            case PROFILES_CREATE: {
                return "PROFILES_CREATE";
            }

            case PROFILES_DELETE: {
                return "PROFILES_DELETE";
            }

            case PROFILES_UPDATE: {
                return "PROFILES_UPDATE";
            }

            case PUBLICATIONS_DELETE: {
                return "PUBLICATIONS_DELETE";
            }

            case REFUNDS_CREATE: {
                return "REFUNDS_CREATE";
            }

            case RETURNS_APPROVE: {
                return "RETURNS_APPROVE";
            }

            case RETURNS_CANCEL: {
                return "RETURNS_CANCEL";
            }

            case RETURNS_CLOSE: {
                return "RETURNS_CLOSE";
            }

            case RETURNS_DECLINE: {
                return "RETURNS_DECLINE";
            }

            case RETURNS_REOPEN: {
                return "RETURNS_REOPEN";
            }

            case RETURNS_REQUEST: {
                return "RETURNS_REQUEST";
            }

            case RETURNS_UPDATE: {
                return "RETURNS_UPDATE";
            }

            case REVERSE_DELIVERIES_ATTACH_DELIVERABLE: {
                return "REVERSE_DELIVERIES_ATTACH_DELIVERABLE";
            }

            case REVERSE_FULFILLMENT_ORDERS_DISPOSE: {
                return "REVERSE_FULFILLMENT_ORDERS_DISPOSE";
            }

            case SCHEDULED_PRODUCT_LISTINGS_ADD: {
                return "SCHEDULED_PRODUCT_LISTINGS_ADD";
            }

            case SCHEDULED_PRODUCT_LISTINGS_REMOVE: {
                return "SCHEDULED_PRODUCT_LISTINGS_REMOVE";
            }

            case SCHEDULED_PRODUCT_LISTINGS_UPDATE: {
                return "SCHEDULED_PRODUCT_LISTINGS_UPDATE";
            }

            case SEGMENTS_CREATE: {
                return "SEGMENTS_CREATE";
            }

            case SEGMENTS_DELETE: {
                return "SEGMENTS_DELETE";
            }

            case SEGMENTS_UPDATE: {
                return "SEGMENTS_UPDATE";
            }

            case SELLING_PLAN_GROUPS_CREATE: {
                return "SELLING_PLAN_GROUPS_CREATE";
            }

            case SELLING_PLAN_GROUPS_DELETE: {
                return "SELLING_PLAN_GROUPS_DELETE";
            }

            case SELLING_PLAN_GROUPS_UPDATE: {
                return "SELLING_PLAN_GROUPS_UPDATE";
            }

            case SHIPPING_ADDRESSES_CREATE: {
                return "SHIPPING_ADDRESSES_CREATE";
            }

            case SHIPPING_ADDRESSES_UPDATE: {
                return "SHIPPING_ADDRESSES_UPDATE";
            }

            case SHOP_UPDATE: {
                return "SHOP_UPDATE";
            }

            case SUBSCRIPTION_BILLING_ATTEMPTS_CHALLENGED: {
                return "SUBSCRIPTION_BILLING_ATTEMPTS_CHALLENGED";
            }

            case SUBSCRIPTION_BILLING_ATTEMPTS_FAILURE: {
                return "SUBSCRIPTION_BILLING_ATTEMPTS_FAILURE";
            }

            case SUBSCRIPTION_BILLING_ATTEMPTS_SUCCESS: {
                return "SUBSCRIPTION_BILLING_ATTEMPTS_SUCCESS";
            }

            case SUBSCRIPTION_BILLING_CYCLES_SKIP: {
                return "SUBSCRIPTION_BILLING_CYCLES_SKIP";
            }

            case SUBSCRIPTION_BILLING_CYCLES_UNSKIP: {
                return "SUBSCRIPTION_BILLING_CYCLES_UNSKIP";
            }

            case SUBSCRIPTION_BILLING_CYCLE_EDITS_CREATE: {
                return "SUBSCRIPTION_BILLING_CYCLE_EDITS_CREATE";
            }

            case SUBSCRIPTION_BILLING_CYCLE_EDITS_DELETE: {
                return "SUBSCRIPTION_BILLING_CYCLE_EDITS_DELETE";
            }

            case SUBSCRIPTION_BILLING_CYCLE_EDITS_UPDATE: {
                return "SUBSCRIPTION_BILLING_CYCLE_EDITS_UPDATE";
            }

            case SUBSCRIPTION_CONTRACTS_ACTIVATE: {
                return "SUBSCRIPTION_CONTRACTS_ACTIVATE";
            }

            case SUBSCRIPTION_CONTRACTS_CANCEL: {
                return "SUBSCRIPTION_CONTRACTS_CANCEL";
            }

            case SUBSCRIPTION_CONTRACTS_CREATE: {
                return "SUBSCRIPTION_CONTRACTS_CREATE";
            }

            case SUBSCRIPTION_CONTRACTS_EXPIRE: {
                return "SUBSCRIPTION_CONTRACTS_EXPIRE";
            }

            case SUBSCRIPTION_CONTRACTS_FAIL: {
                return "SUBSCRIPTION_CONTRACTS_FAIL";
            }

            case SUBSCRIPTION_CONTRACTS_PAUSE: {
                return "SUBSCRIPTION_CONTRACTS_PAUSE";
            }

            case SUBSCRIPTION_CONTRACTS_UPDATE: {
                return "SUBSCRIPTION_CONTRACTS_UPDATE";
            }

            case TAX_PARTNERS_UPDATE: {
                return "TAX_PARTNERS_UPDATE";
            }

            case TAX_SERVICES_CREATE: {
                return "TAX_SERVICES_CREATE";
            }

            case TAX_SERVICES_UPDATE: {
                return "TAX_SERVICES_UPDATE";
            }

            case TENDER_TRANSACTIONS_CREATE: {
                return "TENDER_TRANSACTIONS_CREATE";
            }

            case THEMES_CREATE: {
                return "THEMES_CREATE";
            }

            case THEMES_DELETE: {
                return "THEMES_DELETE";
            }

            case THEMES_PUBLISH: {
                return "THEMES_PUBLISH";
            }

            case THEMES_UPDATE: {
                return "THEMES_UPDATE";
            }

            case VARIANTS_IN_STOCK: {
                return "VARIANTS_IN_STOCK";
            }

            case VARIANTS_OUT_OF_STOCK: {
                return "VARIANTS_OUT_OF_STOCK";
            }

            default: {
                return "";
            }
        }
    }
}

