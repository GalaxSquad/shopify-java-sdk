// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents relative adjustments from one price list to other prices.
* You can use a `PriceListParent` to specify an adjusted relative price using a percentage-based
* adjustment. Adjusted prices work in conjunction with exchange rules and rounding.
* [Adjustment types](https://shopify.dev/api/admin-graphql/latest/enums/pricelistadjustmenttype)
* support both percentage increases and decreases.
*/
public class PriceListParentQuery extends Query<PriceListParentQuery> {
    PriceListParentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A price list adjustment.
    */
    public PriceListParentQuery adjustment(PriceListAdjustmentQueryDefinition queryDef) {
        startField("adjustment");

        _queryBuilder.append('{');
        queryDef.define(new PriceListAdjustmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A price list's settings for adjustment.
    */
    public PriceListParentQuery settings(PriceListAdjustmentSettingsQueryDefinition queryDef) {
        startField("settings");

        _queryBuilder.append('{');
        queryDef.define(new PriceListAdjustmentSettingsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
