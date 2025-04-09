// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class MarketCurrencySettingsUpdateInput implements Serializable {
    private Input<CurrencyCode> baseCurrency = Input.undefined();

    private Input<Boolean> localCurrencies = Input.undefined();

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

        _queryBuilder.append('}');
    }
}
