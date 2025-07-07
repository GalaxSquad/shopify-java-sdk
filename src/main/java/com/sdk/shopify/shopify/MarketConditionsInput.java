// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class MarketConditionsInput implements Serializable {
    private Input<MarketConditionsCompanyLocationsInput> companyLocationsCondition = Input.undefined();

    private Input<MarketConditionsLocationsInput> locationsCondition = Input.undefined();

    private Input<MarketConditionsRegionsInput> regionsCondition = Input.undefined();

    public MarketConditionsCompanyLocationsInput getCompanyLocationsCondition() {
        return companyLocationsCondition.getValue();
    }

    public Input<MarketConditionsCompanyLocationsInput> getCompanyLocationsConditionInput() {
        return companyLocationsCondition;
    }

    public MarketConditionsInput setCompanyLocationsCondition(MarketConditionsCompanyLocationsInput companyLocationsCondition) {
        this.companyLocationsCondition = Input.optional(companyLocationsCondition);
        return this;
    }

    public MarketConditionsInput setCompanyLocationsConditionInput(Input<MarketConditionsCompanyLocationsInput> companyLocationsCondition) {
        if (companyLocationsCondition == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.companyLocationsCondition = companyLocationsCondition;
        return this;
    }

    public MarketConditionsLocationsInput getLocationsCondition() {
        return locationsCondition.getValue();
    }

    public Input<MarketConditionsLocationsInput> getLocationsConditionInput() {
        return locationsCondition;
    }

    public MarketConditionsInput setLocationsCondition(MarketConditionsLocationsInput locationsCondition) {
        this.locationsCondition = Input.optional(locationsCondition);
        return this;
    }

    public MarketConditionsInput setLocationsConditionInput(Input<MarketConditionsLocationsInput> locationsCondition) {
        if (locationsCondition == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locationsCondition = locationsCondition;
        return this;
    }

    public MarketConditionsRegionsInput getRegionsCondition() {
        return regionsCondition.getValue();
    }

    public Input<MarketConditionsRegionsInput> getRegionsConditionInput() {
        return regionsCondition;
    }

    public MarketConditionsInput setRegionsCondition(MarketConditionsRegionsInput regionsCondition) {
        this.regionsCondition = Input.optional(regionsCondition);
        return this;
    }

    public MarketConditionsInput setRegionsConditionInput(Input<MarketConditionsRegionsInput> regionsCondition) {
        if (regionsCondition == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regionsCondition = regionsCondition;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.companyLocationsCondition.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("companyLocationsCondition:");
            if (companyLocationsCondition.getValue() != null) {
                companyLocationsCondition.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.locationsCondition.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locationsCondition:");
            if (locationsCondition.getValue() != null) {
                locationsCondition.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.regionsCondition.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("regionsCondition:");
            if (regionsCondition.getValue() != null) {
                regionsCondition.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
