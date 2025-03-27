// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the shipping details that the customer chose for their order.
*/
public class ShippingLineQuery extends Query<ShippingLineQuery> {
    ShippingLineQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A reference to the carrier service that provided the rate.
    * Present when the rate was computed by a third-party carrier service.
    */
    public ShippingLineQuery carrierIdentifier() {
        startField("carrierIdentifier");

        return this;
    }

    /**
    * A reference to the shipping method.
    */
    public ShippingLineQuery code() {
        startField("code");

        return this;
    }

    /**
    * The current shipping price after applying refunds, after applying discounts. If the parent
    * `order.taxesIncluded`` field is true, then this price includes taxes. Otherwise, this field is the
    * pre-tax price.
    */
    public ShippingLineQuery currentDiscountedPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("currentDiscountedPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the shipping line is custom or not.
    */
    public ShippingLineQuery custom() {
        startField("custom");

        return this;
    }

    /**
    * The general classification of the delivery method.
    */
    public ShippingLineQuery deliveryCategory() {
        startField("deliveryCategory");

        return this;
    }

    /**
    * The discounts that have been allocated to the shipping line.
    */
    public ShippingLineQuery discountAllocations(DiscountAllocationQueryDefinition queryDef) {
        startField("discountAllocations");

        _queryBuilder.append('{');
        queryDef.define(new DiscountAllocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shipping price after applying discounts. If the parent order.taxesIncluded field is true, then
    * this price includes taxes. If not, it's the pre-tax price.
    * As of API version 2024-07, this will be calculated including cart level discounts, such as the free
    * shipping discount.
    */
    public ShippingLineQuery discountedPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("discountedPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public ShippingLineQuery id() {
        startField("id");

        return this;
    }

    /**
    * Whether the shipping line has been removed.
    */
    public ShippingLineQuery isRemoved() {
        startField("isRemoved");

        return this;
    }

    /**
    * The pre-tax shipping price without any discounts applied.
    */
    public ShippingLineQuery originalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("originalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The phone number at the shipping address.
    */
    public ShippingLineQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * A unique identifier for the shipping rate. The format can change without notice and isn't meant to
    * be shown to users.
    */
    public ShippingLineQuery shippingRateHandle() {
        startField("shippingRateHandle");

        return this;
    }

    /**
    * Returns the rate source for the shipping line.
    */
    public ShippingLineQuery source() {
        startField("source");

        return this;
    }

    /**
    * The TaxLine objects connected to this shipping line.
    */
    public ShippingLineQuery taxLines(TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the title of the shipping line.
    */
    public ShippingLineQuery title() {
        startField("title");

        return this;
    }
}
