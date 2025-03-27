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
public class FulfillmentOrderQuery extends Query<FulfillmentOrderQuery> {
    FulfillmentOrderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
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
            public FulfillmentOrderQuery assignedLocation(FulfillmentOrderAssignedLocationQueryDefinition queryDef) {
                startField("assignedLocation");

                _queryBuilder.append('{');
                queryDef.define(new FulfillmentOrderAssignedLocationQuery(_queryBuilder));
                _queryBuilder.append('}');

                return this;
            }

            /**
            * ID of the channel that created the order.
            */
            public FulfillmentOrderQuery channelId() {
                startField("channelId");

                return this;
            }

            /**
            * Date and time when the fulfillment order was created.
            */
            public FulfillmentOrderQuery createdAt() {
                startField("createdAt");

                return this;
            }

            /**
            * Delivery method of this fulfillment order.
            */
            public FulfillmentOrderQuery deliveryMethod(DeliveryMethodQueryDefinition queryDef) {
                startField("deliveryMethod");

                _queryBuilder.append('{');
                queryDef.define(new DeliveryMethodQuery(_queryBuilder));
                _queryBuilder.append('}');

                return this;
            }

            /**
            * The destination where the items should be sent.
            */
            public FulfillmentOrderQuery destination(FulfillmentOrderDestinationQueryDefinition queryDef) {
                startField("destination");

                _queryBuilder.append('{');
                queryDef.define(new FulfillmentOrderDestinationQuery(_queryBuilder));
                _queryBuilder.append('}');

                return this;
            }

            /**
            * The date and time at which the fulfillment order will be fulfillable. When this date and time is
            * reached, the scheduled fulfillment order is automatically transitioned to open. For example, the
            * `fulfill_at` date for a subscription order might be the 1st of each month, a pre-order `fulfill_at`
            * date would be `nil`, and a standard order `fulfill_at` date would be the order creation date.
            */
            public FulfillmentOrderQuery fulfillAt() {
                startField("fulfillAt");

                return this;
            }

            /**
            * The latest date and time by which all items in the fulfillment order need to be fulfilled.
            */
            public FulfillmentOrderQuery fulfillBy() {
                startField("fulfillBy");

                return this;
            }

            /**
            * The fulfillment holds applied on the fulfillment order.
            */
            public FulfillmentOrderQuery fulfillmentHolds(FulfillmentHoldQueryDefinition queryDef) {
                startField("fulfillmentHolds");

                _queryBuilder.append('{');
                queryDef.define(new FulfillmentHoldQuery(_queryBuilder));
                _queryBuilder.append('}');

                return this;
            }

            public class FulfillmentOrdersForMergeArguments extends Arguments {
                FulfillmentOrdersForMergeArguments(StringBuilder _queryBuilder) {
                    super(_queryBuilder, true);
                }

                /**
                * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
                */
                public FulfillmentOrdersForMergeArguments first(Integer value) {
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
                public FulfillmentOrdersForMergeArguments after(String value) {
                    if (value != null) {
                        startArgument("after");
                        Query.appendQuotedString(_queryBuilder, value.toString());
                    }
                    return this;
                }

                /**
                * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
                */
                public FulfillmentOrdersForMergeArguments last(Integer value) {
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
                public FulfillmentOrdersForMergeArguments before(String value) {
                    if (value != null) {
                        startArgument("before");
                        Query.appendQuotedString(_queryBuilder, value.toString());
                    }
                    return this;
                }

                /**
                * Reverse the order of the underlying list.
                */
                public FulfillmentOrdersForMergeArguments reverse(Boolean value) {
                    if (value != null) {
                        startArgument("reverse");
                        _queryBuilder.append(value);
                    }
                    return this;
                }
            }

            public interface FulfillmentOrdersForMergeArgumentsDefinition {
                void define(FulfillmentOrdersForMergeArguments args);
            }

            /**
            * Fulfillment orders eligible for merging with the given fulfillment order.
            */
            public FulfillmentOrderQuery fulfillmentOrdersForMerge(FulfillmentOrderConnectionQueryDefinition queryDef) {
                return fulfillmentOrdersForMerge(args -> {}, queryDef);
            }

            /**
            * Fulfillment orders eligible for merging with the given fulfillment order.
            */
            public FulfillmentOrderQuery fulfillmentOrdersForMerge(FulfillmentOrdersForMergeArgumentsDefinition argsDef, FulfillmentOrderConnectionQueryDefinition queryDef) {
                startField("fulfillmentOrdersForMerge");

                FulfillmentOrdersForMergeArguments args = new FulfillmentOrdersForMergeArguments(_queryBuilder);
                argsDef.define(args);
                FulfillmentOrdersForMergeArguments.end(args);

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
                * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
                */
                public FulfillmentsArguments first(Integer value) {
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
                public FulfillmentsArguments after(String value) {
                    if (value != null) {
                        startArgument("after");
                        Query.appendQuotedString(_queryBuilder, value.toString());
                    }
                    return this;
                }

                /**
                * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
                */
                public FulfillmentsArguments last(Integer value) {
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
                public FulfillmentsArguments before(String value) {
                    if (value != null) {
                        startArgument("before");
                        Query.appendQuotedString(_queryBuilder, value.toString());
                    }
                    return this;
                }

                /**
                * Reverse the order of the underlying list.
                */
                public FulfillmentsArguments reverse(Boolean value) {
                    if (value != null) {
                        startArgument("reverse");
                        _queryBuilder.append(value);
                    }
                    return this;
                }
            }

            public interface FulfillmentsArgumentsDefinition {
                void define(FulfillmentsArguments args);
            }

            /**
            * A list of fulfillments for the fulfillment order.
            */
            public FulfillmentOrderQuery fulfillments(FulfillmentConnectionQueryDefinition queryDef) {
                return fulfillments(args -> {}, queryDef);
            }

            /**
            * A list of fulfillments for the fulfillment order.
            */
            public FulfillmentOrderQuery fulfillments(FulfillmentsArgumentsDefinition argsDef, FulfillmentConnectionQueryDefinition queryDef) {
                startField("fulfillments");

                FulfillmentsArguments args = new FulfillmentsArguments(_queryBuilder);
                argsDef.define(args);
                FulfillmentsArguments.end(args);

                _queryBuilder.append('{');
                queryDef.define(new FulfillmentConnectionQuery(_queryBuilder));
                _queryBuilder.append('}');

                return this;
            }

            /**
            * The duties delivery method of this fulfillment order.
            */
            public FulfillmentOrderQuery internationalDuties(FulfillmentOrderInternationalDutiesQueryDefinition queryDef) {
                startField("internationalDuties");

                _queryBuilder.append('{');
                queryDef.define(new FulfillmentOrderInternationalDutiesQuery(_queryBuilder));
                _queryBuilder.append('}');

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
            * A list of the fulfillment order's line items.
            */
            public FulfillmentOrderQuery lineItems(FulfillmentOrderLineItemConnectionQueryDefinition queryDef) {
                return lineItems(args -> {}, queryDef);
            }

            /**
            * A list of the fulfillment order's line items.
            */
            public FulfillmentOrderQuery lineItems(LineItemsArgumentsDefinition argsDef, FulfillmentOrderLineItemConnectionQueryDefinition queryDef) {
                startField("lineItems");

                LineItemsArguments args = new LineItemsArguments(_queryBuilder);
                argsDef.define(args);
                LineItemsArguments.end(args);

                _queryBuilder.append('{');
                queryDef.define(new FulfillmentOrderLineItemConnectionQuery(_queryBuilder));
                _queryBuilder.append('}');

                return this;
            }

            public class LocationsForMoveArguments extends Arguments {
                LocationsForMoveArguments(StringBuilder _queryBuilder) {
                    super(_queryBuilder, true);
                }

                /**
                * Filter to a list of Fulfillment Order Line Items.
                */
                public LocationsForMoveArguments lineItemIds(List<ID> value) {
                    if (value != null) {
                        startArgument("lineItemIds");
                        _queryBuilder.append('[');
                        {
                            String listSeperator1 = "";
                            for (ID item1 : value) {
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
                * A filter made up of terms, connectives, modifiers, and comparators.
                * | name | type | description | acceptable_values | default_value | example_use |
                * | ---- | ---- | ---- | ---- | ---- | ---- |
                * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
                * `query=Bob Norman`<br/> - `query=title:green hoodie` |
                * | active | string |
                * | address1 | string |
                * | address2 | string |
                * | city | string |
                * | country | string |
                * | created_at | time |
                * | geolocated | boolean |
                * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
                * | legacy | boolean |
                * | location_id | id |
                * | name | string |
                * | pickup_in_store | string | | - `enabled`<br/> - `disabled` |
                * | province | string |
                * | zip | string |
                * You can apply one or more filters to a query. Learn more about [Shopify API search
                * syntax](https://shopify.dev/api/usage/search-syntax).
                */
                public LocationsForMoveArguments query(String value) {
                    if (value != null) {
                        startArgument("query");
                        Query.appendQuotedString(_queryBuilder, value.toString());
                    }
                    return this;
                }

                /**
                * Specific Location ids to check for the movability for a fulfillment order.
                */
                public LocationsForMoveArguments locationIds(List<ID> value) {
                    if (value != null) {
                        startArgument("locationIds");
                        _queryBuilder.append('[');
                        {
                            String listSeperator1 = "";
                            for (ID item1 : value) {
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
                public LocationsForMoveArguments first(Integer value) {
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
                public LocationsForMoveArguments after(String value) {
                    if (value != null) {
                        startArgument("after");
                        Query.appendQuotedString(_queryBuilder, value.toString());
                    }
                    return this;
                }

                /**
                * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
                */
                public LocationsForMoveArguments last(Integer value) {
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
                public LocationsForMoveArguments before(String value) {
                    if (value != null) {
                        startArgument("before");
                        Query.appendQuotedString(_queryBuilder, value.toString());
                    }
                    return this;
                }

                /**
                * Reverse the order of the underlying list.
                */
                public LocationsForMoveArguments reverse(Boolean value) {
                    if (value != null) {
                        startArgument("reverse");
                        _queryBuilder.append(value);
                    }
                    return this;
                }
            }

            public interface LocationsForMoveArgumentsDefinition {
                void define(LocationsForMoveArguments args);
            }

            /**
            * A list of locations that the fulfillment order can potentially move to.
            */
            public FulfillmentOrderQuery locationsForMove(FulfillmentOrderLocationForMoveConnectionQueryDefinition queryDef) {
                return locationsForMove(args -> {}, queryDef);
            }

            /**
            * A list of locations that the fulfillment order can potentially move to.
            */
            public FulfillmentOrderQuery locationsForMove(LocationsForMoveArgumentsDefinition argsDef, FulfillmentOrderLocationForMoveConnectionQueryDefinition queryDef) {
                startField("locationsForMove");

                LocationsForMoveArguments args = new LocationsForMoveArguments(_queryBuilder);
                argsDef.define(args);
                LocationsForMoveArguments.end(args);

                _queryBuilder.append('{');
                queryDef.define(new FulfillmentOrderLocationForMoveConnectionQuery(_queryBuilder));
                _queryBuilder.append('}');

                return this;
            }

            public class MerchantRequestsArguments extends Arguments {
                MerchantRequestsArguments(StringBuilder _queryBuilder) {
                    super(_queryBuilder, true);
                }

                /**
                * The kind of request the merchant sent.
                */
                public MerchantRequestsArguments kind(FulfillmentOrderMerchantRequestKind value) {
                    if (value != null) {
                        startArgument("kind");
                        _queryBuilder.append(value.toString());
                    }
                    return this;
                }

                /**
                * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
                */
                public MerchantRequestsArguments first(Integer value) {
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
                public MerchantRequestsArguments after(String value) {
                    if (value != null) {
                        startArgument("after");
                        Query.appendQuotedString(_queryBuilder, value.toString());
                    }
                    return this;
                }

                /**
                * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
                */
                public MerchantRequestsArguments last(Integer value) {
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
                public MerchantRequestsArguments before(String value) {
                    if (value != null) {
                        startArgument("before");
                        Query.appendQuotedString(_queryBuilder, value.toString());
                    }
                    return this;
                }

                /**
                * Reverse the order of the underlying list.
                */
                public MerchantRequestsArguments reverse(Boolean value) {
                    if (value != null) {
                        startArgument("reverse");
                        _queryBuilder.append(value);
                    }
                    return this;
                }
            }

            public interface MerchantRequestsArgumentsDefinition {
                void define(MerchantRequestsArguments args);
            }

            /**
            * A list of requests sent by the merchant or an order management app to the fulfillment service for
            * the fulfillment order.
            */
            public FulfillmentOrderQuery merchantRequests(FulfillmentOrderMerchantRequestConnectionQueryDefinition queryDef) {
                return merchantRequests(args -> {}, queryDef);
            }

            /**
            * A list of requests sent by the merchant or an order management app to the fulfillment service for
            * the fulfillment order.
            */
            public FulfillmentOrderQuery merchantRequests(MerchantRequestsArgumentsDefinition argsDef, FulfillmentOrderMerchantRequestConnectionQueryDefinition queryDef) {
                startField("merchantRequests");

                MerchantRequestsArguments args = new MerchantRequestsArguments(_queryBuilder);
                argsDef.define(args);
                MerchantRequestsArguments.end(args);

                _queryBuilder.append('{');
                queryDef.define(new FulfillmentOrderMerchantRequestConnectionQuery(_queryBuilder));
                _queryBuilder.append('}');

                return this;
            }

            /**
            * The order that's associated with the fulfillment order.
            */
            public FulfillmentOrderQuery order(OrderQueryDefinition queryDef) {
                startField("order");

                _queryBuilder.append('{');
                queryDef.define(new OrderQuery(_queryBuilder));
                _queryBuilder.append('}');

                return this;
            }

            /**
            * ID of the order that's associated with the fulfillment order.
            */
            public FulfillmentOrderQuery orderId() {
                startField("orderId");

                return this;
            }

            /**
            * The unique identifier for the order that appears on the order page in the Shopify admin and the
            * <b>Order status</b> page.
            * For example, "#1001", "EN1001", or "1001-A".
            * This value isn't unique across multiple stores.
            */
            public FulfillmentOrderQuery orderName() {
                startField("orderName");

                return this;
            }

            /**
            * The date and time when the order was processed.
            * This date and time might not match the date and time when the order was created.
            */
            public FulfillmentOrderQuery orderProcessedAt() {
                startField("orderProcessedAt");

                return this;
            }

            /**
            * The request status of the fulfillment order.
            */
            public FulfillmentOrderQuery requestStatus() {
                startField("requestStatus");

                return this;
            }

            /**
            * The status of the fulfillment order.
            */
            public FulfillmentOrderQuery status() {
                startField("status");

                return this;
            }

            /**
            * The actions that can be performed on this fulfillment order.
            */
            public FulfillmentOrderQuery supportedActions(FulfillmentOrderSupportedActionQueryDefinition queryDef) {
                startField("supportedActions");

                _queryBuilder.append('{');
                queryDef.define(new FulfillmentOrderSupportedActionQuery(_queryBuilder));
                _queryBuilder.append('}');

                return this;
            }

            /**
            * The date and time when the fulfillment order was last updated.
            */
            public FulfillmentOrderQuery updatedAt() {
                startField("updatedAt");

                return this;
            }
        }
