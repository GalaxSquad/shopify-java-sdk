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
* Associates an order line item with quantities requiring fulfillment from the respective fulfillment
* order.
*/
public class FulfillmentOrderLineItem extends AbstractResponse<FulfillmentOrderLineItem> implements Node {
    public FulfillmentOrderLineItem() {
    }

    public FulfillmentOrderLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "financialSummaries": {
                    List<FulfillmentOrderLineItemFinancialSummary> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentOrderLineItemFinancialSummary(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "image": {
                    Image optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Image(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryItemId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lineItem": {
                    responseData.put(key, new LineItem(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productTitle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "remainingQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "requiresShipping": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "sku": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "totalQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "variant": {
                    ProductVariant optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariant(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "variantTitle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "vendor": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "warnings": {
                    List<FulfillmentOrderLineItemWarning> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentOrderLineItemWarning(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "weight": {
                    Weight optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Weight(jsonAsObject(field.getValue(), key));
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

    public FulfillmentOrderLineItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "FulfillmentOrderLineItem";
    }

    /**
    * The financial summary for the Fulfillment Order's Line Items.
    */

    public List<FulfillmentOrderLineItemFinancialSummary> getFinancialSummaries() {
        return (List<FulfillmentOrderLineItemFinancialSummary>) get("financialSummaries");
    }

    public FulfillmentOrderLineItem setFinancialSummaries(List<FulfillmentOrderLineItemFinancialSummary> arg) {
        optimisticData.put(getKey("financialSummaries"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The image associated to the line item's variant.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public FulfillmentOrderLineItem setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * The ID of the inventory item.
    */

    public ID getInventoryItemId() {
        return (ID) get("inventoryItemId");
    }

    public FulfillmentOrderLineItem setInventoryItemId(ID arg) {
        optimisticData.put(getKey("inventoryItemId"), arg);
        return this;
    }

    /**
    * The associated order line item.
    */

    public LineItem getLineItem() {
        return (LineItem) get("lineItem");
    }

    public FulfillmentOrderLineItem setLineItem(LineItem arg) {
        optimisticData.put(getKey("lineItem"), arg);
        return this;
    }

    /**
    * The title of the product.
    */

    public String getProductTitle() {
        return (String) get("productTitle");
    }

    public FulfillmentOrderLineItem setProductTitle(String arg) {
        optimisticData.put(getKey("productTitle"), arg);
        return this;
    }

    /**
    * The number of units remaining to be fulfilled.
    */

    public Integer getRemainingQuantity() {
        return (Integer) get("remainingQuantity");
    }

    public FulfillmentOrderLineItem setRemainingQuantity(Integer arg) {
        optimisticData.put(getKey("remainingQuantity"), arg);
        return this;
    }

    /**
    * Whether physical shipping is required for the variant.
    */

    public Boolean getRequiresShipping() {
        return (Boolean) get("requiresShipping");
    }

    public FulfillmentOrderLineItem setRequiresShipping(Boolean arg) {
        optimisticData.put(getKey("requiresShipping"), arg);
        return this;
    }

    /**
    * The variant SKU number.
    */

    public String getSku() {
        return (String) get("sku");
    }

    public FulfillmentOrderLineItem setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    /**
    * The total number of units to be fulfilled.
    */

    public Integer getTotalQuantity() {
        return (Integer) get("totalQuantity");
    }

    public FulfillmentOrderLineItem setTotalQuantity(Integer arg) {
        optimisticData.put(getKey("totalQuantity"), arg);
        return this;
    }

    /**
    * The product variant associated to the fulfillment order line item.
    */

    public ProductVariant getVariant() {
        return (ProductVariant) get("variant");
    }

    public FulfillmentOrderLineItem setVariant(ProductVariant arg) {
        optimisticData.put(getKey("variant"), arg);
        return this;
    }

    /**
    * The name of the variant.
    */

    public String getVariantTitle() {
        return (String) get("variantTitle");
    }

    public FulfillmentOrderLineItem setVariantTitle(String arg) {
        optimisticData.put(getKey("variantTitle"), arg);
        return this;
    }

    /**
    * The name of the vendor who made the variant.
    */

    public String getVendor() {
        return (String) get("vendor");
    }

    public FulfillmentOrderLineItem setVendor(String arg) {
        optimisticData.put(getKey("vendor"), arg);
        return this;
    }

    /**
    * Warning messages for a fulfillment order line item.
    */

    public List<FulfillmentOrderLineItemWarning> getWarnings() {
        return (List<FulfillmentOrderLineItemWarning>) get("warnings");
    }

    public FulfillmentOrderLineItem setWarnings(List<FulfillmentOrderLineItemWarning> arg) {
        optimisticData.put(getKey("warnings"), arg);
        return this;
    }

    /**
    * The weight of a line item unit.
    */

    public Weight getWeight() {
        return (Weight) get("weight");
    }

    public FulfillmentOrderLineItem setWeight(Weight arg) {
        optimisticData.put(getKey("weight"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "financialSummaries": return true;

            case "id": return false;

            case "image": return true;

            case "inventoryItemId": return false;

            case "lineItem": return true;

            case "productTitle": return false;

            case "remainingQuantity": return false;

            case "requiresShipping": return false;

            case "sku": return false;

            case "totalQuantity": return false;

            case "variant": return true;

            case "variantTitle": return false;

            case "vendor": return false;

            case "warnings": return true;

            case "weight": return true;

            default: return false;
        }
    }
}

