// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
        * - Work on the fulfillment order has not yet begun, which means that the fulfillment order has the
        * [OPEN](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-open),
        * [SCHEDULED](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-schedule
        * d), or
        * [ON_HOLD](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-onhold)
        * status, and the shop's location properties might be undergoing edits (for example, in the Shopify
        * admin).
        * If the [fulfillmentOrderMove](
            * https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove
            * ) mutation has moved the fulfillment order's line items to a new location,
            * but hasn't moved the fulfillment order instance itself, then the original fulfillment order's
            * assigned location
            * doesn't change.
            * This happens if the fulfillment order is being split during the move, or if all line items can be
            * moved
            * to an existing fulfillment order at a new location.
            * Once the fulfillment order has been taken into work or canceled,
            * which means that the fulfillment order has the
            * [IN_PROGRESS](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-inprog
            * ress),
            * [CLOSED](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-closed),
            * [CANCELLED](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-cancelle
            * d), or
            * [INCOMPLETE](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-incompl
            * ete)
            * status, `FulfillmentOrderAssignedLocation` acts as a snapshot of the shop's location content.
            * Up-to-date shop's location data may be queried through [location](
                * https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrderAssignedLocation#field-fulfillm
                * entorderassignedlocation-location
                * ) connection.
                */
                public class FulfillmentOrderAssignedLocationQuery extends Query<FulfillmentOrderAssignedLocationQuery> {
                    FulfillmentOrderAssignedLocationQuery(StringBuilder _queryBuilder) {
                        super(_queryBuilder);
                    }

                    /**
                    * The first line of the address for the location.
                    */
                    public FulfillmentOrderAssignedLocationQuery address1() {
                        startField("address1");

                        return this;
                    }

                    /**
                    * The second line of the address for the location.
                    */
                    public FulfillmentOrderAssignedLocationQuery address2() {
                        startField("address2");

                        return this;
                    }

                    /**
                    * The city of the location.
                    */
                    public FulfillmentOrderAssignedLocationQuery city() {
                        startField("city");

                        return this;
                    }

                    /**
                    * The two-letter country code of the location.
                    */
                    public FulfillmentOrderAssignedLocationQuery countryCode() {
                        startField("countryCode");

                        return this;
                    }

                    /**
                    * The location where the fulfillment is expected to happen. This value might be different from
                    * `FulfillmentOrderAssignedLocation` if the location's attributes were updated
                    * after the fulfillment order was taken into work of canceled.
                    */
                    public FulfillmentOrderAssignedLocationQuery location(LocationQueryDefinition queryDef) {
                        startField("location");

                        _queryBuilder.append('{');
                        queryDef.define(new LocationQuery(_queryBuilder));
                        _queryBuilder.append('}');

                        return this;
                    }

                    /**
                    * The name of the location.
                    */
                    public FulfillmentOrderAssignedLocationQuery name() {
                        startField("name");

                        return this;
                    }

                    /**
                    * The phone number of the location.
                    */
                    public FulfillmentOrderAssignedLocationQuery phone() {
                        startField("phone");

                        return this;
                    }

                    /**
                    * The province of the location.
                    */
                    public FulfillmentOrderAssignedLocationQuery province() {
                        startField("province");

                        return this;
                    }

                    /**
                    * The ZIP code of the location.
                    */
                    public FulfillmentOrderAssignedLocationQuery zip() {
                        startField("zip");

                        return this;
                    }
                }
