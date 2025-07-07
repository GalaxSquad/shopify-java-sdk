// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class MarketPriceInclusionsInput implements Serializable {
    private Input<InclusiveTaxPricingStrategy> taxPricingStrategy = Input.undefined();

    private Input<InclusiveDutiesPricingStrategy> dutiesPricingStrategy = Input.undefined();

    public InclusiveTaxPricingStrategy getTaxPricingStrategy() {
        return taxPricingStrategy.getValue();
    }

    public Input<InclusiveTaxPricingStrategy> getTaxPricingStrategyInput() {
        return taxPricingStrategy;
    }

    public MarketPriceInclusionsInput setTaxPricingStrategy(InclusiveTaxPricingStrategy taxPricingStrategy) {
        this.taxPricingStrategy = Input.optional(taxPricingStrategy);
        return this;
    }

    public MarketPriceInclusionsInput setTaxPricingStrategyInput(Input<InclusiveTaxPricingStrategy> taxPricingStrategy) {
        if (taxPricingStrategy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxPricingStrategy = taxPricingStrategy;
        return this;
    }

    public InclusiveDutiesPricingStrategy getDutiesPricingStrategy() {
        return dutiesPricingStrategy.getValue();
    }

    public Input<InclusiveDutiesPricingStrategy> getDutiesPricingStrategyInput() {
        return dutiesPricingStrategy;
    }

    public MarketPriceInclusionsInput setDutiesPricingStrategy(InclusiveDutiesPricingStrategy dutiesPricingStrategy) {
        this.dutiesPricingStrategy = Input.optional(dutiesPricingStrategy);
        return this;
    }

    public MarketPriceInclusionsInput setDutiesPricingStrategyInput(Input<InclusiveDutiesPricingStrategy> dutiesPricingStrategy) {
        if (dutiesPricingStrategy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dutiesPricingStrategy = dutiesPricingStrategy;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.taxPricingStrategy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("taxPricingStrategy:");
            if (taxPricingStrategy.getValue() != null) {
                _queryBuilder.append(taxPricingStrategy.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dutiesPricingStrategy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dutiesPricingStrategy:");
            if (dutiesPricingStrategy.getValue() != null) {
                _queryBuilder.append(dutiesPricingStrategy.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
