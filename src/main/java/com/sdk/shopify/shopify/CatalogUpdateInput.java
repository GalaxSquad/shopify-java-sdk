// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CatalogUpdateInput implements Serializable {
    private Input<String> title = Input.undefined();

    private Input<CatalogStatus> status = Input.undefined();

    private Input<CatalogContextInput> context = Input.undefined();

    private Input<ID> priceListId = Input.undefined();

    private Input<ID> publicationId = Input.undefined();

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public CatalogUpdateInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public CatalogUpdateInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public CatalogStatus getStatus() {
        return status.getValue();
    }

    public Input<CatalogStatus> getStatusInput() {
        return status;
    }

    public CatalogUpdateInput setStatus(CatalogStatus status) {
        this.status = Input.optional(status);
        return this;
    }

    public CatalogUpdateInput setStatusInput(Input<CatalogStatus> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    public CatalogContextInput getContext() {
        return context.getValue();
    }

    public Input<CatalogContextInput> getContextInput() {
        return context;
    }

    public CatalogUpdateInput setContext(CatalogContextInput context) {
        this.context = Input.optional(context);
        return this;
    }

    public CatalogUpdateInput setContextInput(Input<CatalogContextInput> context) {
        if (context == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.context = context;
        return this;
    }

    public ID getPriceListId() {
        return priceListId.getValue();
    }

    public Input<ID> getPriceListIdInput() {
        return priceListId;
    }

    public CatalogUpdateInput setPriceListId(ID priceListId) {
        this.priceListId = Input.optional(priceListId);
        return this;
    }

    public CatalogUpdateInput setPriceListIdInput(Input<ID> priceListId) {
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

    public CatalogUpdateInput setPublicationId(ID publicationId) {
        this.publicationId = Input.optional(publicationId);
        return this;
    }

    public CatalogUpdateInput setPublicationIdInput(Input<ID> publicationId) {
        if (publicationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.publicationId = publicationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.title.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("title:");
            if (title.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, title.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.status.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("status:");
            if (status.getValue() != null) {
                _queryBuilder.append(status.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.context.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("context:");
            if (context.getValue() != null) {
                context.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

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
