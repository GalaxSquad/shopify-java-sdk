// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class PriceListParentUpdateInput implements Serializable {
    private PriceListAdjustmentInput adjustment;

    private Input<PriceListAdjustmentSettingsInput> settings = Input.undefined();

    public PriceListParentUpdateInput(PriceListAdjustmentInput adjustment) {
        this.adjustment = adjustment;
    }

    public PriceListAdjustmentInput getAdjustment() {
        return adjustment;
    }

    public PriceListParentUpdateInput setAdjustment(PriceListAdjustmentInput adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    public PriceListAdjustmentSettingsInput getSettings() {
        return settings.getValue();
    }

    public Input<PriceListAdjustmentSettingsInput> getSettingsInput() {
        return settings;
    }

    public PriceListParentUpdateInput setSettings(PriceListAdjustmentSettingsInput settings) {
        this.settings = Input.optional(settings);
        return this;
    }

    public PriceListParentUpdateInput setSettingsInput(Input<PriceListAdjustmentSettingsInput> settings) {
        if (settings == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.settings = settings;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("adjustment:");
        adjustment.appendTo(_queryBuilder);

        if (this.settings.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("settings:");
            if (settings.getValue() != null) {
                settings.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
