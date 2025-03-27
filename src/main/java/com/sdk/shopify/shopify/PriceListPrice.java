// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents information about pricing for a product variant
* as defined on a price list, such as the price, compare at price, and origin type. You can use a
* `PriceListPrice` to specify a fixed price for a specific product variant. For examples, refer to
* [PriceListFixedPricesAdd](https://shopify.dev/api/admin-graphql/latest/mutations/priceListFixedPrice
* sAdd) and
* [PriceList](https://shopify.dev/api/admin-graphql/latest/queries/priceList#section-examples).
*/
public class PriceListPrice extends AbstractResponse<PriceListPrice> {
    public PriceListPrice() {
    }

    public PriceListPrice(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "compareAtPrice": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "originType": {
                    responseData.put(key, PriceListPriceOriginType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "price": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantityPriceBreaks": {
                    responseData.put(key, new QuantityPriceBreakConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "variant": {
                    responseData.put(key, new ProductVariant(jsonAsObject(field.getValue(), key)));

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
        return "PriceListPrice";
    }

    /**
    * The compare-at price of the product variant on this price list.
    */

    public MoneyV2 getCompareAtPrice() {
        return (MoneyV2) get("compareAtPrice");
    }

    public PriceListPrice setCompareAtPrice(MoneyV2 arg) {
        optimisticData.put(getKey("compareAtPrice"), arg);
        return this;
    }

    /**
    * The origin of a price, either fixed (defined on the price list) or relative (calculated using a
    * price list adjustment configuration).
    */

    public PriceListPriceOriginType getOriginType() {
        return (PriceListPriceOriginType) get("originType");
    }

    public PriceListPrice setOriginType(PriceListPriceOriginType arg) {
        optimisticData.put(getKey("originType"), arg);
        return this;
    }

    /**
    * The price of the product variant on this price list.
    */

    public MoneyV2 getPrice() {
        return (MoneyV2) get("price");
    }

    public PriceListPrice setPrice(MoneyV2 arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * A list of quantity breaks for the product variant.
    */

    public QuantityPriceBreakConnection getQuantityPriceBreaks() {
        return (QuantityPriceBreakConnection) get("quantityPriceBreaks");
    }

    public PriceListPrice setQuantityPriceBreaks(QuantityPriceBreakConnection arg) {
        optimisticData.put(getKey("quantityPriceBreaks"), arg);
        return this;
    }

    /**
    * The product variant associated with this price.
    */

    public ProductVariant getVariant() {
        return (ProductVariant) get("variant");
    }

    public PriceListPrice setVariant(ProductVariant arg) {
        optimisticData.put(getKey("variant"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "compareAtPrice": return true;

            case "originType": return false;

            case "price": return true;

            case "quantityPriceBreaks": return true;

            case "variant": return true;

            default: return false;
        }
    }
}

