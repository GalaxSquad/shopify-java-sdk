// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.math.BigDecimal;

public class MarketCurrencySettingsUpdateInput implements Serializable {
    private Input<CurrencyCode> baseCurrency = Input.undefined();

    private Input<BigDecimal> baseCurrencyManualRate = Input.undefined();

    private Input<Boolean> localCurrencies = Input.undefined();

    private Input<Boolean> roundingEnabled = Input.undefined();

    public CurrencyCode getBaseCurrency() {
        return baseCurrency.getValue();
    }

    public Input<CurrencyCode> getBaseCurrencyInput() {
        return baseCurrency;
    }

    public MarketCurrencySettingsUpdateInput setBaseCurrency(CurrencyCode baseCurrency) {
        this.baseCurrency = Input.optional(baseCurrency);
        return this;
    }

    public MarketCurrencySettingsUpdateInput setBaseCurrencyInput(Input<CurrencyCode> baseCurrency) {
        if (baseCurrency == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.baseCurrency = baseCurrency;
        return this;
    }

    public BigDecimal getBaseCurrencyManualRate() {
        return baseCurrencyManualRate.getValue();
    }

    public Input<BigDecimal> getBaseCurrencyManualRateInput() {
        return baseCurrencyManualRate;
    }

    public MarketCurrencySettingsUpdateInput setBaseCurrencyManualRate(BigDecimal baseCurrencyManualRate) {
        this.baseCurrencyManualRate = Input.optional(baseCurrencyManualRate);
        return this;
    }

    public MarketCurrencySettingsUpdateInput setBaseCurrencyManualRateInput(Input<BigDecimal> baseCurrencyManualRate) {
        if (baseCurrencyManualRate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.baseCurrencyManualRate = baseCurrencyManualRate;
        return this;
    }

    public Boolean getLocalCurrencies() {
        return localCurrencies.getValue();
    }

    public Input<Boolean> getLocalCurrenciesInput() {
        return localCurrencies;
    }

    public MarketCurrencySettingsUpdateInput setLocalCurrencies(Boolean localCurrencies) {
        this.localCurrencies = Input.optional(localCurrencies);
        return this;
    }

    public MarketCurrencySettingsUpdateInput setLocalCurrenciesInput(Input<Boolean> localCurrencies) {
        if (localCurrencies == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.localCurrencies = localCurrencies;
        return this;
    }

    public Boolean getRoundingEnabled() {
        return roundingEnabled.getValue();
    }

    public Input<Boolean> getRoundingEnabledInput() {
        return roundingEnabled;
    }

    public MarketCurrencySettingsUpdateInput setRoundingEnabled(Boolean roundingEnabled) {
        this.roundingEnabled = Input.optional(roundingEnabled);
        return this;
    }

    public MarketCurrencySettingsUpdateInput setRoundingEnabledInput(Input<Boolean> roundingEnabled) {
        if (roundingEnabled == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.roundingEnabled = roundingEnabled;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.baseCurrency.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("baseCurrency:");
            if (baseCurrency.getValue() != null) {
                _queryBuilder.append(baseCurrency.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.baseCurrencyManualRate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("baseCurrencyManualRate:");
            if (baseCurrencyManualRate.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, baseCurrencyManualRate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.localCurrencies.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("localCurrencies:");
            if (localCurrencies.getValue() != null) {
                _queryBuilder.append(localCurrencies.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.roundingEnabled.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("roundingEnabled:");
            if (roundingEnabled.getValue() != null) {
                _queryBuilder.append(roundingEnabled.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
