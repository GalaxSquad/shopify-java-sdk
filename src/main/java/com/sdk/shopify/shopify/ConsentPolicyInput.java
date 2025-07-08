// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ConsentPolicyInput implements Serializable {
    private Input<PrivacyCountryCode> countryCode = Input.undefined();

    private Input<String> regionCode = Input.undefined();

    private Input<Boolean> consentRequired = Input.undefined();

    private Input<Boolean> dataSaleOptOutRequired = Input.undefined();

    public PrivacyCountryCode getCountryCode() {
        return countryCode.getValue();
    }

    public Input<PrivacyCountryCode> getCountryCodeInput() {
        return countryCode;
    }

    public ConsentPolicyInput setCountryCode(PrivacyCountryCode countryCode) {
        this.countryCode = Input.optional(countryCode);
        return this;
    }

    public ConsentPolicyInput setCountryCodeInput(Input<PrivacyCountryCode> countryCode) {
        if (countryCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryCode = countryCode;
        return this;
    }

    public String getRegionCode() {
        return regionCode.getValue();
    }

    public Input<String> getRegionCodeInput() {
        return regionCode;
    }

    public ConsentPolicyInput setRegionCode(String regionCode) {
        this.regionCode = Input.optional(regionCode);
        return this;
    }

    public ConsentPolicyInput setRegionCodeInput(Input<String> regionCode) {
        if (regionCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regionCode = regionCode;
        return this;
    }

    public Boolean getConsentRequired() {
        return consentRequired.getValue();
    }

    public Input<Boolean> getConsentRequiredInput() {
        return consentRequired;
    }

    public ConsentPolicyInput setConsentRequired(Boolean consentRequired) {
        this.consentRequired = Input.optional(consentRequired);
        return this;
    }

    public ConsentPolicyInput setConsentRequiredInput(Input<Boolean> consentRequired) {
        if (consentRequired == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.consentRequired = consentRequired;
        return this;
    }

    public Boolean getDataSaleOptOutRequired() {
        return dataSaleOptOutRequired.getValue();
    }

    public Input<Boolean> getDataSaleOptOutRequiredInput() {
        return dataSaleOptOutRequired;
    }

    public ConsentPolicyInput setDataSaleOptOutRequired(Boolean dataSaleOptOutRequired) {
        this.dataSaleOptOutRequired = Input.optional(dataSaleOptOutRequired);
        return this;
    }

    public ConsentPolicyInput setDataSaleOptOutRequiredInput(Input<Boolean> dataSaleOptOutRequired) {
        if (dataSaleOptOutRequired == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dataSaleOptOutRequired = dataSaleOptOutRequired;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.countryCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("countryCode:");
            if (countryCode.getValue() != null) {
                _queryBuilder.append(countryCode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.regionCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("regionCode:");
            if (regionCode.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, regionCode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.consentRequired.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("consentRequired:");
            if (consentRequired.getValue() != null) {
                _queryBuilder.append(consentRequired.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dataSaleOptOutRequired.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dataSaleOptOutRequired:");
            if (dataSaleOptOutRequired.getValue() != null) {
                _queryBuilder.append(dataSaleOptOutRequired.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
