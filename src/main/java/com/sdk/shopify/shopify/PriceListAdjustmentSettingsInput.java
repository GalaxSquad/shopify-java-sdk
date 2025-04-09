// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import java.io.Serializable;

public class PriceListAdjustmentSettingsInput implements Serializable {
    private PriceListCompareAtMode compareAtMode;

    public PriceListAdjustmentSettingsInput(PriceListCompareAtMode compareAtMode) {
        this.compareAtMode = compareAtMode;
    }

    public PriceListCompareAtMode getCompareAtMode() {
        return compareAtMode;
    }

    public PriceListAdjustmentSettingsInput setCompareAtMode(PriceListCompareAtMode compareAtMode) {
        this.compareAtMode = compareAtMode;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("compareAtMode:");
        _queryBuilder.append(compareAtMode.toString());

        _queryBuilder.append('}');
    }
}
