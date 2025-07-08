// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;




import java.io.Serializable;

public class MarketConditionsRegionInput implements Serializable {
    private CountryCode countryCode;

    public MarketConditionsRegionInput(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public MarketConditionsRegionInput setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("countryCode:");
        _queryBuilder.append(countryCode.toString());

        _queryBuilder.append('}');
    }
}
