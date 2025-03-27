// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class InventoryItemInput implements Serializable {
    private Input<String> sku = Input.undefined();

    private Input<BigDecimal> cost = Input.undefined();

    private Input<Boolean> tracked = Input.undefined();

    private Input<CountryCode> countryCodeOfOrigin = Input.undefined();

    private Input<String> harmonizedSystemCode = Input.undefined();

    private Input<List<CountryHarmonizedSystemCodeInput>> countryHarmonizedSystemCodes = Input.undefined();

    private Input<String> provinceCodeOfOrigin = Input.undefined();

    private Input<InventoryItemMeasurementInput> measurement = Input.undefined();

    private Input<Boolean> requiresShipping = Input.undefined();

    public String getSku() {
        return sku.getValue();
    }

    public Input<String> getSkuInput() {
        return sku;
    }

    public InventoryItemInput setSku(String sku) {
        this.sku = Input.optional(sku);
        return this;
    }

    public InventoryItemInput setSkuInput(Input<String> sku) {
        if (sku == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sku = sku;
        return this;
    }

    public BigDecimal getCost() {
        return cost.getValue();
    }

    public Input<BigDecimal> getCostInput() {
        return cost;
    }

    public InventoryItemInput setCost(BigDecimal cost) {
        this.cost = Input.optional(cost);
        return this;
    }

    public InventoryItemInput setCostInput(Input<BigDecimal> cost) {
        if (cost == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cost = cost;
        return this;
    }

    public Boolean getTracked() {
        return tracked.getValue();
    }

    public Input<Boolean> getTrackedInput() {
        return tracked;
    }

    public InventoryItemInput setTracked(Boolean tracked) {
        this.tracked = Input.optional(tracked);
        return this;
    }

    public InventoryItemInput setTrackedInput(Input<Boolean> tracked) {
        if (tracked == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tracked = tracked;
        return this;
    }

    public CountryCode getCountryCodeOfOrigin() {
        return countryCodeOfOrigin.getValue();
    }

    public Input<CountryCode> getCountryCodeOfOriginInput() {
        return countryCodeOfOrigin;
    }

    public InventoryItemInput setCountryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
        this.countryCodeOfOrigin = Input.optional(countryCodeOfOrigin);
        return this;
    }

    public InventoryItemInput setCountryCodeOfOriginInput(Input<CountryCode> countryCodeOfOrigin) {
        if (countryCodeOfOrigin == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryCodeOfOrigin = countryCodeOfOrigin;
        return this;
    }

    public String getHarmonizedSystemCode() {
        return harmonizedSystemCode.getValue();
    }

    public Input<String> getHarmonizedSystemCodeInput() {
        return harmonizedSystemCode;
    }

    public InventoryItemInput setHarmonizedSystemCode(String harmonizedSystemCode) {
        this.harmonizedSystemCode = Input.optional(harmonizedSystemCode);
        return this;
    }

    public InventoryItemInput setHarmonizedSystemCodeInput(Input<String> harmonizedSystemCode) {
        if (harmonizedSystemCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.harmonizedSystemCode = harmonizedSystemCode;
        return this;
    }

    public List<CountryHarmonizedSystemCodeInput> getCountryHarmonizedSystemCodes() {
        return countryHarmonizedSystemCodes.getValue();
    }

    public Input<List<CountryHarmonizedSystemCodeInput>> getCountryHarmonizedSystemCodesInput() {
        return countryHarmonizedSystemCodes;
    }

    public InventoryItemInput setCountryHarmonizedSystemCodes(List<CountryHarmonizedSystemCodeInput> countryHarmonizedSystemCodes) {
        this.countryHarmonizedSystemCodes = Input.optional(countryHarmonizedSystemCodes);
        return this;
    }

    public InventoryItemInput setCountryHarmonizedSystemCodesInput(Input<List<CountryHarmonizedSystemCodeInput>> countryHarmonizedSystemCodes) {
        if (countryHarmonizedSystemCodes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
        return this;
    }

    public String getProvinceCodeOfOrigin() {
        return provinceCodeOfOrigin.getValue();
    }

    public Input<String> getProvinceCodeOfOriginInput() {
        return provinceCodeOfOrigin;
    }

    public InventoryItemInput setProvinceCodeOfOrigin(String provinceCodeOfOrigin) {
        this.provinceCodeOfOrigin = Input.optional(provinceCodeOfOrigin);
        return this;
    }

    public InventoryItemInput setProvinceCodeOfOriginInput(Input<String> provinceCodeOfOrigin) {
        if (provinceCodeOfOrigin == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.provinceCodeOfOrigin = provinceCodeOfOrigin;
        return this;
    }

    public InventoryItemMeasurementInput getMeasurement() {
        return measurement.getValue();
    }

    public Input<InventoryItemMeasurementInput> getMeasurementInput() {
        return measurement;
    }

    public InventoryItemInput setMeasurement(InventoryItemMeasurementInput measurement) {
        this.measurement = Input.optional(measurement);
        return this;
    }

    public InventoryItemInput setMeasurementInput(Input<InventoryItemMeasurementInput> measurement) {
        if (measurement == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.measurement = measurement;
        return this;
    }

    public Boolean getRequiresShipping() {
        return requiresShipping.getValue();
    }

    public Input<Boolean> getRequiresShippingInput() {
        return requiresShipping;
    }

    public InventoryItemInput setRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = Input.optional(requiresShipping);
        return this;
    }

    public InventoryItemInput setRequiresShippingInput(Input<Boolean> requiresShipping) {
        if (requiresShipping == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.requiresShipping = requiresShipping;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.sku.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sku:");
            if (sku.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, sku.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.cost.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cost:");
            if (cost.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, cost.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.tracked.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tracked:");
            if (tracked.getValue() != null) {
                _queryBuilder.append(tracked.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.countryCodeOfOrigin.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("countryCodeOfOrigin:");
            if (countryCodeOfOrigin.getValue() != null) {
                _queryBuilder.append(countryCodeOfOrigin.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.harmonizedSystemCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("harmonizedSystemCode:");
            if (harmonizedSystemCode.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, harmonizedSystemCode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.countryHarmonizedSystemCodes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("countryHarmonizedSystemCodes:");
            if (countryHarmonizedSystemCodes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CountryHarmonizedSystemCodeInput item1 : countryHarmonizedSystemCodes.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.provinceCodeOfOrigin.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("provinceCodeOfOrigin:");
            if (provinceCodeOfOrigin.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, provinceCodeOfOrigin.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.measurement.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("measurement:");
            if (measurement.getValue() != null) {
                measurement.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.requiresShipping.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("requiresShipping:");
            if (requiresShipping.getValue() != null) {
                _queryBuilder.append(requiresShipping.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
