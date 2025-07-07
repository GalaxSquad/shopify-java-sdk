// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class WebPresenceUpdateInput implements Serializable {
    private Input<String> defaultLocale = Input.undefined();

    private Input<List<String>> alternateLocales = Input.undefined();

    private Input<String> subfolderSuffix = Input.undefined();

    public String getDefaultLocale() {
        return defaultLocale.getValue();
    }

    public Input<String> getDefaultLocaleInput() {
        return defaultLocale;
    }

    public WebPresenceUpdateInput setDefaultLocale(String defaultLocale) {
        this.defaultLocale = Input.optional(defaultLocale);
        return this;
    }

    public WebPresenceUpdateInput setDefaultLocaleInput(Input<String> defaultLocale) {
        if (defaultLocale == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.defaultLocale = defaultLocale;
        return this;
    }

    public List<String> getAlternateLocales() {
        return alternateLocales.getValue();
    }

    public Input<List<String>> getAlternateLocalesInput() {
        return alternateLocales;
    }

    public WebPresenceUpdateInput setAlternateLocales(List<String> alternateLocales) {
        this.alternateLocales = Input.optional(alternateLocales);
        return this;
    }

    public WebPresenceUpdateInput setAlternateLocalesInput(Input<List<String>> alternateLocales) {
        if (alternateLocales == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alternateLocales = alternateLocales;
        return this;
    }

    public String getSubfolderSuffix() {
        return subfolderSuffix.getValue();
    }

    public Input<String> getSubfolderSuffixInput() {
        return subfolderSuffix;
    }

    public WebPresenceUpdateInput setSubfolderSuffix(String subfolderSuffix) {
        this.subfolderSuffix = Input.optional(subfolderSuffix);
        return this;
    }

    public WebPresenceUpdateInput setSubfolderSuffixInput(Input<String> subfolderSuffix) {
        if (subfolderSuffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.subfolderSuffix = subfolderSuffix;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.defaultLocale.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("defaultLocale:");
            if (defaultLocale.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, defaultLocale.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.alternateLocales.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alternateLocales:");
            if (alternateLocales.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : alternateLocales.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.subfolderSuffix.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("subfolderSuffix:");
            if (subfolderSuffix.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, subfolderSuffix.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
