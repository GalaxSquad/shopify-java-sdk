// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class WebPresenceCreateInput implements Serializable {
    private String defaultLocale;

    private Input<ID> domainId = Input.undefined();

    private Input<List<String>> alternateLocales = Input.undefined();

    private Input<String> subfolderSuffix = Input.undefined();

    public WebPresenceCreateInput(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public String getDefaultLocale() {
        return defaultLocale;
    }

    public WebPresenceCreateInput setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
        return this;
    }

    public ID getDomainId() {
        return domainId.getValue();
    }

    public Input<ID> getDomainIdInput() {
        return domainId;
    }

    public WebPresenceCreateInput setDomainId(ID domainId) {
        this.domainId = Input.optional(domainId);
        return this;
    }

    public WebPresenceCreateInput setDomainIdInput(Input<ID> domainId) {
        if (domainId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.domainId = domainId;
        return this;
    }

    public List<String> getAlternateLocales() {
        return alternateLocales.getValue();
    }

    public Input<List<String>> getAlternateLocalesInput() {
        return alternateLocales;
    }

    public WebPresenceCreateInput setAlternateLocales(List<String> alternateLocales) {
        this.alternateLocales = Input.optional(alternateLocales);
        return this;
    }

    public WebPresenceCreateInput setAlternateLocalesInput(Input<List<String>> alternateLocales) {
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

    public WebPresenceCreateInput setSubfolderSuffix(String subfolderSuffix) {
        this.subfolderSuffix = Input.optional(subfolderSuffix);
        return this;
    }

    public WebPresenceCreateInput setSubfolderSuffixInput(Input<String> subfolderSuffix) {
        if (subfolderSuffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.subfolderSuffix = subfolderSuffix;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("defaultLocale:");
        Query.appendQuotedString(_queryBuilder, defaultLocale.toString());

        if (this.domainId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("domainId:");
            if (domainId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, domainId.getValue().toString());
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
