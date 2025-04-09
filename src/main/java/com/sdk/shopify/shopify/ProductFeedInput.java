// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import java.io.Serializable;

public class ProductFeedInput implements Serializable {
    private LanguageCode language;

    private CountryCode country;

    public ProductFeedInput(LanguageCode language, CountryCode country) {
        this.language = language;

        this.country = country;
    }

    public LanguageCode getLanguage() {
        return language;
    }

    public ProductFeedInput setLanguage(LanguageCode language) {
        this.language = language;
        return this;
    }

    public CountryCode getCountry() {
        return country;
    }

    public ProductFeedInput setCountry(CountryCode country) {
        this.country = country;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("language:");
        _queryBuilder.append(language.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("country:");
        _queryBuilder.append(country.toString());

        _queryBuilder.append('}');
    }
}
