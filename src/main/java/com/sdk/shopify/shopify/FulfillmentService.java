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

import java.util.Map;

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
public class FulfillmentService extends AbstractResponse<FulfillmentService> {
    public FulfillmentService() {
    }

    public FulfillmentService(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "callbackUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "inventoryManagement": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "location": {
                    Location optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Location(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "permitsSkuSharing": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "serviceName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "trackingSupport": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "type": {
                    responseData.put(key, FulfillmentServiceType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "FulfillmentService";
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

    public String getCallbackUrl() {
        return (String) get("callbackUrl");
    }

    public FulfillmentService setCallbackUrl(String arg) {
        optimisticData.put(getKey("callbackUrl"), arg);
        return this;
    }

    /**
    * Human-readable unique identifier for this fulfillment service.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public FulfillmentService setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * The ID of the fulfillment service.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public FulfillmentService setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * Whether the fulfillment service tracks product inventory and provides updates to Shopify.
    */

    public Boolean getInventoryManagement() {
        return (Boolean) get("inventoryManagement");
    }

    public FulfillmentService setInventoryManagement(Boolean arg) {
        optimisticData.put(getKey("inventoryManagement"), arg);
        return this;
    }

    /**
    * Location associated with the fulfillment service.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public FulfillmentService setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * Whether the fulfillment service can stock inventory alongside other locations.
    */

    public Boolean getPermitsSkuSharing() {
        return (Boolean) get("permitsSkuSharing");
    }

    public FulfillmentService setPermitsSkuSharing(Boolean arg) {
        optimisticData.put(getKey("permitsSkuSharing"), arg);
        return this;
    }

    /**
    * The name of the fulfillment service as seen by merchants.
    */

    public String getServiceName() {
        return (String) get("serviceName");
    }

    public FulfillmentService setServiceName(String arg) {
        optimisticData.put(getKey("serviceName"), arg);
        return this;
    }

    /**
    * Whether the fulfillment service implemented the /fetch_tracking_numbers endpoint.
    */

    public Boolean getTrackingSupport() {
        return (Boolean) get("trackingSupport");
    }

    public FulfillmentService setTrackingSupport(Boolean arg) {
        optimisticData.put(getKey("trackingSupport"), arg);
        return this;
    }

    /**
    * Type associated with the fulfillment service.
    */

    public FulfillmentServiceType getType() {
        return (FulfillmentServiceType) get("type");
    }

    public FulfillmentService setType(FulfillmentServiceType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "callbackUrl": return false;

            case "handle": return false;

            case "id": return false;

            case "inventoryManagement": return false;

            case "location": return true;

            case "permitsSkuSharing": return false;

            case "serviceName": return false;

            case "trackingSupport": return false;

            case "type": return false;

            default: return false;
        }
    }
}

