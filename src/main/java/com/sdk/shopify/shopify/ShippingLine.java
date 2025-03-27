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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Represents the shipping details that the customer chose for their order.
*/
public class ShippingLine extends AbstractResponse<ShippingLine> implements DraftOrderPlatformDiscountAllocationTarget {
    public ShippingLine() {
    }

    public ShippingLine(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "carrierIdentifier": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currentDiscountedPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "custom": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "deliveryCategory": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountAllocations": {
                    List<DiscountAllocation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DiscountAllocation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "discountedPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isRemoved": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "originalPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

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

                case "shippingRateHandle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "source": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "taxLines": {
                    List<TaxLine> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TaxLine(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "title": {
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

    public String getGraphQlTypeName() {
        return "ShippingLine";
    }

    /**
    * A reference to the carrier service that provided the rate.
    * Present when the rate was computed by a third-party carrier service.
    */

    public String getCarrierIdentifier() {
        return (String) get("carrierIdentifier");
    }

    public ShippingLine setCarrierIdentifier(String arg) {
        optimisticData.put(getKey("carrierIdentifier"), arg);
        return this;
    }

    /**
    * A reference to the shipping method.
    */

    public String getCode() {
        return (String) get("code");
    }

    public ShippingLine setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The current shipping price after applying refunds, after applying discounts. If the parent
    * `order.taxesIncluded`` field is true, then this price includes taxes. Otherwise, this field is the
    * pre-tax price.
    */

    public MoneyBag getCurrentDiscountedPriceSet() {
        return (MoneyBag) get("currentDiscountedPriceSet");
    }

    public ShippingLine setCurrentDiscountedPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("currentDiscountedPriceSet"), arg);
        return this;
    }

    /**
    * Whether the shipping line is custom or not.
    */

    public Boolean getCustom() {
        return (Boolean) get("custom");
    }

    public ShippingLine setCustom(Boolean arg) {
        optimisticData.put(getKey("custom"), arg);
        return this;
    }

    /**
    * The general classification of the delivery method.
    */

    public String getDeliveryCategory() {
        return (String) get("deliveryCategory");
    }

    public ShippingLine setDeliveryCategory(String arg) {
        optimisticData.put(getKey("deliveryCategory"), arg);
        return this;
    }

    /**
    * The discounts that have been allocated to the shipping line.
    */

    public List<DiscountAllocation> getDiscountAllocations() {
        return (List<DiscountAllocation>) get("discountAllocations");
    }

    public ShippingLine setDiscountAllocations(List<DiscountAllocation> arg) {
        optimisticData.put(getKey("discountAllocations"), arg);
        return this;
    }

    /**
    * The shipping price after applying discounts. If the parent order.taxesIncluded field is true, then
    * this price includes taxes. If not, it's the pre-tax price.
    * As of API version 2024-07, this will be calculated including cart level discounts, such as the free
    * shipping discount.
    */

    public MoneyBag getDiscountedPriceSet() {
        return (MoneyBag) get("discountedPriceSet");
    }

    public ShippingLine setDiscountedPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("discountedPriceSet"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public ShippingLine setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * Whether the shipping line has been removed.
    */

    public Boolean getIsRemoved() {
        return (Boolean) get("isRemoved");
    }

    public ShippingLine setIsRemoved(Boolean arg) {
        optimisticData.put(getKey("isRemoved"), arg);
        return this;
    }

    /**
    * The pre-tax shipping price without any discounts applied.
    */

    public MoneyBag getOriginalPriceSet() {
        return (MoneyBag) get("originalPriceSet");
    }

    public ShippingLine setOriginalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("originalPriceSet"), arg);
        return this;
    }

    /**
    * The phone number at the shipping address.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public ShippingLine setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * A unique identifier for the shipping rate. The format can change without notice and isn't meant to
    * be shown to users.
    */

    public String getShippingRateHandle() {
        return (String) get("shippingRateHandle");
    }

    public ShippingLine setShippingRateHandle(String arg) {
        optimisticData.put(getKey("shippingRateHandle"), arg);
        return this;
    }

    /**
    * Returns the rate source for the shipping line.
    */

    public String getSource() {
        return (String) get("source");
    }

    public ShippingLine setSource(String arg) {
        optimisticData.put(getKey("source"), arg);
        return this;
    }

    /**
    * The TaxLine objects connected to this shipping line.
    */

    public List<TaxLine> getTaxLines() {
        return (List<TaxLine>) get("taxLines");
    }

    public ShippingLine setTaxLines(List<TaxLine> arg) {
        optimisticData.put(getKey("taxLines"), arg);
        return this;
    }

    /**
    * Returns the title of the shipping line.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public ShippingLine setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "carrierIdentifier": return false;

            case "code": return false;

            case "currentDiscountedPriceSet": return true;

            case "custom": return false;

            case "deliveryCategory": return false;

            case "discountAllocations": return true;

            case "discountedPriceSet": return true;

            case "id": return false;

            case "isRemoved": return false;

            case "originalPriceSet": return true;

            case "phone": return false;

            case "shippingRateHandle": return false;

            case "source": return false;

            case "taxLines": return true;

            case "title": return false;

            default: return false;
        }
    }
}

