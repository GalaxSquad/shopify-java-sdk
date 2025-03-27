// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A **Fulfillment Service** is a third party warehouse that prepares and ships orders
* on behalf of the store owner. Fulfillment services charge a fee to package and ship items
* and update product inventory levels. Some well known fulfillment services with Shopify integrations
* include: Amazon, Shipwire, and Rakuten. When an app registers a new `FulfillmentService` on a store,
* Shopify automatically creates a `Location` that's associated to the fulfillment service.
* To learn more about fulfillment services, refer to
* [Manage fulfillments as a fulfillment service
* app](https://shopify.dev/apps/fulfillment/fulfillment-service-apps)
* guide.
* ## Mutations
* You can work with the `FulfillmentService` object with the
* [fulfillmentServiceCreate](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentService
* Create),
* [fulfillmentServiceUpdate](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentService
* Update),
* and
* [fulfillmentServiceDelete](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentService
* Delete)
* mutations.
* ## Hosted endpoints
* Fulfillment service providers integrate with Shopify by providing Shopify with a set of hosted
* endpoints that
* Shopify can query on certain conditions.
* These endpoints must have a common prefix, and this prefix should be supplied in the `callbackUrl`
* parameter
* in the
* [fulfillmentServiceCreate](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentService
* Create)
* mutation.
* - Shopify sends POST requests to the `<callbackUrl>/fulfillment_order_notification` endpoint
* to notify the fulfillment service about fulfillment requests and fulfillment cancellation requests.
* For more information, refer to
* [Receive fulfillment requests and
* cancellations](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments#ste
* p-2-receive-fulfillment-requests-and-cancellations).
* - Shopify sends GET requests to the `<callbackUrl>/fetch_tracking_numbers` endpoint to retrieve
* tracking numbers for orders
* if `trackingSupport` is set to `true`.
* For more information, refer to
* [Enable tracking
* support](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments#step-8-en
* able-tracking-support-optional).
* Fulfillment services can also update tracking information using the
* [fulfillmentTrackingInfoUpdate](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentTr
* ackingInfoUpdate) mutation,
* rather than waiting for Shopify to ask for tracking numbers.
* - Shopify sends GET requests to the `<callbackUrl>/fetch_stock` endpoint to retrieve
* on hand inventory levels for the fulfillment service location if `inventoryManagement` is set to
* `true`.
* For more information, refer to
* [Sharing inventory levels with
* Shopify](https://shopify.dev/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfil
* lment-services#step-10-optional-share-inventory-levels-with-shopify).
* To make sure you have everything set up correctly, you can test the `callbackUrl`-prefixed endpoints
* in your development store.
* ## Resources and webhooks
* There are a variety of objects and webhooks that enable a fulfillment service to work.
* To exchange fulfillment information with Shopify, fulfillment services use the
* [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder),
* [Fulfillment](https://shopify.dev/api/admin-graphql/latest/objects/Fulfillment) and
* [Order](https://shopify.dev/api/admin-graphql/latest/objects/Order) objects and related mutations.
* To act on fulfillment process events that happen on the Shopify side,
* besides awaiting calls to `callbackUrl`-prefixed endpoints,
* fulfillment services can subscribe to the
* [fulfillment
* order](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments#webhooks)
* and [order](https://shopify.dev/api/admin-rest/latest/resources/webhook)
* webhooks.
*/
public class FulfillmentServiceQuery extends Query<FulfillmentServiceQuery> {
    FulfillmentServiceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The callback URL that the fulfillment service has registered for requests. The following
    * considerations apply:
    * - Shopify queries the `<callbackUrl>/fetch_tracking_numbers` endpoint to retrieve tracking numbers
    * for orders, if `trackingSupport` is set to `true`.
    * - Shopify queries the `<callbackUrl>/fetch_stock` endpoint to retrieve inventory levels,
    * if `inventoryManagement` is set to `true`.
    * - Shopify uses the `<callbackUrl>/fulfillment_order_notification` endpoint to send
    * [fulfillment and cancellation
    * requests](https://shopify.dev/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfi
    * llment-services#step-9-optional-enable-tracking-support).
    */
    public FulfillmentServiceQuery callbackUrl() {
        startField("callbackUrl");

        return this;
    }

    /**
    * Human-readable unique identifier for this fulfillment service.
    */
    public FulfillmentServiceQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * The ID of the fulfillment service.
    */
    public FulfillmentServiceQuery id() {
        startField("id");

        return this;
    }

    /**
    * Whether the fulfillment service tracks product inventory and provides updates to Shopify.
    */
    public FulfillmentServiceQuery inventoryManagement() {
        startField("inventoryManagement");

        return this;
    }

    /**
    * Location associated with the fulfillment service.
    */
    public FulfillmentServiceQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the fulfillment service can stock inventory alongside other locations.
    */
    public FulfillmentServiceQuery permitsSkuSharing() {
        startField("permitsSkuSharing");

        return this;
    }

    /**
    * The name of the fulfillment service as seen by merchants.
    */
    public FulfillmentServiceQuery serviceName() {
        startField("serviceName");

        return this;
    }

    /**
    * Whether the fulfillment service implemented the /fetch_tracking_numbers endpoint.
    */
    public FulfillmentServiceQuery trackingSupport() {
        startField("trackingSupport");

        return this;
    }

    /**
    * Type associated with the fulfillment service.
    */
    public FulfillmentServiceQuery type() {
        startField("type");

        return this;
    }
}
