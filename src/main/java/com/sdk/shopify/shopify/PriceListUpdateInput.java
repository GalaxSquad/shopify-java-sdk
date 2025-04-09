// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class PriceListUpdateInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<CurrencyCode> currency = Input.undefined();

    private Input<PriceListParentUpdateInput> parent = Input.undefined();

    private Input<ID> catalogId = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public PriceListUpdateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public PriceListUpdateInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public CurrencyCode getCurrency() {
        return currency.getValue();
    }

    public Input<CurrencyCode> getCurrencyInput() {
        return currency;
    }

    public PriceListUpdateInput setCurrency(CurrencyCode currency) {
        this.currency = Input.optional(currency);
        return this;
    }

    public PriceListUpdateInput setCurrencyInput(Input<CurrencyCode> currency) {
        if (currency == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.currency = currency;
        return this;
    }

    public PriceListParentUpdateInput getParent() {
        return parent.getValue();
    }

    public Input<PriceListParentUpdateInput> getParentInput() {
        return parent;
    }

    public PriceListUpdateInput setParent(PriceListParentUpdateInput parent) {
        this.parent = Input.optional(parent);
        return this;
    }

    public PriceListUpdateInput setParentInput(Input<PriceListParentUpdateInput> parent) {
        if (parent == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.parent = parent;
        return this;
    }

    public ID getCatalogId() {
        return catalogId.getValue();
    }

    public Input<ID> getCatalogIdInput() {
        return catalogId;
    }

    public PriceListUpdateInput setCatalogId(ID catalogId) {
        this.catalogId = Input.optional(catalogId);
        return this;
    }

    public PriceListUpdateInput setCatalogIdInput(Input<ID> catalogId) {
        if (catalogId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.catalogId = catalogId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.currency.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("currency:");
            if (currency.getValue() != null) {
                _queryBuilder.append(currency.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.parent.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("parent:");
            if (parent.getValue() != null) {
                parent.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

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
