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
* Represents a price list, including information about related prices and eligibility rules.
* You can use price lists to specify either fixed prices or adjusted relative prices that
* override initial product variant prices. Price lists are applied to customers
* using context rules, which determine price list eligibility.
* For more information on price lists, refer to
* [Support different pricing
* models](https://shopify.dev/apps/internationalization/product-price-lists).
*/
public class PriceList extends AbstractResponse<PriceList> implements Node {
    public PriceList() {
    }

    public PriceList(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "catalog": {
                    Catalog optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownCatalog.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currency": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "fixedPricesCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "parent": {
                    PriceListParent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceListParent(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "prices": {
                    responseData.put(key, new PriceListPriceConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantityRules": {
                    responseData.put(key, new QuantityRuleConnection(jsonAsObject(field.getValue(), key)));

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

    public PriceList(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "PriceList";
    }

    /**
    * The catalog that the price list is associated with.
    */

    public Catalog getCatalog() {
        return (Catalog) get("catalog");
    }

    public PriceList setCatalog(Catalog arg) {
        optimisticData.put(getKey("catalog"), arg);
        return this;
    }

    /**
    * The currency for fixed prices associated with this price list.
    */

    public CurrencyCode getCurrency() {
        return (CurrencyCode) get("currency");
    }

    public PriceList setCurrency(CurrencyCode arg) {
        optimisticData.put(getKey("currency"), arg);
        return this;
    }

    /**
    * The number of fixed prices on the price list.
    */

    public Integer getFixedPricesCount() {
        return (Integer) get("fixedPricesCount");
    }

    public PriceList setFixedPricesCount(Integer arg) {
        optimisticData.put(getKey("fixedPricesCount"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The unique name of the price list, used as a human-readable identifier.
    */

    public String getName() {
        return (String) get("name");
    }

    public PriceList setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * Relative adjustments to other prices.
    */

    public PriceListParent getParent() {
        return (PriceListParent) get("parent");
    }

    public PriceList setParent(PriceListParent arg) {
        optimisticData.put(getKey("parent"), arg);
        return this;
    }

    /**
    * A list of prices associated with the price list.
    */

    public PriceListPriceConnection getPrices() {
        return (PriceListPriceConnection) get("prices");
    }

    public PriceList setPrices(PriceListPriceConnection arg) {
        optimisticData.put(getKey("prices"), arg);
        return this;
    }

    /**
    * A list of quantity rules associated with the price list, ordered by product variants.
    */

    public QuantityRuleConnection getQuantityRules() {
        return (QuantityRuleConnection) get("quantityRules");
    }

    public PriceList setQuantityRules(QuantityRuleConnection arg) {
        optimisticData.put(getKey("quantityRules"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "catalog": return false;

            case "currency": return false;

            case "fixedPricesCount": return false;

            case "id": return false;

            case "name": return false;

            case "parent": return true;

            case "prices": return true;

            case "quantityRules": return true;

            default: return false;
        }
    }
}

