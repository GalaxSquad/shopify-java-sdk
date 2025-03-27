// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.io.Serializable;
import java.util.List;

public class MarketWebPresenceUpdateInput implements Serializable {
    private Input<ID> domainId = Input.undefined();

    private Input<String> defaultLocale = Input.undefined();

    private Input<List<String>> alternateLocales = Input.undefined();

    private Input<String> subfolderSuffix = Input.undefined();

    public ID getDomainId() {
        return domainId.getValue();
    }

    public Input<ID> getDomainIdInput() {
        return domainId;
    }

    public MarketWebPresenceUpdateInput setDomainId(ID domainId) {
        this.domainId = Input.optional(domainId);
        return this;
    }

    public MarketWebPresenceUpdateInput setDomainIdInput(Input<ID> domainId) {
        if (domainId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.domainId = domainId;
        return this;
    }

    public String getDefaultLocale() {
        return defaultLocale.getValue();
    }

    public Input<String> getDefaultLocaleInput() {
        return defaultLocale;
    }

    public MarketWebPresenceUpdateInput setDefaultLocale(String defaultLocale) {
        this.defaultLocale = Input.optional(defaultLocale);
        return this;
    }

    public MarketWebPresenceUpdateInput setDefaultLocaleInput(Input<String> defaultLocale) {
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

    public MarketWebPresenceUpdateInput setAlternateLocales(List<String> alternateLocales) {
        this.alternateLocales = Input.optional(alternateLocales);
        return this;
    }

    public MarketWebPresenceUpdateInput setAlternateLocalesInput(Input<List<String>> alternateLocales) {
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

    public MarketWebPresenceUpdateInput setSubfolderSuffix(String subfolderSuffix) {
        this.subfolderSuffix = Input.optional(subfolderSuffix);
        return this;
    }

    public MarketWebPresenceUpdateInput setSubfolderSuffixInput(Input<String> subfolderSuffix) {
        if (subfolderSuffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.subfolderSuffix = subfolderSuffix;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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
