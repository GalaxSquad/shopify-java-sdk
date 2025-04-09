// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CatalogCreateInput implements Serializable {
    private String title;

    private CatalogStatus status;

    private CatalogContextInput context;

    private Input<ID> priceListId = Input.undefined();

    private Input<ID> publicationId = Input.undefined();

    public CatalogCreateInput(String title, CatalogStatus status, CatalogContextInput context) {
        this.title = title;

        this.status = status;

        this.context = context;
    }

    public String getTitle() {
        return title;
    }

    public CatalogCreateInput setTitle(String title) {
        this.title = title;
        return this;
    }

    public CatalogStatus getStatus() {
        return status;
    }

    public CatalogCreateInput setStatus(CatalogStatus status) {
        this.status = status;
        return this;
    }

    public CatalogContextInput getContext() {
        return context;
    }

    public CatalogCreateInput setContext(CatalogContextInput context) {
        this.context = context;
        return this;
    }

    public ID getPriceListId() {
        return priceListId.getValue();
    }

    public Input<ID> getPriceListIdInput() {
        return priceListId;
    }

    public CatalogCreateInput setPriceListId(ID priceListId) {
        this.priceListId = Input.optional(priceListId);
        return this;
    }

    public CatalogCreateInput setPriceListIdInput(Input<ID> priceListId) {
        if (priceListId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.priceListId = priceListId;
        return this;
    }

    public ID getPublicationId() {
        return publicationId.getValue();
    }

    public Input<ID> getPublicationIdInput() {
        return publicationId;
    }

    public CatalogCreateInput setPublicationId(ID publicationId) {
        this.publicationId = Input.optional(publicationId);
        return this;
    }

    public CatalogCreateInput setPublicationIdInput(Input<ID> publicationId) {
        if (publicationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.publicationId = publicationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("title:");
        Query.appendQuotedString(_queryBuilder, title.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("status:");
        _queryBuilder.append(status.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("context:");
        context.appendTo(_queryBuilder);

        if (this.priceListId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("priceListId:");
            if (priceListId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, priceListId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.publicationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("publicationId:");
            if (publicationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, publicationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
