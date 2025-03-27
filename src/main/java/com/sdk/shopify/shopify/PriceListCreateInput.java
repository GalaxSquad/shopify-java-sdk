// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class PriceListCreateInput implements Serializable {
    private String name;

    private CurrencyCode currency;

    private PriceListParentCreateInput parent;

    private Input<ID> catalogId = Input.undefined();

    public PriceListCreateInput(String name, CurrencyCode currency, PriceListParentCreateInput parent) {
        this.name = name;

        this.currency = currency;

        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public PriceListCreateInput setName(String name) {
        this.name = name;
        return this;
    }

    public CurrencyCode getCurrency() {
        return currency;
    }

    public PriceListCreateInput setCurrency(CurrencyCode currency) {
        this.currency = currency;
        return this;
    }

    public PriceListParentCreateInput getParent() {
        return parent;
    }

    public PriceListCreateInput setParent(PriceListParentCreateInput parent) {
        this.parent = parent;
        return this;
    }

    public ID getCatalogId() {
        return catalogId.getValue();
    }

    public Input<ID> getCatalogIdInput() {
        return catalogId;
    }

    public PriceListCreateInput setCatalogId(ID catalogId) {
        this.catalogId = Input.optional(catalogId);
        return this;
    }

    public PriceListCreateInput setCatalogIdInput(Input<ID> catalogId) {
        if (catalogId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.catalogId = catalogId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("currency:");
        _queryBuilder.append(currency.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("parent:");
        parent.appendTo(_queryBuilder);

        if (this.catalogId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("catalogId:");
            if (catalogId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, catalogId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
