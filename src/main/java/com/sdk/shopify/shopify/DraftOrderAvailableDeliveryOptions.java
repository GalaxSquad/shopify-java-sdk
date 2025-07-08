// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The available delivery options for a draft order.
*/
public class DraftOrderAvailableDeliveryOptions extends AbstractResponse<DraftOrderAvailableDeliveryOptions> {
    public DraftOrderAvailableDeliveryOptions() {
    }

    public DraftOrderAvailableDeliveryOptions(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "availableLocalDeliveryRates": {
                    List<DraftOrderShippingRate> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DraftOrderShippingRate(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "availableLocalPickupOptions": {
                    List<PickupInStoreLocation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new PickupInStoreLocation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "availableShippingRates": {
                    List<DraftOrderShippingRate> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DraftOrderShippingRate(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "pageInfo": {
                    responseData.put(key, new PageInfo(jsonAsObject(field.getValue(), key)));

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
        return "DraftOrderAvailableDeliveryOptions";
    }

    /**
    * The available local delivery rates for the draft order. Requires a customer with a valid shipping
    * address and at least one line item.
    */

    public List<DraftOrderShippingRate> getAvailableLocalDeliveryRates() {
        return (List<DraftOrderShippingRate>) get("availableLocalDeliveryRates");
    }

    public DraftOrderAvailableDeliveryOptions setAvailableLocalDeliveryRates(List<DraftOrderShippingRate> arg) {
        optimisticData.put(getKey("availableLocalDeliveryRates"), arg);
        return this;
    }

    /**
    * The available local pickup options for the draft order. Requires a customer with a valid shipping
    * address and at least one line item.
    */

    public List<PickupInStoreLocation> getAvailableLocalPickupOptions() {
        return (List<PickupInStoreLocation>) get("availableLocalPickupOptions");
    }

    public DraftOrderAvailableDeliveryOptions setAvailableLocalPickupOptions(List<PickupInStoreLocation> arg) {
        optimisticData.put(getKey("availableLocalPickupOptions"), arg);
        return this;
    }

    /**
    * The available shipping rates for the draft order. Requires a customer with a valid shipping address
    * and at least one line item.
    */

    public List<DraftOrderShippingRate> getAvailableShippingRates() {
        return (List<DraftOrderShippingRate>) get("availableShippingRates");
    }

    public DraftOrderAvailableDeliveryOptions setAvailableShippingRates(List<DraftOrderShippingRate> arg) {
        optimisticData.put(getKey("availableShippingRates"), arg);
        return this;
    }

    /**
    * Returns information about pagination of local pickup options.
    */

    public PageInfo getPageInfo() {
        return (PageInfo) get("pageInfo");
    }

    public DraftOrderAvailableDeliveryOptions setPageInfo(PageInfo arg) {
        optimisticData.put(getKey("pageInfo"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "availableLocalDeliveryRates": return true;

            case "availableLocalPickupOptions": return true;

            case "availableShippingRates": return true;

            case "pageInfo": return true;

            default: return false;
        }
    }
}

