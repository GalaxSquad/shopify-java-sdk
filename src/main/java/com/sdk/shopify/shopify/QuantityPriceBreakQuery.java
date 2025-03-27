// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Quantity price breaks lets you offer different rates that are based on the
* amount of a specific variant being ordered.
*/
public class QuantityPriceBreakQuery extends Query<QuantityPriceBreakQuery> {
    QuantityPriceBreakQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Minimum quantity required to reach new quantity break price.
    */
    public QuantityPriceBreakQuery minimumQuantity() {
        startField("minimumQuantity");

        return this;
    }

    /**
    * The price of variant after reaching the minimum quanity.
    */
    public QuantityPriceBreakQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price list associated with this quantity break.
    */
    public QuantityPriceBreakQuery priceList(PriceListQueryDefinition queryDef) {
        startField("priceList");

        _queryBuilder.append('{');
        queryDef.define(new PriceListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product variant associated with this quantity break.
    */
    public QuantityPriceBreakQuery variant(ProductVariantQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
