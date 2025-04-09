// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The FulfillmentOrder object represents either an item or a group of items in an
* [Order](https://shopify.dev/api/admin-graphql/latest/objects/Order)
* that are expected to be fulfilled from the same location.
* There can be more than one fulfillment order for an
* [order](https://shopify.dev/api/admin-graphql/latest/objects/Order)
* at a given location.
* {{ '/api/reference/fulfillment_order_relationships.png' | image }}
* Fulfillment orders represent the work which is intended to be done in relation to an order.
* When fulfillment has started for one or more line items, a
* [Fulfillment](https://shopify.dev/api/admin-graphql/latest/objects/Fulfillment)
* is created by a merchant or third party to represent the ongoing or completed work of fulfillment.
* [See below for more details on creating
* fulfillments](#the-lifecycle-of-a-fulfillment-order-at-a-location-which-is-managed-by-a-fulfillment-
* service).
* > Note:
* > Shopify creates fulfillment orders automatically when an order is created.
* > It is not possible to manually create fulfillment orders.
* >
* > [See below for more details on the lifecycle of a fulfillment
* order](#the-lifecycle-of-a-fulfillment-order).
* ## Retrieving fulfillment orders
* ### Fulfillment orders from an order
* All fulfillment orders related to a given order can be retrieved with the
* [Order.fulfillmentOrders](https://shopify.dev/api/admin-graphql/latest/objects/Order#connection-orde
* r-fulfillmentorders)
* connection.
* [API access scopes](#api-access-scopes)
* govern which fulfillments orders are returned to clients.
* An API client will only receive a subset of the fulfillment orders which belong to an order
* if they don't have the necessary access scopes to view all of the fulfillment orders.
* ### Fulfillment orders assigned to the app for fulfillment
* Fulfillment service apps can retrieve the fulfillment orders which have been assigned to their
* locations with the
* [assignedFulfillmentOrders](https://shopify.dev/api/admin-graphql/2024-07/objects/queryroot#connecti
* on-assignedfulfillmentorders)
* connection.
* Use the `assignmentStatus` argument to control whether all assigned fulfillment orders
* should be returned or only those where a merchant has sent a
* [fulfillment
* request](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrderMerchantRequest)
* and it has yet to be responded to.
* The API client must be granted the `read_assigned_fulfillment_orders` access scope to access
* the assigned fulfillment orders.
* ### All fulfillment orders
* Apps can retrieve all fulfillment orders with the
* [fulfillmentOrders](https://shopify.dev/api/admin-graphql/latest/queries/fulfillmentOrders)
* query. This query returns all assigned, merchant-managed, and third-party fulfillment orders on the
* shop,
* which are accessible to the app according to the
* [fulfillment order access scopes](#api-access-scopes) it was granted with.
* ## The lifecycle of a fulfillment order
* ### Fulfillment Order Creation
* After an order is created, a background worker performs the order routing process which determines
* which locations will be responsible for fulfilling the purchased items.
* Once the order routing process is complete, one or more fulfillment orders will be created
* and assigned to these locations. It is not possible to manually create fulfillment orders.
* Once a fulfillment order has been created, it will have one of two different lifecycles depending on
* the type of location which the fulfillment order is assigned to.
* ### The lifecycle of a fulfillment order at a merchant managed location
* Fulfillment orders are completed by creating
* [fulfillments](https://shopify.dev/api/admin-graphql/latest/objects/Fulfillment).
* Fulfillments represents the work done.
* For digital products a merchant or an order management app would create a fulfilment once the
* digital asset
* has been provisioned.
* For example, in the case of a digital gift card, a merchant would to do this once
* the gift card has been activated - before the email has been shipped.
* On the other hand, for a traditional shipped order,
* a merchant or an order management app would create a fulfillment after picking and packing the items
* relating
* to a fulfillment order, but before the courier has collected the goods.
* [Learn about managing fulfillment orders as an order management
* app](https://shopify.dev/apps/fulfillment/order-management-apps/manage-fulfillments).
* ### The lifecycle of a fulfillment order at a location which is managed by a fulfillment service
* For fulfillment orders which are assigned to a location that is managed by a fulfillment service,
* a merchant or an Order Management App can
* [send a fulfillment
* request](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderSubmitFulfillmentReq
* uest)
* to the fulfillment service which operates the location to request that they fulfill the associated
* items.
* A fulfillment service has the option to
* [accept](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderAcceptFulfillmentReq
* uest)
* or
* [reject](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderRejectFulfillmentReq
* uest)
* this fulfillment request.
* Once the fulfillment service has accepted the request, the request can no longer be cancelled by the
* merchant
* or order management app and instead a
* [cancellation request must be
* submitted](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderSubmitCancellation
* Request)
* to the fulfillment service.
* Once a fulfillment service accepts a fulfillment request,
* then after they are ready to pack items and send them for delivery, they create fulfillments with
* the
* [fulfillmentCreate](https://shopify.dev/api/admin-graphql/unstable/mutations/fulfillmentCreate)
* mutation.
* They can provide tracking information right away or create fulfillments without it and then
* update the tracking information for fulfillments with the
* [fulfillmentTrackingInfoUpdate](https://shopify.dev/api/admin-graphql/unstable/mutations/fulfillment
* TrackingInfoUpdate)
* mutation.
* [Learn about managing fulfillment orders as a fulfillment
* service](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments).
* ## API access scopes
* Fulfillment orders are governed by the following API access scopes:
* * The `read_merchant_managed_fulfillment_orders` and
* `write_merchant_managed_fulfillment_orders` access scopes
* grant access to fulfillment orders assigned to merchant-managed locations.
* * The `read_assigned_fulfillment_orders` and `write_assigned_fulfillment_orders`
* access scopes are intended for fulfillment services.
* These scopes grant access to fulfillment orders assigned to locations that are being managed
* by fulfillment services.
* * The `read_third_party_fulfillment_orders` and `write_third_party_fulfillment_orders`
* access scopes grant access to fulfillment orders
* assigned to locations managed by other fulfillment services.
* ### Fulfillment service app access scopes
* Usually, **fulfillment services** have the `write_assigned_fulfillment_orders` access scope
* and don't have the `*_third_party_fulfillment_orders`
* or `*_merchant_managed_fulfillment_orders` access scopes.
* The app will only have access to the fulfillment orders assigned to their location
* (or multiple locations if the app registers multiple fulfillment services on the shop).
* The app will not have access to fulfillment orders assigned to merchant-managed locations
* or locations owned by other fulfillment service apps.
* ### Order management app access scopes
* **Order management apps** will usually request `write_merchant_managed_fulfillment_orders` and
* `write_third_party_fulfillment_orders` access scopes. This will allow them to manage all fulfillment
* orders
* on behalf of a merchant.
* If an app combines the functions of an order management app and a fulfillment service,
* then the app should request all
* access scopes to manage all assigned and all unassigned fulfillment orders.
* ## Notifications about fulfillment orders
* Fulfillment services are required to
* [register](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentService)
* a self-hosted callback URL which has a number of uses. One of these uses is that this callback URL
* will be notified
* whenever a merchant submits a fulfillment or cancellation request.
* Both merchants and apps can
* [subscribe](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments#webhoo
* ks)
* to the
* [fulfillment order
* webhooks](https://shopify.dev/api/admin-graphql/latest/enums/WebhookSubscriptionTopic#value-fulfillm
* entorderscancellationrequestaccepted)
* to be notified whenever fulfillment order related domain events occur.
* [Learn about fulfillment workflows](https://shopify.dev/apps/fulfillment).
*/
public class FulfillmentOrder extends AbstractResponse<FulfillmentOrder> implements MetafieldReferencer, Node {
    public FulfillmentOrder() {
    }

    public FulfillmentOrder(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "assignedLocation": {
                    responseData.put(key, new FulfillmentOrderAssignedLocation(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "channelId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "deliveryMethod": {
                    DeliveryMethod optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryMethod(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "destination": {
                    FulfillmentOrderDestination optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderDestination(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillBy": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentHolds": {
                    List<FulfillmentHold> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentHold(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "fulfillmentOrdersForMerge": {
                    responseData.put(key, new FulfillmentOrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "fulfillments": {
                    responseData.put(key, new FulfillmentConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "internationalDuties": {
                    FulfillmentOrderInternationalDuties optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderInternationalDuties(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lineItems": {
                    responseData.put(key, new FulfillmentOrderLineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "locationsForMove": {
                    responseData.put(key, new FulfillmentOrderLocationForMoveConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "merchantRequests": {
                    responseData.put(key, new FulfillmentOrderMerchantRequestConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "order": {
                    responseData.put(key, new Order(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "orderId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "orderName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "orderProcessedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "requestStatus": {
                    responseData.put(key, FulfillmentOrderRequestStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, FulfillmentOrderStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "supportedActions": {
                    List<FulfillmentOrderSupportedAction> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentOrderSupportedAction(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public FulfillmentOrder(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "FulfillmentOrder";
    }

    /**
    * The fulfillment order's assigned location. This is the location where the fulfillment is expected to
    * happen.
    * The fulfillment order's assigned location might change in the following cases:
    * - The fulfillment order has been entirely moved to a new location. For example, the
    * [fulfillmentOrderMove](
        * https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove
        * ) mutation has been called, and you see the original fulfillment order in the
        * [movedFulfillmentOrder](
            * https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove#field-fulfillmentordermo
            * vepayload-movedfulfillmentorder
            * ) field within the mutation's response.
            * - Work on the fulfillment order hasn't yet begun, which means that the fulfillment order has the
            * [OPEN](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-open),
            * [SCHEDULED](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-schedule
            * d), or
            * [ON_HOLD](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-onhold)
            * status, and the shop's location properties might be undergoing edits (for example, in the Shopify
            * admin).
            */

            public FulfillmentOrderAssignedLocation getAssignedLocation() {
                return (FulfillmentOrderAssignedLocation) get("assignedLocation");
            }

            public FulfillmentOrder setAssignedLocation(FulfillmentOrderAssignedLocation arg) {
                optimisticData.put(getKey("assignedLocation"), arg);
                return this;
            }

            /**
            * ID of the channel that created the order.
            */

            public ID getChannelId() {
                return (ID) get("channelId");
            }

            public FulfillmentOrder setChannelId(ID arg) {
                optimisticData.put(getKey("channelId"), arg);
                return this;
            }

            /**
            * Date and time when the fulfillment order was created.
            */

            public String getCreatedAt() {
                return (String) get("createdAt");
            }

            public FulfillmentOrder setCreatedAt(String arg) {
                optimisticData.put(getKey("createdAt"), arg);
                return this;
            }

            /**
            * Delivery method of this fulfillment order.
            */

            public DeliveryMethod getDeliveryMethod() {
                return (DeliveryMethod) get("deliveryMethod");
            }

            public FulfillmentOrder setDeliveryMethod(DeliveryMethod arg) {
                optimisticData.put(getKey("deliveryMethod"), arg);
                return this;
            }

            /**
            * The destination where the items should be sent.
            */

            public FulfillmentOrderDestination getDestination() {
                return (FulfillmentOrderDestination) get("destination");
            }

            public FulfillmentOrder setDestination(FulfillmentOrderDestination arg) {
                optimisticData.put(getKey("destination"), arg);
                return this;
            }

            /**
            * The date and time at which the fulfillment order will be fulfillable. When this date and time is
            * reached, the scheduled fulfillment order is automatically transitioned to open. For example, the
            * `fulfill_at` date for a subscription order might be the 1st of each month, a pre-order `fulfill_at`
            * date would be `nil`, and a standard order `fulfill_at` date would be the order creation date.
            */

            public String getFulfillAt() {
                return (String) get("fulfillAt");
            }

            public FulfillmentOrder setFulfillAt(String arg) {
                optimisticData.put(getKey("fulfillAt"), arg);
                return this;
            }

            /**
            * The latest date and time by which all items in the fulfillment order need to be fulfilled.
            */

            public String getFulfillBy() {
                return (String) get("fulfillBy");
            }

            public FulfillmentOrder setFulfillBy(String arg) {
                optimisticData.put(getKey("fulfillBy"), arg);
                return this;
            }

            /**
            * The fulfillment holds applied on the fulfillment order.
            */

            public List<FulfillmentHold> getFulfillmentHolds() {
                return (List<FulfillmentHold>) get("fulfillmentHolds");
            }

            public FulfillmentOrder setFulfillmentHolds(List<FulfillmentHold> arg) {
                optimisticData.put(getKey("fulfillmentHolds"), arg);
                return this;
            }

            /**
            * Fulfillment orders eligible for merging with the given fulfillment order.
            */

            public FulfillmentOrderConnection getFulfillmentOrdersForMerge() {
                return (FulfillmentOrderConnection) get("fulfillmentOrdersForMerge");
            }

            public FulfillmentOrder setFulfillmentOrdersForMerge(FulfillmentOrderConnection arg) {
                optimisticData.put(getKey("fulfillmentOrdersForMerge"), arg);
                return this;
            }

            /**
            * A list of fulfillments for the fulfillment order.
            */

            public FulfillmentConnection getFulfillments() {
                return (FulfillmentConnection) get("fulfillments");
            }

            public FulfillmentOrder setFulfillments(FulfillmentConnection arg) {
                optimisticData.put(getKey("fulfillments"), arg);
                return this;
            }

            /**
            * A globally-unique ID.
            */

            public ID getId() {
                return (ID) get("id");
            }

            /**
            * The duties delivery method of this fulfillment order.
            */

            public FulfillmentOrderInternationalDuties getInternationalDuties() {
                return (FulfillmentOrderInternationalDuties) get("internationalDuties");
            }

            public FulfillmentOrder setInternationalDuties(FulfillmentOrderInternationalDuties arg) {
                optimisticData.put(getKey("internationalDuties"), arg);
                return this;
            }

            /**
            * A list of the fulfillment order's line items.
            */

            public FulfillmentOrderLineItemConnection getLineItems() {
                return (FulfillmentOrderLineItemConnection) get("lineItems");
            }

            public FulfillmentOrder setLineItems(FulfillmentOrderLineItemConnection arg) {
                optimisticData.put(getKey("lineItems"), arg);
                return this;
            }

            /**
            * A list of locations that the fulfillment order can potentially move to.
            */

            public FulfillmentOrderLocationForMoveConnection getLocationsForMove() {
                return (FulfillmentOrderLocationForMoveConnection) get("locationsForMove");
            }

            public FulfillmentOrder setLocationsForMove(FulfillmentOrderLocationForMoveConnection arg) {
                optimisticData.put(getKey("locationsForMove"), arg);
                return this;
            }

            /**
            * A list of requests sent by the merchant or an order management app to the fulfillment service for
            * the fulfillment order.
            */

            public FulfillmentOrderMerchantRequestConnection getMerchantRequests() {
                return (FulfillmentOrderMerchantRequestConnection) get("merchantRequests");
            }

            public FulfillmentOrder setMerchantRequests(FulfillmentOrderMerchantRequestConnection arg) {
                optimisticData.put(getKey("merchantRequests"), arg);
                return this;
            }

            /**
            * The order that's associated with the fulfillment order.
            */

            public Order getOrder() {
                return (Order) get("order");
            }

            public FulfillmentOrder setOrder(Order arg) {
                optimisticData.put(getKey("order"), arg);
                return this;
            }

            /**
            * ID of the order that's associated with the fulfillment order.
            */

            public ID getOrderId() {
                return (ID) get("orderId");
            }

            public FulfillmentOrder setOrderId(ID arg) {
                optimisticData.put(getKey("orderId"), arg);
                return this;
            }

            /**
            * The unique identifier for the order that appears on the order page in the Shopify admin and the
            * <b>Order status</b> page.
            * For example, "#1001", "EN1001", or "1001-A".
            * This value isn't unique across multiple stores.
            */

            public String getOrderName() {
                return (String) get("orderName");
            }

            public FulfillmentOrder setOrderName(String arg) {
                optimisticData.put(getKey("orderName"), arg);
                return this;
            }

            /**
            * The date and time when the order was processed.
            * This date and time might not match the date and time when the order was created.
            */

            public String getOrderProcessedAt() {
                return (String) get("orderProcessedAt");
            }

            public FulfillmentOrder setOrderProcessedAt(String arg) {
                optimisticData.put(getKey("orderProcessedAt"), arg);
                return this;
            }

            /**
            * The request status of the fulfillment order.
            */

            public FulfillmentOrderRequestStatus getRequestStatus() {
                return (FulfillmentOrderRequestStatus) get("requestStatus");
            }

            public FulfillmentOrder setRequestStatus(FulfillmentOrderRequestStatus arg) {
                optimisticData.put(getKey("requestStatus"), arg);
                return this;
            }

            /**
            * The status of the fulfillment order.
            */

            public FulfillmentOrderStatus getStatus() {
                return (FulfillmentOrderStatus) get("status");
            }

            public FulfillmentOrder setStatus(FulfillmentOrderStatus arg) {
                optimisticData.put(getKey("status"), arg);
                return this;
            }

            /**
            * The actions that can be performed on this fulfillment order.
            */

            public List<FulfillmentOrderSupportedAction> getSupportedActions() {
                return (List<FulfillmentOrderSupportedAction>) get("supportedActions");
            }

            public FulfillmentOrder setSupportedActions(List<FulfillmentOrderSupportedAction> arg) {
                optimisticData.put(getKey("supportedActions"), arg);
                return this;
            }

            /**
            * The date and time when the fulfillment order was last updated.
            */

            public String getUpdatedAt() {
                return (String) get("updatedAt");
            }

            public FulfillmentOrder setUpdatedAt(String arg) {
                optimisticData.put(getKey("updatedAt"), arg);
                return this;
            }

            public boolean unwrapsToObject(String key) {
                switch (getFieldName(key)) {
                    case "assignedLocation": return true;

                    case "channelId": return false;

                    case "createdAt": return false;

                    case "deliveryMethod": return true;

                    case "destination": return true;

                    case "fulfillAt": return false;

                    case "fulfillBy": return false;

                    case "fulfillmentHolds": return true;

                    case "fulfillmentOrdersForMerge": return true;

                    case "fulfillments": return true;

                    case "id": return false;

                    case "internationalDuties": return true;

                    case "lineItems": return true;

                    case "locationsForMove": return true;

                    case "merchantRequests": return true;

                    case "order": return true;

                    case "orderId": return false;

                    case "orderName": return false;

                    case "orderProcessedAt": return false;

                    case "requestStatus": return false;

                    case "status": return false;

                    case "supportedActions": return true;

                    case "updatedAt": return false;

                    default: return false;
                }
            }
        }

