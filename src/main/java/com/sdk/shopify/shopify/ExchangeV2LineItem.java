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
* Contains information about an item in the exchange.
*/
public class ExchangeV2LineItem extends AbstractResponse<ExchangeV2LineItem> {
    public ExchangeV2LineItem() {
    }

    public ExchangeV2LineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customAttributes": {
                    List<Attribute> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Attribute(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "discountedTotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountedUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "fulfillmentService": {
                    FulfillmentService optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentService(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftCard": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "giftCards": {
                    List<GiftCard> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new GiftCard(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "isGiftCard": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "lineItem": {
                    LineItem optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LineItem(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "originalTotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "originalUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
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

                case "taxLines": {
                    List<TaxLine> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TaxLine(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "taxable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "ExchangeV2LineItem";
    }

    /**
    * A list of attributes that represent custom features or special requests.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public ExchangeV2LineItem setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * The total line price, in shop and presentment currencies, after discounts are applied.
    */

    public MoneyBag getDiscountedTotalSet() {
        return (MoneyBag) get("discountedTotalSet");
    }

    public ExchangeV2LineItem setDiscountedTotalSet(MoneyBag arg) {
        optimisticData.put(getKey("discountedTotalSet"), arg);
        return this;
    }

    /**
    * The price, in shop and presentment currencies,
    * of a single variant unit after line item discounts are applied.
    */

    public MoneyBag getDiscountedUnitPriceSet() {
        return (MoneyBag) get("discountedUnitPriceSet");
    }

    public ExchangeV2LineItem setDiscountedUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("discountedUnitPriceSet"), arg);
        return this;
    }

    /**
    * Name of the service provider who fulfilled the order.
    * Valid values are either **manual** or the name of the provider.
    * For example, **amazon**, **shipwire**.
    * Deleted fulfillment services will return null.
    */

    public FulfillmentService getFulfillmentService() {
        return (FulfillmentService) get("fulfillmentService");
    }

    public ExchangeV2LineItem setFulfillmentService(FulfillmentService arg) {
        optimisticData.put(getKey("fulfillmentService"), arg);
        return this;
    }

    /**
    * Indiciates if this line item is a gift card.
    */

    public Boolean getGiftCard() {
        return (Boolean) get("giftCard");
    }

    public ExchangeV2LineItem setGiftCard(Boolean arg) {
        optimisticData.put(getKey("giftCard"), arg);
        return this;
    }

    /**
    * The gift cards associated with the line item.
    */

    public List<GiftCard> getGiftCards() {
        return (List<GiftCard>) get("giftCards");
    }

    public ExchangeV2LineItem setGiftCards(List<GiftCard> arg) {
        optimisticData.put(getKey("giftCards"), arg);
        return this;
    }

    /**
    * Whether the line item represents the purchase of a gift card.
    */

    public Boolean getIsGiftCard() {
        return (Boolean) get("isGiftCard");
    }

    public ExchangeV2LineItem setIsGiftCard(Boolean arg) {
        optimisticData.put(getKey("isGiftCard"), arg);
        return this;
    }

    /**
    * The line item associated with this object.
    */

    public LineItem getLineItem() {
        return (LineItem) get("lineItem");
    }

    public ExchangeV2LineItem setLineItem(LineItem arg) {
        optimisticData.put(getKey("lineItem"), arg);
        return this;
    }

    /**
    * The name of the product.
    */

    public String getName() {
        return (String) get("name");
    }

    public ExchangeV2LineItem setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The total price, in shop and presentment currencies, before discounts are applied.
    */

    public MoneyBag getOriginalTotalSet() {
        return (MoneyBag) get("originalTotalSet");
    }

    public ExchangeV2LineItem setOriginalTotalSet(MoneyBag arg) {
        optimisticData.put(getKey("originalTotalSet"), arg);
        return this;
    }

    /**
    * The price, in shop and presentment currencies,
    * of a single variant unit before line item discounts are applied.
    */

    public MoneyBag getOriginalUnitPriceSet() {
        return (MoneyBag) get("originalUnitPriceSet");
    }

    public ExchangeV2LineItem setOriginalUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("originalUnitPriceSet"), arg);
        return this;
    }

    /**
    * The number of products that were purchased.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public ExchangeV2LineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * Whether physical shipping is required for the variant.
    */

    public Boolean getRequiresShipping() {
        return (Boolean) get("requiresShipping");
    }

    public ExchangeV2LineItem setRequiresShipping(Boolean arg) {
        optimisticData.put(getKey("requiresShipping"), arg);
        return this;
    }

    /**
    * The SKU number of the product variant.
    */

    public String getSku() {
        return (String) get("sku");
    }

    public ExchangeV2LineItem setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    /**
    * The TaxLine object connected to this line item.
    */

    public List<TaxLine> getTaxLines() {
        return (List<TaxLine>) get("taxLines");
    }

    public ExchangeV2LineItem setTaxLines(List<TaxLine> arg) {
        optimisticData.put(getKey("taxLines"), arg);
        return this;
    }

    /**
    * Whether the variant is taxable.
    */

    public Boolean getTaxable() {
        return (Boolean) get("taxable");
    }

    public ExchangeV2LineItem setTaxable(Boolean arg) {
        optimisticData.put(getKey("taxable"), arg);
        return this;
    }

    /**
    * The title of the product or variant. This field only applies to custom line items.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public ExchangeV2LineItem setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The product variant of the line item.
    */

    public ProductVariant getVariant() {
        return (ProductVariant) get("variant");
    }

    public ExchangeV2LineItem setVariant(ProductVariant arg) {
        optimisticData.put(getKey("variant"), arg);
        return this;
    }

    /**
    * The name of the variant.
    */

    public String getVariantTitle() {
        return (String) get("variantTitle");
    }

    public ExchangeV2LineItem setVariantTitle(String arg) {
        optimisticData.put(getKey("variantTitle"), arg);
        return this;
    }

    /**
    * The name of the vendor who created the product variant.
    */

    public String getVendor() {
        return (String) get("vendor");
    }

    public ExchangeV2LineItem setVendor(String arg) {
        optimisticData.put(getKey("vendor"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customAttributes": return true;

            case "discountedTotalSet": return true;

            case "discountedUnitPriceSet": return true;

            case "fulfillmentService": return true;

            case "giftCard": return false;

            case "giftCards": return true;

            case "isGiftCard": return false;

            case "lineItem": return true;

            case "name": return false;

            case "originalTotalSet": return true;

            case "originalUnitPriceSet": return true;

            case "quantity": return false;

            case "requiresShipping": return false;

            case "sku": return false;

            case "taxLines": return true;

            case "taxable": return false;

            case "title": return false;

            case "variant": return true;

            case "variantTitle": return false;

            case "vendor": return false;

            default: return false;
        }
    }
}

