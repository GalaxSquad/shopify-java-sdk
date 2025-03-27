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

/**
* Contains information about an item in the exchange.
*/
public class ExchangeV2LineItemQuery extends Query<ExchangeV2LineItemQuery> {
    ExchangeV2LineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A list of attributes that represent custom features or special requests.
    */
    public ExchangeV2LineItemQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total line price, in shop and presentment currencies, after discounts are applied.
    */
    public ExchangeV2LineItemQuery discountedTotalSet(MoneyBagQueryDefinition queryDef) {
        startField("discountedTotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price, in shop and presentment currencies,
    * of a single variant unit after line item discounts are applied.
    */
    public ExchangeV2LineItemQuery discountedUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("discountedUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Name of the service provider who fulfilled the order.
    * Valid values are either **manual** or the name of the provider.
    * For example, **amazon**, **shipwire**.
    * Deleted fulfillment services will return null.
    */
    public ExchangeV2LineItemQuery fulfillmentService(FulfillmentServiceQueryDefinition queryDef) {
        startField("fulfillmentService");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Indiciates if this line item is a gift card.
    */
    public ExchangeV2LineItemQuery giftCard() {
        startField("giftCard");

        return this;
    }

    /**
    * The gift cards associated with the line item.
    */
    public ExchangeV2LineItemQuery giftCards(GiftCardQueryDefinition queryDef) {
        startField("giftCards");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the line item represents the purchase of a gift card.
    */
    public ExchangeV2LineItemQuery isGiftCard() {
        startField("isGiftCard");

        return this;
    }

    /**
    * The line item associated with this object.
    */
    public ExchangeV2LineItemQuery lineItem(LineItemQueryDefinition queryDef) {
        startField("lineItem");

        _queryBuilder.append('{');
        queryDef.define(new LineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the product.
    */
    public ExchangeV2LineItemQuery name() {
        startField("name");

        return this;
    }

    /**
    * The total price, in shop and presentment currencies, before discounts are applied.
    */
    public ExchangeV2LineItemQuery originalTotalSet(MoneyBagQueryDefinition queryDef) {
        startField("originalTotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price, in shop and presentment currencies,
    * of a single variant unit before line item discounts are applied.
    */
    public ExchangeV2LineItemQuery originalUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("originalUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of products that were purchased.
    */
    public ExchangeV2LineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * Whether physical shipping is required for the variant.
    */
    public ExchangeV2LineItemQuery requiresShipping() {
        startField("requiresShipping");

        return this;
    }

    /**
    * The SKU number of the product variant.
    */
    public ExchangeV2LineItemQuery sku() {
        startField("sku");

        return this;
    }

    /**
    * The TaxLine object connected to this line item.
    */
    public ExchangeV2LineItemQuery taxLines(TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the variant is taxable.
    */
    public ExchangeV2LineItemQuery taxable() {
        startField("taxable");

        return this;
    }

    /**
    * The title of the product or variant. This field only applies to custom line items.
    */
    public ExchangeV2LineItemQuery title() {
        startField("title");

        return this;
    }

    /**
    * The product variant of the line item.
    */
    public ExchangeV2LineItemQuery variant(ProductVariantQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the variant.
    */
    public ExchangeV2LineItemQuery variantTitle() {
        startField("variantTitle");

        return this;
    }

    /**
    * The name of the vendor who created the product variant.
    */
    public ExchangeV2LineItemQuery vendor() {
        startField("vendor");

        return this;
    }
}
