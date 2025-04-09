// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

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
                public class FulfillmentOrderAssignedLocation extends AbstractResponse<FulfillmentOrderAssignedLocation> {
                    public FulfillmentOrderAssignedLocation() {
                    }

                    public FulfillmentOrderAssignedLocation(JsonObject fields) throws SchemaViolationError {
                        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
                            String key = field.getKey();
                            String fieldName = getFieldName(key);
                            switch (fieldName) {
                                case "address1": {
                                    String optional1 = null;
                                    if (!field.getValue().isJsonNull()) {
                                        optional1 = jsonAsString(field.getValue(), key);
                                    }

                                    responseData.put(key, optional1);

                                    break;
                                }

                                case "address2": {
                                    String optional1 = null;
                                    if (!field.getValue().isJsonNull()) {
                                        optional1 = jsonAsString(field.getValue(), key);
                                    }

                                    responseData.put(key, optional1);

                                    break;
                                }

                                case "city": {
                                    String optional1 = null;
                                    if (!field.getValue().isJsonNull()) {
                                        optional1 = jsonAsString(field.getValue(), key);
                                    }

                                    responseData.put(key, optional1);

                                    break;
                                }

                                case "countryCode": {
                                    responseData.put(key, CountryCode.fromGraphQl(jsonAsString(field.getValue(), key)));

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

                                case "name": {
                                    responseData.put(key, jsonAsString(field.getValue(), key));

                                    break;
                                }

                                case "phone": {
                                    String optional1 = null;
                                    if (!field.getValue().isJsonNull()) {
                                        optional1 = jsonAsString(field.getValue(), key);
                                    }

                                    responseData.put(key, optional1);

                                    break;
                                }

                                case "province": {
                                    String optional1 = null;
                                    if (!field.getValue().isJsonNull()) {
                                        optional1 = jsonAsString(field.getValue(), key);
                                    }

                                    responseData.put(key, optional1);

                                    break;
                                }

                                case "zip": {
                                    String optional1 = null;
                                    if (!field.getValue().isJsonNull()) {
                                        optional1 = jsonAsString(field.getValue(), key);
                                    }

                                    responseData.put(key, optional1);

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
                        return "FulfillmentOrderAssignedLocation";
                    }

                    /**
                    * The first line of the address for the location.
                    */

                    public String getAddress1() {
                        return (String) get("address1");
                    }

                    public FulfillmentOrderAssignedLocation setAddress1(String arg) {
                        optimisticData.put(getKey("address1"), arg);
                        return this;
                    }

                    /**
                    * The second line of the address for the location.
                    */

                    public String getAddress2() {
                        return (String) get("address2");
                    }

                    public FulfillmentOrderAssignedLocation setAddress2(String arg) {
                        optimisticData.put(getKey("address2"), arg);
                        return this;
                    }

                    /**
                    * The city of the location.
                    */

                    public String getCity() {
                        return (String) get("city");
                    }

                    public FulfillmentOrderAssignedLocation setCity(String arg) {
                        optimisticData.put(getKey("city"), arg);
                        return this;
                    }

                    /**
                    * The two-letter country code of the location.
                    */

                    public CountryCode getCountryCode() {
                        return (CountryCode) get("countryCode");
                    }

                    public FulfillmentOrderAssignedLocation setCountryCode(CountryCode arg) {
                        optimisticData.put(getKey("countryCode"), arg);
                        return this;
                    }

                    /**
                    * The location where the fulfillment is expected to happen. This value might be different from
                    * `FulfillmentOrderAssignedLocation` if the location's attributes were updated
                    * after the fulfillment order was taken into work of canceled.
                    */

                    public Location getLocation() {
                        return (Location) get("location");
                    }

                    public FulfillmentOrderAssignedLocation setLocation(Location arg) {
                        optimisticData.put(getKey("location"), arg);
                        return this;
                    }

                    /**
                    * The name of the location.
                    */

                    public String getName() {
                        return (String) get("name");
                    }

                    public FulfillmentOrderAssignedLocation setName(String arg) {
                        optimisticData.put(getKey("name"), arg);
                        return this;
                    }

                    /**
                    * The phone number of the location.
                    */

                    public String getPhone() {
                        return (String) get("phone");
                    }

                    public FulfillmentOrderAssignedLocation setPhone(String arg) {
                        optimisticData.put(getKey("phone"), arg);
                        return this;
                    }

                    /**
                    * The province of the location.
                    */

                    public String getProvince() {
                        return (String) get("province");
                    }

                    public FulfillmentOrderAssignedLocation setProvince(String arg) {
                        optimisticData.put(getKey("province"), arg);
                        return this;
                    }

                    /**
                    * The ZIP code of the location.
                    */

                    public String getZip() {
                        return (String) get("zip");
                    }

                    public FulfillmentOrderAssignedLocation setZip(String arg) {
                        optimisticData.put(getKey("zip"), arg);
                        return this;
                    }

                    public boolean unwrapsToObject(String key) {
                        switch (getFieldName(key)) {
                            case "address1": return false;

                            case "address2": return false;

                            case "city": return false;

                            case "countryCode": return false;

                            case "location": return true;

                            case "name": return false;

                            case "phone": return false;

                            case "province": return false;

                            case "zip": return false;

                            default: return false;
                        }
                    }
                }

