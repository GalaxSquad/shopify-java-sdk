// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the settings of price list adjustments.
*/
public class PriceListAdjustmentSettingsQuery extends Query<PriceListAdjustmentSettingsQuery> {
    PriceListAdjustmentSettingsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The type of price list adjustment setting for compare at price.
    */
    public PriceListAdjustmentSettingsQuery compareAtMode() {
        startField("compareAtMode");

        return this;
    }
}
