// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CountryHarmonizedSystemCodeInput implements Serializable {
    private String harmonizedSystemCode;

    private CountryCode countryCode;

    public CountryHarmonizedSystemCodeInput(String harmonizedSystemCode, CountryCode countryCode) {
        this.harmonizedSystemCode = harmonizedSystemCode;

        this.countryCode = countryCode;
    }

    public String getHarmonizedSystemCode() {
        return harmonizedSystemCode;
    }

    public CountryHarmonizedSystemCodeInput setHarmonizedSystemCode(String harmonizedSystemCode) {
        this.harmonizedSystemCode = harmonizedSystemCode;
        return this;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public CountryHarmonizedSystemCodeInput setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("harmonizedSystemCode:");
        Query.appendQuotedString(_queryBuilder, harmonizedSystemCode.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("countryCode:");
        _queryBuilder.append(countryCode.toString());

        _queryBuilder.append('}');
    }
}
